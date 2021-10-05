 package com.testH.base.desktopView;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.QuestionCategoryPage;

public class QuestionCategoryPageDesktopView extends QuestionCategoryPage {
	
	By loc_btnPauseGame=By.xpath("//span[contains(text(),'PAUSE GAME')]");
	By loc_btnEndGame=By.xpath("//span[contains(text(),'END GAME')]");
	By loc_txtTotalTime=By.xpath("//mat-card-title[contains(text(),'TOTAL TIME')]");
	By loc_categoryCardList=By.xpath("//div[@class='categoryPanel']//child::mat-card");
	By loc_catNames=By.xpath("//mat-card[contains(@class,'categories')]//child::mat-card-title[contains(@class,'cardName')]");
	By loc_totalQuesCount=By.xpath("//mat-card-title[contains(@class,'questionCountText')]");
	By loc_textPlayerName=By.xpath("//mat-card-title[contains(@class,'cardTitleName')]");
	By loc_playerPoints=By.xpath("//mat-card-title[contains(@class,'cardTitleName')]/parent::div/following-sibling::mat-card-title");
	
	private SelectAnswerPageDesktopView objSelectAnswerPageDesktopView=new SelectAnswerPageDesktopView();
	
	public static int quesCount=0;
	public static int gamePoints=0;
	public static String playerName="";
	public static String totalTime="";

	@Override
	public void verifyCatScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_txtTotalTime, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category screen is opening",Pojo.getObjSeleniumFunctions().getText(loc_txtTotalTime).startsWith("TOTAL TIME"));
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is appearing",Pojo.getObjSeleniumFunctions().getText(loc_txtTotalTime).startsWith("TOTAL TIME"));
		
	}
	
	@Override
	public void verifyAndClickPauseGame() {
		
		quesCount=getQuestionCount();
		gamePoints=getPlayerPoints();
		playerName=getPlayerName();
		totalTime=getTotalTime();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Pause button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnPauseGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that Pasue button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnPauseGame));		
		Pojo.getObjSeleniumFunctions().waitFor(3);
	}

	@Override
	public void selectCategory() {
		
		List<WebElement> catList;
		catList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList);
		int catCount=catList.size();
		int ran_Num= Pojo.getObjUtilitiesFunctions().getRandomNumber(1,catCount);
		
		By loc_categoryCardList=By.xpath("//div[@class='categoryPanel']//child::mat-card["+ran_Num+"]");

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_categoryCardList, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category button is clicking",Pojo.getObjSeleniumFunctions().click(loc_categoryCardList));
	}

	public void verifyCategories()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catNames, 15);
		List<WebElement> catNames=Pojo.getObjSeleniumFunctions().getWebElementList(loc_catNames);
		List<String> catNamesStr=new ArrayList<String>();
		
		for(WebElement catName:catNames)
		{
			catNamesStr.add(catName.getText().trim());
		}
		
		
		System.out.println("Category names actual: "+catNamesStr);
		System.out.println("Category names expected "+BuildSpGamePage.expectedData.get("Categories"));
		System.out.println(BuildSpGamePage.expectedData.get("Categories").containsAll(catNamesStr));
		
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

		List<WebElement> totalQuestions=Pojo.getObjSeleniumFunctions().getWebElementList(loc_totalQuesCount);
		int totalQues=0;
				
		for(WebElement count:totalQuestions)
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
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnEndGame, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that End Game button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnEndGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that End Game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnEndGame));
		
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
		List<WebElement> totalQuestions=Pojo.getObjSeleniumFunctions().getWebElementList(loc_totalQuesCount);
		System.out.println("Total Ques "+totalQuestions);
		int totalQues=0;
				
		for(WebElement count:totalQuestions)
		{
			totalQues=totalQues+Integer.parseInt(count.getText().trim());
		}
		System.out.println("Total Questions "+totalQues);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that question count is correct", totalQues>0);
		
		return totalQues;
	}

	@Override
	public String getTotalTime() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_txtTotalTime));
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_txtTotalTime).trim().replaceAll("[^0-9]", "");
		return totalTime;
	}

	@Override
	public String getPlayerName() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that player name is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_textPlayerName));
		String playerName=Pojo.getObjSeleniumFunctions().getText(loc_textPlayerName);
		return playerName;
	}

	@Override
	public void verifyCategoryNameWithQues() {
		
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=0;i<catCount;i++)
		{
			By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			System.out.println("Expected Cat Name "+expectedCatName);
			
			By loc_questionCountCategory=By.xpath("//mat-card-title[contains(text(),'"+expectedCatName+"')]/following-sibling::mat-card-title");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			String actualCatName=objSelectAnswerPageDesktopView.getCategoryName();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is correct", expectedCatName.equals(actualCatName));
			objSelectAnswerPageDesktopView.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
			objSelectAnswerPageDesktopView.clickBack();
			}
			else
			{
			objSelectAnswerPageDesktopView.clickDone();;
			}

		}
	    }}

	@Override
	public void verifyPointsWithQues() {
		
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=0;i<catCount;i++)
		{
			By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=By.xpath("//mat-card-title[contains(text(),'"+expectedCatName+"')]/following-sibling::mat-card-title");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			
			int quesPoint=objSelectAnswerPageDesktopView.getQuesPoint();
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question point is correct", quesPoint<=500);
			objSelectAnswerPageDesktopView.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
			objSelectAnswerPageDesktopView.clickBack();
			}
			else
			{
			objSelectAnswerPageDesktopView.clickDone();;
			}

		}
	    }}

	@Override
	public void clickEndGameButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnEndGame));
	}

	@Override
	public void verifyDoneButtonLastQuestion() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_categoryCardList, 10);
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=0;i<catCount;i++)
		{
			By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=By.xpath("//mat-card-title[contains(text(),'"+expectedCatName+"')]/following-sibling::mat-card-title");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_CatName, 10);
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageDesktopView.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount==0)
			{
			   objSelectAnswerPageDesktopView.clickDone();
			}
			else
			{
				objSelectAnswerPageDesktopView.clickBack();
			}

		}
	    }		
	}

	@Override
	public void verifyDisabledBackButtonLastQues() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=0;i<catCount;i++)
		{
			By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=By.xpath("//mat-card-title[contains(text(),'"+expectedCatName+"')]/following-sibling::mat-card-title");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageDesktopView.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount==0)
			{
			   objSelectAnswerPageDesktopView.verifyBackBtnDisabledLastQues();
			}
			else
			{
				objSelectAnswerPageDesktopView.clickBack();
			}

		}
	    }		
	}

	@Override
	public void verifyTimerWithQuestions() {
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=getQuestionCount();
		
		for(int i=0;i<catCount;i++)
		{
			By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			By loc_questionCountCategory=By.xpath("//mat-card-title[contains(text(),'"+expectedCatName+"')]/following-sibling::mat-card-title");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			objSelectAnswerPageDesktopView.verifyQuestionTimer();
			objSelectAnswerPageDesktopView.giveAns("correct");
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
			objSelectAnswerPageDesktopView.clickBack();
			}
			else
			{
			objSelectAnswerPageDesktopView.clickDone();;
			}

		}
	    }}
		
	

	@Override
	public void verifyRateQuestionEnabledWithEveryQuestion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyEnabledBackButtonLastQuesAndroidApp() {
		// TODO Auto-generated method stub
		
	}
		
	}
		
	
