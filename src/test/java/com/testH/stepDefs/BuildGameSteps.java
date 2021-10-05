package com.testH.stepDefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.UtilitiesFunctions;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GameLibraryPage;
import com.testH.base.pages.admin.GamePreviewPageAdmin;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.admin.ScheduleGamePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;




public class BuildGameSteps {
	
	String gameName="";
	String profileTitle="";
	String scenario="";
	List<String> cats=new ArrayList<String>();
	List<String> Ques=new ArrayList<String>();
	List<String> Options=new ArrayList<String>();
	String attempts="";
	public static HashMap<String, Integer> expectedGameData= new HashMap<String, Integer>();
	
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
	private BuildMlgGamePage objBuildMlgGamePage;
	private PlayGameFlow objPlayGameFlow;



	
	public BuildGameSteps() {
		
		objBaseTest=new BaseTest();
		objBuildSpGamePage=new BuildSpGamePage();
		objBuildMlgGamePage=new BuildMlgGamePage();
		objLoginPage=new LoginPage();
		objGamePreviewPageAdmin=new GamePreviewPageAdmin();
		objScheduleGamePage=new ScheduleGamePage();
		objGameLibraryPage=new GameLibraryPage();
		objHomePage = new PageFactory().getObjHomePage();
		objSelectGamePage=new PageFactory().getSelectGamePage();
		objGamePreviewPage=new PageFactory().getGamePreviewPage();
		objQuestionCategoryPage=new PageFactory().getQuestionCategoryPage();
		objSelectAnswerPage=new PageFactory().getSelectAnswerPage();
		objPlayGameFlow=new PlayGameFlow();
	}

	 @Given("^Manager is logged In$")
	    public void manager_is_logged_in(DataTable table) throws Throwable {
		 

		    List<List<String>> data=table.asLists();
	    	String userName=data.get(1).get(0);
	    	String password=data.get(1).get(1);
	    	
	    	userName=Pojo.getObjConfig().getProperty(userName);
	    	password=Pojo.getObjConfig().getProperty(password);
	    	
	    	
	    	
	    	
		 
		   objLoginPage.enterEmail(userName);
		   objLoginPage.clickNext();
		   
		   objLoginPage.enterPw(password);
		   objLoginPage.clickNext();

		   
		 
		 
	    }

	 @When("^Manager enters game name$")
	    public void manager_enters_game_name(DataTable table) throws Throwable {
		 
		 objBuildSpGamePage.clickBuildGame();
		 objBuildSpGamePage.clickSinglePlayer();
		 objBuildSpGamePage.selectLevel();

		 List<List<String>> data=table.asLists();

		 gameName=data.get(1).get(0);
		 System.out.println("Game Name "+gameName);
		 objBuildSpGamePage.enterGameName(gameName);
		 
	    }
	 
	 @When("^Manager enters random game name$")
	    public void manager_enters_random_game_name() throws Throwable {
		 objBuildSpGamePage.clickBuildGame();
		 objBuildSpGamePage.clickSinglePlayer();
		 objBuildSpGamePage.selectLevel();
         gameName="Random Game "+Pojo.getObjTestData().getFirstName()+Pojo.getObjTestData().getLastName()+Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 100);
		 objBuildSpGamePage.enterGameName(gameName);

	    }
	 
	 @And("^Enters Categories Questions and Options$")
	    public void enters_gameData(DataTable table) throws Throwable {
		 List<List<String>> data=table.asLists();
         String cat1=data.get(1).get(0).toUpperCase();
         String cat2=data.get(1).get(1).toUpperCase();
         String cat3=data.get(1).get(2).toUpperCase();
         String cat4=data.get(1).get(3).toUpperCase();
         String cat5=data.get(1).get(4).toUpperCase();
         
         System.out.println("Categories Are: "+cat1 +" "+cat2+" "+cat3+" "+cat4+" "+cat5);
         
         String ques1=data.get(1).get(5);
         String ques2=data.get(1).get(6);
         String ques3=data.get(1).get(7);
         String ques4=data.get(1).get(8);
         String ques5=data.get(1).get(9);
         String ques6=data.get(1).get(10);
         String ques7=data.get(1).get(11);
         String ques8=data.get(1).get(12);
         String ques9=data.get(1).get(13);
         String ques10=data.get(1).get(14);
         System.out.println("Questions Are: "+ques1 +" "+ques2+" "+ques3+" "+ques4+" "+ques5+" "+ques6+" "+ques7+" "+ques8+" "+ques9+" "+ques10);

         String opt1=data.get(1).get(15);
         String opt2=data.get(1).get(16);
         String opt3=data.get(1).get(17);
         String opt4=data.get(1).get(18);
         System.out.println("Options Are: "+opt1 +" "+opt2+" "+opt3+" "+opt4);
         
         int catCount=Integer.parseInt(data.get(1).get(19));
         System.out.println("No of Categories to add in game "+catCount);
         
         int quesCount=Integer.parseInt(data.get(1).get(20));
         System.out.println("No of questions to add in game "+quesCount);

         int optionCount=Integer.parseInt(data.get(1).get(21));
         System.out.println("No of options to add in game "+optionCount);
         
         int corectAnsOptionCount=Integer.parseInt(data.get(1).get(22));
         System.out.println("No of correct options to add in game "+corectAnsOptionCount);


         objBuildSpGamePage.enterGameData(cat1,cat2, cat3,cat4,cat5,ques1,ques2,ques3,ques4,ques5,ques6,ques7,ques8,ques9,ques10,opt1,opt2,opt3,opt4,catCount,quesCount,optionCount,corectAnsOptionCount);
		 }
	 
	 @And("^Click on Preview button$")
	    public void click_on_preview_button() throws Throwable {
		 
		 objBuildSpGamePage.clickGamePreview();
	    }

	    @And("^Add Game Preview Title and Scenario$")
	    public void add_game_title_scenario(DataTable table) throws Throwable {
	    	
			 List<List<String>> data=table.asLists();
			 profileTitle=data.get(1).get(0);
			 scenario=data.get(1).get(1);
	    	
			 System.out.println("Profile Title "+profileTitle);
			 System.out.println("Profile Scenario "+scenario);
			 
			objGamePreviewPageAdmin.enterTitle(profileTitle);
			Pojo.getObjSeleniumFunctions().waitFor(2);
	    	objGamePreviewPageAdmin.enterScenario(scenario);
	    	
	    	}
	    
	    @And("^Add Information title and description$")
	    public void add_information_title_and_description(DataTable table) throws Throwable {
	    	
	    	List<List<String>> data=table.asLists();
	    	int addMoreCount=Integer.parseInt(data.get(1).get(0));
	    	objGamePreviewPageAdmin.enterInformation(addMoreCount);
	    }

	    @And("^click on Done button on gamepreview page$")
	    public void click_on_done_button_on_gamepreview_page() throws Throwable {	
	    	objGamePreviewPageAdmin.clickDoneButton();

	    	objGamePreviewPageAdmin.clickYesScheduleGame();
	    //	objGamePreviewPageAdmin.clickDoneButton();//bcz response not appearing after clicking on Done button and yes one time
	    	//objGamePreviewPageAdmin.clickYesScheduleGame();//bcz response not appearing after clicking on Done button and yes one time
	    }
	    
	    @And("^manager tries to schedule game$")
	    public void manager_tries_to_schedule_game(DataTable table) throws Throwable {
	    	String scheduleGameOrNot=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	    	objGamePreviewPageAdmin.clickDoneButton();
	    	if(scheduleGameOrNot.equalsIgnoreCase("Yes"))
	    	{
	    		objGamePreviewPageAdmin.clickYesScheduleGame();
	    	}
	    	else
	    	{
	    		objGamePreviewPageAdmin.clickNoScheduleGame();
	    	}
	    }
	    
	    
	    @And("^Schedule Game$")
	    public void schedule_game(DataTable table) throws Throwable {
	    	
	    	List<List<String>> data=table.asLists();
	    	attempts=data.get(1).get(0);
	    	
	    	
	    	objScheduleGamePage.selectAllLocations();
	    	objScheduleGamePage.clickNext();
	    	objScheduleGamePage.selectAllDeps();
	    	objScheduleGamePage.clickNext();
	    	objScheduleGamePage.enterAttempt(attempts);
	    	//Pojo.getObjUtilitiesFunctions().setRandomEndDateScheduleGame();
	    	objScheduleGamePage.clickApply();
	    	
	    }
	    
	    @And("^manager selects all locations on schedule game screen$")
	    public void manager_selects_all_locations_on_schedule_game_screen() throws Throwable {
	    	objScheduleGamePage.selectAllLocations(); 
	    	objScheduleGamePage.clickNext();
	    }

	    @And("^manager selects all departments on schedule game screen$")
	    public void manager_selects_all_departments_on_schedule_game_screen() throws Throwable {
	    	objScheduleGamePage.selectAllDeps();
	    	objScheduleGamePage.clickNext();
	    }

	    @And("^manager enters attempts on schedule game screen$")
	    public void manager_enters_attempts_on_schedule_game_screen(DataTable table) throws Throwable {
	    	List<List<String>> data=table.asLists();
	    	attempts=data.get(1).get(0);
	    	objScheduleGamePage.enterAttempt(attempts);
	    }

	    @And("^manager set a random date on schedule game screen$")
	    public void manager_set_a_random_date_on_schedule_game_screen() throws Throwable {
	    	Pojo.getObjUtilitiesFunctions().setRandomEndDateScheduleGame();
	    }

	    @And("^manager clicks on apply button on schedule game screen$")
	    public void manager_clicks_on_apply_button_on_schedule_game_screen() throws Throwable {
	    	objScheduleGamePage.clickApply();
	    }
	    
	    @Then("^correct game is in live state$")
	    public void correct_game_is_in_live_state() throws Throwable {
	    	
	    	objBuildSpGamePage.clickGameLibrary();
	    	objGameLibraryPage.selectLiveFilter();
	    	
	    	for(int i=1;i<=10;i++)
	    	{
	    	if(objGameLibraryPage.verifyLiveGame()==false)
	    	{
	    		Pojo.getObjSeleniumFunctions().pageRefresh();
	    		Pojo.getObjSeleniumFunctions().waitFor(15);
	    		//objBuildSpGamePage.clickGameIcon();
	    		//objBuildSpGamePage.clickGameLibrary();
		    	objGameLibraryPage.selectLiveFilter();
	    	}
	    	else
	    	{
	    		break;
	    	}
	    	}
	    }

	    @Then("^Game name is correct on app$")
	    public void game_name_is_correct_on_webapp() throws Throwable {
	    	
	    	objSelectGamePage.verifyLiveGameWebApp();
	    	}

	    @Then("^Game preview title scenario and information is correct on webapp$")
	    public void preview_title_and_scenario_is_correct_on_webapp() throws Throwable {
	    	
	    	System.out.println("Recently Added game name "+gameName);
	    	objSelectGamePage.selectRecentlyCreatedGame(gameName);
	    	
	    	objGamePreviewPage.verifyPreviewTitle(profileTitle);
	    	objGamePreviewPage.verifyScenario(scenario);
	    	objGamePreviewPage.verifyPreviewInfo();
	    	}
	    
	    @Then("^Trophy field is appearing on preview screen$")
	    public void trophy_field_is_appearing_on_preview_screen() throws Throwable {
	    	objGamePreviewPage.verifyTrophyField();
	    }

	    @Then("^Trophy description is correct$")
	    public void trophy_description_is_correct() throws Throwable {
	    	objGamePreviewPage.verifyTrophyDescription();
	    }
	    
	    @And("^Total points, Attempts and High Score is correct on game preview screen$")
	    public void total_points_attempts_and_high_score_is_correct_on_game_preview_screen() throws Throwable {
	    	objGamePreviewPage.verifyGameAttempt();
	    	objGamePreviewPage.verifyTotalPoints();
	    	objGamePreviewPage.verifyHighScore();
	    }

	    @Then("^Category name is correct on category screen$")
	    public void category_name_is_correct_on_category_screen() throws Throwable {
	    	
	        objSelectGamePage.selectRecentlyCreatedGame(gameName);
	    	objGamePreviewPage.clickPlayGameButton();
	    	objQuestionCategoryPage.verifyCategories();
	    	
	    }
	    @Then("^Verify Category name is correct on category screen$")
	    public void verify_category_name_is_correct_on_category_screen() throws Throwable {
	    	objQuestionCategoryPage.verifyCategories();
	    }

	    @Then("^Question title is correct on web app$")
	    public void question_title_is_correct_on_web_app() throws Throwable {
	    	objSelectGamePage.selectRecentlyCreatedGame(gameName);
            objGamePreviewPage.clickPlayGameButton();
	    	objQuestionCategoryPage.selectCategory();
	    	objSelectAnswerPage.verifyQuestionTitle();
	    	
	    }

	    @Then("^Question options are correct on web app$")
	    public void question_options_are_correct_on_web_app() throws Throwable {
	    	objSelectGamePage.selectRecentlyCreatedGame(gameName);
            objGamePreviewPage.clickPlayGameButton();
	    	objQuestionCategoryPage.selectCategory();
	    	objSelectAnswerPage.verifyQuestionOptions();
	    }
	    
	    @Then("^Question title and question options are correct on web app$")
	    public void question_title_and_question_options_are_correct_on_web_app() throws Throwable {
	    	objSelectGamePage.selectRecentlyCreatedGame(gameName);
            objGamePreviewPage.clickPlayGameButton();
	    	objQuestionCategoryPage.selectCategory();
	    	objSelectAnswerPage.verifyQuestionTitleAndOptions();
	    }
	    
	    @Then("^Question Title and Question Options and Question points are correct$")
	    public void questio_ans_info_is_correct() throws Throwable {
	    	
	    	objSelectAnswerPage.playGameAndCalculatePoint();
	    	
	    }
	    @When("^Manager creates a game$")
	    public void manager_creates_a_game(DataTable table) throws Throwable {
	    	
	    	 objBuildSpGamePage.clickBuildGame();
			 objBuildSpGamePage.clickSinglePlayer();
			 objBuildSpGamePage.selectLevel();

			 List<List<String>> data=table.asLists();

			 gameName=data.get(1).get(0);
			 System.out.println("Game Name "+gameName);
			 objBuildSpGamePage.enterGameName(gameName);
			 
	         String cat1=data.get(1).get(1).toUpperCase();
	         String cat2=data.get(1).get(2).toUpperCase();
	         String cat3=data.get(1).get(3).toUpperCase();
	         String cat4=data.get(1).get(4).toUpperCase();
	         String cat5=data.get(1).get(5).toUpperCase();
	         
	         System.out.println("Categories Are: "+cat1 +" "+cat2+" "+cat3+" "+cat4+" "+cat5);
	         
	         String ques1=data.get(1).get(6);
	         String ques2=data.get(1).get(7);
	         String ques3=data.get(1).get(8);
	         String ques4=data.get(1).get(9);
	         String ques5=data.get(1).get(10);
	         String ques6=data.get(1).get(11);
	         String ques7=data.get(1).get(12);
	         String ques8=data.get(1).get(13);
	         String ques9=data.get(1).get(14);
	         String ques10=data.get(1).get(15);
	         System.out.println("Questions Are: "+ques1 +" "+ques2+" "+ques3+" "+ques4+" "+ques5+" "+ques6+" "+ques7+" "+ques8+" "+ques9+" "+ques10);

	         String opt1=data.get(1).get(16);
	         String opt2=data.get(1).get(17);
	         String opt3=data.get(1).get(18);
	         String opt4=data.get(1).get(19);
	         System.out.println("Options Are: "+opt1 +" "+opt2+" "+opt3+" "+opt4);
	         
	         int catCount=Integer.parseInt(data.get(1).get(20));
	         System.out.println("No of Categories to add in game "+catCount);
	         
	         int quesCount=Integer.parseInt(data.get(1).get(21));
	         System.out.println("No of questions to add in game "+quesCount);

	         int optionCount=Integer.parseInt(data.get(1).get(22));
	         System.out.println("No of options to add in game "+optionCount);
	         
	         int correctAnsOptionCount=Integer.parseInt(data.get(1).get(23));
	         System.out.println("No of correct options to add in game "+correctAnsOptionCount);

	         objBuildSpGamePage.enterGameData(cat1,cat2, cat3,cat4,cat5,ques1,ques2,ques3,ques4,ques5,ques6,ques7,ques8,ques9,ques10,opt1,opt2,opt3,opt4,catCount,quesCount,optionCount,correctAnsOptionCount);
	         objBuildSpGamePage.clickGamePreview();
	         profileTitle=data.get(1).get(24);
			 scenario=data.get(1).get(25);
	    	
			 System.out.println("Profile Title "+profileTitle);
			 System.out.println("Profile Scenario "+scenario);
			 
			objGamePreviewPageAdmin.enterTitle(profileTitle);
			Pojo.getObjSeleniumFunctions().waitFor(2);
	    	objGamePreviewPageAdmin.enterScenario(scenario);
	    	objGamePreviewPageAdmin.clickDoneButton();
	    	objGamePreviewPageAdmin.clickYesScheduleGame();
	    	
	    	attempts=data.get(1).get(26);
	    	
	    	
	    	objScheduleGamePage.selectAllLocations();
	    	objScheduleGamePage.clickNext();
	    	objScheduleGamePage.selectAllDeps();
	    	objScheduleGamePage.clickNext();
	    	objScheduleGamePage.enterAttempt(attempts);
	    	objScheduleGamePage.clickApply();
	    }
	    
	    @And("^user refresh page till game is live state on app$")
	    public void user_refresh_page_till_game_is_live_on_web_app() throws Throwable {
	    	objSelectGamePage.refrestTillGameLive(gameName);
	    }
	   
	    @And("^Manager enters random MLG game name$")
	    public void manager_enters_random_mlg_game_name() throws Throwable {
	    	 objBuildSpGamePage.clickBuildGame();
			 objBuildSpGamePage.clickSinglePlayer();
			 objBuildSpGamePage.selectMultiLevel();
	         gameName="Random MLG Game "+Pojo.getObjTestData().getFirstName()+Pojo.getObjTestData().getLastName()+Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 100);
			 System.out.println("Game Name "+gameName);
			 objBuildMlgGamePage.enterMlgGameName(gameName);
			 BuildMlgGamePage.count=0;
	    }
	    @And("^Manager clicks on Add Level button$")
	    public void manager_clicks_on_add_level_button() throws Throwable {
	    	objBuildMlgGamePage.clickAddLevelBtn();
	    	
	    }

	    @And("^Manger search recently created game and select$")
	    public void manger_search_recently_created_game_and_select(DataTable table) throws Throwable {
	    	int gameNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	objBuildMlgGamePage.enterGameNameAndSelect(gameNum);
	    }

	    @And("^Manger search already created game and select$")
	    public void manger_search_already_created_game_and_select(DataTable table) throws Throwable {
	    	String gameName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	    	objBuildMlgGamePage.enterGameNameAndSelect(gameName);

	    }
	    
	    @And("^Manager enters rule$")
	    public void manager_enters_rule(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.enterRule(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    
	    @And("^Manager clicks on Add button$")
	    public void manager_clicks_on_add_button() throws Throwable {
	    	objBuildMlgGamePage.clickAddBtn();
	    }
	   
	    @And("^Manager clicks on Add Criteria button$")
	    public void manager_clicks_on_add_criteria_button(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	objBuildMlgGamePage.clickAddCriteriaBtn(levelNum);

	    }

	    @And("^Manager selects total points criteria$")
	    public void manager_selects_total_points_criteria(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.selectTotalPoints(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager selects minium attempts criteria$")
	    public void manager_selects_minium_attempts_criteria(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.selectMinimumAttempts(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager selects high score criteria$")
	    public void manager_selects_high_score_criteria(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.selectHighScore(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager clicks on Add Players button$")
	    public void manager_clicks_on_add_players_button() throws Throwable {
	    	objBuildMlgGamePage.clickAddPlayers();
	    }
	    
	    @And("^Manager clicks on Add button on add players page$")
	    public void manager_clicks_on_add_button_on_add_players_players_page() throws Throwable {
	    	objBuildMlgGamePage.addChipAddPlayersPage();
	    }

	   @And("^Manager searches location$")
	    public void manager_searches_location() throws Throwable {
		   objBuildMlgGamePage.clickLocation();
		   objBuildMlgGamePage.enterLocation();
	    }
	   
	   @And("^Manager clicks on location side arrow button$")
	    public void manager_clicks_on_location_side_arrow_button() throws Throwable {
		   objBuildMlgGamePage.clickLocation();	    }

	   
	   @And("^Manager clicks on already selected location chip$")
	    public void manager_clicks_on_already_selected_location_chip() throws Throwable {
		   objBuildMlgGamePage.clickSelectedLocationChip();
	    }

	   
	   @And("^Manager searches specific location for adding players in MLG$")
	    public void manager_searches_specific_location_for_adding_players_in_mlg(DataTable table) throws Throwable {
		  // objBuildMlgGamePage.clickLocation();
		   objBuildMlgGamePage.enterLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager selects location$")
	    public void manager_selects_location() throws Throwable {
	    	objBuildMlgGamePage.selectLocation();
	    }
	    
	    @And("^Manager selects specific location$")
	    public void manager_selects_specific_location(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.selectLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));	    }

	    

	    @And("^Manager clicks on done button$")
	    public void manager_clicks_on_done_button() throws Throwable {
	    	objBuildMlgGamePage.clickDoneBtn();
	    }

	    @And("^Manager searches department$")
	    public void manager_searches_department() throws Throwable {
	    	objBuildMlgGamePage.clickDept();
	    	objBuildMlgGamePage.enterDept();
	    }
	    
	    @And("^Manager searches specific department for adding players in MLG$")
	    public void manager_searches_specific_department_for_adding_players_in_mlg(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.clickDept();
	    	objBuildMlgGamePage.enterDept(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager selects department$")
	    public void manager_selects_department() throws Throwable {
	    	objBuildMlgGamePage.selectDept();
	    }
	    
	    @And("^Manager selects already added department$")
	    public void manager_selects_already_added_department(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.selectDept(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager turns on status$")
	    public void manager_turns_on_status() throws Throwable {
	    	objBuildMlgGamePage.clickToggleBtn();
	    }

	    @And("^Manager clicks on Turn On button$")
	    public void manager_clicks_on_turn_on_button() throws Throwable {
	    	objBuildMlgGamePage.clickTurnOnBtn();
	    }
	    @Then("^MLG live success message is appearing$")
	    public void multivel_game_is_now_live_is_appearing(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.verifySuccessMsg(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    @And("^live MLG is displaying to user$")
	    public void live_mlg_is_displaying_to_user() throws Throwable {
	    	objSelectGamePage.verifyMlgLiveGameWebApp();
	    }
	    @Then("^MLG is not displaying to other location and department player$")
	    public void mlg_is_not_displaying_to_other_location_and_department_player() throws Throwable {
	    	objSelectGamePage.verifyMlgNotDisplayingOtherLocationDept();
	    }
	    
	    @Then("^MLG is not displaying to same location but other department player$")
	    public void mlg_is_not_displaying_to_same_location_but_other_department_player() throws Throwable {
	    	objSelectGamePage.verifyMlgNotDisplayingSameLocationOtherDept();
	    }

	    
	    @And("^user selects recently created MLG$")
	    public void user_selects_recently_created_mlg() throws Throwable {
	    	objSelectGamePage.selectRecentlyCreatedMLG();
	    }
	    
	    @And("^user selects already created MLG$")
	    public void user_selects_already_created_mlg(DataTable table) throws Throwable {
	    	
	    	String mlgName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	    	
	    	
	    	objSelectGamePage.selectAlreadyCreatedMLG(mlgName);
	    	

	    	
	    	
	    }
	    
	    
	    
	    @Then("^Rules icon is appearing on the screen$")
	    public void rules_icon_is_appearing_on_the_screen() throws Throwable {
	    	objSelectGamePage.verifyRulesIcon();
	    }

	    @Then("^MLG game name is correct$")
	    public void mlg_game_name_is_correct() throws Throwable {
	    	objSelectGamePage.verifyMlgGameName();
	    }

	    @Then("^Total points are zero before playing game$")
	    public void total_points_are_zero() throws Throwable {
	    	objSelectGamePage.verifyMlgPointsBeforePlaying();
	    }

	    @Then("^Level indicator is displaying with trophy image$")
	    public void level_indicator_is_displaying_with_trophy_image() throws Throwable {
	    	objSelectGamePage.verifyLevelIndicatorAndTrophyImage();
	    }

	    @Then("^Level count is correct$")
	    public void level_count_is_correct() throws Throwable {
	    	objSelectGamePage.verifyLevelCount();
	    }

	    @Then("^Game over text is appearing$")
	    public void game_over_text_is_appearing() throws Throwable {
	    	objSelectGamePage.verifyGameOverText();
	    }

	    @Then("^Rules are correct after opening rules$")
	    public void rules_are_correct_after_opening_rules() throws Throwable {
	    	objSelectGamePage.clickAndVerifyRules();
	    }
	    
	    @And("^Player closes rules$")
	    public void player_closes_rules() throws Throwable {
	    }
	    
	    
	    @Then("^Lock image is appearing for levels which are after level one$")
	    public void lock_image_is_appearing_after_level_one_levels() throws Throwable {
	    	objSelectGamePage.verifyLockedImageAfterFirstLevel();
 	    }
	    @And("^Manager enters total points for MLG$")
	    public void manager_enters_total_points_for_mlg(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	int totalPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
	    	objBuildMlgGamePage.setPoints(levelNum,totalPoints);
	    }

	    @And("^Manager enters minimum attempts for MLG$")
	    public void manager_enters_minimum_attempts_for_mlg(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	int minAttempts=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
	    	objBuildMlgGamePage.setAttempts(levelNum,minAttempts);
	    }

	    @And("^Manager enters high score of MLG$")
	    public void manager_enters_high_score_of_mlg(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	int highScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
	    	objBuildMlgGamePage.setHighScore(levelNum,highScore);
	    }
	    
	    @And("^user opens and verify level$")
	    public void user_opens_level(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	objSelectGamePage.openAndVerifyLevel(levelNum);
	    }
	    

	    @Then("^Game name is correct on level popup$")
	    public void game_name_is_correct_on_level_popup() throws Throwable {
	    	objSelectGamePage.verifyGameNameOnLevelPopup();
	    }

	    @Then("^How to Win Text is appearing$")
	    public void how_to_win_text_is_appearing() throws Throwable {
	    	objSelectGamePage.verifyHowToWinText();
	    }

	    @Then("^Points criteria is correct$")
	    public void points_criteria_is_correct() throws Throwable {
	    	objSelectGamePage.verifyPointsCriteria();
	    }

	    @Then("^Attempt criteria is correct$")
	    public void attempt_criteria_is_correct() throws Throwable {
	    	objSelectGamePage.verifyAttemptsCriteria();
	    }

	    @Then("^High score criteria is correct$")
	    public void high_score_criteria_is_correct() throws Throwable {
	    	objSelectGamePage.verifyHighScoreCriteria();

	    }

	    @Then("^Lets Go button is enabled$")
	    public void lets_go_button_is_enabled() throws Throwable {
	    	objSelectGamePage.verifyLetsGoEnabled();
	    }
	    
	    @Then("^Lets Go button is disabled$")
	    public void lets_go_button_is_disabled() throws Throwable {
	    	objSelectGamePage.verifyLetsGoDisabled();
	    }
	    
	    @Then("^Player clicks on LetsGo button$")
	    public void player_clicks_on_letsgo_button() throws Throwable {
	    	objSelectGamePage.verifyAndClickLetsGoButton();
	    }
	    @Then("^Level details icon is appearing on game preview screen$")
	    public void level_details_icon_is_appearing_on_game_preview_screen() throws Throwable {
	    	objGamePreviewPage.verifyLevelDetailsIcon();
	    }

	    @Then("^Level popup is appearing after clicking on level details icon$")
	    public void level_popup_is_appearing_after_clicking_on_level_details_icon() throws Throwable {
	    	objGamePreviewPage.clickLevelDetailsIcon();
	    	objSelectGamePage.verifyLevelPopUpGamePreview();
	    }
	    @Then("^Player closes level popup$")
	    public void player_closes_level_popup() throws Throwable {
	    	objSelectGamePage.closeLevelPopUp();
	    }
	    @And("^user plays SP game of mlg$")
	    public void user_plays_sp_game_of_mlg(DataTable table) throws Throwable {
	    	int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	int gameCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
	        String answerType=Pojo.getObjSeleniumFunctions().getTestData(1,2, table);
	        System.out.println("ansType " +answerType);
	        String levelOrTrophy=Pojo.getObjSeleniumFunctions().getTestData(1,3, table);
	        int totalLevelCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,4, table));
	        expectedGameData=objPlayGameFlow.playAlreadyAddedMLG(levelNum, gameCount, answerType,levelOrTrophy,totalLevelCount);
	        
	        }
	    
	    @Then("^Next level is getting unlocked after meeting all the criteria$")
	    public void next_level_is_getting_unlocked_after_meeting_all_the_criteria() throws Throwable {
	    	boolean isLevelUnlocked=objSelectGamePage.checkAllCriteriaMatched(expectedGameData);
	    	System.out.println("Is Level Unlocked "+isLevelUnlocked);
	    	objSelectGamePage.verifyNextLevelStatus(isLevelUnlocked);
	    	
	    }
	    
	    @Then("^Next level is getting unlocked after meeting all the criteria for already created MLG$")
	    public void next_level_is_getting_unlocked_after_meeting_all_the_criteria_for_already_created_mlg(DataTable table) throws Throwable {
	    	int points=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	int attempts=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    	int highScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
	    	boolean isLevelUnlocked=objSelectGamePage.checkAllCriteriaMatched(expectedGameData,points,attempts,highScore);
	    	System.out.println("Is Level Unlocked "+isLevelUnlocked);
	    	objSelectGamePage.verifyNextLevelStatusAlreayCreatedMlg(isLevelUnlocked);
	    }
	    
	    
	    @Then("^Next level is not getting unlocked if criteria does not match$")
	    public void next_level_is_not_getting_unlocked_if_criteria_does_not_match(DataTable table) throws Throwable {
	    	int points=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	int attempts=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    	int highScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
	    	boolean isLevelUnlocked=objSelectGamePage.checkAllCriteriaMatched(expectedGameData,points,attempts,highScore);
	    	objSelectGamePage.verifyNextLevelStatus(isLevelUnlocked);
	    	
	    }
	    
	    @Then("^Next level is not getting unlocked if criteria does not match for already created MLG$")
	    public void next_level_is_not_getting_unlocked_if_criteria_does_not_match_for_already_created_mlg(DataTable table) throws Throwable {
	    	int points=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	int attempts=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    	int highScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
	    	boolean isLevelUnlocked=objSelectGamePage.checkAllCriteriaMatched(expectedGameData,points,attempts,highScore);
	    	objSelectGamePage.verifyNextLevelLocked(isLevelUnlocked);
	    }
	    
	    @Then("^verify that total points are correct on select level screen$")
	    public void verify_that_total_points_are_correct_on_select_level_screen() throws Throwable {
	    	objSelectGamePage.verifyTotalPointsAfterEndingGameMLG(expectedGameData);
	    }
	    
	    @And("^User clicks on back button on select level screen$")
	    public void user_clicks_on_back_button_on_select_level_screen() throws Throwable {
	    	objSelectGamePage.clickBackSelectMLG();
	    }
	    
	    @Then("^MLG points are adding to leaderboard$")
	    public void mlg_points_are_adding_to_leaderboard(DataTable table) throws Throwable {
	    	objSelectGamePage.verifyMlgPointsOnLeaderboard(expectedGameData,Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    
	    @Then("^Points are updating on level popup$")
	    public void points_are_updating_on_level_popup() throws Throwable {
	    	objSelectGamePage.verifyUpdatedPointsLevelopup(expectedGameData);
	    }

	    @Then("^Attempts are updating on level popup$")
	    public void attempts_are_updating_on_level_popup() throws Throwable {
	    	objSelectGamePage.verifyUpdatedAttemptsLevelopup(expectedGameData);
	    }

	    @Then("^High Score is updating on level popup$")
	    public void high_score_is_updating_on_level_popup() throws Throwable {
	    	objSelectGamePage.verifyUpdatedHighScoreLevelopup(expectedGameData);
	    }
	    
	    @And("^user refreshes page$")
	    public void user_refreshes_page() throws Throwable {
	    	objSelectGamePage.pageRefresh();
	    	
	    	
	    	
	    }
	    @Then("^grren tick is appearing with points if points criteria matched$")
	    public void grren_tick_is_appearing_with_points_if_points_criteria_matched() throws Throwable {
	    	objSelectGamePage.verifyGreenTickPoints();
	    }

	    @Then("^green tick is appearing with attempts if attempt criteria matched$")
	    public void green_tick_is_appearing_with_attempts_if_attempt_criteria_matched() throws Throwable {
	    	objSelectGamePage.verifyGreenTickAttempts();
	    }

	    @Then("^green tick is appearing with high score if high score criteria matched$")
	    public void green_tick_is_appearing_with_high_score_if_high_score_criteria_matched() throws Throwable {
	    	objSelectGamePage.verifyGreenTickHighScore();
	    }
	    
	    @And("^Manager enters question data$")
	    public void manager_enters_question_data(DataTable table) throws Throwable {
			 List<List<String>> data=table.asLists();

	    	 String quesTitleText=data.get(1).get(0);
	        
	    	 String opt1=data.get(1).get(1);
	         String opt2=data.get(1).get(2);
	         String opt3=data.get(1).get(3);
	         String opt4=data.get(1).get(4);
	         int ansOptionCount=Integer.parseInt(data.get(1).get(5));
	         int correctAnsOption=Integer.parseInt(data.get(1).get(6));
	         
	         String catName=data.get(1).get(7);
	         String timer=data.get(1).get(8);
	         String points=data.get(1).get(9);
	         String tag=data.get(1).get(10);
	         
	         
	        
			 objBuildSpGamePage.addCustomizeQuestion(quesTitleText, opt1, opt2, opt3, opt4, ansOptionCount,correctAnsOption, catName, timer, points, tag);

	         
	         System.out.println("Options Are: "+opt1 +" "+opt2+" "+opt3+" "+opt4);
	    }
	    
	    @And("^Manager selects Category from dropdown$")
	    public void manager_selects_category_from_dropdown(DataTable table) throws Throwable {
	    	objBuildSpGamePage.selectCategory(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Manager selects timer from dropdown$")
	    public void manager_selects_timer_from_dropdown(DataTable table) throws Throwable {
	    	objBuildSpGamePage.selectTimer(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @And("^Manager selects points from dropdown$")
	    public void manager_selects_points_from_dropdown(DataTable table) throws Throwable {
	    	objBuildSpGamePage.selectPoints(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @And("^Manager uploads question image$")
	    public void manager_uploads_question_image() throws Throwable {
	    	objBuildSpGamePage.uploadQuestionImage();
	    }

	    @And("^Manager uploads question sound$")
	    public void manager_uploads_question_sound() throws Throwable {
	    	objBuildSpGamePage.uploadQuestionSound();

	    }

	    @And("^Manager Enters Category$")
	    public void manager_enters_category(DataTable table) throws Throwable {
	    	int catNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	String catName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
	    	objBuildSpGamePage.enterCategoryName(catNum, catName);
	    }

	    @And("^Manager clicks on Done button in Select Question Image popup$")
	    public void manager_clicks_on_done_on_in_select_question_image_popup() throws Throwable {
	    	objBuildSpGamePage.clickDoneBtn();
	    }
	  
	    @And("^Manager clicks on Done checkmark button$")
	    public void manager_clicks_on_done_checkmark_button() throws Throwable {
	    	objBuildSpGamePage.clickAddQuestionTick();
	    }
	    
	    @And("^Manager selects a particular category to add question in it$")
	    public void manager_selects_a_particular_category_to_add_question_in_it(DataTable table) throws Throwable {
	    	String strCatNum=Pojo.getObjSeleniumFunctions().getTestData(1,0, table);
	    	int catNum=Integer.parseInt(strCatNum);
	    	objBuildSpGamePage.selectParticularCategory(catNum);
	    	
	    }
	    
	    @Then("^customized question data is correct$")
	    public void cutomized_question_data_is_correct() throws Throwable {
	 	   objSelectGamePage.selectRecentlyCreatedGame(gameName);
	        objGamePreviewPage.clickPlayGameButton();
	        objQuestionCategoryPage.verifyCategories();
	    	objQuestionCategoryPage.selectCategory();
	    	objSelectAnswerPage.verifyQuestionDataWithImageAndSound();
	    }
	   
	    @And("^Manager searches specific location and clicks on select all$")
	    public void manager_searches_specific_location(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.clickLocation();
			objBuildMlgGamePage.enterLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
			objBuildMlgGamePage.clickSelectAll();
			
			
	    }
	    
	    @And("^Manager searches specific department and clicks on select all$")
	    public void manager_searches_specific_department_and_clicks_on_select_all(DataTable table) throws Throwable {
	    	objBuildMlgGamePage.clickDept();
			objBuildMlgGamePage.enterLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
			objBuildMlgGamePage.clickSelectAll();
	    }
	    
	    @Then("^Points are updating on level popup for already created MLG$")
	    public void points_are_updating_on_level_popup_for_already_created_mlg() throws Throwable {
	    	objSelectGamePage.verifyUpdatedPointsLevelopupAlreayCreatedMLG(expectedGameData);

	    }

	    @Then("^Attempts are updating on level popup for already created MLG$")
	    public void attempts_are_updating_on_level_popup_for_already_created_mlg() throws Throwable {
	    	objSelectGamePage.verifyUpdatedAttemptsLevelopupAlreadyCreatedMLG(expectedGameData);
	 	   
	    }

	    @Then("^High Score is updating on level popup for already created MLG$")
	    public void high_score_is_updating_on_level_popup_for_already_created_mlg() throws Throwable {
	    	objSelectGamePage.verifyUpdatedHighScoreLevelopupAlreadyCreatedMLG(expectedGameData);
	    }
	    
	   
}
