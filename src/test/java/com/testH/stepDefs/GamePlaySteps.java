package com.testH.stepDefs;

import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;



public class GamePlaySteps 
{
	
	
	private SelectGamePage objSelectGamePage;
	private HomePage objHomePage;
	private GamePreviewPage objGamePreviewPage;
	private QuestionCategoryPage objQuestionCategoryPage;
	private SelectAnswerPage objSelectAnswerPage;
	private EndGamePage objEndGamePage;
	private PlayGameFlow objPlayGameFlow;
	private GmailLoginPage objGmailLoginPage;
	
	int endgamePoints=0;
	String gameNameAlreadyCreated="";


  public GamePlaySteps()
	{
		objSelectGamePage= new PageFactory().getSelectGamePage();
		objHomePage = new PageFactory().getObjHomePage();
		objGamePreviewPage= new PageFactory().getGamePreviewPage();
		objQuestionCategoryPage=new  PageFactory().getQuestionCategoryPage();
		objSelectAnswerPage= new PageFactory().getSelectAnswerPage();
		objEndGamePage=new PageFactory().getEndGamePage();
		objPlayGameFlow=new PlayGameFlow();
		objGmailLoginPage=new GmailLoginPage();

	}

	
	
    @When("^User is on select game screen$")
    public void user_is_on_select_game_screen(DataTable table) throws Throwable {
    	
    	List<List<String>> data=table.asLists();
    	String cmp_Name=data.get(1).get(0);
    	objSelectGamePage.verifySelectGameScreen(cmp_Name);
    	}

    @Then("^Game list should be appeared$")
    public void game_list_should_be_appeared() throws Throwable {
    	objSelectGamePage.verifyGameList();

    }
    
    @Then("^Hign score percentage text is appearing with single level game name$")
    public void hign_score_percentage_is_appearing_with_single_level_game_name(DataTable table) throws Throwable {
    	String gameName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objSelectGamePage.verifyHighScorePercentageText(gameName);
    }

    
    @Then("^User should be able to select game$")
    public void user_should_be_able_to_select_game() throws Throwable {
    	objSelectGamePage.selectGame();
    }
    
    @When("^User selects game$")
    public void User_selects_game() throws Throwable {
    	objSelectGamePage.selectGame();
    }
    
    @When("^User selects already created game$")
    public void user_selects_already_created_game(DataTable table) throws Throwable {
    	gameNameAlreadyCreated=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		objSelectGamePage.selectRecentlyCreatedGame(gameNameAlreadyCreated);//here passing already created game so that game will select

    	
    }
    
    @And("^user selects recently created game$")
    public void user_selects_recently_created_game() throws Throwable {
    	String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		objSelectGamePage.selectRecentlyCreatedGame(gameName);
    }
    
    @Then("^Game preview screen is opening$")
    public void game_preview_screen_should_be_opened() throws Throwable {
    	
    	objGamePreviewPage.verifyGamepreviewScreen();
    }
    
   @Then("^User can click on Play Game button$")
    public void user_should_be_able_to_click_on_play_game_button() throws Throwable {
    	objGamePreviewPage.clickPlayGameButton();
    }
   @Then("^Category screen is opening$")
   public void category_screen_is_opening() throws Throwable {
	   objQuestionCategoryPage.verifyCatScreen();
   }
   
   @Then("^Category name is correct with questions$")
   public void category_name_is_correct_with_questions() throws Throwable {
	   objQuestionCategoryPage.verifyCategoryNameWithQues();
   }
   
   @Then("^Points are appearing with the questions$")
   public void points_are_appearing_with_the_questions() throws Throwable {
	   objQuestionCategoryPage.verifyPointsWithQues();
   }
   
   @Then("^Timer is appearing with every question$")
   public void timer_is_appearing_with_every_question() throws Throwable {
	   objQuestionCategoryPage.verifyTimerWithQuestions();
   }

   
   @And("^User clicks on end game button on category screen$")
   public void user_clicks_on_end_game_button_on_category_screen() throws Throwable {
	   objQuestionCategoryPage.clickEndGameButton();
   }
   
   @Then("^Verify and click done button with last question$")
   public void verify_and_click_done_button_with_last_question() throws Throwable {
	   objQuestionCategoryPage.verifyDoneButtonLastQuestion();
   }
   
   @Then("^Verify that Back button is disabled with last question$")
   public void verify_that_back_button_is_disabled_with_last_question() throws Throwable {
	   objQuestionCategoryPage.verifyDisabledBackButtonLastQues();
   }
   
   @Then("^Verify that Back button is not disable with last question on mobile app$")
   public void verify_that_back_button_is_not_disable_with_last_question_on_mobile_app() throws Throwable {
	   objQuestionCategoryPage.verifyEnabledBackButtonLastQuesAndroidApp();
   }
   
   @Then("^Verify that Next and Back button is disabled$")
   public void verify_that_next_and_back_button_is_disabled() throws Throwable {
	   objSelectAnswerPage.verifyBackAndNextDisabled();
   }
   
   @Then("^Question count is correct on category screen$")
   public void question_count_is_correct_on_category_screen() throws Throwable {
	   objQuestionCategoryPage.verifyQuestionCount();
   }

   @And("^Pause Game button is appearing$")
   public void pause_game_button_is_appearing() throws Throwable {
	   objQuestionCategoryPage.verifyPauseGameButton();
   }

   @Then("^End Game button is appearing$")
   public void end_game_button_is_appearing() {
	   objQuestionCategoryPage.verifyEndGameButton();
   }

   @And("^Total Time field is appearing$")
   public void total_time_field_is_appearing()  {
	   objQuestionCategoryPage.verifyTotalTimeField();
   }
   
   @And("^user verify and click on pause button$")
   public void user_verify_and_click_on_pause_button() throws Throwable {
	   objQuestionCategoryPage.verifyAndClickPauseGame();
   }
   
   	

   @Then("^User is selecting category$")
   public void user_is_selecting_category()  {
	   objQuestionCategoryPage.selectCategory();

	   
   }
   
   @And("^User gives answer$")
   public void user_gives_answer(DataTable table) throws Throwable {
	    String ansType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	    objSelectAnswerPage.giveAns(ansType);
	    
   }
   
   @And("^User clicks on Back button$")
   public void user_clicks_on_back_button() throws Throwable {
	   objSelectAnswerPage.clickBack();
   }
   
   
   @Then("^Verify total score after ending game$")
   public void correct_points_should_be_displayed_on_end_game_screen(DataTable table) {
	   
	   String ansType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	   endgamePoints=objSelectAnswerPage.playGameAndCalculatePointWebOnly(ansType);
	   objEndGamePage.verifyTotalScore(endgamePoints);
	   
   }

   
   @Then("^High score is correct if user play game with all wrong$")
   public void high_score_is_correct_if_user_play_game_with_all_wrong(DataTable table) throws Throwable {
	   List<List<String>> data=table.asLists();
	   
	   int questionCount=Integer.parseInt(data.get(1).get(0));
       String selectAns=data.get(1).get(1);
       int gamePlayCount=Integer.parseInt(data.get(1).get(2));
       String gameName=data.get(1).get(3);
       Pojo.getObjSeleniumFunctions().navigateToBack();
       int correctAnsCount=objPlayGameFlow.playGameForHighScore(gameName,gamePlayCount, selectAns);
       objSelectGamePage.clickGamesIconSideMenu();
       objSelectGamePage.verifyHighScore(questionCount,correctAnsCount,gameName);
       
   }
   @Then("^High score is correct if user play game with random answers$")
   public void high_score_is_correct_if_user_play_game_with_random_answers(DataTable table) throws Throwable {
	   List<List<String>> data=table.asLists();
	   int questionCount=Integer.parseInt(data.get(1).get(0));
       String selectAns=data.get(1).get(1);
       int gamePlayCount=Integer.parseInt(data.get(1).get(2));
       String gameName=data.get(1).get(3);
       Pojo.getObjSeleniumFunctions().navigateToBackAndroidApp();
       System.out.println("Navigate Back");
       int correctAnsCount=objPlayGameFlow.playGameForHighScore(gameName,gamePlayCount,selectAns);
       objSelectGamePage.clickGamesIconSideMenu();
       objSelectGamePage.verifyHighScore(questionCount,correctAnsCount,gameName);
       
   }
   @Then("^High score is correct if user play game with all correct answers$")
   public void high_score_is_correct_if_user_play_game_with_all_correct_answers(DataTable table) throws Throwable {
	   List<List<String>> data=table.asLists();
	   int questionCount=Integer.parseInt(data.get(1).get(0));
       String selectAns=data.get(1).get(1);
       int gamePlayCount=Integer.parseInt(data.get(1).get(2));
       String gameName=data.get(1).get(3);
       Pojo.getObjSeleniumFunctions().navigateToBack();
       int correctAnsCount=objPlayGameFlow.playGameForHighScore(gameName,gamePlayCount, selectAns);
       objSelectGamePage.clickGamesIconSideMenu();
       objSelectGamePage.verifyHighScore(questionCount,correctAnsCount,gameName);
       
       
   }
   
   @When("^User play game for a specific time$")
   public void user_play_game_for_a_specific_time(DataTable table) throws Throwable {
	   List<List<String>> data=table.asLists();
       String selectAns=data.get(1).get(0);
       int gamePlayCount=Integer.parseInt(data.get(1).get(1));
       int holdTime=Integer.parseInt(data.get(1).get(2));
       
	   objPlayGameFlow.playGameForSpecificTime(gamePlayCount, selectAns, holdTime);
   }
   
   @When("^User play game for trophies$")
   public void user_play_game_for_trophies(DataTable table) throws Throwable {
	   
	   List<List<String>> data=table.asLists();
	   String gameName=data.get(1).get(0);
       String selectAns=data.get(1).get(1);
       int gamePlayCount=Integer.parseInt(data.get(1).get(2));
       
	   objPlayGameFlow.playGameForTrophies(gameName,gamePlayCount, selectAns);
   }
   
   @When("^User play game for trophies without giving answers$")
   public void user_play_game_for_trophies_without_giving_answers(DataTable table) throws Throwable {
	   List<List<String>> data=table.asLists();
	   String gameName=data.get(1).get(0);
       int gamePlayCount=Integer.parseInt(data.get(1).get(1));
       
	   objPlayGameFlow.playGameForTrophiesWithoutGivingAns(gameName,gamePlayCount);
   }
   
   @When("^User play game for game trophies$")
   public void user_play_game_for_game_trophies(DataTable table) throws Throwable {
	   
	   List<List<String>> data=table.asLists();
	   
       String selectAns=data.get(1).get(0);
       int gamePlayCount=Integer.parseInt(data.get(1).get(1));
       
	   objPlayGameFlow.playGameForGameTrophies(TrophiesPageAdmin.gameTrophyData.get("TrophyName"),gamePlayCount, selectAns); 
   }
   
   @When("^User play game for levels$")
   public void user_play_game_for_levels(DataTable table) throws Throwable {
	   
	   List<List<String>> data=table.asLists();
       String selectAns=data.get(1).get(0);
       int gamePlayCount=Integer.parseInt(data.get(1).get(1));
       
       String gameName=data.get(1).get(2);
       
	   objPlayGameFlow.playGameForLevels(gameName,gamePlayCount, selectAns);
   }

   @Then("^Game Over screen is appearing$")
   public void game_over_screen_is_appearing() throws Throwable {
	   objEndGamePage.verifyGameOverText();
   }
   
   
   @Then("^Game Over text, Game name and Total time fields are appearing on end game screen$")
   public void game_over_text_game_name_and_total_time_fields_are_appearing_on_end_game_screen() throws Throwable {
	   objEndGamePage.verifyGameOverText();
	   objEndGamePage.verifyGameName(gameNameAlreadyCreated);
	   objEndGamePage.verifyTotalTimeField();
	   }
   
   @Then("^correct percentage is correct on end game$")
   public void correct_percentage_is_correct_on_end_game() throws Throwable {
	   objEndGamePage.verifyScorePercentage();
   }
 
   @And("^User clicks on Send Record button$")
   public void user_clicks_on_send_record_button() throws Throwable {
	   objEndGamePage.verifyAndClickSendRecordButton();
   }
   
   @Then("^success message is appearing after sending record$")
   public void success_message_is_appearing_after_sending_record(DataTable table) throws Throwable {
	   String textMessage=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	   objEndGamePage.verifySuccessMessageAfterSendRecord(textMessage);
   }
   
   @Then("^user verify and open game report$")
   public void user_verify_and_open_game_report(DataTable table) throws Throwable {
	    String mail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
		objGmailLoginPage.gmailLogin(mail, pw);
		objGmailLoginPage.verifyAndOpenGameReportMail();
		objGmailLoginPage.clickResetPw();
   }
   
   @Then("^Welcome text is appearing$")
   public void welcome_text_is_appearing(DataTable table) throws Throwable {
	   objGmailLoginPage.verifyWelcomeTextGameReport(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
   }
   
   @Then("^Date Time GameName and LengthOfGame is correct$")
   public void date_time_gamename_and_lengthofgame_is_correct() throws Throwable {
   }
   
   @Then("^Player Name and Points are correct on game report$")
   public void player_name_and_points_are_correct_on_game_report() throws Throwable {
	   objGmailLoginPage.verifyPlayerNameGameReport();
	   objGmailLoginPage.verifyPlayerPointsGameReport(endgamePoints);
   }

   @Then("^Twitter Facebook Instagram and LinkedIn icons are present on game report$")
   public void twitter_facebook_instagram_and_linkedin_icons_are_present_on_game_report() throws Throwable {
	   objGmailLoginPage.verifySocialIconsGameReport();
   }
   
   @Then("^Game trophy is appearing with gamename$")
   public void game_trophy_is_appearing_with_gamename() throws Throwable {
	   objSelectGamePage.verifyGameTrophyWithGame();
   }   
   
   @Then("^player clicks on back button game preview screen$")
   public void player_clicks_on_back_button_game_preview_screen() throws Throwable {
	   objGamePreviewPage.clickBackGamePreview();
   }
   
   @Then("^verify that achieved tropgy icon is appearing with MLG game$")
   public void verify_that_achieved_tropgy_icon_is_appearing_with_mlg_game() throws Throwable {
	   objSelectGamePage.verifyMlgTrophyWithMlg();
   }
   
   @Then("^verify that achieved tropgy icon is appearing with already created MLG game$")
   public void verify_that_achieved_tropgy_icon_is_appearing_with_already_created_mlg_game(DataTable table) throws Throwable {
	   objSelectGamePage.verifyMlgTrophyWithMlg(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
   }
   
   
   @And("^user wait for loading animation to be disappeared$")
   public void user_wait_for_loading_animation_to_be_disappeared() throws Throwable {
	   objSelectGamePage.verifyLoadingAnimationDisappear();
   }
  
   @And("^User clicks on home button on end game screen$")
   public void user_clicks_on_home_button_on_end_game_screen() throws Throwable {
	   objEndGamePage.clickHomeButton();
   }
   @And("^user goes to select Game screen$")
   public void user_goes_to_games_screen() throws Throwable {
	   objSelectGamePage.clickGamesIconSideMenu();
   }
   @Then("^attempt count is correct on game preview screen$")
   public void attempt_count_is_correct_on_game_preview_screen() throws Throwable {
	   objGamePreviewPage.verifyGamesToGo();
	   objGamePreviewPage.verifyAttemptAndEndDate();
   }
   @Then("^Play button is disabled on preview screen$")
   public void play_button_is_disabled_on_preview_screen() throws Throwable {
	   objGamePreviewPage.verifyDisabledPlayButton();
   }
   @Then("^disabled check icon is appearing with game name$")
   public void disabled_check_icon_is_appearing_with_game_name() throws Throwable {
	   objSelectGamePage.verifyCheckIconWithGameName();
   }
  
   @Then("^Game name is correct on level popup for already created MLG$")
   public void game_name_is_correct_on_level_popup_for_already_created_mlg(DataTable table) throws Throwable {
	   objSelectGamePage.verifyGameNameOnLevelPopup(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
   }
   
   @Then("^Points criteria is correct for already created MLG$")
   public void points_criteria_is_correct_for_already_created_mlg(DataTable table) throws Throwable {
	   objSelectGamePage.verifyPointsCriteria(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
   }
   
   @Then("^Attempt criteria is correct for already created MLG$")
   public void attempt_criteria_is_correct_for_already_created_mlg(DataTable table) throws Throwable {
	   objSelectGamePage.verifyAttemptsCriteria(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
   }
   
   @Then("^High score criteria is correct for already created MLG$")
   public void high_score_criteria_is_correct_for_already_created_mlg(DataTable table) throws Throwable {
	   objSelectGamePage.verifyHighScoreCriteria(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

   }
   
   @And("^user opens and verify level for alreay created MLG$")
   public void user_opens_and_verify_level_for_alreay_created_mlg(DataTable table) throws Throwable {
	   int levelNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	   objSelectGamePage.openAndVerifyLevelAlreadyCreatedMLG(levelNum);
   }
   
   @And("^Users play already created MLG$")
   public void users_play_already_created_mlg(DataTable table) throws Throwable {
       String mlgName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
       int userNumber=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
       String levelUnlockOrNot=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
       objSelectGamePage.selectAlreadyCreatedMLG(mlgName);
       

   }
   
}
