package com.testH.app.baseHelper;

public interface ConfigReaderHelper {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public String getUserName();
	public String getPassword();
	public String getEnvironment();
	public String getAUT_URL();
	public String getAUT_ADMIN_URL(); 
	
	
	public String getTargetDevice();
	

}
