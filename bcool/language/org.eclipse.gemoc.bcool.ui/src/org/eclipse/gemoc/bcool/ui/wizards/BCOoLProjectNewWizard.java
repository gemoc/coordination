/*******************************************************************************
 * Copyright (c) 2016, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.bcool.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gemoc.commons.eclipse.pde.ui.PluginConverter;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.gemoc.bcool.model.xtext.builder.GemocBCOoLNature;
import org.eclipse.gemoc.bcool.ui.Activator;
import org.eclipse.gemoc.bcool.ui.ResourceMessages;
import org.eclipse.gemoc.commons.eclipse.core.resources.IProjectUtils;

/**
 * @author Didier Vojtisek<didier.vojtisek@inria.fr>
 *
 */
public class BCOoLProjectNewWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage mainPage;

	// cache of newly-created project
	private IProject newProject;

    /**
     * The workbench.
     */
    private IWorkbench workbench;

	/**
	 * The current selection.
	 */
	protected IStructuredSelection selection;

	/**
	 * 
	 */
	public BCOoLProjectNewWizard() {
		super();
		setNeedsProgressMonitor(true);

	}

	@Override
	public void addPages() {
		super.addPages();

		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage") { //$NON-NLS-1$
			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				createWorkingSetGroup(
						(Composite) getControl(),
						selection,
						new String[] { "org.eclipse.ui.resourceWorkingSetPage" }); //$NON-NLS-1$
				Dialog.applyDialogFont(getControl());
			}
		};
		mainPage.setTitle(ResourceMessages.NewProject_title);
		mainPage.setDescription(ResourceMessages.NewProject_description);
		this.addPage(mainPage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench theWorkbench, IStructuredSelection currentSelection) {
        this.workbench = theWorkbench;
		this.selection = currentSelection;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		createNewProject();

		if (newProject == null) {
			return false;
		}
		IWorkingSet[] workingSets = mainPage.getSelectedWorkingSets();
		getWorkbench().getWorkingSetManager().addToWorkingSets(newProject,
				workingSets);
		return true;
	}


	/**
	 * Creates a new project resource with the selected name.
	 * <p>
	 * In normal usage, this method is invoked after the user has pressed Finish
	 * on the wizard; the enablement of the Finish button implies that all
	 * controls on the pages currently contain valid values.
	 * </p>
	 * <p>
	 * Note that this wizard caches the new project once it has been
	 * successfully created; subsequent invocations of this method will answer
	 * the same project resource without attempting to create it again.
	 * </p>
	 *
	 * @return the created project resource, or <code>null</code> if the
	 *         project was not created
	 */
	private IProject createNewProject() {
		if (newProject != null) {
			return newProject;
		}

		// get a project handle
		final IProject createdProject = mainPage.getProjectHandle();

		try {
			//final String languageName = _askLanguageNamePage.getLanguageName();

			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			final IProjectDescription description = workspace.newProjectDescription(createdProject.getName());
			if (!mainPage.getLocationPath().equals(workspace.getRoot().getLocation()))
				description.setLocation(mainPage.getLocationPath());
			//description.setLocationURI(_askProjectNamePage.getLocationURI());

			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					createdProject.create(description, monitor);
					createdProject.open(monitor);			 

					// this is a plugin
					try {
						PluginConverter.convert(createdProject);
					} catch (InvocationTargetException e) {
						Activator.error(e.getMessage(), e);
					} catch (InterruptedException e) {
						Activator.error(e.getMessage(), e);
					}

					// add BCOoL nature
					IProjectDescription newdescription = createdProject.getDescription();
					String[] natures = newdescription.getNatureIds();
					String[] newNatures = new String[natures.length + 1];
					System.arraycopy(natures, 0, newNatures, 0, natures.length);
					newNatures[natures.length] = GemocBCOoLNature.NATURE_ID;
					newdescription.setNatureIds(newNatures);
					createdProject.setDescription(newdescription, null);

					// add some content
					IProjectUtils.createFolder(createdProject, "operator", monitor);

					String contents = "L1AndL2\n\n"+			
									"// ImportLib \"platform:/resource"+createdProject.getFullPath().toString()+"/operator/facilities.bcoollib\"\n"+
									"// ImportLib \"platform:/resource"+createdProject.getFullPath().toString()+"/operator/facilities.moccml\"\n\n"+
									"// ImportInterface \"platform:/resource/L1/ecl/L1.ecl\"  as L1\n"+
									"// ImportInterface \"platform:/resource/L2/ecl/L2.ecl\"  as L2\n\n";
					IProjectUtils.createFile(createdProject, "operator/my.bcool", contents, monitor);

					// add result of builder in the plugin jar
					String buildFileContent = "bin.includes = META-INF/,\\\r\n\tgemoc-gen/";
					IProjectUtils.setFileContent(createdProject, "build.properties", buildFileContent);

					createdProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					createdProject.touch(new NullProgressMonitor()); 
				}
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
		} catch (CoreException exception) {
			Activator.error(exception.getMessage(), exception);
			return null;
		}

		newProject = createdProject;

		return newProject;
	}



	/**
	 * Returns the newly created project.
	 *
	 * @return the created project, or <code>null</code> if project not
	 *         created
	 */
	public IProject getNewProject() {
		return newProject;
	}


	public IWorkbench getWorkbench() {
		return workbench;
	}
}
