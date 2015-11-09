package org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher.tabs;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedRunConfiguration;
import org.gemoc.execution.engine.ui.commons.RunConfiguration;
import org.gemoc.executionengine.ccsljava.api.extensions.deciders.DeciderSpecificationExtension;
import org.gemoc.executionengine.ccsljava.api.extensions.deciders.DeciderSpecificationExtensionPoint;
import org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.Activator;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;

public class CoordinatedLaunchConfigurationMainTab extends LaunchConfigurationTab {

	protected Composite _parent;
	
	protected Text _bcoolLocationText;
	protected ArrayList<Text> _configurationLocationTexts = new ArrayList<Text>();
	protected Combo _deciderCombo;
	protected ArrayList<Button> _browseLocationButtons = new ArrayList<Button>();
	protected ArrayList<Label> _configLabels = new ArrayList<Label>();
	private int nb_configLocations = 0;

	
	protected ArrayList<LaunchConfigurationTab> _modelConfigurations;
	public int GRID_DEFAULT_WIDTH = 200;

	@Override
	public void createControl(Composite parent) {
		_parent = parent;
		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		Group modelArea = createGroup(area, "BCOoL Model:");
		createModelLayout(modelArea, null);

		
	}
	
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) 
	{
		try 
		{
			CoordinatedRunConfiguration runConfiguration = new CoordinatedRunConfiguration(configuration);
			nb_configLocations=0;
			for(Button b : _browseLocationButtons){
				b.dispose();
			}
			_browseLocationButtons.clear();
			for(Text t : _configurationLocationTexts){
				t.dispose();
			}
			_configurationLocationTexts.clear();
			for(Label l : _configLabels){
				l.dispose();
			}
			_configLabels.clear();
			_bcoolLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getBcoolModelURI()));
			nb_configLocations = configuration.getAttribute("nb_logicalSteps", 0);
			for (int i = 0; i < nb_configLocations; i++){
				createConfigLocationUI(_parent, i);
				String path = configuration.getAttribute("Configuration"+(i), (String)null);
				URI confURI = URI.createURI(path);
				runConfiguration.getConfigurationURIs().add(confURI);
				if (path != null && path.length() != 0){
					_configurationLocationTexts.get(i).setText( URIHelper.removePlatformScheme(confURI));
				}
			}
			_deciderCombo.setText(runConfiguration.getDeciderName());
			
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) 
	{
		configuration.setAttribute(
				AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,
				this._bcoolLocationText.getText());
		for (int i = 0; i < _configurationLocationTexts.size(); i++){
			configuration.setAttribute(
				"Configuration"+i,
				this._configurationLocationTexts.get(i).getText());
		}
		configuration.setAttribute("nb_logicalSteps", nb_configLocations);
		configuration.setAttribute(CoordinatedRunConfiguration.LAUNCH_SELECTED_DECIDER, this._deciderCombo.getText());

		
	}

	@Override
	public String getName() {
		return "Main";
	}

	// -----------------------------------

	/**
	 * Basic modify listener that can be reused if there is no more precise need
	 */
	private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	};




	// -----------------------------------
	
	
	/***
	 * Create the Field where user enters model to execute
	 * 
	 * @param parent
	 * @param font
	 * @return
	 */
	public Composite createModelLayout(Composite parent, Font font) {
		_parent = parent;
		createTextLabelLayout(_parent, "BCOoL specification");
		// Model location text
		_bcoolLocationText = new Text(_parent, SWT.SINGLE | SWT.BORDER);
		_bcoolLocationText.setLayoutData(createStandardLayout());
		_bcoolLocationText.addModifyListener(fBasicModifyListener);
		Button modelLocationButton = createPushButton(_parent, "Browse", null);
		modelLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					_bcoolLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});	
		
		
		
		createTextLabelLayout(parent, "Decider");
		_deciderCombo = new Combo(parent, SWT.BORDER);
		_deciderCombo.setLayoutData(createStandardLayout());

		createTextLabelLayout(parent, " - ");

		
		ArrayList<String> deciders = new ArrayList<>();
		for (DeciderSpecificationExtension definition : DeciderSpecificationExtensionPoint.getSpecifications()) {
			deciders.add(definition.getName());
		}

		String[] a = new String[deciders.size()];
		_deciderCombo.setItems(deciders.toArray(a));
		_deciderCombo.select(0);
		_deciderCombo.addModifyListener(fBasicModifyListener);
		
		// Model location text
		for (int i = 0; i < nb_configLocations; i++){
			createConfigLocationUI(_parent, i);	
		}
		
		Button addConfig = createPushButton(_parent, "Add Configuration", null);
		createTextLabelLayout(parent, " - ");
		createTextLabelLayout(parent, " - ");
		
		addConfig.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {

				createConfigLocationUI(_parent, nb_configLocations);
				nb_configLocations++;
				updateLaunchConfigurationDialog();
				}
			});	

		
		
		
		return parent;
	}


	protected void createConfigLocationUI(Composite parent, int i) {
		_configLabels.add(createTextLabelLayout(parent, "configuration of model #"+i+" to execute"));
		_configurationLocationTexts.add(new Text(parent, SWT.SINGLE | SWT.BORDER));
		final Text iemeText = _configurationLocationTexts.get(i);
		iemeText.setLayoutData(createStandardLayout());
		iemeText.addModifyListener(fBasicModifyListener);
		_browseLocationButtons.add(createPushButton(parent, "Browse", null));
		_browseLocationButtons.get(i).addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					iemeText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});
	}
	
	

	private GridData createStandardLayout() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false);
	}

	
	@Override
	protected void updateLaunchConfigurationDialog() 
	{
		super.updateLaunchConfigurationDialog();
	}


	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}
}
