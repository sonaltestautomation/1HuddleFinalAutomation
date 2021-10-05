package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.GameLibraryPage;
import com.testH.base.pages.admin.ScheduleGamePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class GameOperationsAdminSteps {
	
	private GameLibraryPage objGameLibraryPage;
	private ScheduleGamePage objScheduleGamePage;
	private DashboardPage objDashboardPage;



	 public GameOperationsAdminSteps()
	 {
			objGameLibraryPage=new GameLibraryPage();
			objScheduleGamePage=new ScheduleGamePage();
			objDashboardPage=new DashboardPage();

	 }
	 
	 @And("^Manager selects gametype$")
	    public void manager_selects_gametype(DataTable table) throws Throwable {
		 String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		 By loc_gameType=By.xpath("//div[contains(text(),'"+expectedText+"')]");
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game type is selecting", Pojo.getObjSeleniumFunctions().click(loc_gameType));
	    }
	
	 @And("^manager selects game state$")
	    public void manager_selects_game_state(DataTable table) throws Throwable {
		 
		 objGameLibraryPage.selectGameStateFilter(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
		 
	    }
	
	
	@And("^manager delete game$")
	    public void manager_delete_game(DataTable table) throws Throwable {
		
		String gameCount= Pojo.getObjSeleniumFunctions().getTestData(1,0, table);
		int intGameCount=Integer.parseInt(gameCount);
		objGameLibraryPage.deleteGame(intGameCount);
		
	}

	@Then("^game is deleting$")
    public void game_is_deleting() throws Throwable {
    }

	@And("^Manager clicks on options button on recently created game$")
    public void manager_clicks_on_options_button_on_recently_created_game() throws Throwable {
		objGameLibraryPage.clickOptionsRecentlyCreatedGame();
    }
	@And("^Manager moves game to ready state$")
    public void manager_moves_game_to_ready_state() throws Throwable {
		objGameLibraryPage.clickMoveToReady();
    }

	@And("^manager enters game name$")
    public void manager_enters_game_name(DataTable table) throws Throwable {
		String gameName= Pojo.getObjSeleniumFunctions().getTestData(1,0, table);
		objGameLibraryPage.enterGameName(gameName);

    }
    
	@Then("^correct message is appearing on the page$")
    public void correct_message_is_appearing_on_the_page(DataTable table) throws Throwable {
		String expectedMsg=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		objScheduleGamePage.verifyMessageOnBlankPage(expectedMsg);
		
    }

    @Then("^manager clicks on dashboard button$")
    public void manager_clicks_on_dashboard_button() throws Throwable {
    	objDashboardPage.clickDashboard();
    	
    }

    @And("^manager enters live game name$")
    public void manager_enters_live_game_name() throws Throwable {
    }

    

    @And("^manager clicks on schedule in options list$")
    public void manager_clicks_on_schedule_in_options_list() throws Throwable {
    	objGameLibraryPage.clickScheduleGameButton();
    }

    @And("^manager selects limit$")
    public void manager_selects_limit() throws Throwable {
    	objScheduleGamePage.selectCheckBoxWithLimit();
    }

    @And("^manager clicks on delete button on schedule game screen$")
    public void manager_clicks_on_delete_button_on_schedule_game_screen() throws Throwable {
    	objScheduleGamePage.clickDeleteIcon();
    }

    @And("^manager clicks on yes button on delete limit confirmation popup$")
    public void manager_clicks_on_yes_button_on_delete_limit_confirmation_popup() throws Throwable {
    	objScheduleGamePage.clickYesConfirmationPopUp();
    }
   
}
