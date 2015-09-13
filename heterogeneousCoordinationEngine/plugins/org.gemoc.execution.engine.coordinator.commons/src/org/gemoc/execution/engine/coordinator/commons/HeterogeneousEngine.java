package org.gemoc.execution.engine.coordinator.commons;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.execution.engine.Activator;
import org.gemoc.execution.engine.commons.EngineContextException;
import org.gemoc.execution.engine.core.AbstractExecutionEngine;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.MSEOccurrence;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionContext;
import org.gemoc.executionengine.ccsljava.api.core.IConcurrentExecutionEngine;
import org.gemoc.executionengine.ccsljava.api.core.ILogicalStepDecider;
import org.gemoc.executionengine.ccsljava.api.dsa.executors.ICodeExecutor;
import org.gemoc.executionengine.ccsljava.api.moc.ISolver;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.ExecutionMode;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionContext;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IFutureAction;
import org.gemoc.gemoc_language_workbench.api.engine_addon.IEngineAddon;
import org.gemoc.gemoc_language_workbench.extensions.timesquare.moc.impl.CcslSolver;

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

public class HeterogeneousEngine extends AbstractExecutionEngine implements IConcurrentExecutionEngine{//extends ConcurrentExecutionEngine{

	protected ArrayList<IConcurrentExecutionEngine> _coordinatedEngines = new ArrayList<IConcurrentExecutionEngine>();
	
	public ArrayList<IConcurrentExecutionEngine> get_coordinatedEngines() {
		return _coordinatedEngines;
	}

	protected CCSLKernelSolver _coordinationSolver;
	protected ArrayList<CCSLKernelSolver> _t2Solvers;
//	private UIJob stepJob;
//	private UIJob uiJob;
//	private EngineStatus engineStatus;
	
	public HeterogeneousEngine(CoordinatedModelExecutionContext executionContext, ExecutionMode executionMode) throws EngineContextException {
		
		
//		try
//		{
//			_logicalStepDecider = LogicalStepDeciderFactory.createDecider(executionContext.getRunConfiguration().getDeciderName(),executionMode);
//		} catch (CoreException e)
//		{
//			EngineContextException exception = new EngineContextException(
//					"Cannot initialize the execution context, see inner exception.", e);
//			throw exception;
//		}
		ArrayList<IExecutionEngine> coordinatedEngines = executionContext.getCoordinatedEngines();
		for(IExecutionEngine e : coordinatedEngines){
			if (!(e instanceof IConcurrentExecutionEngine)){
				throw new RuntimeErrorException(new Error("sorry, for now, only concurrent execution engines are supported, please donate for more :p"));
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
		coordinationResource = ccslResourceSet.createResource(executionContext.getCoordinationModelURI());
		try {
			coordinationResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			String ccordinationPathName = executionContext.getCoordinationModelURI().toString();
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
		
//		notifyEngineAboutToStart();
//		setEngineStatus(EngineStatus.RunStatus.Running);
//		notifyEngineStarted();
		
	
//		//launche the UI
//		uiJob = new org.eclipse.ui.progress.UIJob("CoordinationEngine") {			
//			@Override
//			public IStatus runInUIThread(IProgressMonitor monitor)
//			{
//				
//
//				Shell shell = new Shell (getDisplay());
//				shell.setFocus();
//				shell.setText("Coordinator UI");
//				shell.setLayout(new GridLayout());
//				final Button button = new Button (shell, SWT.ARROW_RIGHT);
//				button.setLayoutData(new GridData(GridData.GRAB_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_CENTER));
//				button.setText ("Do Step");
//				/* Make the button toggle between three states */
//				button.addListener (SWT.Selection, new Listener() {
//					@Override
//					public void handleEvent (Event e) {
//						stepJob.schedule();
////						try {
////							stepJob.join();
////						} catch (InterruptedException e1) {e1.printStackTrace();}
//					}
//				});
//				
//				final Button buttonStop = new Button (shell, SWT.ABORT);
//				buttonStop.setLayoutData(new GridData(GridData.GRAB_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_CENTER));
//				buttonStop.setText ("Abord");
//				/* Make the button toggle between three states */
//				buttonStop.addListener (SWT.Selection, new Listener() {
//					@Override
//					public void handleEvent (Event e) {
//						for(IBasicExecutionEngine engine : _coordinatedEngines){
//							((IExecutionEngine) engine).stop();
//							((IExecutionEngine) engine).setEngineStatus(EngineStatus.RunStatus.Stopped);
//							((IExecutionEngine) engine).notifyEngineStopped();
//						}
//					}
//				});
//				
//				
//				shell.setSize(300, 300);
//				shell.open ();
//				while (!shell.isDisposed ()) {
//					if (!getDisplay().readAndDispatch ()) getDisplay().sleep ();
//				}
//				return new Status(IStatus.OK, Activator.PLUGIN_ID, "coordinator engine UI closed");
//			}
//			
//		};
//		
//		
//		//prepare the job to perform execution !
//
//		stepJob = new org.eclipse.ui.progress.UIJob("CoordinationEngine") {			
//			@Override
//			public IStatus runInUIThread(IProgressMonitor monitor)
//			{
//				try {
//					_coordinationSolver.constructBDD();
//				} catch (SimulationException e1) {e1.printStackTrace();}
//				
//				for(IConcurrentExecutionEngine engine : _coordinatedEngines){
//					engine.computePossibleLogicalSteps();
//					engine.updatePossibleLogicalSteps();
//				}
//				
//				ArrayList<HeterogeneousLogicalStep> res=null;
//				try {
//					res = computeHeterogeneousLogicalStep();
//				} catch (SimulationException e) {e.printStackTrace();}
//				
//				System.out.println(res);
//				System.out.println(res.size());
//				//here, in res, we have a list of "compliant step". A compliant step 
//				//is an ordered set of integer corresponding to the step number of the 
//				//solver with the same index in the coordinatedEngines list 
//				if(res.size() == 0){
//					System.err.println("no more solution can be found");
//					for(IExecutionEngine engine : _coordinatedEngines){
//						((AbstractExecutionEngine) engine).stop();
//						((AbstractExecutionEngine) engine).setEngineStatus(EngineStatus.RunStatus.Stopped);
//						((AbstractExecutionEngine) engine).notifyEngineStopped();
//					}
//					return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "no more solution can be found");
//				}
//				
//				
//				double randomChoice = (Math.random()*1000)%(res.size());
//				HeterogeneousLogicalStep selectedCompliantStep = res.get((int)(Math.floor((float)randomChoice)));
//				for(int i=0; i < _coordinatedEngines.size(); i++){
//					IConcurrentExecutionEngine oneEngine = _coordinatedEngines.get(i);
//					int theLogicalStepToSelect = selectedCompliantStep.stepPositions.get(i);
//					//if we chose the empty step, do nothing
//					if(theLogicalStepToSelect==oneEngine.getPossibleLogicalSteps().size()){
//						continue;
//					}
//					LogicalStep selectedLogicalStep = oneEngine.getPossibleLogicalSteps().get(theLogicalStepToSelect);
//					oneEngine.setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
//					oneEngine.notifyAboutToSelectLogicalStep();
//					oneEngine.setSelectedLogicalStep(selectedLogicalStep);
//					oneEngine.setEngineStatus(EngineStatus.RunStatus.Running);
//					oneEngine.notifyLogicalStepSelected();
//					// run all the event occurrences of this logical
//					// step
//
//					oneEngine.notifyAboutToExecuteLogicalStep(selectedLogicalStep); 
//					oneEngine.executeSelectedLogicalStep();
//					oneEngine.notifyLogicalStepExecuted(selectedLogicalStep);
//				
//					// 3 - run the selected logical step
//					// inform the solver that we will run this step
//					if (selectedLogicalStep != null)
//					{
//						oneEngine.getSolver().applyLogicalStep(selectedLogicalStep);
//						oneEngine.getEngineStatus().incrementNbLogicalStepRun();
//					}
//				}
//				
//				return new Status(IStatus.OK, Activator.PLUGIN_ID, "Execution step was successfull");
//			}
//		};
//		
//		uiJob.schedule();

	}
	@Override
	public void initialize(IExecutionContext executionContext){
		
		if (!(executionContext instanceof CoordinatedModelExecutionContext))
			throw new IllegalArgumentException("executionContext must be a CoordinatedModelExecutionContext when used in an HeterogeneousExecutionEngine");
		
		_executionContext = executionContext;
		CoordinatedModelExecutionContext coordinatedExecutionContext = (CoordinatedModelExecutionContext)_executionContext;
		
		this.changeLogicalStepDecider(coordinatedExecutionContext.getLogicalStepDecider());
		
//		notifyEngineAboutToStart();
//		Activator.getDefault().gemocRunningEngineRegistry.registerEngine("Coordinator", this);
//		notifyEngineStarted();

		setEngineStatus(EngineStatus.RunStatus.Running);
		
		Activator.getDefault().info("*** Heterogeneous Coordination Engine initialization done. ***");
	}
	
//	@Override
	public void notifyEngineStatusChanged(RunStatus newStatus) {
		if (_coordinatedEngines.size() == 0){
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.engineStatusChanged(this, newStatus);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}
	
	@Override
	public void notifyEngineAboutToStart() {
		if (_coordinatedEngines.size() == 0){
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.engineAboutToStart(this);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}
	
	@Override
	public void notifyEngineStarted() {
		if (_coordinatedEngines.size() == 0){
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.engineStarted(this);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}
	
	public CoordinatedModelExecutionContext getCoordinatedModelExecutionContext(){
		
		IExecutionContext context = getExecutionContext();
		if(context instanceof CoordinatedModelExecutionContext){
			return (CoordinatedModelExecutionContext) context;
		}
		else return null;
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
	 * @return
	 * @throws SimulationException 
	 */
	public ArrayList<HeterogeneousLogicalStep> computeHeterogeneousLogicalStep() throws SimulationException{
		ArrayList<HeterogeneousLogicalStep> res = new ArrayList<HeterogeneousLogicalStep>();
		
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
					HeterogeneousLogicalStep theStepsUsed = new HeterogeneousLogicalStep();
					theStepsUsed.logicalSteps.add(logicalStepsOf0.get(logicalStepNumberIn0));
					theStepsUsed.stepPositions.add(logicalStepNumberIn0);
					theStepsUsed.logicalSteps.add(logicalStepsOf1.get(logicalStepNumberIn1));
					theStepsUsed.stepPositions.add(logicalStepNumberIn1);
					res.add(theStepsUsed);
				}else{
//					System.out.println("incompatible couple of LS: "+logicalStepNumberIn0+" ; "+logicalStepNumberIn1);
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
//						System.out.println("already forced to true"+rc);
					}
				}
			}
			//here, the logicalStep aStep is forced in the coordinationSolver.
	}
	
	
	class EngineRunnable implements Runnable {
		
		public void run() {
			engineStatus.setNbLogicalStepRun(0);
			try 
			{
				while (!_isStopped || !oneEngineStopped()) 
				{					
					performExecutionStep();							
				} 
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		}

	}
	
	public void performExecutionStep() {
		
		if (_heterogeneousLogicalSteps.size() == 0) {
			Activator.getDefault().debug("No more LogicalStep to run");
			stop();
		} else {
			//Activator.getDefault().debug("\t\t ---------------- LogicalStep " + count);
			LogicalStep selectedLogicalStep = selectAndExecuteLogicalStep();						
			// 3 - run the selected logical step
			// inform the solver that we will run this step
			if (selectedLogicalStep != null)
			{
//				executeSelectedLogicalStep();
				engineStatus.setNbLogicalStepRun(engineStatus.getNbLogicalStepRun()+1);
				computePossibleLogicalSteps();
			} else {
				// no logical step was selected, this is most probably due to a preempt on the LogicalStepDecider  and a change of Decider, 
				//notify Addons that we'll rerun this ExecutionStep
				//recomputePossibleLogicalSteps();
			}
		}
	}
	
	
	private LogicalStep selectAndExecuteLogicalStep() {
		setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
		notifyAboutToSelectLogicalStep();
		LogicalStep selectedLogicalStep = null;
		try {
//			double randomChoice = (Math.random()*1000)%(_heterogeneousLogicalSteps.size());
//			System.out.println("size is "+_heterogeneousLogicalSteps.size()+" choice is "+ randomChoice);
//			HeterogeneousLogicalStep _selectedCompliantStep = _heterogeneousLogicalSteps.get((int)(Math.floor((float)randomChoice)));
			for(IConcurrentExecutionEngine eng : get_coordinatedEngines()){
				eng.getLogicalStepDecider().preempt();
			}
			selectedLogicalStep = //_selectedCompliantStep;
					getLogicalStepDecider().decide(this, getPossibleLogicalSteps());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (selectedLogicalStep != null)
		{
			setSelectedLogicalStep(selectedLogicalStep);
			setEngineStatus(EngineStatus.RunStatus.Running);
			notifyLogicalStepSelected();
			// run all the event occurrences of this logical
			// step
		//	notifyAboutToExecuteLogicalStep(selectedLogicalStep);
			executeSelectedLogicalStep();
			notifyLogicalStepExecuted(selectedLogicalStep);
		}
		return selectedLogicalStep;
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
	
	
	
	
	

	
	protected ArrayList<HeterogeneousLogicalStep> _heterogeneousLogicalSteps = new ArrayList<HeterogeneousLogicalStep>();
	
	public void computePossibleLogicalSteps(){
		try {
			_coordinationSolver.constructBDD();
		} catch (SimulationException e1) {e1.printStackTrace();}
		
		for(IConcurrentExecutionEngine engine : _coordinatedEngines){
			engine.computePossibleLogicalSteps();
			engine.updatePossibleLogicalSteps();
		}
		
		_heterogeneousLogicalSteps = null;
		try {
			_heterogeneousLogicalSteps = computeHeterogeneousLogicalStep();
		} catch (SimulationException e) {e.printStackTrace();}
		
		_selectedCompliantStep = _heterogeneousLogicalSteps.get(0);
		System.out.println(_heterogeneousLogicalSteps);
		System.out.println(_heterogeneousLogicalSteps.size());
		//here, in _HeterogeneousLogicalStep, we have a list of "compliant step". A compliant step 
		//is an ordered set of integer corresponding to the step number 
	}

	protected HeterogeneousLogicalStep _selectedCompliantStep = null;
//	private Collection<? extends LogicalStep> _possibleLogicalSteps = new ArrayList<LogicalStep>();
	
	@Override
	public LogicalStep getSelectedLogicalStep() 
	{
		synchronized (this) {
			return (LogicalStep) _selectedCompliantStep;
		}
	}
	
	@Override
	public void setSelectedLogicalStep(LogicalStep selectedStep) 
	{
		if (!(selectedStep instanceof HeterogeneousLogicalStep))
		{
			throw new RuntimeErrorException(new Error("you try to set a step to a coordinator engine, it should be instance of HeterogeneousLogicalStep and not of"+selectedStep.getClass().getCanonicalName()));
		}
		synchronized (this) {
			_selectedCompliantStep = (HeterogeneousLogicalStep) selectedStep;
		}
	}
	
	@Override
	public List<LogicalStep> getPossibleLogicalSteps() 
	{
		//synchronized (this)
//		{
			return new ArrayList<LogicalStep>(_heterogeneousLogicalSteps);
//		}
	}

	@Override
	public void stop() 
	{
		if (!_isStopped)
		{
			notifyAboutToStop(); // notification occurs only if not already stopped
			_isStopped = true;
//			setSelectedLogicalStep(null);
			if (getLogicalStepDecider() != null)
			{
				// unlock decider if this is a user decider
				getLogicalStepDecider().preempt();
			}
			for(IBasicExecutionEngine engine : _coordinatedEngines){
				((IExecutionEngine) engine).stop();
				((IExecutionEngine) engine).setEngineStatus(EngineStatus.RunStatus.Stopped);
				((IExecutionEngine) engine).notifyEngineStopped();
			}
		}
	}

	@Override
	public void recomputePossibleLogicalSteps()
	{
		for(IConcurrentExecutionEngine engine : _coordinatedEngines){
			engine.getSolver().revertForceClockEffect();
			engine.updatePossibleLogicalSteps();	
			engine.notifyProposedLogicalStepsChanged();
		}
		computePossibleLogicalSteps();
	}
	
	

	
	public void executeSelectedLogicalStep(){
		for(int i=0; i < _coordinatedEngines.size(); i++){
			IConcurrentExecutionEngine oneEngine = _coordinatedEngines.get(i);
			int theLogicalStepToSelect = _selectedCompliantStep.stepPositions.get(i);
			//if we chose the empty step, do nothing
			if(theLogicalStepToSelect==(oneEngine.getPossibleLogicalSteps().size())){
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

		//	oneEngine.notifyAboutToExecuteLogicalStep(selectedLogicalStep); 
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
		
		return ;//new Status(IStatus.OK, Activator.PLUGIN_ID, "Execution step was successfull");
	}
	
	public String getName() {
		return "Gemoc engine " + _executionContext.getRunConfiguration().getExecutedModelURI();
	}
	
	@Override
	public void start(){
		if (!_started) {
			_started = true;
			Runnable r = new Runnable() {

				@Override
				public void run() {
					try {
						notifyEngineAboutToStart();
						Activator.getDefault().gemocRunningEngineRegistry.registerEngine(getName(), HeterogeneousEngine.this);
						setEngineStatus(EngineStatus.RunStatus.Running);
						computePossibleLogicalSteps();
						notifyEngineStarted();
						getRunnable().run();
					} catch (Throwable e) {
						e.printStackTrace();
						Activator.getDefault().error("Exception received " + e.getMessage() + ", stopping engine.", e);
						StringWriter sw = new StringWriter();
						e.printStackTrace(new PrintWriter(sw));
						String exceptionAsString = sw.toString();

						Activator.getDefault().error(exceptionAsString);
					} finally {
						// make sure to notify the stop if this wasn't an
						// external call to stop() that lead us here.
						// ie. normal end of the mode execution
						stop();
						setEngineStatus(EngineStatus.RunStatus.Stopped);
						notifyEngineStopped();
					}
				}
			};
			thread = new Thread(r, engineKindName()+" " + _executionContext.getRunConfiguration().getExecutedModelURI());
			thread.start();
		}
	}
	
//	@Override
	protected Runnable getRunnable() 
	{
//		performExecutionStep();
		return new EngineRunnable();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	@Override
	public String engineKindName() {
		return "GEMOC heterogeneous Coordination Engine";
	}

	@Override
	public IConcurrentExecutionContext getConcurrentExecutionContext() {
		return (IConcurrentExecutionContext) _executionContext;
	}
	@Override
	public void updatePossibleLogicalSteps() {
		// TODO Auto-generated method stub
	}
	@Override
	public void addFutureAction(IFutureAction action) {
	}
	@Override
	public ILogicalStepDecider getLogicalStepDecider() {
		return ((CoordinatedModelExecutionContext)_executionContext).get_logicalStepDecider();
	}
	
	@Override
	public void changeLogicalStepDecider(ILogicalStepDecider newDecider) {
		((CoordinatedModelExecutionContext)_executionContext).set_logicalStepDecider(newDecider);
	}
	@Override
	public ISolver getSolver() {
		return null;
	}
	@Override
	public void setSolver(ISolver solver) {
		
	}
	@Override
	public ICodeExecutor getCodeExecutor() {
		return null;
	}
	@Override
	public void notifyLogicalStepSelected() {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) 
		{
			try {
				addon.logicalStepSelected(this, getSelectedLogicalStep());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon "+addon+", "+e.getMessage(), e);
			}
		}	
	}
	@Override
	public void notifyAboutToSelectLogicalStep() {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) 
		{
			try {
				addon.aboutToSelectLogicalStep(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon "+addon+", "+e.getMessage(), e);
			}
		}
		
	}
	@Override
	public void notifyProposedLogicalStepsChanged(){
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) 
		{
			try {
				addon.proposedLogicalStepsChanged(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon "+addon+", "+e.getMessage(), e);
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}
