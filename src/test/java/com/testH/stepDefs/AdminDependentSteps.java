package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GameLibraryPage;
import com.testH.base.pages.admin.GamePreviewPageAdmin;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.admin.ScheduleGamePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class AdminDependentSteps {
	String gameName="";
	String profileTitle="";
	String scenario="";
	List<String> cats=new ArrayList<String>();
	List<String> Ques=new ArrayList<String>();
	List<String> Options=new ArrayList<String>();
	String attempts="";
	
	private BaseTest objBaseTest;
	private BuildSpGamePage objBuildSpGamePage;
	private LoginPage objLoginPage;
	private GamePreviewPageAdmin objGamePreviewPageAdmin;
	private ScheduleGamePage objScheduleGamePage;
	private GameLibraryPage objGameLibraryPage;
	private HomePage objHomePage;
	private SelectGamePage objSelectGamePage;
	private GamePreviewPage objGamePreviewPage;
	private QuestionCategoryPage objQuestionCategoryPage;
	private SelectAnswerPage objSelectAnswerPage;
	
	public AdminDependentSteps()
	{
		objBaseTest=new BaseTest();
		objBuildSpGamePage=new BuildSpGamePage();
		objLoginPage=new LoginPage();
		objGamePreviewPageAdmin=new GamePreviewPageAdmin();
		objScheduleGamePage=new ScheduleGamePage();
		objGameLibraryPage=new GameLibraryPage();
		objHomePage = new PageFactory().getObjHomePage();
		objSelectGamePage=new PageFactory().getSelectGamePage();
		objGamePreviewPage=new PageFactory().getGamePreviewPage();
		objQuestionCategoryPage=new PageFactory().getQuestionCategoryPage();
		objSelectAnswerPage=new PageFactory().getSelectAnswerPage();
	}
	
	
	/*
	 * @Given("^Manager is logged In$") public void manager_is_logged_in(DataTable
	 * table) throws Throwable { List<List<String>> data=table.asLists(); String
	 * userName=data.get(1).get(0); String password=data.get(1).get(1);
	 * System.out.println("User Name: "+userName);
	 * System.out.println("Password: "+password);
	 * 
	 * System.out.println("objLogin"+objLoginPage);
	 * 
	 * objLoginPage.enterEmail(userName); objLoginPage.clickNext();
	 * 
	 * objLoginPage.enterPw(password); objLoginPage.clickNext();
	 * 
	 * 
	 * }
	 */

//    @When("^Manager creates a game$")
//    public void manager_creates_a_game(DataTable table) throws Throwable {
//    	
//    	 objBuildSpGamePage.clickBuildGame();
//		 objBuildSpGamePage.clickSinglePlayer();
//		 objBuildSpGamePage.selectLevel();
//
//		 List<List<String>> data=table.asLists();
//
//		 gameName=data.get(1).get(0);
//		 System.out.println("Game Name "+gameName);
//		 objBuildSpGamePage.enterGameName(gameName);
//		 
//         String cat1=data.get(1).get(1).toUpperCase();
//         String cat2=data.get(1).get(2).toUpperCase();
//         String cat3=data.get(1).get(3).toUpperCase();
//         String cat4=data.get(1).get(4).toUpperCase();
//         String cat5=data.get(1).get(5).toUpperCase();
//         
//         System.out.println("Categories Are: "+cat1 +" "+cat2+" "+cat3+" "+cat4+" "+cat5);
//         
//         String ques1=data.get(1).get(6);
//         String ques2=data.get(1).get(7);
//         String ques3=data.get(1).get(8);
//         String ques4=data.get(1).get(9);
//         String ques5=data.get(1).get(10);
//         String ques6=data.get(1).get(11);
//         String ques7=data.get(1).get(12);
//         String ques8=data.get(1).get(13);
//         String ques9=data.get(1).get(14);
//         String ques10=data.get(1).get(15);
//         System.out.println("Questions Are: "+ques1 +" "+ques2+" "+ques3+" "+ques4+" "+ques5+" "+ques6+" "+ques7+" "+ques8+" "+ques9+" "+ques10);
//
//         String opt1=data.get(1).get(16);
//         String opt2=data.get(1).get(17);
//         String opt3=data.get(1).get(18);
//         String opt4=data.get(1).get(19);
//         System.out.println("Options Are: "+opt1 +" "+opt2+" "+opt3+" "+opt4);
//         
//         int catCount=Integer.parseInt(data.get(1).get(20));
//         System.out.println("No of Categories to add in game "+catCount);
//         
//         int quesCount=Integer.parseInt(data.get(1).get(21));
//         System.out.println("No of questions to add in game "+quesCount);
//
//         int optionCount=Integer.parseInt(data.get(1).get(22));
//         System.out.println("No of options to add in game "+optionCount);
//
//         objBuildSpGamePage.enterGameData(cat1,cat2, cat3,cat4,cat5,ques1,ques2,ques3,ques4,ques5,ques6,ques7,ques8,ques9,ques10,opt1,opt2,opt3,opt4,catCount,quesCount,optionCount);
//         objBuildSpGamePage.clickGamePreview();
//         profileTitle=data.get(1).get(23);
//		 scenario=data.get(1).get(24);
//    	
//		 System.out.println("Profile Title "+profileTitle);
//		 System.out.println("Profile Scenario "+scenario);
//		 
//		objGamePreviewPageAdmin.enterTitle(profileTitle);
//		Pojo.getObjSeleniumFunctions().waitFor(2);
//    	objGamePreviewPageAdmin.enterScenario(scenario);
//    	objGamePreviewPageAdmin.clickDoneButton();
//    	objGamePreviewPageAdmin.clickYesScheduleGame();
//    	
//    	attempts=data.get(1).get(25);
//    	
//    	
//    	objScheduleGamePage.selectAllLocations();
//    	objScheduleGamePage.clickNext();
//    	objScheduleGamePage.selectAllDeps();
//    	objScheduleGamePage.clickNext();
//    	objScheduleGamePage.enterAttempt(attempts);
//    	objScheduleGamePage.clickApply();
//         
//    }

    
//    	@Then("^correct game is in live state$")
//	    public void correct_game_is_in_live_state() throws Throwable {
//	    	
//	    	objBuildSpGamePage.clickGameLibrary();
//	    	objGameLibraryPage.selectLiveFilter();
//	    	objGameLibraryPage.verifyLiveGame();
//	    	 
//	    }
    }



