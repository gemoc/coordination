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
package org.eclipse.gemoc.bcool.ui;

import org.eclipse.osgi.util.NLS;

public class ResourceMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gemoc.bcool.ui.messages";//$NON-NLS-1$

	// ==============================================================================
	// New Resource Wizards
	// ==============================================================================

	public static String NewProject_windowTitle;
	public static String NewProject_title;
	public static String NewProject_description;
	

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, ResourceMessages.class);
	}
}
