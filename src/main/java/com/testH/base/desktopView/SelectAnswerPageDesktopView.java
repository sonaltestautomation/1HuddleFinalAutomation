package com.testH.base.desktopView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;

public class SelectAnswerPageDesktopView extends SelectAnswerPage  {
	public int totalGamePlayPoints=0;
	public static int totalGameCount=0;
	public static HashMap<String, Integer> expectedGamePlayData = new HashMap<String, Integer>();	
	public static HashMap<String, Boolean> expectedQuestionAttemptData = new HashMap<String, Boolean>();	

	public int totalPoints=0;   
	boolean perfectGameStatus=false;
    public int perfectGameCount; //perfect game means all correct
    public static HashMap<String, Integer> expectedGamePlayDataStatistics = new HashMap<String, Integer>();

	
	By loc_QuestionPoint=By.xpath("//mat-card[contains(@class,'dispalayFlax')]//child::div[2]/child::mat-card-title/child::mat-card-title");
	By loc_CorrectAnsOption=By.xpath("//button[contains(text(),'Correct')]");
	By loc_correctAllAbove=By.xpath("//button[contains(text(),'All of the above')]");
	By loc_IncorectAnsOption=By.xpath("//button[contains(text(),'Wrong')]");
	By loc_RightButton=By.xpath("//div[contains(@class,'rightButton')]//child::*[contains(text(),'keyboard_arrow_right')]");
	By loc_DoneButton=By.xpath("//div[contains(@class,'rightButton')]//child::*[contains(text(),'done')]");
	By loc_questionText=By.xpath("//span[contains(@class,'card-text')]");
	By loc_ansOptions=By.xpath("//button[contains(@class,'ans')]");
	By loc_btnBack=By.xpath("//*[contains(text(),'keyboard_arrow_left')]");
	By loc_textCat=By.xpath("//div[contains(@class,'categories')]/child::mat-card-title");
	By loc_disabledBackBtn=By.xpath("//*[contains(text(),'keyboard_arrow_left')]/parent::div");
	By loc_disabledNextBtn=By.xpath("//*[contains(@class,'rightButton')]");
	By loc_timerText=By.xpath("//mat-card-title[contains(text(),'TIMER')]");
	By loc_categoryCardList=By.xpath("//div[@class='categoryPanel']//child::mat-card");
	By loc_btnRateQuestion=By.xpath("//div[contains(@class,'rateQuesbtn')]");
	By loc_quesImage=By.xpath("//div[@class='question_image']");
	By loc_quesSound=By.xpath("//audio");
	By loc_showAnsBtn=By.xpath("//span[contains(text(),'SHOW ANSWER')]");
	By loc_TimerValue=By.xpath("//mat-card-title[contains(text(),'TIMER')]/child::mat-card-title");
	By loc_totalGameTime=By.xpath("//mat-card-title[contains(text(),'TOTAL TIME')]");
	
	

	@Override
	public int getQuestionPoint() {
		
		String quesPoint=Pojo.getObjSeleniumFunctions().getText(loc_QuestionPoint).trim();
		System.out.println("Question Point "+quesPoint);
		
		int intQuestionPoint=Integer.parseInt(quesPoint);
		
		return intQuestionPoint;
	}

	@Override
	public boolean giveAns(String playerAns) {
		
		boolean ansStatus=false;
		
		if(playerAns.equalsIgnoreCase("correct"))
		{
		    if((BuildSpGamePage.expectedDataCount.get("OptionCount")==BuildSpGamePage.expectedDataCount.get("CorrectAnsOptionCount"))&&BuildSpGamePage.expectedDataCount.get("OptionCount")!=null)
		    {
		    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_correctAllAbove, 10);
		    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans is selecting",Pojo.getObjSeleniumFunctions().click(loc_correctAllAbove));
				Pojo.getObjSeleniumFunctions().waitFor(1);
				ansStatus=true;
		    }
		    
		    else
		    {
		    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_CorrectAnsOption, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans is selecting",Pojo.getObjSeleniumFunctions().click(loc_CorrectAnsOption));
			Pojo.getObjSeleniumFunctions().waitFor(1);
			ansStatus=true;
		    }
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that incorrect ans is selecting",Pojo.getObjSeleniumFunctions().click(loc_IncorectAnsOption));
			Pojo.getObjSeleniumFunctions().waitFor(1);
		}
		
		
		return ansStatus;
	}

	@Override
	public int playGameAndCalculatePoint() {
		
		int totalPoints=0;
		boolean status=true;
		
		List<String> ansOptions=new ArrayList<String>();
		ansOptions.add("Correct");
	    ansOptions.add("Incorrect");
		
		int ranNumber;
		
		while(status==true)
		{
			
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",BuildSpGamePage.expectedData.get("Questions").contains(getQuestionTitle()));
		  System.out.println("Expected Question Title "+BuildSpGamePage.expectedData.get("Questions"));
		  System.out.println("Actual Ques Title "+getQuestionTitle());
		  
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",BuildSpGamePage.expectedData.get("Options").containsAll(getOptions()));
		  System.out.println("Expected options "+BuildSpGamePage.expectedData.get("Options"));
		  System.out.println("Actual options "+getOptions());
		   
			
			ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
			
			if(ansResult==true)
			{
				totalPoints=totalPoints+getQuestionPoint();
			}
			
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			{
				Pojo.getObjSeleniumFunctions().waitFor(3);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,15);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;

			}
			
		}
		
		System.out.println("Total Points "+totalPoints);
		return totalPoints;
	}

	
	
	@Override
	public void clickNext() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Next button is clicking", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
		
	}

	@Override
	public void clickDone() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
		
	}

	
	public String getQuestionTitle()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_questionText, 10);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_questionText).trim();
		System.out.println("Question Title is "+actualText);
		return actualText;
	}
	
	public List<String> getOptions()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_ansOptions, 10);
		List<WebElement> ansOptions=Pojo.getObjSeleniumFunctions().getWebElementList(loc_ansOptions);
		List<String> strAnsOptions=new ArrayList<String>();
		
		for(WebElement option:ansOptions)
		{
			strAnsOptions.add(Pojo.getObjSeleniumFunctions().getText(option).trim());
		}
		System.out.println("Actual Ans Options "+strAnsOptions);
		return strAnsOptions;
	}

	@Override
	public int playGameAndCalculatePointWebOnly(String selectAns) {
    
		int totalPoints=0;
		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		
		if(selectAns.equalsIgnoreCase("random"))
		{
		ansOptions.add("Correct");
		ansOptions.add("Incorrect");
		}
		else if(selectAns.equalsIgnoreCase("all correct"))
		{
			ansOptions.add("Correct");
			ansOptions.add("Correct");
		}
		else if(selectAns.equalsIgnoreCase("all wrong"))
		{
			ansOptions.add("Incorrect");
			ansOptions.add("Incorrect");
		}
		else
		{
			ansOptions.add("Correct");
			ansOptions.add("Incorrect");
		}
		
		int ranNumber;
		
		while(status==true)
		{
			ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
			
			if(ansResult==true)
			{
				totalPoints=totalPoints+getQuestionPoint();
			}
			
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;

			}
			
		}
		
		System.out.println("Total Points "+totalPoints);
		return totalPoints;
	}

	@Override
	public void verifyQuestionTitle() {
		
		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		ansOptions.add("Correct");
	    ansOptions.add("Incorrect");
	    int ranNumber;
		
		while(status==true)
		{
			
		  if(getQuestionTitle()!=null)
		  {
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",BuildSpGamePage.expectedData.get("Questions").contains(getQuestionTitle()));
		  }
		  else
		  {
			  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",false);
 
		  }
		  
		  System.out.println("Expected Question Title "+BuildSpGamePage.expectedData.get("Questions"));
		  System.out.println("Actual Ques Title "+getQuestionTitle());
		  ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
          giveAns(ansOptions.get(ranNumber));

		  
		//  if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			{
			    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;
			}
			}
		    }

	@Override
	public void verifyQuestionOptions() {
		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		ansOptions.add("Correct");
	    ansOptions.add("Incorrect");
	    int ranNumber;
		while(status==true)
		{
		if(getOptions().size()!=0)
		{
		   if(BuildSpGamePage.expectedDataCount.get("OptionCount")==BuildSpGamePage.expectedDataCount.get("CorrectAnsOptionCount"))
		   {
			   System.out.println("All Correct Option");
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All of the above option is appearing",getOptions().contains("All of the above"));

		   }
		   else if (BuildSpGamePage.expectedDataCount.get("CorrectAnsOptionCount")==2)
		    {
			   System.out.println("Both Correct Option");
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that both option is appearing",getOptions().contains("Both 2 & 3")||getOptions().contains("Both 1 & 2")||getOptions().contains("None of the above")||getOptions().contains("Both 1 & 3")||getOptions().contains("All of the above"));//All the above option also appeared when 2 option selected as correct
		    }
		   else
		   {
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",BuildSpGamePage.expectedData.get("Options").containsAll(getOptions()));
		   }
		}
		else
		{
			  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",false);

		}
		
		  System.out.println("Expected options "+BuildSpGamePage.expectedData.get("Options"));
		  System.out.println("Actual options "+getOptions());
		  ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
          giveAns(ansOptions.get(ranNumber));
		   
		//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7))
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))

			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;
			}
			}
		
	}

	@Override
	public int playGameAndCalculateCorrectAnswers(String selectAns) {
		int totalcorrectAns=0;
		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		
		if(selectAns.equalsIgnoreCase("random"))
		{
		ansOptions.add("Correct");
		ansOptions.add("Incorrect");
		}
		else if(selectAns.equalsIgnoreCase("all correct"))
		{
			ansOptions.add("Correct");
			ansOptions.add("Correct");
		}
		else if(selectAns.equalsIgnoreCase("all wrong"))
		{
			ansOptions.add("Incorrect");
			ansOptions.add("Incorrect");
		}
		else
		{
			ansOptions.add("Correct");
			ansOptions.add("Incorrect");
		}
		
		int ranNumber;
		
		while(status==true)
		{
			ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
			
			if(ansResult==true)
			{
				totalcorrectAns=totalcorrectAns+1;
			}
			
			
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;

			}
			
		}
		
		System.out.println("Total Correct Ans "+totalcorrectAns);
		return totalcorrectAns;
	}

	@Override
	public void clickBack() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnBack, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnBack));
	}

	@Override
	public String getCategoryName() {
		
		String catName = Pojo.getObjSeleniumFunctions().getTextNode(loc_textCat, 0);
		System.out.println("Category Name question screen "+catName);
		return catName;
	}

	@Override
	public int getQuesPoint() {
		
		String strPoints=Pojo.getObjSeleniumFunctions().getTextNode(loc_textCat, 1);
		int intQuesPoints=Integer.parseInt(strPoints);
		System.out.println("Category question points "+intQuesPoints);
		return intQuesPoints;
	}

	@Override
	public void verifyBackBtnDisabledLastQues() {
		
		String expectedDisabledBackButtonClassName=Pojo.getObjSeleniumFunctions().getAttribute(loc_disabledBackBtn,"class");
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Back button is disabled for last question ", expectedDisabledBackButtonClassName.trim().equals("leftButton disabled"));
	}

	@Override
	public void verifyBackAndNextDisabled() {
        String expectedDisabledBackButtonClassName=Pojo.getObjSeleniumFunctions().getAttribute(loc_disabledBackBtn,"class");
        Pojo.getObjSeleniumFunctions().waitFor(3);
        
//        if(Pojo.getObjConfig().get("environment").toString().equalsIgnoreCase("Alpha")||Pojo.getObjConfig().get("environment").toString().equalsIgnoreCase("QA"))
//        {
//        loc_disabledNextBtn=By.xpath("//*[contains(text(),'keyboard_arrow_right')]/parent::div");
//        }
        String expectedDisabledNextButtonClassName=Pojo.getObjSeleniumFunctions().getAttribute(loc_disabledNextBtn,"class");

        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Back button is disabled without giving answer ", expectedDisabledBackButtonClassName.trim().equals("leftButton disabled"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Next button is disabled without giving answer ", expectedDisabledNextButtonClassName.trim().startsWith("rightButton disabled"));

	}

	@Override
	public void verifyQuestionTimer() {
		String timerText=Pojo.getObjSeleniumFunctions().getTextNode(loc_timerText, 0);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer text is appearing", timerText.trim().equals("TIMER"));
		
		String strTimerTime=Pojo.getObjSeleniumFunctions().getTextNode(loc_timerText, 1);
		int intTimerTime=Integer.parseInt(strTimerTime.trim());
		System.out.println("Question Timer "+intTimerTime);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer time is correct",intTimerTime>=0&&intTimerTime<=60);

		
		
	}

	@Override
	public void verifyRateQuestionEveryQues() {
		
		QuestionCategoryPage objQuestionCategoryPage=new PageFactory().getQuestionCategoryPage();

		int catCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_categoryCardList).size();
		int allCategoryQuestionsCount=objQuestionCategoryPage.getQuestionCount();
		
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
			
			giveAns("correct");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate Question is displaying for all the questions",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnRateQuestion));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate Question is enabled for all the questions",Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_btnRateQuestion));
			quesCount=quesCount-1;
			allCategoryQuestionsCount=allCategoryQuestionsCount-1;
			if(allCategoryQuestionsCount!=0)
			{
			clickBack();
			}
			else
			{
			clickDone();;
			}

		}
	    }}

	@Override
	public HashMap<String, Integer> playGameAndCalculatePointsStatistics(String selectAns) {
		int totalcorrectAns=0;
		int totalIncorrectAns=0;

		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		List<Boolean> userAns=new ArrayList<Boolean>();
		
		if(selectAns.equalsIgnoreCase("random"))
		{
		ansOptions.add("Correct");
		ansOptions.add("Incorrect");
		ansOptions.add("Correct");

		}
		else if(selectAns.equalsIgnoreCase("all correct"))
		{
			ansOptions.add("Correct");
			ansOptions.add("Correct");
			ansOptions.add("Correct");

		}
		else if(selectAns.equalsIgnoreCase("all wrong"))
		{
			ansOptions.add("Incorrect");
			ansOptions.add("Incorrect");
			ansOptions.add("Incorrect");

		}
		else
		{
			ansOptions.add("Correct");
			ansOptions.add("Incorrect");
			ansOptions.add("Correct");

		}
		
		int ranNumber=0;
		
		while(status==true)
		{
		  	//ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 2);
			  System.out.println("Actual Ques Title "+getQuestionTitle());
			  ;
			  
			expectedGamePlayData.put(getQuestionTitle(), getQuestionPoint()) ;
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
			
			  expectedQuestionAttemptData.put(getQuestionTitle(),ansResult);

			
			ranNumber=ranNumber+1;
			if(ranNumber==ansOptions.size())
			{
				ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
			}

			userAns.add(ansResult);
			
			if(ansResult==true)
			{
				totalPoints=totalPoints+getQuestionPoint();
				totalcorrectAns=totalcorrectAns+1;
			}
			else
			{
				totalIncorrectAns=totalIncorrectAns+1;
			}
			
			
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;
			}
			}
		if(userAns.contains(false))
		{
			perfectGameCount=perfectGameCount+0;
		}
		else
		{
			perfectGameCount=perfectGameCount+1;
		}
		
		String gameTime=Pojo.getObjSeleniumFunctions().getText(loc_totalGameTime).trim();
		gameTime=gameTime.replaceAll("[:a-zA-Z]","").trim();
		int intGameTime=Integer.parseInt(gameTime);
		
		System.out.println("Total Points "+totalPoints);
		System.out.println("Perfect Game "+perfectGameCount);
		System.out.println("Total Correct Ans "+totalcorrectAns);
		expectedGamePlayDataStatistics.put("PerfectGameCount",perfectGameCount);
		expectedGamePlayDataStatistics.put("TotalPoints",totalPoints);
		expectedGamePlayDataStatistics.put("TotalCorrectAns",totalcorrectAns);
		expectedGamePlayDataStatistics.put("TotalIncorrectAns",totalIncorrectAns);
		expectedGamePlayDataStatistics.put("TotalGameTime",intGameTime);

		
		return expectedGamePlayDataStatistics;
	}

	@Override
	public void verifyQuestionDataWithImageAndSound() {
		
		int totalPoints=0;
		boolean status=true;
		
		List<String> ansOptions=new ArrayList<String>();
		ansOptions.add("Correct");
	    ansOptions.add("Incorrect");
		
		int ranNumber;
		
		while(status==true)
		{
			
		  System.out.println("Expected Question Title "+BuildSpGamePage.expectedData.get("Questions"));
		  System.out.println("Actual Ques Title "+getQuestionTitle());
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",BuildSpGamePage.expectedData.get("Questions").contains(getQuestionTitle()));
		 
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question time is correct",BuildSpGamePage.expectedData.get("QuesTimer").get(0).trim().equals(Pojo.getObjSeleniumFunctions().getText(loc_TimerValue).trim()));
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question point is correct",BuildSpGamePage.expectedData.get("QuesPoints").get(0).trim().equals(Pojo.getObjSeleniumFunctions().getText(loc_QuestionPoint).trim()));

		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesImage, 10);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question image is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_quesImage));	
		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesSound, 10);

		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question sound is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_quesSound));	
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that show answer button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_showAnsBtn));
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that show answer button is clicking", Pojo.getObjSeleniumFunctions().click(loc_showAnsBtn));

		  
		  System.out.println("Expected options "+BuildSpGamePage.expectedData.get("Options"));
		  System.out.println("Actual options "+getOptions());
		   
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",BuildSpGamePage.expectedData.get("Options").containsAll(getOptions()));
		  
			
			ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
			
			if(ansResult==true)
			{
				totalPoints=totalPoints+getQuestionPoint();
			}
			
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			{
				Pojo.getObjSeleniumFunctions().waitFor(3);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,15);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;

			}
			
		}
		
		

	}
		
	@Override
	public void verifyQuestionSound() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesSound, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question sound is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_quesSound));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that show answer button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_showAnsBtn));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_TimerValue));

	}

	@Override
	public void verifyQuestionTitleAndOptions() {
		boolean status=true;
		List<String> ansOptions=new ArrayList<String>();
		ansOptions.add("Correct");
	    ansOptions.add("Incorrect");
	    int ranNumber;
		
		while(status==true)
		{
			
		  if(getQuestionTitle()!=null)
		  {
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",BuildSpGamePage.expectedData.get("Questions").contains(getQuestionTitle()));
		  }
		  else
		  {
			  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",false);
 
		  }
		  
		  if(getOptions().size()!=0)
			{
			   if(BuildSpGamePage.expectedDataCount.get("OptionCount")==BuildSpGamePage.expectedDataCount.get("CorrectAnsOptionCount"))
			   {
				   System.out.println("All Correct Option");
				   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All of the above option is appearing",getOptions().contains("All of the above"));

			   }
			   else if (BuildSpGamePage.expectedDataCount.get("CorrectAnsOptionCount")==2)
			    {
				   System.out.println("Both Correct Option");
				   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All of the above option is appearing",getOptions().contains("Both 2 & 3")||getOptions().contains("Both 1 & 2")||getOptions().contains("None of the above")||getOptions().contains("Both 1 & 3"));
			    }
			   else
			   {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",BuildSpGamePage.expectedData.get("Options").containsAll(getOptions()));
			   }
			}
			else
			{
				  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options are correct",false);

			}
		  
		  
		  
		  System.out.println("Expected Question Title "+BuildSpGamePage.expectedData.get("Questions"));
		  System.out.println("Actual Ques Title "+getQuestionTitle());
		  System.out.println("Expected options "+BuildSpGamePage.expectedData.get("Options"));
		  System.out.println("Actual options "+getOptions());
		  
		  
		  ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
          giveAns(ansOptions.get(ranNumber));

		  
		//  if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
			{
			    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
				status=false;
			}
			}
		
	}

	@Override
	public void clickAndVerifyEnabledBackButtonAndroidApp() {
		// TODO Auto-generated method stub
		
	}

	
}
	

	


