package com.testH.Runners;

import java.io.IOException; 

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.service.ExtentService;	
import com.testH.app.generic.InitializeEnvironment;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.PropertyReaderManager;

import io.cucumber.junit.CucumberOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.junit.Cucumber;

//import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		// "json:target/BDD-Report/cucumber.json"
},
		/*
		 * // "pretty", // "html:target/BDD-Report/cucumber.html",
		 * "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
		 * //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 */

		

		features = { 
//	
//			    "src/test/resources/featureFilesClient/GamePlay.feature",
// 		        "src/test/resources/featureFilesClient/LoginPlayer.feature",
//		        "src/test/resources/featureFilesClient/RateQuestion.feature",
//			    "src/test/resources/featureFilesClient/ForgotPasswordPlayer.feature",
//				     "src/test/resources/featureFilesClient/GamePause.feature",
//				     "src/test/resources/featureFilesClient/Trophies.feature",
//				     "src/test/resources/featureFilesClient/Help.feature",
//				     "src/test/resources/featureFilesClient/Leaderboard.feature",
//				     "src/test/resources/featureFilesAdmin/BuildGame.feature",
//	         
//	         
				//"src/test/resources/featureFilesClient/VipCode.feature"

//
//		"src/test/resources/featureFilesClient/MLG.feature",
//        "src/test/resources/featureFilesClient/LoginManager.feature",
//        "src/test/resources/featureFilesClient/LoginMiddleManager.feature",
//        "src/test/resources/featureFilesClient/LoginTeamLead.feature",
//                "src/test/resources/featureFilesAdmin/Notifications.feature",
//      "src/test/resources/featureFilesClient/ForgotPasswordManager.feature",
//          	 "src/test/resources/featureFilesClient/ChangeLanguage.feature",
//		 		"src/test/resources/featureFilesClient/PlayerProfile_Set1.feature",
//       "src/test/resources/featureFilesClient/PlayerProfile_Set2.feature",
//      	    "src/test/resources/featureFilesClient/EditPlayer.feature" ,
//	    "src/test/resources/featureFilesClient/LogOut.feature",
//	    "src/test/resources/featureFilesClient/Levels.feature"
//	    

			//	"src/test/resources/featureFilesAdmin/ACreateContest.feature",	
				//"src/test/resources/featureFilesAdmin/TheShop.feature"
				
		    //    "src/test/resources/featureFilesAdmin/DetailedReport.feature"
			   "src/test/resources/featureFilesAdmin/Dashboard.feature"

	//			"src/test/resources/featureFilesAdmin/ContestFeatureSet1.feature",
			//	"src/test/resources/featureFilesAdmin/ContestFeatureSet2.feature",
	    
				
	//	        "src/test/resources/featureFilesAdmin/DetailedReport.feature"
			    


			
				//      "src/test/resources/featureFilesAdmin/ACreateContest.feature",
		 
		//		"src/test/resources/featureFilesAdmin/CsvDownloadedData.feature"
  		        
		
//				
	//       "src/test/resources/featureFilesClient/RetestFailedTestCases.feature",
      //      "src/test/resources/featureFilesClient/RetestFailedTestCases2.feature"
	//	"src/test/resources/featureFilesAdmin/GameOperations.feature",
				
//				"src/test/resources/featureFilesClient/PlayGameDemo.feature",

		}, glue = { "com/testH/stepDefs" },monochrome =  true, dryRun =false
        //  tags = {"@GamePlay"}

)

public class HRunnerClientTest {
	
	private static PropertyReaderManager objPropertyReaderManager;

	
	@BeforeClass
	public static void setUp() throws IOException, InterruptedException
	{
		System.out.println("Before Class");
		objPropertyReaderManager=new PropertyReaderManager();
		if(Pojo.getObjConfig().get("Target.Device").equals("androidapp")) {
			
		  InitializeEnvironment.startEmulator();
		  
		
					}
}
		
	@AfterClass
	public static void setExtentData() {

		

		
		
		ExtentService.getInstance().setSystemInfo("QA Name: ", Pojo.getObjConfig().getProperty("userName"));
		ExtentService.getInstance().setSystemInfo("Application Name: ",Pojo.getObjConfig().getProperty("applicationName"));
		
		if(Pojo.getObjConfig().get("Target.Device").equals("androidapp"))
		{
			ExtentService.getInstance().setSystemInfo("OS ","Android App");

		}
		else
		{
		ExtentService.getInstance().setSystemInfo("OS ", System.getProperty("os.name"));
		}
		ExtentService.getInstance().setSystemInfo("Environment ", Pojo.getObjConfig().getProperty("environment"));
		ExtentService.getInstance().setSystemInfo("Browser", Pojo.getObjConfig().getProperty("web.browser").toUpperCase());

		ExtentService.getInstance().flush();// writing everything to documentAnd new player is able to login to app


		
		}
	}
