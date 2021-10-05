package com.testH.base.pages.androidApp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.SelectAnswerPageDesktopView;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.QuestionCategoryPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class QuestionCategoryPageAndroidApp extends QuestionCategoryPage {
	By loc_catNames=MobileBy.xpath("//android.widget.TextView[@resource-id='com.ionicframework.SaleshuddleApp:id/category_name_tv']");
	//By loc_firstCat=MobileBy.AndroidUIAutomator("new UiSelector().text(\"CATEGORY A\")");
	By loc_firstCat=MobileBy.xpath("//android.view.ViewGroup[contains(@resource-id,'com.ionicframework.SaleshuddleApp:id/principle_category_item_')]/child::android.widget.TextView[1]");
	//By loc_firstCat=MobileBy.AndroidUIAutomator("new UiSelector().resource-id(\"com.ionicframework.SaleshuddleApp:id/principle_category_item_2\")");
	//By loc_firstCat=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/principle_category_item_2']");
    By loc_pauseBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_pause_tv\")");
    By loc_rateQues=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_rate_question_tv\")");
    By loc_CanRateQues=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rate_question_bottom_view_cancel_tv\")");
    By loc_playerPoints=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_player_game_score_tv\")");
    By loc_totalQuesCount=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_remaining_tv\")");
    By loc_valueTotalTime=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_chronometer\")");
    By loc_txtTotalTime=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_player_total_time_tv\")");

    By loc_textPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_player_name_tv\")");
    By loc_btnPauseGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_pause_tv\")");
    By loc_btnEndGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_end_game_tv\")");
    By loc_categoryCardList=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout");
    
    
    
	private SelectAnswerPageAndroidApp objSelectAnswerPageAndroidApp=new SelectAnswerPageAndroidApp();

    public static int quesCount=0;
	public static int gamePoints=0;
	public static String playerName="";
	public static String totalTime="";
    
    
	@Override
	public void verifyCatScreen() {
		boolean status=false;
		List<AndroidElement> catNames=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_catNames);

	//	List<AndroidElement> catNames=Pojo.getAndroidDriver().findElementsByXPath("//android.widget.TextView[@resource-id='com.ionicframeifwork.SaleshuddleApp:id/category_name_tv']");
		if(catNames!=null)
		{
			status=true;
		}
		else
		{
			status=false;
		}
			
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat screen is opening",status);
		
	}

	@Override
	public void verifyPauseGameButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Pause button is enabled",Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_btnPauseGame));

		
	}

	@Override
	public void verifyEndGameButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that End Game button is enabled",Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_btnEndGame));

		
	}

	@Override
	public void verifyTotalTimeField() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is appearing",Pojo.getObjSeleniumFunctions().getText(loc_txtTotalTime).startsWith("Total Time"));

		
	}

	@Override
	public void selectCategory() {
		//boolean status=true;
		Pojo.getObjSeleniumFunctions().waitFor(5);
		getQuestionCount();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_firstCat, 15);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category button is clicking",Pojo.getObjSeleniumFunctions().click(loc_firstCat));
	    System.out.println("Cat Tapping Done");


	}

	@Override
	public void verifyCategories() {
		//Pojo.getObjSeleniumFunctions().waitFor(5);
		//List<AndroidElement> catNames=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_catNames);
	//	List<AndroidElement> catNames=Pojo.getAndroidDriver().findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/category_name_tv\")");
		
		By loc_catNames=MobileBy.xpath("//android.widget.TextView[@resource-id='com.ionicframework.SaleshuddleApp:id/category_name_tv']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catNames, 15);
		List<AndroidElement> catNames=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_catNames);
		List<String> catNamesStr=new ArrayList<String>();
		
		
		for(AndroidElement catName:catNames)
		{
			catNamesStr.add(catName.getText().trim());
		}
		
		if(catNamesStr.size()==0)
		{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that catgory names are correct", false);
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that catgory names are correct", BuildSpGamePage.expectedData.get("Categories").containsAll(catNamesStr));

		}
		}
	
	@Override
	public void verifyQuestionCount() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalQuesCount,15);

		List<AndroidElement> totalQuestions=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_totalQuesCount);
		int totalQues=0;
				
		for(AndroidElement count:totalQuestions)
		{
			totalQues=totalQues+Integer.parseInt(count.getText().trim());
		}
		
		System.out.println("Actual Total Category Questions "+totalQues);
		
		int catCount=BuildSpGamePage.expectedDataCount.get("CategoryCount");
		
		System.out.println("Expected Total Category Questions "+BuildSpGamePage.expectedDataCount.get("QuestionCount")*catCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify total category questions on category screen ",totalQues==BuildSpGamePage.expectedDataCount.get("QuestionCount"));
		
	}

	

	@Override
	public void verifyAndClickEndGameButton() {
		Pojo.getObjSeleniumFunctions().waitFor(10);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnEndGame, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that End Game button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnEndGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that End Game button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnEndGame));		
	}

	@Override
	public int getPlayerPoints() {
		String strPlayerPoints=Pojo.getObjSeleniumFunctions().getText(loc_playerPoints).trim();
		int playerPoints=Integer.parseInt(strPlayerPoints);
		return playerPoints;
	}

	@Override
	public int getQuestionCount() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalQuesCount, 15);
		List<AndroidElement> totalQuestions=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_totalQuesCount);
		int totalQues=0;
				
		for(AndroidElement count:totalQuestions)
		{
			totalQues=totalQues+Integer.parseInt(count.getText().trim());
		}
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that question count is correct", totalQues>0);
		System.out.println("Total Questions "+totalQues);
		return totalQues;
	}

	@Override
	public String getTotalTime() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_valueTotalTime, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_valueTotalTime));
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_valueTotalTime).trim().replaceAll("[^0-9]", "");
		return totalTime;
	}

	@Override
	public String getPlayerName() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textPlayerName, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that player name is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_textPlayerName));
		String playerName=Pojo.getObjSeleniumFunctions().getText(loc_textPlayerName);
		return playerName;
	}

	@Override
	public void verifyAndClickPauseGame() {
		quesCount=getQuestionCount();
		gamePoints=getPlayerPoints();
		playerName=getPlayerName();
		totalTime=getTotalTime();
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnPauseGame, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Pause button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnPauseGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that Pasue button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnPauseGame));		
		Pojo.getObjSeleniumFunctions().waitFor(3);		
	}

	@Override
	public void verifyCategoryNameWithQues() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=1;i<=catCount;i++)
		{
			//By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			By loc_CatName=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout["+i+"]//child::android.widget.TextView[1]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName).trim();
			System.out.println("Expected Cat Name "+expectedCatName);
			
			By loc_questionCountCategory=MobileBy.xpath("//android.widget.TextView[@text='"+expectedCatName+"']//following-sibling::android.widget.TextView");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			String actualCatName=objSelectAnswerPageAndroidApp.getCategoryName();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is correct", expectedCatName.equals(actualCatName));
			objSelectAnswerPageAndroidApp.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
				objSelectAnswerPageAndroidApp.clickBack();
			}
			else
			{
				objSelectAnswerPageAndroidApp.clickDone();;
			}

		}
	    }		
	}

	@Override
	public void verifyPointsWithQues() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=1;i<=catCount;i++)
		{
		//	By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			By loc_CatName=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout["+i+"]//child::android.widget.TextView[1]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName).trim();
			
			By loc_questionCountCategory=MobileBy.xpath("//android.widget.TextView[@text='"+expectedCatName+"']//following-sibling::android.widget.TextView");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			int j=100;

			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			
			int quesPoint=objSelectAnswerPageAndroidApp.getQuesPoint();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question point is correct", j==quesPoint);
			objSelectAnswerPageAndroidApp.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
			objSelectAnswerPageAndroidApp.clickBack();
			j=j+100;
			}
			else
			{
			objSelectAnswerPageAndroidApp.clickDone();;
			}

		}
	    }}
		
	

	@Override
	public void clickEndGameButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnEndGame, 10);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnEndGame));
		
	}

	@Override
	public void verifyDoneButtonLastQuestion() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=1;i<=catCount;i++)
		{
			//By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			By loc_CatName=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout["+i+"]//child::android.widget.TextView[1]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName).trim();
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=MobileBy.xpath("//android.widget.TextView[@text='"+expectedCatName+"']//following-sibling::android.widget.TextView");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageAndroidApp.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount==0)
			{
				objSelectAnswerPageAndroidApp.clickDone();
			}
			else
			{
				objSelectAnswerPageAndroidApp.clickBack();;
			}

		}
	    }
	}

	@Override
	public void verifyDisabledBackButtonLastQues() {
				
	}

	@Override
	public void verifyTimerWithQuestions() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=1;i<=catCount;i++)
		{
			//By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			By loc_CatName=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout["+i+"]//child::android.widget.TextView[1]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName).trim();
			By loc_questionCountCategory=MobileBy.xpath("//android.widget.TextView[@text='"+expectedCatName+"']//following-sibling::android.widget.TextView");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageAndroidApp.verifyQuestionTimer();
			objSelectAnswerPageAndroidApp.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
				objSelectAnswerPageAndroidApp.clickBack();
			}
			else
			{
				objSelectAnswerPageAndroidApp.clickDone();;
			}

		}
	    }		
		
	}

	@Override
	public void verifyRateQuestionEnabledWithEveryQuestion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyEnabledBackButtonLastQuesAndroidApp() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=1;i<=catCount;i++)
		{
			//By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			By loc_CatName=MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl']//child::android.widget.FrameLayout["+i+"]//child::android.widget.TextView[1]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName).trim();
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=MobileBy.xpath("//android.widget.TextView[@text='"+expectedCatName+"']//following-sibling::android.widget.TextView");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageAndroidApp.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount==0)
			{
				objSelectAnswerPageAndroidApp.clickAndVerifyEnabledBackButtonAndroidApp();
			}
			else
			{
				objSelectAnswerPageAndroidApp.clickBack();;
			}

		}
	    }		
	}

}
