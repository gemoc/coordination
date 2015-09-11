package org.gemoc.execution.engine.coordinator.commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.execution.engine.Activator;
import org.gemoc.execution.engine.commons.DefaultExecutionPlatform;
import org.gemoc.execution.engine.core.AbstractExecutionEngine;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.MSEOccurrence;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.engine_addon.IEngineAddon;
import org.gemoc.gemoc_language_workbench.extensions.timesquare.moc.impl.CcslSolver;
import org.gemoc.executionengine.ccsljava.api.moc.ISolver;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement;
import fr.inria.aoste.timesquare.ccslkernel.model.utils.ResourceLoader;
import fr.inria.aoste.timesquare.ccslkernel.modelunfolding.exception.UnfoldingException;
import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;
import fr.inria.aoste.timesquare.ccslkernel.runtime.elements.RuntimeClock;
import fr.inria.aoste.timesquare.ccslkernel.runtime.exceptions.SimulationException;
import fr.inria.aoste.timesquare.ccslkernel.solver.CCSLKernelSolver;
import fr.inria.aoste.timesquare.ccslkernel.solver.TimeModel.SolverClock;
import fr.inria.aoste.timesquare.ccslkernel.solver.launch.CCSLKernelSolverWrapper;
import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;

public class HeterogeneousEngine {

	protected ArrayList<IConcurrentExecutionEngine> _coordinatedEngines = new ArrayList<IConcurrentExecutionEngine>();
	protected CCSLKernelSolver _coordinationSolver;
	protected ArrayList<CCSLKernelSolver> _t2Solvers;
	private UIJob stepJob;
	private UIJob uiJob;
	
	public HeterogeneousEngine(URI coordinationURI, ArrayList<IExecutionEngine> coordinatedEngines) {
		for(IExecutionEngine e : coordinatedEngines){
			if (!(e instanceof IConcurrentExecutionEngine)){
				throw new RuntimeErrorException(new Error("sorry, for now, only concurrent execuution engine are supported, please donate for more :p"));
			}
			_coordinatedEngines.add((IConcurrentExecutionEngine)e);
		}
		_coordinationSolver = new CCSLKernelSolver();
		
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet ccslResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		ccslResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource coordinationResource=null;
		coordinationResource = ccslResourceSet.createResource(coordinationURI);
		try {
			coordinationResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			String ccordinationPathName = coordinationURI.toString();
			String tmpProjectName = ccordinationPathName.substring(1, ccordinationPathName.length());
			String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
			IProject coordinationProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFile ccslFile = coordinationProject.getFile(ccordinationPathName.replaceFirst("/"+projectName+"/", ""));
			_coordinationSolver.loadCoordinationModel(ResourceLoader.INSTANCE.loadResource(ccslFile.getFullPath()));
		} catch (IOException | UnfoldingException | SimulationException e) {
			e.printStackTrace();
		}
		
		_t2Solvers = new ArrayList<CCSLKernelSolver>();
		for(IConcurrentExecutionEngine eng : _coordinatedEngines){
			CcslSolver gemocSolver =  (CcslSolver) ((IConcurrentExecutionEngine)eng).getSolver();
			CCSLKernelSolverWrapper t2solverWrapper = gemocSolver.getSolverWrapper();
			_t2Solvers.add(t2solverWrapper.getSolver());
		}
		
	
		//launche the UI
		uiJob = new org.eclipse.ui.progress.UIJob("CoordinationEngine") {			
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor)
			{
				

				Shell shell = new Shell (getDisplay());
				shell.setFocus();
				shell.setText("Coordinator UI");
				shell.setLayout(new GridLayout());
				final Button button = new Button (shell, SWT.ARROW_RIGHT);
				button.setLayoutData(new GridData(GridData.GRAB_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_CENTER));
				button.setText ("Do Step");
				/* Make the button toggle between three states */
				button.addListener (SWT.Selection, new Listener() {
					@Override
					public void handleEvent (Event e) {
						stepJob.schedule();
//						try {
//							stepJob.join();
//						} catch (InterruptedException e1) {e1.printStackTrace();}
					}
				});
				
				final Button buttonStop = new Button (shell, SWT.ABORT);
				buttonStop.setLayoutData(new GridData(GridData.GRAB_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_CENTER));
				buttonStop.setText ("Abord");
				/* Make the button toggle between three states */
				buttonStop.addListener (SWT.Selection, new Listener() {
					@Override
					public void handleEvent (Event e) {
						for(IBasicExecutionEngine engine : _coordinatedEngines){
							((IExecutionEngine) engine).stop();
							((IExecutionEngine) engine).setEngineStatus(EngineStatus.RunStatus.Stopped);
							((IExecutionEngine) engine).notifyEngineStopped();
						}
					}
				});
				
				
				shell.setSize(300, 300);
				shell.open ();
				while (!shell.isDisposed ()) {
					if (!getDisplay().readAndDispatch ()) getDisplay().sleep ();
				}
				return new Status(IStatus.OK, Activator.PLUGIN_ID, "coordinator engine UI closed");
			}
			
		};
		
		
		//prepare the job to perform execution !

		stepJob = new org.eclipse.ui.progress.UIJob("CoordinationEngine") {			
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor)
			{
				try {
					_coordinationSolver.constructBDD();
				} catch (SimulationException e1) {e1.printStackTrace();}
				
				for(IConcurrentExecutionEngine engine : _coordinatedEngines){
					engine.computePossibleLogicalSteps();
					engine.updatePossibleLogicalSteps();
				}
				
				ArrayList<CompliantLogicalSteps> res=null;
				try {
					res = computeCompliantLogicalSteps();
				} catch (SimulationException e) {e.printStackTrace();}
				
				System.out.println(res);
				System.out.println(res.size());
				//here, in res, we have a list of "compliant step". A compliant step 
				//is an ordered set of integer corresponding to the step number of the 
				//solver with the same index in the coordinatedEngines list 
				if(res.size() == 0){
					System.err.println("no more solution can be found");
					for(IExecutionEngine engine : _coordinatedEngines){
						((AbstractExecutionEngine) engine).stop();
						((AbstractExecutionEngine) engine).setEngineStatus(EngineStatus.RunStatus.Stopped);
						((AbstractExecutionEngine) engine).notifyEngineStopped();
					}
					return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "no more solution can be found");
				}
				
				
				double randomChoice = (Math.random()*1000)%(res.size());
				CompliantLogicalSteps selectedCompliantStep = res.get((int)(Math.floor((float)randomChoice)));
				for(int i=0; i < _coordinatedEngines.size(); i++){
					IConcurrentExecutionEngine oneEngine = _coordinatedEngines.get(i);
					int theLogicalStepToSelect = selectedCompliantStep.get(i);
					//if we chose the empty step, do nothing
					if(theLogicalStepToSelect==oneEngine.getPossibleLogicalSteps().size()){
						continue;
					}
					LogicalStep selectedLogicalStep = oneEngine.getPossibleLogicalSteps().get(theLogicalStepToSelect);
					oneEngine.setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
					oneEngine.notifyAboutToSelectLogicalStep();
					oneEngine.setSelectedLogicalStep(selectedLogicalStep);
					oneEngine.setEngineStatus(EngineStatus.RunStatus.Running);
					oneEngine.notifyLogicalStepSelected();
					// run all the event occurrences of this logical
					// step

					oneEngine.notifyAboutToExecuteLogicalStep(selectedLogicalStep); 
					oneEngine.executeSelectedLogicalStep();
					oneEngine.notifyLogicalStepExecuted(selectedLogicalStep);
				
					// 3 - run the selected logical step
					// inform the solver that we will run this step
					if (selectedLogicalStep != null)
					{
						oneEngine.getSolver().applyLogicalStep(selectedLogicalStep);
						oneEngine.getEngineStatus().incrementNbLogicalStepRun();
					}
				}
				
				return new Status(IStatus.OK, Activator.PLUGIN_ID, "Execution step was successfull");
			}
		};	
	}
	
	public SolverClock getCoordinatedSolverClockFromCoordinationSolverClock(Clock in, int engineNumber){
		return _t2Solvers.get(engineNumber).findClockByPath(getQualifiedName(in));
	}

	public SolverClock getCoordinatedSolverClockFromCoordinationSolverClock(RuntimeClock in, int engineNumber){
		return _t2Solvers.get(engineNumber).findClock(in.getQualifiedName().toString());
	}
	
	public SolverClock getCoordinationSolverClockFromMSE(ModelSpecificEvent inMSE, CCSLKernelSolver aSolver){
		return _coordinationSolver.findClockByPath(getQualifiedName((Clock) inMSE.getSolverEvent()));
	}

	
	/**
	 * TODO: this only work for two coordinated engines... not sure how to generalize that
	 * 
	 * TODO: we should add the case were  none of the clock managed by a solver ticks (i.e., one of the execution engine is stalled)
	 * @return
	 * @throws SimulationException 
	 */
	public ArrayList<CompliantLogicalSteps> computeCompliantLogicalSteps() throws SimulationException{
		ArrayList<CompliantLogicalSteps> res = new ArrayList<CompliantLogicalSteps>();
		
		IConcurrentExecutionEngine engine0 = _coordinatedEngines.get(0);
		IConcurrentExecutionEngine engine1 = _coordinatedEngines.get(1);
		
		LogicalStep emptyLogicalStep = org.gemoc.execution.engine.trace.gemoc_execution_trace.Gemoc_execution_traceFactory.eINSTANCE.createLogicalStep();

		List<LogicalStep> logicalStepsOf0 = engine0.getPossibleLogicalSteps();
		logicalStepsOf0.add(emptyLogicalStep); //to allow stalling/stuttering an engine
		List<LogicalStep> logicalStepsOf1 = engine1.getPossibleLogicalSteps();
		logicalStepsOf1.add(emptyLogicalStep); //to allow stalling/stuttering an engine
		
		for(int logicalStepNumberIn0 = 0; logicalStepNumberIn0 < logicalStepsOf0.size(); logicalStepNumberIn0++ ){
			for(int logicalStepNumberIn1 = 0; logicalStepNumberIn1 < logicalStepsOf1.size(); logicalStepNumberIn1++ ){
				addConstraintsFromOneStepOfOneEngine(0, logicalStepsOf0.get(logicalStepNumberIn0));
				addConstraintsFromOneStepOfOneEngine(1, logicalStepsOf1.get(logicalStepNumberIn1));

				if (_coordinationSolver.hasSolution()){
					CompliantLogicalSteps theStepsUsed = new CompliantLogicalSteps();
					theStepsUsed.add(logicalStepNumberIn0);
					theStepsUsed.add(logicalStepNumberIn1);
					res.add(theStepsUsed);
				}else{
					System.out.println("incompatible couple of LS: "+logicalStepNumberIn0+" ; "+logicalStepNumberIn1);
				}
				_coordinationSolver.revertForceClockEffect();
			}
		}
		
		return res;
	}

	public void addConstraintsFromOneStepOfOneEngine(int engineNumber, LogicalStep aStep) throws SimulationException{
			
		CCSLKernelSolver oneSolver= _t2Solvers.get(engineNumber);
		ArrayList<SolverClock> trueClocks = new ArrayList<SolverClock>();
			for(MSEOccurrence mseOcc : aStep.getMseOccurrences()){
				ModelSpecificEvent mse = mseOcc.getMse();
				SolverClock coordinationClock = getCoordinationSolverClockFromMSE(mse, oneSolver);
				trueClocks.add(coordinationClock);
				_coordinationSolver.forceClockPresence(coordinationClock);
			}
			//here we are to force absence of the other clocks managed by the engine
			List<RuntimeClock> allRuntimeClocks = _coordinationSolver.getAllDiscreteClocks();
			//should keep only clock managed by the engine engineNumber
			for(RuntimeClock rc: allRuntimeClocks){
				String QNrc = "";
				if (rc instanceof SolverClock){
					QNrc = ((SolverClock)rc).getInstantiationPath().getQualifiedName();
				}else{
					QNrc = rc.getQualifiedName().toString();
				}
				if (oneSolver.findClockByPath(QNrc) == null){
					continue;
				}
				if (rc instanceof SolverClock){
					if (!trueClocks.contains(rc)){
						_coordinationSolver.forceClockAbscence((SolverClock) rc);
					}else{
						System.out.println("already forced to true"+rc);
					}
				}
			}
			//here, the logicalStep aStep is forced in the coordinationSolver.
	}
	
	
	
	public void run() {
		
		
		uiJob.schedule();
		
//		
//		
//		while (!oneEngineStopped()) 
//		{
//			stepJob.schedule();
//			try {
//				stepJob.join();
//			} catch (InterruptedException e) {e.printStackTrace();}
//		}
//		
//		
//		
//		
//		uiJob.cancel();

		
	}
	
	
	private boolean oneEngineStopped() {
		for(IExecutionEngine anEngine : _coordinatedEngines){
			if (((AbstractExecutionEngine)anEngine).getRunningStatus()==RunStatus.Stopped){
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Returns a textual representation of the Clock as a string built from
	 * the name of all elements in the path, separated by the separator string.
	 */
	public String getQualifiedName(Clock c) {
		StringBuilder sb = new StringBuilder(c.getName());
		NamedElement ne = (NamedElement) c.eContainer();
		while (ne != null) {
			sb.insert(0, ne.getName()+"::");
			ne = (NamedElement) ne.eContainer();
		}
		return sb.toString();
	}
	
	
	
	
	
	/**
	 * this is a list of integer where each integer is index of the logical step of its solver. 
	 * The index of the integer itself represents the associated solver index in the _coordinatedEngines list 
	 */
	class CompliantLogicalSteps extends ArrayList<Integer>{

		/**
		 * 
		 */
		private static final long serialVersionUID = 7306227694056928033L;
	}





	
}
