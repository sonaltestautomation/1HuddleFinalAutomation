package com.testH.app.generic;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.UtilitiesFunctions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import com.testH.app.generic.TestData;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.PropertyReaderManager;



/*
   This class will used to set common properties 
   like webdriver and properties files.
*/
public class Pojo {
	
	private static String baseURL = "";
	
	private static AppiumDriverLocalService service;
	private static WebDriver webDriver;
	private static AndroidDriver<AndroidElement> androidDriver;
	private static UtilitiesFunctions objUtilitiesFunctions;
	private static SeleniumFunctionsHelper objSeleniumFunctions;
	private static Properties objConfig;
	private static WebDriverWait webDriverWait;
	private static TestData objTestData;

	public static void setDriver(WebDriver webDriver) {
		Pojo.webDriver = webDriver;
	}
	public static WebDriver getDriver()
	{
		return webDriver;
	}
	
	public static void setAndroidDriver(AndroidDriver<AndroidElement> androidDriver) {
		Pojo.androidDriver = androidDriver;
	} 
	
	public static AndroidDriver<AndroidElement> getAndroidDriver() {
		return androidDriver;
	}

   public static void setAppiumService(AppiumDriverLocalService service) {
		Pojo.service = service;
	}
	public static AppiumDriverLocalService getAppiumService()
	{
		return service;
	}
	
	public static void setObjConfig(Properties objPropertyReaderManager)
	{
		objConfig = objPropertyReaderManager;
	}


	public static Properties getObjConfig()
	{
		return objConfig;
	}
	
	public static void setBaseURL(String baseURL) 
	{
		Pojo.baseURL = baseURL;
	}
	
	public static String getBaseURL() {
		return baseURL;
	}
	
	public static void setObjUtilitiesFunctions(UtilitiesFunctions objUtilitiesFunctions) {
		Pojo.objUtilitiesFunctions = objUtilitiesFunctions;
	}
	public static UtilitiesFunctions getObjUtilitiesFunctions() {
		return objUtilitiesFunctions;
	}
	
	public static void setObjSeleniumFunctions(SeleniumFunctionsHelper objSeleniumFunctions) {
		Pojo.objSeleniumFunctions = objSeleniumFunctions;
	}
	
	public static SeleniumFunctionsHelper getObjSeleniumFunctions() {
		return objSeleniumFunctions;
	}
	public static void setWebDriverWait(WebDriverWait webDriverWait)
	{
		Pojo.webDriverWait = webDriverWait;
	}

	public static WebDriverWait getWebDriverWait()
	{
		return webDriverWait;
	}
	
	public static TestData getObjTestData() {
		return objTestData;
	}


	public static void setObjTestData(TestData objTestDataBean) {
		Pojo.objTestData = objTestDataBean;
	}
	
}
