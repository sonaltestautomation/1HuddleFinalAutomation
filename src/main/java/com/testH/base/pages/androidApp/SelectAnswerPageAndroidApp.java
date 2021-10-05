package com.testH.base.pages.androidApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class SelectAnswerPageAndroidApp extends SelectAnswerPage  {
	
	By loc_catNames=MobileBy.xpath("//android.widget.TextView[@resource-id='com.ionicframework.SaleshuddleApp:id/category_name_tv']");
	
	By loc_categoryCardList=MobileBy.xpath("//android.widget.FrameLayout[contains(@resource-id,'com.ionicframework.SaleshuddleApp:id/category_fragment_game_profile_category_holder_fl')]/child::android.view.ViewGroup//following-sibling::android.widget.FrameLayout");
	By loc_btnRateQuestion=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_rate_question_tv\")");
	By loc_btnDone=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_skip_tv\")");
	
	By loc_RightButton=MobileBy.xpath("//android.widget.TextView[@text='NEXT']");
	By loc_DoneButton=MobileBy.xpath("//android.widget.TextView[@text='DONE']");
	
	By loc_titleQuestion=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_question_text_tv\")");
      By loc_CorrectAnsOption=MobileBy.xpath("//android.widget.TextView[contains(@text,'CorrectOption')]");
	//By loc_CorrectAnsOption=MobileBy.xpath("//android.widget.TextView[@text='CorrectOption 1']");
	
	By loc_IncorrectAnsOption=MobileBy.xpath("//android.widget.TextView[contains(@text,'WrongOption')]");
	//By loc_IncorrectAnsOption=MobileBy.xpath("//android.widget.TextView[@text='WrongOption 3']");
	
	By loc_correctAllAbove=MobileBy.xpath("//android.widget.TextView[contains(@text,'All of the above')]");

	By loc_timerQuestion=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_question_timer_tv\")");
    By loc_optionsQues=MobileBy.xpath("//android.widget.TextView[contains(@resource-id,'com.ionicframework.SaleshuddleApp:id/answer_view_option')]");
	By loc_footerCompanyLogo=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_footer_company_logo\")");
    By loc_fourthAnsOption=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_footer_company_logo\")");
    
    By loc_QuestionPoint=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_category_point_tv\")");
    By loc_textCat=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_category_name_tv\")");
    By loc_quesImage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_question_image_iv\")");
    
	public int totalPoints=0;   
    public int perfectGameCount; //perfect game means all correct
    public static HashMap<String, Integer> expectedGamePlayDataStatistics = new HashMap<String, Integer>();



    
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
		    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans is selecting",Pojo.getObjSeleniumFunctions().tap(loc_correctAllAbove));
				Pojo.getObjSeleniumFunctions().waitFor(1);
				ansStatus=true;
		    }
		    
		    else
		    {
		    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_CorrectAnsOption, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans is selecting",Pojo.getObjSeleniumFunctions().tap(loc_CorrectAnsOption));
			Pojo.getObjSeleniumFunctions().waitFor(1);
			ansStatus=true;
		    }
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that incorrect ans is selecting",Pojo.getObjSeleniumFunctions().click(loc_IncorrectAnsOption));
			Pojo.getObjSeleniumFunctions().waitFor(1);
		}
		
		
		return ansStatus;
	}
	

	@Override
	public int playGameAndCalculatePoint() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clickNext() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickDone() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnDone));
	}

	@Override
	public String getQuestionTitle() {
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_titleQuestion).trim();
		System.out.println("Question Title is "+actualText);
		return actualText;
	}

	@Override
	public List<String> getOptions() {
	    Pojo.getObjSeleniumFunctions().swipe(loc_titleQuestion, loc_timerQuestion);
		List<AndroidElement> ansOptions=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_optionsQues);
		List<String> strAnsOptions=new ArrayList<String>();
		
		for(AndroidElement option:ansOptions)
		{
			strAnsOptions.add(Pojo.getObjSeleniumFunctions().getText(option).trim());
		}
		return strAnsOptions;
	}
	

	@Override
	public int playGameAndCalculatePointWebOnly(String selectAns) {
		// TODO Auto-generated method stub
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
			//if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3)==true)
			{
				//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().tap(loc_RightButton));
			}
			else
			{
				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,3);
				//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().tap(loc_DoneButton));
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
		
		//while(status==true)
		//{
			
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question title is correct",BuildSpGamePage.expectedData.get("Questions").contains(getQuestionTitle()));
		  System.out.println("Expected Question Title "+BuildSpGamePage.expectedData.get("Questions"));
		  System.out.println("Actual Ques Title "+getQuestionTitle());
		 // ranNumber=Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1);
        //  giveAns(ansOptions.get(ranNumber));

		  
		//  if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,3))
//			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_RightButton))
//			{
//			    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
//				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_RightButton));
//			}
//			else
//			{
//				Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DoneButton,10);
//				Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_DoneButton);
//				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_DoneButton));
//				status=false;
//			}
		//	}
		
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
		Pojo.getObjSeleniumFunctions().navigateToBack();
	}

	@Override
	public String getCategoryName() {
		String catName = Pojo.getObjSeleniumFunctions().getText(loc_textCat);
		System.out.println("Category Name question screen "+catName);
		return catName;
	}

	@Override
	public int getQuesPoint() {
		String strPoints=Pojo.getObjSeleniumFunctions().getText(loc_QuestionPoint);
		int intQuesPoints=Integer.parseInt(strPoints);
		System.out.println("Category question points "+intQuesPoints);
		return intQuesPoints;
	}

	@Override
	public void verifyBackBtnDisabledLastQues() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyBackAndNextDisabled() {

        
//On mobile app there is no back button on app but user can do it using device back
        String expectedDisabledNextButtonAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_RightButton,"clickable");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Next button is disabled without giving answer ", expectedDisabledNextButtonAttribute.equals("false"));
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyQuestionTimer() {
		String timer=Pojo.getObjSeleniumFunctions().getText(loc_timerQuestion);
		
		int intTimerTime=Integer.parseInt(timer.trim());
		System.out.println("Question Timer "+intTimerTime);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer time is correct",intTimerTime>=0&&intTimerTime<=60);		
	}

	@Override
	public void verifyRateQuestionEveryQues() {
		
		QuestionCategoryPage objQuestionCategoryPage=new PageFactory().getQuestionCategoryPage();
        Pojo.getObjSeleniumFunctions().waitFor(15);
		int catCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_categoryCardList).size();
		int allCategoryQuestionsCount=objQuestionCategoryPage.getQuestionCount();
		System.out.println("Question Count is "+allCategoryQuestionsCount);
		
		for(int i=1;i<=catCount;i++)
		{
			By loc_CatName=By.xpath("//android.view.ViewGroup[contains(@resource-id,'com.ionicframework.SaleshuddleApp:id/principle_category_item_"+i+"')]/child::android.widget.TextView[1]");

			
			
		//	By loc_CatName=By.xpath("//mat-card[contains(@class,'"+i+"')]//child::mat-card-title[contains(@class,'cardName')]");
			String expectedCatName=Pojo.getObjSeleniumFunctions().getText(loc_CatName);
			System.out.println("Expected Cat Name "+expectedCatName);
			By loc_questionCountCategory=By.xpath("//android.view.ViewGroup[contains(@resource-id,'com.ionicframework.SaleshuddleApp:id/principle_category_item_"+i+"')]/child::android.widget.TextView[2]");
			int quesCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_questionCountCategory).trim());
			while(quesCount!=0)
			{
			Pojo.getObjSeleniumFunctions().click(loc_CatName);
			
			giveAns("all correct");
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
	    }
		
	}

	@Override
	public HashMap<String, Integer> playGameAndCalculatePointsStatistics(String selectAns) {
		int totalcorrectAns=0;

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
			
			boolean ansResult=giveAns(ansOptions.get(ranNumber));
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
		
		System.out.println("Total Points "+totalPoints);
		System.out.println("Perfect Game "+perfectGameCount);
		System.out.println("Total Correct Ans "+totalcorrectAns);
		expectedGamePlayDataStatistics.put("PerfectGameCount",perfectGameCount);
		expectedGamePlayDataStatistics.put("TotalPoints",totalPoints);
		expectedGamePlayDataStatistics.put("TotalCorrectAns",totalcorrectAns);

		
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
		 
		  int quesTimerExp=Integer.parseInt(BuildSpGamePage.expectedData.get("QuesTimer").get(0).trim());
		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_timerQuestion, 10);
		  Pojo.getObjSeleniumFunctions().waitFor(3);
		  int quesTimerActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_timerQuestion).trim());
		  
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question time is correct",quesTimerActual<=quesTimerExp);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question point is correct",BuildSpGamePage.expectedData.get("QuesPoints").get(0).trim().equals(Pojo.getObjSeleniumFunctions().getText(loc_QuestionPoint).trim()));

		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesImage, 10);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question image is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_quesImage));	
		//  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesSound, 10); //Question sound feature is not on mob app

		//  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question sound is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_quesSound));	//Ques sound feature is not on mobile app
		//  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that show answer button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_showAnsBtn));
		//  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that show answer button is clicking", Pojo.getObjSeleniumFunctions().click(loc_showAnsBtn));

		  
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
		// TODO Auto-generated method stub
		
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
			   // Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_RightButton,7);
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().navigateToBack());
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

		
	}

	
	


