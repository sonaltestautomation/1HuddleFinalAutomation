package com.testH.app.generic;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.InitializeEnvironmentHelper;
import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.UtilitiesFunctions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import com.testH.app.generic.TestData;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.SeleniumFunctionsWebApp;
import com.testH.app.baseHelper.InitializeEnvironmentHelper;
import com.testH.app.generic.PropertyReaderManager;
import org.apache.log4j.Logger;




  /*  This class will load all test data, load all objects,
      initialize web driver, start reports. Contains generic
      functionalities like open browser, login/logout
  
 */

public class BaseTest extends Pojo {
	
	private AppiumDriverLocalService service;
	private WebDriver webDriver;
	private AndroidDriver<AndroidElement> androidDriver;
	
	private Properties objConfig;
	private WebDriverWait webDriverWait;
	private String baseURL = "";
	private String targetDevice="";
	
	private InitializeEnvironment objInitializeEnvironment;
    private UtilitiesFunctions objUtilitiesFunctions;
	private SeleniumFunctionsHelper objSeleniumFunctions;
	//private PropertyReaderManager objPropertyReaderManager;
	private TestData objTestData;
	
	By loc_EnterEmailTextBox=By.xpath("//input[@name='username']");
	
	
	public void initializeWebEnvironment() {
		
	//	objPropertyReaderManager=new PropertyReaderManager();
	    String targetDeviceName = Pojo.getObjConfig().getProperty("Target.Device").trim().toLowerCase();
		System.out.println("Step Description ----->  Targeted Device : " + targetDeviceName);
       
		if(targetDeviceName.toLowerCase().equals("desktopview") || targetDeviceName.toLowerCase().equals("mobileview"))
		{
			objInitializeEnvironment=new InitializeEnvironment();
			webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
			Pojo.setDriver(webDriver);
			webDriverWait = new WebDriverWait(webDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
			Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsWebApp();
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			baseURL = Pojo.getObjConfig().getProperty("AUT_URL");
			Pojo.setBaseURL(baseURL);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);	
			this.loadBaseURL();
			//Pojo.getObjSeleniumFunctions().waitFor(20);
			Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_EnterEmailTextBox);
			
		}
			else if(targetDeviceName.toLowerCase().equals("androidapp")){
				
			}
			else {
				
			}}

	
	 /* Open Base URL*/
	  
	 public void loadBaseURL() {
		try {		
			Pojo.getDriver().get(getBaseURL());			
		} catch (Exception exception) {
			exception.printStackTrace();

		}}
	
	
	public void tearDownWebEnvironment() {

		try {
				Pojo.getDriver().manage().deleteAllCookies();
				Thread.sleep(2000);
				Pojo.getDriver().quit();
				Thread.sleep(2000);
				Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
				Thread.sleep(1500);
				 Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
				Thread.sleep(1500);
				Pojo.getObjUtilitiesFunctions().consoleLogPrinter("Kill Windows Chrome Browser and chromedriver.exe  ...!!!!!!");
			} 
			 catch (Exception exception) {
				System.out.println("Not able to close chrome driver backend process.");
				System.out.println("Linux chrome driver process 'ERROR MESSAGE' ----> "+exception.getLocalizedMessage().toString());
			 }}

	/*
	  createLo4jLogerDirectory
	*/
	public void createLo4jLogerDirectory() {
		String logFilePath = System.getProperty("user.dir") + "/target/custom-reports/log4j-Logger.log";
		File reportFile = new File(logFilePath);
		try {
			// If file not exist create for running script details
			if (!reportFile.exists()) {
				new File(System.getProperty("user.dir") + "/target/custom-reports").mkdir();
				reportFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* This method initialize web driver for web application by
	              opening the browser and URL specified in config.properties
	              file
	*/
	public void initializeWebEnvironmentIncognitoForAdmin() {
		
	//	objPropertyReaderManager=new PropertyReaderManager();
	    String targetDeviceName = Pojo.getObjConfig().getProperty("Target.Device").trim().toLowerCase();
		System.out.println("Step Description ----->  Targeted Device : " + targetDeviceName);
       
		if(targetDeviceName.toLowerCase().equals("desktopview") || targetDeviceName.toLowerCase().equals("mobileview"))
		{
			objInitializeEnvironment=new InitializeEnvironment();
			webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
			Pojo.setDriver(webDriver);
			webDriverWait = new WebDriverWait(webDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
			Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsWebApp();
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			baseURL = Pojo.getObjConfig().getProperty("AUT_ADMIN_URL");
			Pojo.setBaseURL(baseURL);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);	
			this.loadBaseURL();
			//Pojo.getObjSeleniumFunctions().waitFor(20);
		}
			else if(targetDeviceName.toLowerCase().equals("androidapp")){
				
			}
		
			else {
				
			}}

	
	
	/*Description : This method initialize web driver for web application by
	                opening the browser and URL specified in config.properties
	                file
	*/
	public void initializeWebEnvironmentIncognitoForEmail() {
		
		objInitializeEnvironment=new InitializeEnvironment();
		webDriver=objInitializeEnvironment.initializeWebEnvironment(objConfig);
		Pojo.setDriver(webDriver);
		webDriverWait = new WebDriverWait(webDriver,
				Integer.parseInt(objConfig.getProperty("driver.WebDriverWait").trim()));
		Pojo.setWebDriverWait(webDriverWait);
		objUtilitiesFunctions = new UtilitiesFunctions();
		Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
		objSeleniumFunctions = new SeleniumFunctionsWebApp();
		Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
		baseURL = objConfig.getProperty("EMAIL_URL");		
		Pojo.setBaseURL(baseURL);
		objTestData = new TestData();
		Pojo.setObjTestData(objTestData);	
		this.loadBaseURL();

	}
	
public void initializEnvironmentIncognito() throws InterruptedException, IOException {
		
	//	objPropertyReaderManager=new PropertyReaderManager();
	    String targetDeviceName = Pojo.getObjConfig().getProperty("Target.Device").trim().toLowerCase();
		System.out.println("Step Description ----->  Targeted Device : " + targetDeviceName);
       
		if(targetDeviceName.toLowerCase().equals("desktopview") || targetDeviceName.toLowerCase().equals("mobileview"))
		{
			objInitializeEnvironment=new InitializeEnvironment();
			webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
			Pojo.setDriver(webDriver); 
			webDriverWait = new WebDriverWait(webDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
			Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsWebApp();
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);	
			//Pojo.getObjSeleniumFunctions().waitFor(20);
		}
		else if(targetDeviceName.toLowerCase().equals("androidapp")){
//			objInitializeEnvironment=new InitializeEnvironment();
//			service=objInitializeEnvironment.startServer();
//			Pojo.setAppiumService(service);
//			System.out.println("AppName");
			
//			androidDriver=objInitializeEnvironment.capabilities(Pojo.getObjConfig().getProperty("AppName"));
//			Pojo.setAndroidDriver(androidDriver);
//			Pojo.setDriver(androidDriver);
//			webDriverWait = new WebDriverWait(androidDriver,
//					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
//			Pojo.setWebDriverWait(webDriverWait);
//			objUtilitiesFunctions = new UtilitiesFunctions();
//		    Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
//			objSeleniumFunctions = new SeleniumFunctionsAndroidEnv();			
//			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
//			objTestData = new TestData();
//			Pojo.setObjTestData(objTestData);	
			
			}
		else if(targetDeviceName.toLowerCase().equals("firefox"))
			{
				objInitializeEnvironment=new InitializeEnvironment();
				webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
				Pojo.setDriver(webDriver);
				webDriverWait = new WebDriverWait(webDriver,
						Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
				Pojo.setWebDriverWait(webDriverWait);
				objUtilitiesFunctions = new UtilitiesFunctions();
				Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
				objSeleniumFunctions = new SeleniumFunctionsWebApp();
				Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
				objTestData = new TestData();
				Pojo.setObjTestData(objTestData);	
			}
		else {
				
			}}


public void loadWebAppUrl() {
	
	if(Pojo.getObjConfig().get("Target.Device").equals("DesktopView"))
	{
	try {

		baseURL = Pojo.getObjConfig().getProperty("AUT_URL");
		Pojo.setBaseURL(baseURL);
		this.loadBaseURL();
		

	} catch (Exception exception) {
		exception.printStackTrace();

	}}
	else
	{
		System.out.println("MobileApp Already Installed");
	}
}

public void loadAdminAppUrl() {
	if(Pojo.getObjConfig().get("Target.Device").equals("DesktopView"))
	{
	try {
		baseURL = Pojo.getObjConfig().getProperty("AUT_ADMIN_URL");
		Pojo.setBaseURL(baseURL);
		System.out.println("Load Admin Url...");
		this.loadBaseURL();

	} catch (Exception exception) {
		exception.printStackTrace();

	}}}

public void loadGmailUrl() {
	try {
		
		objInitializeEnvironment=new InitializeEnvironment();
		webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
		Pojo.setDriver(webDriver); 
		webDriverWait = new WebDriverWait(webDriver,
				Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
		Pojo.setWebDriverWait(webDriverWait);
		objUtilitiesFunctions = new UtilitiesFunctions();
		Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
		objSeleniumFunctions = new SeleniumFunctionsWebApp();
		Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
		objTestData = new TestData();
		Pojo.setObjTestData(objTestData);	
		
		
		baseURL = Pojo.getObjConfig().getProperty("EMAIL_URL");
		Pojo.setBaseURL(baseURL);
		this.loadBaseURL();

	} catch (Exception exception) {
		exception.printStackTrace();

	}}

}
