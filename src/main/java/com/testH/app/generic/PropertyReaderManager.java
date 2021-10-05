package com.testH.app.generic;

import java.io.FileInputStream;
import java.util.Properties;

import com.gargoylesoftware.css.dom.Property;
import com.testH.app.baseHelper.ConfigReaderHelper;
import com.testH.app.generic.Pojo;

public class PropertyReaderManager implements ConfigReaderHelper
 {
	Properties objConfig;
	
	public PropertyReaderManager (){
		this.loadConfigProperties();
	}
	
	public Properties loadConfigProperties() {
		 
		 try {
				objConfig = new Properties();
				objConfig.load(new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/configuration/config.properties"));
				//objConfig.load(new FileInputStream(
					//	System.getProperty("user.dir") + "/src/test/resources/configuration/appConfig.properties"));
				Pojo.setObjConfig(objConfig);
				return objConfig;

			} catch (Exception exception) {
				System.out.println("Error Message -------> "+exception.getMessage());
				exception.printStackTrace();
			}
		return objConfig;
	}
	
	public String getProperty(String key) {
		String strValue = "";
		if (key != "") {
			this.loadConfigProperties();
			try {
				if (!objConfig.getProperty(key).trim().isEmpty())
					strValue = objConfig.getProperty(key).trim();
			} catch (NullPointerException exception) {
				System.out.println("Config property file data does not exist.");
				exception.printStackTrace();
			}
		} else {
			System.out.println("Config proprty key cannot be null..");
		}
		return strValue;
	}

	
	
	public int getImpliciteWait() {
		return Integer.parseInt(objConfig.getProperty("driver.implicitlyWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(objConfig.getProperty("driver.WebDriverWait"));
	}

	public int getPageLoadTime() {
		return Integer.parseInt(objConfig.getProperty("driver.pageLoadTimeout"));
	}

	public String getUserName() {
		
			return objConfig.getProperty("AUT_USERNAME");
		
	}

	public String getPassword() {
		return objConfig.getProperty("AUT_PASSWORD");
	}

	public String getTargetDevice() {
		return objConfig.getProperty("Target.Device");
	}

	public String getEnvironment() {
		return objConfig.getProperty("environment");
	}

	public String getAUT_URL() {
		return objConfig.getProperty("AUT_URL");
	}

	public String getAUT_ADMIN_URL() {
		return objConfig.getProperty("AUT_ADMIN_URL");
	}

	
}
