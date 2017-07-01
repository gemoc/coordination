package org.eclipse.gemoc.workbench.heterogeneous.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.gemoc.workbench.heterogeneous.ui.launcher.tabs.CoordinatedLaunchConfigurationMainTab;

public class LauncherTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LauncherTabGroup() 
	{
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { 
				new CoordinatedLaunchConfigurationMainTab(),
//                new LaunchConfigurationConfigurationTab(),
//                new LaunchConfigurationBackendsTab(),
                new CommonTab()
		};
		setTabs(tabs);
	}

}
