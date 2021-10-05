package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.EndGamePage;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.QuestionCategoryPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class LeaderboardSteps {
	
	
	public int gamePoint=0;

	private EndGamePage objEndGamePage;
	private LeaderboardPage objLeaderboardPage;
	private PlayGameFlow objPlayGameFlow;

	
	public LeaderboardSteps()
	{
		objLeaderboardPage=new PageFactory().getLeaderboardPage();
		objEndGamePage=new PageFactory().getEndGamePage();
		objPlayGameFlow=new PlayGameFlow();
	}

    @When("^User clicks on Leaderboards$")
    public void user_clicks_on_leaderboards() throws Throwable {
    	objLeaderboardPage.clickLeaderboardsSideMenu();
    }

    @Then("^Leaderboards page is opening$")
    public void leaderboards_page_is_opening() throws Throwable {
    	objLeaderboardPage.verifyLeaderboardPage();
    }

    @Then("^company name is appearing on leaderboard screen$")
    public void company_name_is_appearing_on_leaderboard_screen(DataTable table) throws Throwable {
    	String companyName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objLeaderboardPage.verifyCompanyName(companyName);
    }
    
    @Then("^All and Department tabs are appearing$")
    public void all_and_department_tabs_are_appearing() throws Throwable {
    	objLeaderboardPage.verifyAllDeptTabs();
    }
    
   @Then("^All Department and Group tabs are appearing$")
    public void all_department_and_group_tabs_are_appearing() throws Throwable {
    	objLeaderboardPage.verifyAllDeptGroupTabs();
    }
    
    @And("^User click on home button on end game page$")
    public void user_click_on_home_button_on_end_game_page() throws Throwable {
    	objEndGamePage.clickHomeButton();    
    	}
    
    @And("^User comes to leaderboard screen$")
    public void user_come_to_leaderboard_screen() throws Throwable {
    	
    	objLeaderboardPage.clickLeaderboardsSideMenu();
    	
    	
    }
    @When("^User checks points on leaderboard screen$")
    public void user_checks_points_on_leaderboard_screen(DataTable table) throws Throwable {
    	objLeaderboardPage.getLeaderboardPoint(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    @And("^User play game$")
    public void user_play_game(DataTable table) throws Throwable {
 	   
 	   List<List<String>> data=table.asLists();
       String selectAns=data.get(1).get(0);
       int gamePlayCount=Integer.parseInt(data.get(1).get(1));
       gamePoint=objPlayGameFlow.playGame(gamePlayCount,selectAns);
 	  }
    @And("^User play already created game$")
    public void user_play_already_created_game(DataTable table) throws Throwable {
 	   List<List<String>> data=table.asLists();
        String gameName=data.get(1).get(0);
        int gameCount=Integer.parseInt(data.get(1).get(1));
        String answerType=data.get(1).get(2);
        
        gamePoint= objPlayGameFlow.playAlreadyAddedGame(gameName, gameCount, answerType);
        
    }
    
    @Then("^player score is correct$")
    public void player_score_is_correct() throws Throwable {
    	objLeaderboardPage.verifyLeaderBoardPoint(gamePoint);
    }
    @Then("^User ranking order and score order is showing correctly$")
    public void user_ranking_is_showing_correctly() throws Throwable {
    	objLeaderboardPage.verifyPlayerRankingOrder();
    }

    @Then("^User logs out$")
    public void user_logs_out() throws Throwable {
    }

    @When("^User clicks on particular leaderboard$")
    public void user_clicks_on_particular_leaderboard(DataTable table) throws Throwable {
    	String leaderboardType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objLeaderboardPage.clickLeaderboard(leaderboardType);
    	
    }

    @Then("^Department name is correct$")
    public void department_name_is_correct() throws Throwable {
    	objLeaderboardPage.verifyDeptName();
    }
    
    @Then("^Group name is correct$")
    public void group_name_is_correct() throws Throwable {
    	objLeaderboardPage.verifyGroupName();
    }
    
    @Then("^First Second and Third rank are correct$")
    public void first_second_and_third_rank_are_correct() throws Throwable {
    	objLeaderboardPage.verifyFirstRank();
    	objLeaderboardPage.verifySecondRank();
    	objLeaderboardPage.verifuThirdRank();
    	}
    
    @Then("^user is showing in the list$")
    public void user_is_showing_in_the_list() throws Throwable {
    	objLeaderboardPage.verifyUserInLeaderboardRankingList();
    }
    
    @And("^User clicks on group wise leaderboard$")
    public void user_clicks_on_group_wise_leaderboard() throws Throwable {
    	objLeaderboardPage.selectGroupLeaderboard();
    }

    @Then("^info message is correct on leaderboard to verify email$")
    public void info_message_is_correct_on_leaderboard_to_verify_email(DataTable table) throws Throwable {
    	objLeaderboardPage.verifyInfoMessageToVerifyEmailLimitedAccess(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }
    
    

}
