package com.testH.businessFlow.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.BaseTest;
import com.testH.app.generic.InitializeEnvironment;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.SeleniumFunctionsAndroidEnv;
import com.testH.app.generic.TestData;
import com.testH.app.generic.UtilitiesFunctions;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.GamePausePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.MorePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class PlayGameFlow {
	

	public int totalGamePlayPoints=0;
	public int totalGameCount=0;
	int quesCount=0;
	public static HashMap<String, Integer> expectedGamePlayData = new HashMap<String, Integer>();
	public static HashMap<String, List<String>> expectedGameData = new HashMap<String, List<String>>();
	static int mlgPointsBeforePlay;
	static int totalMlgPoints;

	
	private MorePage objMorePage;
	private SelectGamePage objSelectGamePage;
	private HomePage objHomePage;
	private GamePreviewPage objGamePreviewPage;
	private QuestionCategoryPage objQuestionCategoryPage;
	private SelectAnswerPage objSelectAnswerPage;
	private EndGamePage objEndGamePage;
	private LeaderboardPage objLeaderboardPage;
	private GamePausePage objGamePausePage;

	private BaseTest objBaseTest;
	private LoginPage objLoginPage;
	private AllUsersPage objAllUsersPage;
	
	private GmailLoginPage objGmailLoginPage;
	private AndroidDriver<AndroidElement> androidDriver;
	private WebDriverWait webDriverWait;
    private UtilitiesFunctions objUtilitiesFunctions;
	private TestData objTestData;
	private SeleniumFunctionsHelper objSeleniumFunctions;
	private InitializeEnvironment objInitializeEnvironment;
	private AppiumDriverLocalService service;
	
	
	public PlayGameFlow()
	{
		objSelectGamePage= new PageFactory().getSelectGamePage();
		objHomePage = new PageFactory().getObjHomePage();
		objGamePreviewPage= new PageFactory().getGamePreviewPage();
		objQuestionCategoryPage=new  PageFactory().getQuestionCategoryPage();
		objSelectAnswerPage= new PageFactory().getSelectAnswerPage();
		objEndGamePage=new PageFactory().getEndGamePage();
		objGamePausePage=new PageFactory().getGamePausePage();
		objMorePage=new PageFactory().getMorePage();

		
		objBaseTest = new BaseTest();
		objLoginPage = new LoginPage();
		objAllUsersPage = new AllUsersPage();

	}
	
	public int playGame(int gameCount,String ansType)
	{
	  for(int i=1;i<=gameCount;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   objEndGamePage.clickHomeButton();
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
	
	public int playGameForSpecificTime(int gameCount,String ansType,int timeHold)
	{
	  for(int i=1;i<=gameCount;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   Pojo.getObjSeleniumFunctions().waitFor(timeHold);
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   objEndGamePage.clickHomeButton();
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
	
	public int playGameForTrophies(int gameCount,String ansType)
	{
	
	  for(int i=1;i<=gameCount;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   
		   objEndGamePage.clickHomeButtonForTrophies(gameCount,i);
		   
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
     
	public int playGameForTrophies(String gameName,int gameCountTrophy,String ansType)
	{
	

	  for(int i=1;i<=gameCountTrophy;i++)
	   	   {
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   
		   objEndGamePage.clickHomeButtonForTrophies(gameCountTrophy,i);
		   
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
	
	public void playGameForTrophiesWithoutGivingAns(String gameName,int gameCountTrophy)
	{
	
	  for(int i=1;i<=gameCountTrophy;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		 //  objQuestionCategoryPage.selectCategory();
		  // int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		  // totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   objQuestionCategoryPage.verifyAndClickEndGameButton();
		   objGamePausePage.clickYesConfirmation();
		   
		   objEndGamePage.clickHomeButtonForTrophies(gameCountTrophy,i);
		   
	   	   }
	}
	
	public int playGameForGameTrophies(String gameName,int gameCountTrophy,String ansType)
	{
	
	  for(int i=1;i<=gameCountTrophy;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   
		   objEndGamePage.clickHomeButtonForGameTrophies(gameCountTrophy,i);
		   
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
	
	
	
	public int playGameForLevels(String gameName,int gameCount,String ansType)
	{
		 for(int i=1;i<=gameCount;i++)
	   	   {
		   String newGameName="";
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   if(BuildSpGamePage.expectedData.get("GameName")!=null)
		   {
			   newGameName= BuildSpGamePage.expectedData.get("GameName").get(0);
			   objSelectGamePage.selectRecentlyCreatedGame(newGameName);
		   }
		   else
		   {
			   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   }
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   
		   objEndGamePage.clickHomeButtonForLevels(gameCount,i);
		   
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	  return totalGamePlayPoints;
	}
	
	public int playGameForHighScore(String gameName,int gameCount,String ansType)
	{
		 int correctAnsCount=0;
		 for(int i=1;i<=gameCount;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		  // String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		  // objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objSelectGamePage.selectRecentlyCreatedGame(gameName); //Using hardcoded value as game won't immediately live after creating from admin panel
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   correctAnsCount= objSelectAnswerPage.playGameAndCalculateCorrectAnswers(ansType);
		   objEndGamePage.clickHomeButton();
          }
	  
	  return correctAnsCount;
	}
	
	public double playGameForRating(String gameName,int gameCount,String ansType)
	{

		// By loc_totalQuesCount=By.xpath("//mat-card-title[contains(@class,'questionCountText')]");
		 float accuracy=0;
		 float avgAccuracy=0;
		 float rating=0;
		 int mpWinCount=0;
		 int mpGameCount=0;
		 
         int totalQues=0;

		 
		 for(int i=1;i<=gameCount;i++)
	   	   {
		   float correctAnsCount=0;
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName); 
		   objGamePreviewPage.clickPlayGameButton();
		   
		   totalQues= objQuestionCategoryPage.getQuestionCount();
		   
//		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalQuesCount, 10);
//		   List<WebElement> totalQuestions=Pojo.getObjSeleniumFunctions().getWebElementList(loc_totalQuesCount);
//		   int totalQues=0;
//					
//			for(WebElement count:totalQuestions)
//			{
//				totalQues=totalQues+Integer.parseInt(count.getText().trim());
//			}
		   System.out.println("Total Ques "+totalQues);
		   objQuestionCategoryPage.selectCategory();
		   correctAnsCount= objSelectAnswerPage.playGameAndCalculateCorrectAnswers(ansType);
		   System.out.println("Correct Ans Count "+correctAnsCount);
		   objEndGamePage.clickHomeButton();
		   accuracy=accuracy+(correctAnsCount/totalQues)*100;	
		   System.out.println("Accuracy "+accuracy);
          }
		 
		 avgAccuracy=accuracy/gameCount;
		 System.out.println("Avg Accuracy "+avgAccuracy);
		 
		 
		 if(mpGameCount!=0)
		 {
		 rating=(float) (avgAccuracy*0.8+mpWinCount*0.2);
		 System.out.println("Rating is "+rating);
		 }
		 else
		 {
			 rating=(float) (avgAccuracy);
			 System.out.println("Rating is "+rating);
		 }
		 
		 return rating;
	}
	

public int playAlreadyAddedGame(String gameName,int gameCount,String ansType)
{
	  for(int i=1;i<=gameCount;i++)
	   	   {
		  
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   int individualGamePoint= objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
		   totalGamePlayPoints=totalGamePlayPoints+individualGamePoint;
		   objEndGamePage.clickHomeButton();
	   	   }
	  System.out.println("Total Game Points "+totalGamePlayPoints);
	 
	  
	  return totalGamePlayPoints;
	}


public HashMap<String, Integer> playAlreadyAddedGameStatistics(String gameName,int gameCount,String ansType)
{
	ArrayList<String> li=new ArrayList<String>();
	int totalQues=0;
	  for(int i=1;i<=gameCount;i++)
	   	   {
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   totalQues= totalQues+objQuestionCategoryPage.getQuestionCount();
		   objQuestionCategoryPage.selectCategory();
		   expectedGamePlayData= objSelectAnswerPage.playGameAndCalculatePointsStatistics(ansType);
		   li.add(Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy hh:mm"));
		   expectedGameData.put("Game "+i+" End Time", li);
		   System.out.println("Game "+i+" End Time");
		   objEndGamePage.clickHomeButton();
	   	   }
	  totalGameCount=totalGameCount+gameCount;
	  expectedGamePlayData.put("TotalGameCount",totalGameCount);
	  expectedGamePlayData.put("TotalQuesCount",totalQues);
	  return expectedGamePlayData;
	}

public HashMap<String, Integer> playRecentlyAddedGameStatistics(String gameName,int gameCount,String ansType)
{
	ArrayList<String> li=new ArrayList<String>();
	
	for(int i=1;i<=gameCount;i++)
	   	   {
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   expectedGamePlayData= objSelectAnswerPage.playGameAndCalculatePointsStatistics(ansType);
		   li.add(Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy HH:mm"));
		   expectedGameData.put("Game "+i+" End Time", li);
		   System.out.println("Game "+i+" End Time");
		   objEndGamePage.clickHomeButton();
	   	   }
	  totalGameCount=totalGameCount+gameCount;
	  expectedGamePlayData.put("TotalGameCount",totalGameCount);
	  return expectedGamePlayData;
	}

public HashMap<String, Integer> playRecentlyAddedGameStatisticsForMultiplePlayer(String gameName,int gameCount,String ansType) throws InterruptedException, IOException
{
	  int playerCount=objAllUsersPage.expectedDataUSerEmailAndPassword.size();
	  System.out.println("Players count who will play the game "+playerCount);
	  
	    objBaseTest.loadWebAppUrl();
		objHomePage.verifyWebAppUrl();
		objInitializeEnvironment=new InitializeEnvironment();
		if(Pojo.getObjConfig().get("Target.Device").equals("androidapp"))
		{
			System.out.println("Start Server");
			service=objInitializeEnvironment.startServer();
		Pojo.setAppiumService(service);
			androidDriver=objInitializeEnvironment.capabilities(Pojo.getObjConfig().getProperty("AppName"));
				Pojo.setAndroidDriver(androidDriver);
			//Pojo.setDriver(androidDriver);
			webDriverWait = new WebDriverWait(androidDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
		    Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsAndroidEnv();			
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);
		}
		
	  while(playerCount!=0)
	  {
			objHomePage.verify1HuddleHomePage();
			objHomePage.verifyLoginWithNewlyAddedPlayer(playerCount);
		  
	  
	  for(int i=1;i<=gameCount;i++)
	   	   {
		   System.out.println("Game Number "+i);
		   objSelectGamePage.clickGamesIconSideMenu();
		   objSelectGamePage.selectRecentlyCreatedGame(gameName);
		   objGamePreviewPage.clickPlayGameButton();
		   objQuestionCategoryPage.selectCategory();
		   expectedGamePlayData= objSelectAnswerPage.playGameAndCalculatePointsStatistics(ansType);
		   objEndGamePage.clickHomeButton();
		   }
	   objMorePage.clickMoreOption();
	   objMorePage.clickLogout();
	   playerCount--;
	  }
	  totalGameCount=objAllUsersPage.expectedDataUSerEmailAndPassword.size()*gameCount;
	  expectedGamePlayData.put("TotalGameCount",totalGameCount);
	  return expectedGamePlayData;
	}




public HashMap<String, Integer> playAlreadyAddedGameMLG(int levelNum,int gameCount,String ansType,String levelOrTrophy)
{
	  for(int i=1;i<=gameCount;i++)
	   	   {
		   System.out.println("Game Number "+i);
	       objSelectGamePage.openAndVerifyLevel(levelNum);
	       objSelectGamePage.verifyAndClickLetsGoButton();
		   objGamePreviewPage.clickPlayGameButton();
		   quesCount=  objQuestionCategoryPage.getQuestionCount();
		   objQuestionCategoryPage.selectCategory();
		   expectedGamePlayData=objSelectAnswerPage.playGameAndCalculatePointsStatistics(ansType);
		   objEndGamePage.clickHomeButtonForMlgTrophies(levelNum,levelOrTrophy);
}
	  totalGameCount=totalGameCount+gameCount;
	  expectedGamePlayData.put("TotalGameCount",totalGameCount);
	  expectedGamePlayData.put("LevelNum",levelNum);
	  expectedGamePlayData.put("QuestionCount",quesCount);
	  
	  return expectedGamePlayData;
	}

public HashMap<String, Integer> playAlreadyAddedMLG(int levelNum,int gameCount,String ansType,String levelOrTrophy,int totalLevels)
{
	  mlgPointsBeforePlay=objSelectGamePage.getMLGPoints();  //Mlg points are the points before playing MLG
		System.out.println("MLG Points Before Playing "+mlgPointsBeforePlay);

	
	  for(int i=1;i<=gameCount;i++)
	   	   {
		   System.out.println("Game Number "+i);
	       objSelectGamePage.openAndVerifyLevelAlreadyCreatedMLG(levelNum);
	       objSelectGamePage.verifyAndClickLetsGoButton();
		   objGamePreviewPage.clickPlayGameButton();
		   quesCount=  objQuestionCategoryPage.getQuestionCount();
		   objQuestionCategoryPage.selectCategory();
		   expectedGamePlayData=objSelectAnswerPage.playGameAndCalculatePointsStatistics(ansType);
		   objEndGamePage.clickHomeButtonForMlgTrophies(levelNum,levelOrTrophy,totalLevels);

		  
}
	//	mlgPoints=objSelectGamePage.getMLGPoints();  //
	  
	  totalMlgPoints=mlgPointsBeforePlay+ expectedGamePlayData.get("TotalPoints");

	  totalGameCount=totalGameCount+gameCount;
	  expectedGamePlayData.put("TotalGameCount",totalGameCount);
	  expectedGamePlayData.put("LevelNum",levelNum);
	  expectedGamePlayData.put("QuestionCount",quesCount);
	  expectedGamePlayData.put("MLGPoints",totalMlgPoints);
	  
	  
	  return expectedGamePlayData;
	}
}


