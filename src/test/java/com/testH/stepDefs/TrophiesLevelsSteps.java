package com.testH.stepDefs;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.SelectGamePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class TrophiesLevelsSteps {
	
	private EndGamePage objEndGamePage;
	private SelectGamePage objSelectGamePage;

	public TrophiesLevelsSteps()
	{
		objEndGamePage=new PageFactory().getEndGamePage();
		objSelectGamePage= new PageFactory().getSelectGamePage();

	}
	
	
	@Then("^trophy header, trophy title and trophy subtitle is correct$")
    public void trophy_header_trophy_title_and_trophy_subtitle_is_correct(DataTable table) throws Throwable {
		
		String title=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		String subtitle=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
		objEndGamePage.verifyTrophyTitleAndSubtitle(title, subtitle);
		
    }
	
	@Then("^level header and level title are correct$")
    public void level_header_and_title_correct(DataTable table) throws Throwable {
		
		String title=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		String subtitle=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
		objEndGamePage.verifyLevelTitleANdSubTitle(title, subtitle);
		
    }
	
	
	 @When("^user verify and click social share button$")
	    public void user_verify_and_click_social_share_button() throws Throwable {
		 objEndGamePage.verifyAndClickLetKnowButton();
	    }

	    

	    @Then("^Share modal title is correct$")
	    public void share_modal_title_is_correct() throws Throwable {
	    	objEndGamePage.verifyShareTropyTitle();
	    }
	    
	    @Then("^Share modal title is correct for levels$")
	    public void share_modal_title_is_correct_for_levels() throws Throwable {
	    	objEndGamePage.verifyShareLevelTitle();
	    }

	    @And("^Facebook sharing is working$")
	    public void facebook_sharing_is_working() throws Throwable {
	    	objEndGamePage.verifyAndClickFbShare();
	    }

	    @And("^LinkdIn sharing is working$")
	    public void linkdin_sharing_is_working() throws Throwable {
	    	objEndGamePage.verifyAndClickLinkInShare();
	    }

	    @And("^Twitter sharing is working$")
	    public void twitter_sharing_is_working() throws Throwable {
	    	objEndGamePage.verifyAndClickTwitterShare();
	    }

	    @And("^Mail sharing is working$")
	    public void mail_sharing_is_working() throws Throwable {
	    	objEndGamePage.verifyAndClickMailShare();
	    }
	    
	    @Then("^Text is correct on MLG trophy$")
	    public void text_is_correct_on_mlg_trophy(DataTable table) throws Throwable {
	    	String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
	    	objEndGamePage.verifyMlgTrophyText(expectedText);
        }

	    @Then("^MLG game name is correct on MLG trophy$")
	    public void mlg_game_name_is_correct_on_mlg_trophy() throws Throwable {
	    	objEndGamePage.verifyMlgTrophyName();
	    }
	    
	    @Then("^MLG game name is correct on MLG trophy for already created MLG$")
	    public void mlg_game_name_is_correct_on_mlg_trophy_for_already_created_mlg(DataTable table) throws Throwable {
	    	objEndGamePage.verifyMlgTrophyName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @Then("^user closes MLG trophy$")
	    public void user_closes_mlg_trophy() throws Throwable {
	    	objEndGamePage.closeMlgTrophy();
	    }
	    @And("^user close level popup if it appears$")
	    public void user_close_previous_level_popup_if_it_appears() throws Throwable {
	    	objEndGamePage.closeLevelPopUp();
	    }	   
	    @Then("^Complete text is appearing on level popup$")
	    public void complete_text_is_appearing_on_level_popup(DataTable table) throws Throwable {
	    	objEndGamePage.verifyCompleteText(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    @Then("^Level number is correct on level popup$")
	    public void level_number_is_correct_on_level_popup() throws Throwable {
	    	objSelectGamePage.verifyLevelNumberLevelCompletePopUp();
	    }
	    
	    @And("^Game Trophy name is correct after ending game$")
	    public void game_trophy_name_is_correct_after_ending_game() throws Throwable {
	    	objEndGamePage.verifyGameTrophyNameEndGame();
	    	    }
	    @And("^User closes all the opened trophies and levels and go to home screen$")
	    public void user_closes_all_the_opened_trophies_and_levels_and_go_to_home_screen() throws Throwable {
	    	objEndGamePage.closeAllTrophiesAndLevelAndGoToHomeScreen();  }

	    @And("^User closes all the trophies$")
	    public void user_closes_all_trophy() throws Throwable {
	    	objEndGamePage.closeOpenedTrophies();
	    }

}
