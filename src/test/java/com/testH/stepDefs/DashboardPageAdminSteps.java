package com.testH.stepDefs;

import java.util.HashMap;
import java.util.Hashtable;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class DashboardPageAdminSteps {
	
	private DashboardPage objDashboardPage;
	
	
	String timeFilterType;
	
	public static HashMap<String, Integer> trophiesCountDashboardBeforePlaying = new HashMap<String, Integer>();
	public static HashMap<String, Integer> gamesPlayedCountDashboardBeforePlaying = new HashMap<String, Integer>();
	public static HashMap<String, Integer> participationDashboardBeforePlaying = new HashMap<String, Integer>();
	public static HashMap<String, HashMap<String, Integer>> trophies_gamePlay__participation_countDashboardBeforePlaying = new HashMap<String, HashMap<String, Integer>>();

	
	
	public DashboardPageAdminSteps()
	{
		objDashboardPage=new DashboardPage();
	}

	@Then("^Dashboard screen is opening$")
    public void dashboard_screen_is_opening() throws Throwable {
		objDashboardPage.verifyDashboardPageAdminLogin();
    }

    @Then("^Practice game count is correct$")
    public void practice_game_count_is_correct() throws Throwable {
    	objDashboardPage.verifyPracticeGameCount(timeFilterType);
    }

    @Then("^Live game count is correct$")
    public void live_game_count_is_correct() throws Throwable {
    	
    	objDashboardPage.verifyLiveGameCount(PlayGameFlow.expectedGamePlayData.get("TotalGameCount"),timeFilterType);
        
    }

    @Then("^Trophies achieved count is correct$")
    public void trophies_achieved_count_is_correct(DataTable table) throws Throwable {
    	String testData=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int expTrophyCount=Integer.parseInt(testData);    	
    	objDashboardPage.verifyTrophiesAchievedCount(expTrophyCount,timeFilterType);
    }
    
    
    @Then("^Participation time is correct$")
    public void participation_time_is_correct() throws Throwable {
    	objDashboardPage.verifyParticipationTime(timeFilterType);
    }

    @And("^Manager clicks on filter$")
    public void manager_clicks_on_filter(DataTable table) throws Throwable {
    	objDashboardPage.selectFilter(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager clicks on right arrow button of a filter$")
    public void manager_clicks_on_right_arrow_button_of_a_filter(DataTable table) throws Throwable {
    	objDashboardPage.clickRightArrowButtonOfFilter(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    
    @And("^Manager mouse hove on filter$")
    public void manager_mouse_hove_on_filter(DataTable table) throws Throwable {
    	objDashboardPage.mouseHoveOnFilter(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    
    @And("^Manager selects sub filter$")
    public void manager_selects_sub_filter(DataTable table) throws Throwable {
    	
    	String filterName=Pojo.getObjSeleniumFunctions().getTestData(1,0, table);
    	String subFilterName=Pojo.getObjSeleniumFunctions().getTestData(1,1, table);
    	
    	objDashboardPage.selectSubFilter(filterName, subFilterName);
    }

    @And("^Manager selects menu item filter$")
    public void manager_selects_menu_item_filter(DataTable table) throws Throwable {
    	objDashboardPage.selectMenuItemFilter(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }

    
//    @And("^Manager clicks on Add a filter button$")
//    public void manager_clicks_on_add_a_filter_button() throws Throwable {
//    	objDashboardPage.clickAddFilterBtn();
//    }

    @And("^Manager clicks on submenu arrow button$")
    public void manager_clicks_on_submenu_arrow_button(DataTable table) throws Throwable {
    	
    	objDashboardPage.clickSubMenuArrowRight(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager enters recently played player name$")
    public void manager_enters_recently_played_player_name() throws Throwable {
    	objDashboardPage.enterRecentlyPlayedPlayerName();
    }

    @And("^Manager selects searched item$")
    public void manager_selects_searched_item() throws Throwable {
    	objDashboardPage.selectSearchedResult();
    }

    @And("^Manager selects time duration in time filter$")
    public void manager_clicks_on_time_filter(DataTable table) throws Throwable {
    	timeFilterType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDashboardPage.selectTimeFilter(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager clicks on time filter$")
    public void manager_clicks_on_time_filter() throws Throwable {
    	objDashboardPage.clickTImerFilter();
    }
    
    @Then("^Live game count is correct when live game has been moved to ready$")
    public void live_game_count_is_correct_when_live_game_has_been_moved_to_ready(DataTable table) throws Throwable {
    	
    	int gameCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.verifyLiveGameCount(gameCount,timeFilterType);    }
    
   
    @And("^Manager enters location name and select it$")
    public void manager_enters_location_name(DataTable table) throws Throwable {
    	objDashboardPage.enterLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.clickCheckboxSearchedResult();
    }
    
    @And("^Manager enters department name and select it$")
    public void manager_enters_department_name_and_select_it(DataTable table) throws Throwable {
    	objDashboardPage.enterDepartment(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.clickCheckboxSearchedResult();
    }
    
    @And("^Manager enters group name and select it$")
    public void manager_enters_group_name_and_select_it(DataTable table) throws Throwable {
    	objDashboardPage.enterGroup(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.clickCheckboxSearchedResult();
    }


    @And("^Manager clicks on done button on the search result list$")
    public void manager_clicks_on_done_button_on_the_search_result_list() throws Throwable {
    	objDashboardPage.clickDoneBtn();
    }
    
    @And("^manager clicks on select all checkBox in the textbox$")
    public void manager_clicks_on_checkbox_in_the_textbox() throws Throwable {
    	objDashboardPage.clickSelectAll();
    }
   
    @And("^Manager gets Game Played, Trophies and Participation count$")
    public void manager_gets_game_played_count() throws Throwable {
    	
    	trophies_gamePlay__participation_countDashboardBeforePlaying=objDashboardPage.getGamesPlayedCountTrophiesCountParticipationCount();
    	
    	gamesPlayedCountDashboardBeforePlaying=trophies_gamePlay__participation_countDashboardBeforePlaying.get("Games Played Count Dashboard");
    	trophiesCountDashboardBeforePlaying=trophies_gamePlay__participation_countDashboardBeforePlaying.get("Trophies Achieved Count Dashboard");
		participationDashboardBeforePlaying=trophies_gamePlay__participation_countDashboardBeforePlaying.get("Participation Count Dashboard");


    	System.out.println("Games Played Count "+gamesPlayedCountDashboardBeforePlaying);
    	System.out.println("Trophies Count "+trophiesCountDashboardBeforePlaying);
		System.out.println("Participation "+participationDashboardBeforePlaying);


    }

    @And("^Manager gets Thophies achieved count$")
    public void manager_gets_thophies_achieved_count() throws Throwable {
    	trophiesCountDashboardBeforePlaying=objDashboardPage.getTrophiesAchievedCount();
    	System.out.println("Trophies Count "+trophiesCountDashboardBeforePlaying);

    }

    @And("^Manager gets Participation$")
    public void manager_gets_participation() throws Throwable {
    		participationDashboardBeforePlaying=objDashboardPage.getParticipationCount();
    		System.out.println("Participation "+participationDashboardBeforePlaying);
    }
    
    @Then("^games played count is correct on dashboard$")
    public void games_played_count_is_correct_on_dashboard() throws Throwable {
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	objDashboardPage.verifyGamesPlayedCount(gamePlayCount,gamesPlayedCountDashboardBeforePlaying);
    }

    @Then("^participation count is correct on dashboard for team wise filter$")
    public void participation_count_is_correct_on_dashboard_for_team_wise_filter() throws Throwable {
    	objDashboardPage.verifyParticipationTeamWiseDashboard(participationDashboardBeforePlaying);
    }
    
    @Then("^Trophies achieved count is correct for team wise dashboard$")
    public void trophies_achieved_count_is_correct_for_team_wise_dashboard(DataTable table) throws Throwable {
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);    	
    	objDashboardPage.verifyTrophiesAchievedCount(intTrophyAchievedCountRecentlyPlayedGames,trophiesCountDashboardBeforePlaying);
    	}
    
    @Then("^games played count, trophies count and participation count is correct for team wise filter$")
    public void games_played_count_trophies_count_and_participation_count_is_correct_on_for_team_wise_filter(DataTable table) throws Throwable {
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    //	objDashboardPage.verifyTrophiesAchievedCount(intTrophyAchievedCountRecentlyPlayedGames,trophiesCountDashboardBeforePlaying);
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipation(gamePlayCount, intTrophyAchievedCountRecentlyPlayedGames,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);
    	}
    
    @Then("^games played count, trophy achieved count and participation count is correct if dashboard type is Game Single Level$")
    public void games_played_count_trophy_achieved_count_and_participation_count_is_correct_if_dashboard_type_is_game_single_level(DataTable table) throws Throwable {
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	int totalPlayerCount=CreatePlayerSteps.totalPlayerCount;
		String gameTrophyCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		int intGameTrophyCount=Integer.parseInt(gameTrophyCount);
	//	objDashboardPage.verifyTrophiesAchievedCountSingleLevelGamePlayDashboard(totalPlayerCount,intGameTrophyCount, trophiesCountDashboardBeforePlaying);
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationDashBoardTypeSingleLevel(gamePlayCount,intGameTrophyCount,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying,totalPlayerCount);
    }
    
    @Then("^games played count, trophies count and participation count is correct for team wise filter for active players$")
    public void games_played_count_trophies_count_and_participation_count_is_correct_for_team_wise_filter_for_active_players(DataTable table) throws Throwable {
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationForActivePlayers(gamePlayCount, intTrophyAchievedCountRecentlyPlayedGames,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);    }
    
    @Then("^games played count, trophies count and participation count is correct for active players$")
    public void games_played_count_trophies_count_and_participation_count_is_correct_for_active_players(DataTable table) throws Throwable {
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationForActivePlayers(gamePlayCount, intTrophyAchievedCountRecentlyPlayedGames,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);    }
    
    @Then("^games played count, trophies achieved count and participation count is correct for MLG dashboard if status all$")
    public void games_played_count_trophies_achieved_count_and_participation_count_is_correct_for_mlg_dashboard_if_status_all(DataTable table) throws Throwable {
    	String trophyAchievedCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCount=Integer.parseInt(trophyAchievedCount);  
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationMlgDashboard(gamePlayCount,intTrophyAchievedCount,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);
    	}
    
    @Then("^games played count, trophies achieved count and participation count is correct for MLG dashboard if status inProgress$")
    public void games_played_count_trophies_achieved_count_and_participation_count_is_correct_for_mlg_dashboard_if_status_inprogress(DataTable table) throws Throwable {
    	String trophyAchievedCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCount=Integer.parseInt(trophyAchievedCount);  
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationMlgDashboard(gamePlayCount,intTrophyAchievedCount,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);    }

    @Then("^games played count, trophies achieved count and participation count is correct for MLG dashboard if status is won$")
    public void games_played_count_trophies_achieved_count_and_participation_count_is_correct_for_mlg_dashboard_if_status_is_won(DataTable table) throws Throwable {
    	int gamePlayCount=	Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	int participation=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
    	String trophyAchievedCount=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	int intTrophyAchievedCount=Integer.parseInt(trophyAchievedCount);
    	objDashboardPage.verifyGamePlayCountTrophyAchievedCountAndParticipationMlgDashboardStatusWon(gamePlayCount,intTrophyAchievedCount,participation,gamesPlayedCountDashboardBeforePlaying,trophiesCountDashboardBeforePlaying,participationDashboardBeforePlaying);    
    	
 
 }

    	
    	
    
    
    @Then("^Trophies achieved count is correct for MLG dashboard$")
    public void trophies_achieved_count_is_correct_for_mlg_dashboard(DataTable table) throws Throwable {
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);    	
    	objDashboardPage.verifyTrophiesAchievedCount(intTrophyAchievedCountRecentlyPlayedGames,trophiesCountDashboardBeforePlaying);    }

    @Then("^games played count is correct on dashboard for active players$")
    public void games_played_count_is_correct_on_dashboard_for_active_players() throws Throwable {
    	int gamePlayCount=	PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	System.out.println("Game Count Played "+gamePlayCount);
    	objDashboardPage.verifyGamesPlayedCountActivePlayers(gamePlayCount,gamesPlayedCountDashboardBeforePlaying);
    }
    
    @Then("^games played count is correct on dashboard for mlg dashboard if status is won$")
    public void games_played_count_is_correct_on_dashboard_for_mlg_dashboard_if_status_is_won(DataTable table) throws Throwable {
    	
    	int gamePlayCount=	Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	System.out.println("Game Count Played "+gamePlayCount);
    	objDashboardPage.verifyGamesPlayedCount(gamePlayCount,gamesPlayedCountDashboardBeforePlaying);
;    }


    @Then("^Trophies achieved count is correct on dashboard for active players$")
    public void trophies_achieved_count_is_correct_for_team_wise_dashboard_for_active_players(DataTable table) throws Throwable {
    	String trophyAchievedCountRecentlyPlayedGames=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int intTrophyAchievedCountRecentlyPlayedGames=Integer.parseInt(trophyAchievedCountRecentlyPlayedGames);    	
    	objDashboardPage.verifyTrophiesAchievedCountActivePlayers(intTrophyAchievedCountRecentlyPlayedGames,trophiesCountDashboardBeforePlaying);
    }

    @Then("^participation count is correct on dashboard for active players$")
    public void participation_count_is_correct_on_dashboard_for_team_wise_filter_for_active_players() throws Throwable {
    	objDashboardPage.verifyParticipationTeamWiseDashboardActivePlayers(participationDashboardBeforePlaying);

    }
    
    
    @And("^Manager clicks on Dashboard side menu button$")
    public void manager_clicks_on_dashboard_side_menu_button() throws Throwable {
    	objDashboardPage.clickDashboardIconSideMenu();
    }

    @And("^Manager enters recently created game name and select it$")
    public void manager_enters_recently_created_game_name_and_select_it() throws Throwable {
    //	objDashboardPage.enterLocation(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.enterGameName();
    	objDashboardPage.selectSearchedResult();
    }

    @Then("^Trophies achieved count is correct for if dashboard type is Game Single Level$")
    public void trophies_achieved_count_is_correct_for_if_dashboard_type_is_game_single_level(DataTable table) throws Throwable {
		int totalPlayerCount=CreatePlayerSteps.totalPlayerCount;
		String gameTrophyCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		int intGameTrophyCount=Integer.parseInt(gameTrophyCount);
		objDashboardPage.verifyTrophiesAchievedCountSingleLevelGamePlayDashboard(totalPlayerCount,intGameTrophyCount, trophiesCountDashboardBeforePlaying);
    }

    @And("^Manager enters already created MLG name and select it$")
    public void manager_enters_already_created_mlg_name_and_select_it(DataTable table) throws Throwable {
    	objDashboardPage.enterGameName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDashboardPage.selectSearchedResult();

    	
    }
    
    @And("^Manager enters recently created mlg game name and select it$")
    public void manager_enters_recently_created_mlg_game_name_and_select_it() throws Throwable {
    	objDashboardPage.enterGameName(BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0));
    	objDashboardPage.selectSearchedResult();
    }
    
    @Then("^participation count is correct for mlg dashboard$")
    public void participation_count_is_correct_for_mlg_dashboard() throws Throwable {
    	objDashboardPage.verifyParticipationMlgDashboard(participationDashboardBeforePlaying);
    }
	
    @Then("^participation count is correct for mlg dashboard if status is won$")
    public void participation_count_is_correct_for_mlg_dashboard_if_status_is_won(DataTable table) throws Throwable {
    	int participation=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    	objDashboardPage.verifyParticipationMlgDashboard(participation,participationDashboardBeforePlaying);
    }
}
