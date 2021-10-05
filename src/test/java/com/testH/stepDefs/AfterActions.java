package com.testH.stepDefs;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;


public class AfterActions  {
	
	//WebDriver driver=Pojo.getDriver();
	String screenshotdir = System.getProperty("user.dir") + "/test-output/HtmlReport/";


	@After
	public void tearDown(Scenario scenario) throws IOException {
		
		//System.out.println("Scenario Failed: "+scenario.isFailed());
    	// if (scenario.isFailed()) {
    		 
    	//	 embedScreenshot(scenario);
    	// }
     	System.out.println("TearDownWebEnvironment......!!!");
     	
     	if(Pojo.getObjConfig().get("Target.Device").toString().trim().equals("androidapp"))
     	{
     		AllUsersPage.expectedDataUser.put("FirstName", null);
     		AllUsersPage.expectedDataUser.put("LastName", null);
       if(Pojo.getAndroidDriver().currentActivity()!=null)
       {
        Pojo.getAndroidDriver().closeApp();
       }
     	
        if(Pojo.getAppiumService()!=null) {
        System.out.println("Stopping Appium Server");
		Pojo.getAppiumService().stop();
		}}
     	else if(Pojo.getObjConfig().get("Target.Device").toString().trim().equals("DesktopView"))
     	{
     		AllUsersPage.expectedDataUser.put("FirstName", null);
     		AllUsersPage.expectedDataUser.put("LastName", null);
     		
     	System.out.println("Quitting Web Browser");
	//   Pojo.getDriver().quit();
     	}
     	
     	
    }
	
	
	
	@AfterStep
	public void embedScreenshot(Scenario scenario) throws IOException {
		//System.out.println("Scenario Failed: "+scenario.isFailed());
		
		if(Pojo.getObjConfig().get("Target.Device").toString().trim().equals("androidapp"))
		{
			if(scenario.isFailed())
			{
			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getBase64Screenshot(Pojo.getAndroidDriver())); 
	        byte[] screenshotBytes = ((TakesScreenshot) Pojo.getAndroidDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
			}
		}
		
		else if(scenario.isFailed())
		{
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getBase64Screenshot(Pojo.getDriver())); 
        byte[] screenshotBytes = ((TakesScreenshot) Pojo.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotBytes, "image/png");
		}
	}

	public String getBase64Screenshot(WebDriver driver) throws IOException {
	    String Base64StringofScreenshot="";
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    // for saving screenshots in local - this is optional 
	    Date oDate = new Date();
	    SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
	    String sDate = oSDF.format(oDate);
	    FileUtils.copyFile(src, new File(screenshotdir + "Screenshot_" + sDate + ".png"));
	    //
	    byte[] fileContent = FileUtils.readFileToByteArray(src);
	    Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
	    return Base64StringofScreenshot;
	}
}


