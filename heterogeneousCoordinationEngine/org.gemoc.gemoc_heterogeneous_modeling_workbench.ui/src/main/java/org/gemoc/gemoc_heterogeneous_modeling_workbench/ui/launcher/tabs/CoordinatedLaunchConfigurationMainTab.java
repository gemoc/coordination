package org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher.tabs;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedRunConfiguration;
import org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.Activator;
import org.gemoc.gemoc_language_workbench.api.core.IRunConfiguration;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;

public class CoordinatedLaunchConfigurationMainTab extends LaunchConfigurationTab {

	protected Composite _parent;
	
	protected Text _bcoolLocationText;
	protected Text _firstConfigurationLocationText;
	protected Text _secondConfigurationLocationText;
	
	
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
			_bcoolLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getBcoolModelURI()));
			_firstConfigurationLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getConfigurationURI1()));
			_secondConfigurationLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getConfigurationURI2()));
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
		configuration.setAttribute(
				"Configuration1",
				this._firstConfigurationLocationText.getText());
		configuration.setAttribute(
				"Configuration2",
				this._secondConfigurationLocationText.getText());
		
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
		createTextLabelLayout(parent, "Model to execute");
		// Model location text
		_bcoolLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_bcoolLocationText.setLayoutData(createStandardLayout());
		_bcoolLocationText.setFont(font);
		_bcoolLocationText.addModifyListener(fBasicModifyListener);
		Button modelLocationButton = createPushButton(parent, "Browse", null);
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
		createTextLabelLayout(parent, "configuration of first model to execute");
		// Model location text
		_firstConfigurationLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_firstConfigurationLocationText.setLayoutData(createStandardLayout());
		_firstConfigurationLocationText.setFont(font);
		_firstConfigurationLocationText.addModifyListener(fBasicModifyListener);
		Button firstConfigurationLocationButton = createPushButton(parent, "Browse", null);
		firstConfigurationLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					_firstConfigurationLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});	
		createTextLabelLayout(parent, "configuration of second model to execute");
		// Model location text
		_secondConfigurationLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_secondConfigurationLocationText.setLayoutData(createStandardLayout());
		_secondConfigurationLocationText.setFont(font);
		_secondConfigurationLocationText.addModifyListener(fBasicModifyListener);
		Button secondConfigurationLocationButton = createPushButton(parent, "Browse", null);
		secondConfigurationLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					_secondConfigurationLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});	
		return parent;
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
