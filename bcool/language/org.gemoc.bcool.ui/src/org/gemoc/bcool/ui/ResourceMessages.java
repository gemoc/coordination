package org.gemoc.bcool.ui;

import org.eclipse.osgi.util.NLS;

public class ResourceMessages extends NLS {
	private static final String BUNDLE_NAME = "org.gemoc.bcool.ui.messages";//$NON-NLS-1$

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
