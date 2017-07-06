/*******************************************************************************
 * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.workbench.heterogeneous.ui.launcher.tabs;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public abstract class LaunchConfigurationTab extends AbstractLaunchConfigurationTab 
{

	public LaunchConfigurationTab() {
		super();
	}

	protected Group createGroup(Composite parent, String text, int Columns) {
		Group group = new Group(parent, SWT.NULL);
		group.setText(text);
		GridLayout locationLayout = new GridLayout();
		locationLayout.numColumns = Columns;
		locationLayout.marginHeight = 10;
		locationLayout.marginWidth = 10;
		group.setLayout(locationLayout);
		return group;
	}
	
	/**
	 * 
	 * @param parent
	 *            the Parent of this argument tab
	 * @param labelString
	 *            the label of the input text to create
	 * @param adapter
	 *            the event that is triggered when clicking on OK button
	 */
	protected Label createTextLabelLayout(Composite parent, String labelString) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		parent.setLayoutData(gd);
		Label inputLabel = new Label(parent, SWT.NONE);
		inputLabel.setText(labelString); //$NON-NLS-1$
		return inputLabel;
		//gd = new GridData();
		//gd.horizontalSpan = 2;
		//inputLabel.setLayoutData(gd);
	}

}