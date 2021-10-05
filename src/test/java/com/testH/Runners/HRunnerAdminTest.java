package com.testH.Runners;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.service.ExtentService;
import com.testH.app.generic.Pojo;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


//import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                          "json:target/BDD-Report/cucumber.json"},
        	 /*  // "pretty", 
        		  // "html:target/BDD-Report/cucumber.html",
        		   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
        		   //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
*/         
        features = "src/test/resources/featureFilesAdmin/Notifications.feature",
        glue = "com/testH/admin/stepDefs",
        monochrome=true,
        dryRun=false,  
        tags = {"@smokeTest"}        
        )

public class HRunnerAdminTest  {
	
   @AfterClass
    public static  void setExtentData() {
	
	ExtentService.getInstance().setSystemInfo("QA Name: " ,Pojo.getObjConfig().getProperty("userName") );
    ExtentService.getInstance().setSystemInfo("Application Name: " ,Pojo.getObjConfig().getProperty("applicationName") );  
	ExtentService.getInstance().setSystemInfo("OS ", System.getProperty("os.name"));  
	ExtentService.getInstance().setSystemInfo("Environment ",Pojo.getObjConfig().getProperty("environment") );  
	ExtentService.getInstance().setSystemInfo("Browser", "Chrome");  
	
	ExtentService.getInstance().flush();// writing everything to document

    }
    }
	
