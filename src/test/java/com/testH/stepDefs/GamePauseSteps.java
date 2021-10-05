package com.testH.stepDefs;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.GamePausePage;
import com.testH.base.pages.client.GamePreviewPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class GamePauseSteps {
	
	private GamePausePage objGamePausePage;
	

	
	public GamePauseSteps()
	{
		objGamePausePage=new PageFactory().getGamePausePage();
	}

	
	 @Then("^pause game screen is opening$")
	    public void pause_game_screen_is_opening() throws Throwable {
		 objGamePausePage.verifyPauseScreen();
		 
	    }
	 @Then("^game name is appearing on pause screen$")
	    public void game_name_is_appearing_on_pause_screen() throws Throwable {
		 objGamePausePage.verifyGameName();
	    }
	 
	 @Then("^question count is correct on Pause screen$")
	    public void question_count_is_correct_on_pause_screen() throws Throwable {
		 objGamePausePage.verifyQuestionCount();
	    }
	 
	 @Then("^player points are correct on Pause screen$")
	    public void player_points_are_correct_on_pause_screen() throws Throwable {
		 objGamePausePage.verifyPlayerPoints();
	    }
	 @Then("^total time is correct on Pause screen$")
	    public void total_time_is_correct_on_pause_screen() throws Throwable {

		 objGamePausePage.verifyTotalTime();
	    }
	 @And("^user wait for some time$")
	    public void user_wait_for_some_time() throws Throwable {
		 Pojo.getObjSeleniumFunctions().waitFor(10);
	    }

	 @Then("^player name is corret on pause screen$")
	    public void player_name_is_corret_on_pause_screen() throws Throwable {
		 objGamePausePage.verifyPlayerName();
	    }
	 @Then("^questions to go text is correct on pause screen$")
	    public void questions_to_go_text_is_correct_on_pause_screen() throws Throwable {
		 objGamePausePage.verifyQuestionsToGoText();
	    }
	 
	 @And("^user verify and click on resume game button$")
	    public void user_verify_and_click_on_resume_game_button() throws Throwable {
		 objGamePausePage.verifyAndClickResumeGameButton();
	    }
	 @And("^user verify and click on end game button$")
	    public void user_verify_and_click_on_end_game_button() throws Throwable {
		 objGamePausePage.verifyAndClickEndGameButton();
	    }

	    @And("^user clicks on yes on confirmation$")
	    public void user_clicks_on_yes_on_confirmation() throws Throwable {
	    	objGamePausePage.clickYesConfirmation();
	    }

}
