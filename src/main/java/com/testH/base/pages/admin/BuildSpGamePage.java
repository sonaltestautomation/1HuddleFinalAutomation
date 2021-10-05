package com.testH.base.pages.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.app.generic.UtilitiesFunctions;

public class BuildSpGamePage {
	
	By loc_gameIcon=By.xpath("//mat-icon[text()='videogame_asset']");
	By loc_Games=By.xpath("//p[text()=' Games ']");
	By loc_btnBuildGame=By.xpath("//p[text()=' Build a Game ']");
	By loc_SpButton=By.xpath("//img[@src='assets/img/single-player-new.png']");
	By loc_NewGameTextBox=By.xpath("//input[@placeholder='Game Name']");
	By loc_btnAddQuestion=By.xpath("//button[contains(@class,'add-game')]");
	By loc_txtAreaQuestion=By.xpath("//textarea[(@name='question_title')]");
	By loc_opt1=By.xpath("//input[(@placeholder='Option 1')]");
	By loc_opt2=By.xpath("//input[(@placeholder='Option 2')]");
	By loc_pt3=By.xpath("//input[(@placeholder='Option 3')]");
	By loc_opt4=By.xpath("//input[(@placeholder='Option 4')]");
	By loc_selTimer=By.xpath("//select[(@name='timer')]");
	By loc_salPoints=By.xpath("//select[(@name='monetization')]");
	By loc_btnQuestionCheck=By.xpath("//mat-icon[(text()='check')]");
	By loc_btnQuestionCancel=By.xpath("//mat-icon[(text()='close')]");
	By loc_btnAddMore=By.xpath("//p[text()='+ Add More']");
	//By loc_optionCheckbox=By.xpath("//div[@class='answer-options']/child::span[1]//child::mat-checkbox");
	By loc_GamePreview=By.xpath("//span[text()='PREVIEW ']");
	By loc_btnGameLibrary=By.xpath("//p[text()=' Game Library ']");
	By loc_1huddleLogo=By.xpath("//img[@alt='1Huddle']");
	By loc_singleLevel=By.xpath("//img[@src='assets/img/single-level.png']");
	By loc_multiLevel=By.xpath("//img[@src='assets/img/multi-level.png']");
	By loc_drpDownCat=By.xpath("//select[@name='category_name']");
	By loc_drpDownTimer=By.xpath("//select[@name='timer']");
	By loc_drpDownPoints=By.xpath("//select[@name='monetization']");
	By loc_imageIcon=By.xpath("//mat-icon[contains(text(),'add_photo_alternate')]");
	By loc_musicIcon=By.xpath("//mat-icon[contains(text(),'music_video')]");
	By loc_tagIcon=By.xpath("//mat-icon[contains(text(),'label')]");
	By loc_addTagChip=By.xpath("//span[contains(text(),'Add a tag')]");
	By loc_textboxTag=By.xpath("//mat-toolbar[contains(text(),'Question Tags')]/following-sibling::section//child::mat-form-field[1]/child::div/child::div[1]/child::div");
	By loc_btnDone=By.xpath("//span[contains(text(),'DONE')]");
	By loc_iconQustionImage=By.xpath("//mat-icon[contains(text(),' add_photo_alternate')]");
	By loc_iconMusic=By.xpath("//mat-icon[contains(text(),'music_video')]");
	By loc_progressBar=By.xpath("//div[@id='initialView']//div[@role='progressbar']");
	
	
    ArrayList<String> games = new ArrayList<String>();
    public static HashMap<String, List<String>> expectedData = new HashMap<String, List<String>>();
	public static HashMap<String, Integer> expectedDataCount = new HashMap<String, Integer>();
	//public static HashMap<String, List<String>> expectedDataCustomizeQues = new HashMap<String, List<String>>();

	
	
	public void clickGameIcon()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hover on Games Icon",Pojo.getObjSeleniumFunctions().mouseHover(loc_gameIcon));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Games, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games drop down is clicking",Pojo.getObjSeleniumFunctions().click(loc_Games));

	}
	
	public void mouseHoverGameIcon()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hover on Games Icon",Pojo.getObjSeleniumFunctions().mouseHover(loc_gameIcon));

	}
	
	
	public void clickBuildGame()
	{
		
		clickGameIcon();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify click on build game button",Pojo.getObjSeleniumFunctions().click(loc_btnBuildGame));

	}

	public void clickSinglePlayer()
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify click SP is working",Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_SpButton));
		

		
	}
	
	public void selectLevel()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_singleLevel,15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that single level is clicking",Pojo.getObjSeleniumFunctions().click(loc_singleLevel));
	}
	
	public void selectMultiLevel()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_multiLevel,15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that multilevel level is clicking",Pojo.getObjSeleniumFunctions().click(loc_multiLevel));

	}
	
	/*public void enterSPgameName()
	{
		String gameName = UtilitiesFunctions.DUMMY_DATA.keySet().iterator().next();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that clicking is working",Pojo.getObjSeleniumFunctions().click(loc_NewGameTextBox));
		Pojo.getObjSeleniumFunctions().clearText(loc_NewGameTextBox);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is entering",Pojo.getObjSeleniumFunctions().setText(loc_NewGameTextBox, gameName));
	}

	public void enterCategory()
	{
	
		int i=1;
		for(String currentCategoryName:UtilitiesFunctions.DUMMY_DATA.get(UtilitiesFunctions.DUMMY_DATA.keySet().iterator().next()).keySet()) {
		  
    	  By loc_catListAdding=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+i+"]");
    	  Pojo.getObjSeleniumFunctions().waitFor(5);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));

    	  By loc_catListEdit=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+i+"]//child::input");
    	  Pojo.getObjSeleniumFunctions().waitFor(5);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));

		  Pojo.getObjSeleniumFunctions().clearText(loc_catListEdit);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is adding",Pojo.getObjSeleniumFunctions().setText(loc_catListEdit, currentCategoryName));
		  System.out.println("current cat name"+i+""+currentCategoryName);
		  i++;
}
	}
	
	public void addQuestions() {
		
		Map<String,List<String>> categoryViceQuestion = UtilitiesFunctions.DUMMY_DATA.get(UtilitiesFunctions.DUMMY_DATA.keySet().iterator().next());
  	  By loc_catList=By.xpath("//div[contains(@class,'chips-container')]//child::div[contains(@class,'mat-chip')]");
  	  List<WebElement> catList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_catList);
  	  
  	    for(int i=1;i<=catList.size();i++)
  	    {
  	  	  By loc_category=By.xpath("//div[contains(@class,'chips-container')]//child::div[contains(@class,'mat-chip')]["+i+"]");

  	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category is selecting",Pojo.getObjSeleniumFunctions().click(loc_category));

		
		for(String currentCategoryName:categoryViceQuestion.keySet())
		{
			for (String questionName:categoryViceQuestion.get(currentCategoryName)) {
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add question button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnAddQuestion));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question Title is adding",Pojo.getObjSeleniumFunctions().setText(loc_txtAreaQuestion, questionName));
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question option1 is adding",Pojo.getObjSeleniumFunctions().setText(loc_opt1,"CorrectAns"));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question option2 is adding",Pojo.getObjSeleniumFunctions().setText(loc_opt2,"InCorrectAns"));

			
			}
		}
		
	}}
	
	*/
	

public void enterGameName(String gameName)
{
    games.add(gameName);

    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_NewGameTextBox, 10);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that clicking is working",Pojo.getObjSeleniumFunctions().click(loc_NewGameTextBox));
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_NewGameTextBox, 10);
	Pojo.getObjSeleniumFunctions().clearText(loc_NewGameTextBox);
	Pojo.getObjSeleniumFunctions().waitFor(2);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is entering",Pojo.getObjSeleniumFunctions().setText(loc_NewGameTextBox, gameName));
	System.out.println("Entered Game Name: "+gameName);
	expectedData.put("GameName",games);
}


public void enterGameData(String cat1, String cat2, String cat3, String cat4, String cat5,String ques1, String ques2, String ques3, String ques4, String ques5,String ques6,String ques7, String ques8, String ques9,String ques10,String option1,String option2, String option3,String option4,int catCount,int quesCount,int optionCount,int correctAnsOptionCount)
{
	ArrayList<String> categories=new ArrayList<String>();
	ArrayList<String> questions=new ArrayList<String>();
	ArrayList<String> options=new ArrayList<String>();
	
	categories.add(cat1);
	categories.add(cat2);
	categories.add(cat3);
	categories.add(cat4);
	categories.add(cat5);
	
	questions.add(ques1);
	questions.add(ques2);
	questions.add(ques3);
	questions.add(ques4);
	questions.add(ques5);
	questions.add(ques6);
	questions.add(ques7);
	questions.add(ques8);
	questions.add(ques9);
	questions.add(ques10);
	
	options.add(option1);
	options.add(option2);
	options.add(option3);
	options.add(option4);
	
	expectedData.put("Categories",categories );
	expectedData.put("Questions",questions );
	expectedData.put("Options",options );
	expectedDataCount.put("QuestionCount", quesCount);
	expectedDataCount.put("CategoryCount", catCount);
	expectedDataCount.put("CorrectAnsOptionCount", correctAnsOptionCount);
	expectedDataCount.put("OptionCount", optionCount);

	

	for(int i=1;i<=catCount;i++)
	{
		
		By loc_catListAdding=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+i+"]");
  	    Pojo.getObjSeleniumFunctions().waitFor(3);
	  	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListAdding, 10);
	  	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_catListAdding);

	  	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListAdding, 10);
	  	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_catListAdding);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));

  	  By loc_catListEdit=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+i+"]//child::input");
  	  Pojo.getObjSeleniumFunctions().waitFor(3);
  	  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListEdit, 15);
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));
  	  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListEdit, 15);

	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));

		  Pojo.getObjSeleniumFunctions().clearText(loc_catListEdit);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is adding",Pojo.getObjSeleniumFunctions().setText(loc_catListEdit, categories.get(i-1)));
		  System.out.println("current cat name"+i+ ""+categories.get(i-1));
		  addQuestion(questions,options,quesCount,optionCount,correctAnsOptionCount); //
		  
		
	}}
	
public void addQuestion(ArrayList<String> questions,ArrayList<String> options,int quesCount,int optionCount,int correctOptionCount)
	{
		for(int i=1;i<=quesCount;i++)
		{
		  int optionCountCopy=optionCount;
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add question button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddQuestion));
          Pojo.getObjSeleniumFunctions().waitFor(2);
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question is entering", Pojo.getObjSeleniumFunctions().setText(loc_txtAreaQuestion, questions.get(i-1)));
          
          while(optionCountCopy>2)
          {
              Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that extra option is adding", Pojo.getObjSeleniumFunctions().click(loc_btnAddMore));
              optionCountCopy=optionCountCopy-2;

          }
          
          for(int j=1;j<=optionCount;j++)
          {   
        	  By loc_option=By.xpath("//div[@class='answer-options']/child::span["+j+"]/child::div/child::div/child::input");
              Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that option is entering", Pojo.getObjSeleniumFunctions().setText(loc_option, options.get(j-1)));
          }
          
          for(int k=1;k<=correctOptionCount;k++)
          {
          By loc_optionCheckbox=By.xpath("//div[@class='answer-options']/child::span["+k+"]//child::mat-checkbox"); 
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans option is selecting", Pojo.getObjSeleniumFunctions().click(loc_optionCheckbox));
          }
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question is adding", Pojo.getObjSeleniumFunctions().click(loc_btnQuestionCheck));
          Pojo.getObjSeleniumFunctions().waitFor(3);

          }}


public void clickGamePreview()
{ 
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_GamePreview,25);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that preview button is clicking",Pojo.getObjSeleniumFunctions().click(loc_GamePreview));
}

public void clickGameLibrary()
{
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameIcon, 20);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hover on Games Icon",Pojo.getObjSeleniumFunctions().mouseHover(loc_gameIcon));
	//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games drop down is clicking",Pojo.getObjSeleniumFunctions().click(loc_Games));

	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify click on game library button",Pojo.getObjSeleniumFunctions().click(loc_btnGameLibrary));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hover on 1h logo",Pojo.getObjSeleniumFunctions().mouseHover(loc_1huddleLogo));
    Pojo.getObjSeleniumFunctions().waitFor(3);
}

public void selectCategory(String catName)
{
	
	By loc_catName=By.xpath("//select[@name='category_name']/child::option[2][contains(text(),'"+catName+"')]");
	Pojo.getObjSeleniumFunctions().waitFor(5);
    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_drpDownCat));
	Pojo.getObjSeleniumFunctions().waitFor(5);

	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that category is selecting", Pojo.getObjSeleniumFunctions().click(loc_catName));
}
public void selectTimer(String timer)
{
	By loc_time=By.xpath("//option[text()='"+timer+"']");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer is clicking", Pojo.getObjSeleniumFunctions().click(loc_drpDownTimer));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timer is selecting", Pojo.getObjSeleniumFunctions().click(loc_time));

}
public void selectPoints(String points)
{	
	By loc_points=By.xpath("//option[contains(text(),'"+points+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points clicking", Pojo.getObjSeleniumFunctions().click(loc_drpDownPoints));
	Pojo.getObjSeleniumFunctions().waitFor(2);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are selecting", Pojo.getObjSeleniumFunctions().click(loc_points));

}

public void addTag(String tagName)
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that tags is clicking", Pojo.getObjSeleniumFunctions().click(loc_tagIcon));
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addTagChip, 10);
	Pojo.getObjSeleniumFunctions().click(loc_addTagChip);
	Pojo.getObjSeleniumFunctions().waitFor(2);
	Pojo.getObjSeleniumFunctions().click(loc_textboxTag);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Enter tag name", Pojo.getObjSeleniumFunctions().setText(loc_textboxTag, tagName));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDone));
}

public void addCustomizeQuestion(String quesTitle,String option1,String option2, String option3,String option4,int optionCount,int correctAnsOptionCount,String catName,String timer,String points,String tag)
{
	ArrayList<String> options=new ArrayList<String>();
	ArrayList<String> quesText=new ArrayList<String>();
	ArrayList<String> catNameDrpDown=new ArrayList<String>();
	ArrayList<String> quesTimer=new ArrayList<String>();
	ArrayList<String> quesPoints=new ArrayList<String>();
	ArrayList<String> quesTag=new ArrayList<String>();

    quesText.add(quesTitle);
	options.add(option1);
	options.add(option2);
	options.add(option3);
	options.add(option4);
	catNameDrpDown.add(catName);
	quesTimer.add(timer);
	quesPoints.add(points);
	quesTag.add(tag);

	expectedData.put("Options", options);
	expectedData.put("Questions", quesText);
	expectedData.put("Categories", catNameDrpDown);
	expectedData.put("QuesTimer", quesTimer);
	expectedData.put("QuesPoints", quesPoints);
	expectedData.put("QuesTag", quesTag);
	expectedDataCount.put("CorrectAnsOptionCount", correctAnsOptionCount);
	expectedDataCount.put("OptionCount", optionCount);


	  int optionCountCopy=optionCount;
      Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add question button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddQuestion));
      Pojo.getObjSeleniumFunctions().waitFor(2);
      Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question is entering", Pojo.getObjSeleniumFunctions().setText(loc_txtAreaQuestion, quesTitle));
      
      while(optionCountCopy>2)
      {
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that extra option is adding", Pojo.getObjSeleniumFunctions().click(loc_btnAddMore));
          optionCountCopy=optionCountCopy-2;

      }
      
      for(int j=1;j<=optionCount;j++)
      {   
    	  By loc_option=By.xpath("//div[@class='answer-options']/child::span["+j+"]/child::div/child::div/child::input");
          Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that option is entering", Pojo.getObjSeleniumFunctions().setText(loc_option, options.get(j-1)));
      }
      
      for(int k=1;k<=correctAnsOptionCount;k++)
      {
      By loc_optionCheckbox=By.xpath("//div[@class='answer-options']/child::span["+k+"]//child::mat-checkbox"); 
      Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct ans option is selecting", Pojo.getObjSeleniumFunctions().click(loc_optionCheckbox));
      }
      
      selectTimer(timer);
   //  selectCategory(catName);  //Created Bug for this,Showing untitled when try to select cat from dropdown using automation script. Have to log bug
      selectPoints(points);
      
      
      
      }

	public void clickAddQuestionTick()
	{
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question is adding", Pojo.getObjSeleniumFunctions().click(loc_btnQuestionCheck));
	     Pojo.getObjSeleniumFunctions().waitFor(30);
		// Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_progressBar,25);

	}
	
	public void selectParticularCategory(int catId)
	{
		By loc_cat=By.xpath("//input[contains(@id,'isContent"+catId+"')]/parent::div");
		System.out.println("Loc Cat "+loc_cat);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat is selecting", Pojo.getObjSeleniumFunctions().click(loc_cat));
	}

	public void enterCategoryName(int catNumber,String catName)
	{
		By loc_catListAdding=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+catNumber+"]");
  	    Pojo.getObjSeleniumFunctions().waitFor(3);
	  	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListAdding, 10);
	  	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_catListAdding);

	  	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListAdding, 10);
	  	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_catListAdding);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new cat is clicking", Pojo.getObjSeleniumFunctions().click(loc_catListAdding));

  	  By loc_catListEdit=By.xpath("//div[contains(@class,'chips-container')]//child::div[1]//following-sibling::div["+catNumber+"]//child::input");
  	  Pojo.getObjSeleniumFunctions().waitFor(3);
  	  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListEdit, 15);
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));
  	  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_catListEdit, 15);

	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is clicking ", Pojo.getObjSeleniumFunctions().click(loc_catListEdit));

		  Pojo.getObjSeleniumFunctions().clearText(loc_catListEdit);
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cat name is adding",Pojo.getObjSeleniumFunctions().setText(loc_catListEdit, catName));
	}
	
	public void uploadQuestionImage() throws IOException
	{
	   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that image icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconQustionImage));
	   Pojo.getObjSeleniumFunctions().waitFor(3);
	   Runtime.getRuntime().exec("src/test/resources/autoitScripts/WebAppValidImage.exe");

	}
	public void uploadQuestionSound() throws IOException
	{
		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_iconMusic, 10);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that sound icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconMusic));
		   Pojo.getObjSeleniumFunctions().waitFor(3);
		   Runtime.getRuntime().exec("src/test/resources/autoitScripts/QuestionSound.exe");
	}
	
	public void clickDoneBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDone));

	}
	}
