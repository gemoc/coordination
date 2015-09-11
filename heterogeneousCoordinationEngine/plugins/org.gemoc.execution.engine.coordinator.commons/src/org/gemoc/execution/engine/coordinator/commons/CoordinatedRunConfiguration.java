package org.gemoc.execution.engine.coordinator.commons;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.gemoc.gemoc_language_workbench.api.core.IRunConfiguration;
import org.gemoc.gemoc_language_workbench.api.extensions.engine_addon.EngineAddonSpecificationExtension;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;

public class CoordinatedRunConfiguration //implements IRunConfiguration
{
	
	// main launch parameters
	public static final String LAUNCH_BCOOL_PATH = "GEMOC_LAUNCH_MODEL_PATH";
		
	private ILaunchConfiguration _launchConfiguration;
	
	public CoordinatedRunConfiguration(ILaunchConfiguration launchConfiguration) throws CoreException
	{
		_launchConfiguration = launchConfiguration;
		extractInformation();
	}


	private void extractInformation() throws CoreException 
	{
		_bcoolURI = URI.createPlatformResourceURI(
				getAttribute(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI, ""),
				true);
		
		_ConfigurationURI1 = URI.createPlatformResourceURI(
				getAttribute("Configuration1", "")
				,true);
		_ConfigurationURI2 = URI.createPlatformResourceURI(
				getAttribute("Configuration2", "")
				,true);
	}

	private String getAttribute(String attributeName, String defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	private Integer getAttribute(String attributeName, Integer defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	private Boolean getAttribute(String attributeName, Boolean defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	private String _bcoolFileName;
	public String getBcoolFileName() 
	{
		return _bcoolFileName;
	}
	

	private URI _bcoolURI;
	public URI getBcoolModelURI() 
	{
		return _bcoolURI;
	}
	private URI _ConfigurationURI1;
	public URI getConfigurationURI1() 
	{
		return _ConfigurationURI1;
	}
	private URI _ConfigurationURI2;
	public URI getConfigurationURI2() 
	{
		return _ConfigurationURI2;
	}

//
//	@Override
//	public String getLanguageName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public URI getExecutedModelURI() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public URI getExecutedModelAsMelangeURI() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public String getMelangeQuery() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public URI getAnimatorURI() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public int getAnimationDelay() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//
//	@Override
//	public int getDeadlockDetectionDepth() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//
//	@Override
//	public Collection<EngineAddonSpecificationExtension> getEngineAddonExtensions() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public String getDeciderName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public String getExecutionEntryPoint() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

}
