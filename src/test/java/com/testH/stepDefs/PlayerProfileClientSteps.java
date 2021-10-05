package com.testH.stepDefs;
import java.util.HashMap;
import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.PlayerProfilePage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;


public class PlayerProfileClientSteps {
	
	//double ratings=0;
	static double ratings=0;
	
	int gameCount;
	public int gamePoint=0;
	public static HashMap<String, Integer> expectedGameData= new HashMap<String, Integer>();


	private PlayerProfilePage objPlayerProfilePage;
	private LeaderboardPage objLeaderboardPage;
	private PlayGameFlow objPlayGameFlow;


	
	public PlayerProfileClientSteps()
	{
		objPlayerProfilePage= new PageFactory().getPlayerProfilePage();
		objLeaderboardPage=new PageFactory().getLeaderboardPage();
		objPlayGameFlow=new PlayGameFlow();


		
	}
	
	 @And("^user clicks on Profile side menu button$")
	    public void user_clicks_on_profile_side_menu_button() throws Throwable {
		 objPlayerProfilePage.clickProfileBtn();
		 
	    }

	 @Then("^player profile screen is opening$")
	    public void profile_screen_is_opening() throws Throwable {
		 objPlayerProfilePage.verifyProfileScreen();
	    }
	 
	 @Then("^Achievements and Statistics tabs are appearing$")
	    public void achievements_and_statistics_tabs_are_appearing() throws Throwable {
		 objPlayerProfilePage.verifyAchievementAndStatisticsTab();
		 
	    }
	 
	
	 
	 
	 @And("^User play already created game and calculate rating$")
	    public void user_play_already_created_game_and_calculate_rating(DataTable table) throws Throwable {
			 List<List<String>> data=table.asLists();
		        String gameName=data.get(1).get(0);
		        gameCount=Integer.parseInt(data.get(1).get(1));
		        String answerType=data.get(1).get(2);
		        
		        ratings=objPlayGameFlow.playGameForRating(gameName, gameCount, answerType);
	    }
	 
	 @Then("^Player name, Department, Location, Active Since, Ratings and status are correct$")
	    public void player_name_department_location_active_since_ratings_and_status_are_correct() throws Throwable {
		 objPlayerProfilePage.verifyPlayerName();
		 objPlayerProfilePage.verifyDepartment();
		 objPlayerProfilePage.verifyLocation();
		 objPlayerProfilePage.verifyStatus();
		 objPlayerProfilePage.verifyActiveSince();
		 objPlayerProfilePage.verifyRating(ratings);
		}
	 
	 @When("^user verify and click Scorecard button$")
	    public void user_verify_and_click_viewdownload_scorecard_button() throws Throwable {
		 objPlayerProfilePage.verifyAndClickViewDownloadScoreCard();

	    	
	    }
	 @Then("^Scorecard popup is opening$")
	    public void scorecard_popup_is_opening() throws Throwable {
		 objPlayerProfilePage.verifyScoreCardPopup();

	    }
	 
	 @Then("^What Next, Download Scorecard, Share on social/resume text and social icons are appearing on card$")
	    public void what_next_download_scorecard_share_on_socialresume_text_and_social_icons_are_appearing_on_card() throws Throwable {
		 objPlayerProfilePage.verifyWhatNextText();
		 objPlayerProfilePage.verifyDownloadScoreCardText();
		 objPlayerProfilePage.verifyShareOnSocialResumeText();	    
		 }

	 @Then("^Download button is appearing on scorecard$")
	    public void download_button_is_appearing_on_scorecard() throws Throwable {
		 objPlayerProfilePage.verifyDownloadButtonScorecard();
	    }

	    @Then("^success message is appearing after clicking on download button on scorecard$")
	    public void success_message_is_appearing_after_clicking_on_download_button_on_scorecard() throws Throwable {
	    	objPlayerProfilePage.verifySuccessDownloadScorecard();
	    	}
	    
	    @And("^user verify and click on close button$")
	    public void user_verify_and_click_on_close_button() throws Throwable {
	    	objPlayerProfilePage.verifyAndClickCloseBtn();
	    }
	 
	    @Then("^level image is displaying$")
	    public void level_image_is_displaying() throws Throwable {
	    	objPlayerProfilePage.verifyLevelImage();
	    }
	    
	    @When("^user verify and click on level share icon on profile screen$")
	    public void user_verify_and_click_on_level_share_icon_on_profile_screen() throws Throwable {
	    	objPlayerProfilePage.verifyAndClickLevelShareIcon();
	    }

	    @Then("^My Level text is appearing$")
	    public void my_level_text_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyMyLevelText();
	    }

	    @Then("^Level image is appearing$")
	    public void level_image_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyLevelNameImage();
	    }
	    
	    @Then("^game count is correct with Rookie, Starter, Professional, All Star and Master level$")
	    public void game_count_is_correct_with_rookie_starter_professional_all_star_and_master_level(DataTable table) throws Throwable {
	    	
	    	int rookieCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	int startterCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    	int professionalCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
	    	int allstarCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 3, table));
	    	String masterCount=Pojo.getObjSeleniumFunctions().getTestData(1, 4, table); //taking this String because master count display as 1,000
	    	
	    	
	    	
	    	objPlayerProfilePage.verifyGameCountRookie(gameCount,rookieCount);
	    	objPlayerProfilePage.verifyGameCountStarter(gameCount,startterCount);
	    	objPlayerProfilePage.verifyGameCountProfessional(gameCount,professionalCount);
	    	objPlayerProfilePage.verifyGameCountAllStar(gameCount,allstarCount);
	    	objPlayerProfilePage.verifyGameCountMaster(gameCount,masterCount);
	    	
	    	
	    }
	    
	    
	   
	    @Then("^My Accomplishments field is appearing$")
	    public void my_accomplishments_field_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyMyAccomplishment();
	    }

	    @Then("^Trophies field is appearing under My Accomplishments field$")
	    public void trophies_field_is_appearing_under_my_accomplishments_field() throws Throwable {
	    	objPlayerProfilePage.verifyTrophiesField();
	    	
	    }

	    @Then("^Contests field is appearing under My Accomplishments field$")
	    public void contests_field_is_appearing_under_my_accomplishments_field() throws Throwable {
	    	objPlayerProfilePage.verifyContestField();
	    }

	    @Then("^Rewards field is appearing under My Accomplishments field$")
	    public void rewards_field_is_appearing_under_my_accomplishments_field() throws Throwable {
	    	objPlayerProfilePage.verifyRewardsField();
	    }

	    @Then("^Multilevel field is appearing under My Accomplishments field$")
	    public void multilevel_field_is_appearing_under_my_accomplishments_field() throws Throwable {
	    	objPlayerProfilePage.verifyMultilevelField();
	    }
	    @Then("^trophy count is correct in bubble$")
	    public void trophy_count_is_correct_in_bubble(DataTable table) throws Throwable {
	    	int expectedTrophyCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	objPlayerProfilePage.verifyTrophyCountBubble(expectedTrophyCount);
	    }
	    @When("^user clicks on Trophies$")
	    public void user_clicks_on_trophies() throws Throwable {
	    	objPlayerProfilePage.clickTrophies();
	    }
	    
	    @Then("^Thophies screen is opening$")
	    public void thophies_screen_is_opening() throws Throwable {
	    	objPlayerProfilePage.verifyTrophiesScreen();
	    }
	    
	    @When("^user clicks on Contests$")
	    public void user_clicks_on_contests() throws Throwable {
	    	objPlayerProfilePage.clickContests();
	    }

	    @Then("^Contests screen is opening$")
	    public void contests_screen_is_opening() throws Throwable {
	    	objPlayerProfilePage.verifyContestsScreen();
	    }
	    @When("^user clicks on Rewards$")
	    public void user_clicks_on_rewards() throws Throwable {
	    	objPlayerProfilePage.clickRewards();
	    }

	    @Then("^Rewards screen is opening$")
	    public void rewards_screen_is_opening() throws Throwable {
	    	objPlayerProfilePage.verifyRewardsScreen();
	    }
	    
	    @When("^user clicks on Multilevel$")
	    public void user_clicks_on_multilevel() throws Throwable {
	    	objPlayerProfilePage.clickMultilevel();
	    }

	    @Then("^Multilevel screen is opening$")
	    public void multilevel_screen_is_opening() throws Throwable {
	    	objPlayerProfilePage.verifyMultilevelScreen();
	    }
	    
	    @Then("^user clicks on back button$")
	    public void user_clicks_on_back_button() throws Throwable {
	    	objPlayerProfilePage.verifyAndClickBackButton();
	    }
	    
	    @Then("^total unlocked field is appearing on trophies screen$")
	    public void total_unlocked_field_is_appearing_on_trophies_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @Then("^career unloacked field is appearing on trophies screen$")
	    public void career_unloacked_field_is_appearing_on_trophies_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @Then("^game trophies field is appearing with trophies screen$")
	    public void game_trophies_field_is_appearing_with_trophies_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

  	    }
	    @Then("^Total Wins fiels is appearing on contest screen$")
	    public void total_wins_fiels_is_appearing_on_contest_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @Then("^Contest Trophies field is appearing on contest screen$")
	    public void contest_trophies_field_is_appearing_on_contest_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }
	    @Then("^total unlocked field is apparing on rewards screen$")
	    public void total_unlocked_field_is_apparing_on_rewards_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @Then("^contest rewards field is appearing on rewards screen$")
	    public void contest_rewards_field_is_appearing_on_rewards_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }
	    
	    @Then("^total unlocked field is appearing on multilevel screen$")
	    public void total_unlocked_field_is_appearing_on_multilevel_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

	    }

	    @Then("^multilevel trophy field is appearing on multilevel screen$")
	    public void multilevel_trophy_field_is_appearing_on_multilevel_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    @Then("^multilevel game field is appearing with trophies screen$")
	    public void multilevel_game_field_is_appearing_with_trophies_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    @Then("^single level game field is appearing with trophies screen$")
	    public void single_level_game_field_is_appearing_with_trophies_screen(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyFieldName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    @Then("^total unlocked trophy count is correct$")
	    public void total_unlocked_trophy_count_is_correct(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyCount(Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table)));
  
	    }
	    @Then("^first game trophy is appearing$")
	    public void first_game_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    }

	    @Then("^five games in a trophy is appearing$")
	    public void five_games_in_a_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^hundred percent correct trophy is appearing$")
	    public void hundred_percent_correct_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^hundred minute trophy is appearing$")
	    public void hundred_minute_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^seven days in a row trophy is appearing$")
	    public void seven_days_in_a_row_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^ten days in a row trophy is appearing$")
	    public void ten_days_in_a_row_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^hundred games trophy is appearing$")
	    public void hundred_games_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^one million points trophy is appearing$")
	    public void one_million_points_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @Then("^five million points trophy is appearing$")
	    public void five_million_points_trophy_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitleSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));

	    }

	    @And("^user closes trophy popup$")
	    public void user_closes_trophy_popup() throws Throwable {
	    	objPlayerProfilePage.closeTrophyPopup();
	    }
	    @And("^user opens trophy$")
	    public void user_opens_trophy(DataTable table) throws Throwable {
	    	objPlayerProfilePage.selectTrophy(Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table)));
	    }
	    @When("^user opens single level game trophy$")
	    public void user_opens_single_level_game_trophy() throws Throwable {
	    	objPlayerProfilePage.openSingleLevelGameTrophy();
	    }

	    @Then("^Game Trophy Title is correct$")
	    public void trophy_title_is_correct(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophyTitle(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @And("^Trophy name is correct$")
	    public void trophy_name_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyGameTrophyName();
	    }

	    @And("^Total points, Attempts and High Score is correct$")
	    public void total_points_attempts_and_high_score_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyTotalPoints();
	    	objPlayerProfilePage.verifyAttempts();
	    	objPlayerProfilePage.verifyHighScore();
	    }
	    
	    @When("^user selects perticular tab$")
	    public void user_selects_perticular_tab(DataTable table) throws Throwable {
	    	objPlayerProfilePage.selectTab(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }

	    @Then("^statistics tab is opening$")
	    public void statistics_tab_is_opening() throws Throwable {
	    	objPlayerProfilePage.verifyStatisticsTabOpening();
	    }
	    
	    @Then("^LIFETIME tab is appearing$")
	    public void lifetime_tab_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyLifeTimeTab();
	    }

	    @Then("^THIS YEAR tab is appearing$")
	    public void this_year_tab_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyThisYearTab();
	    }

	    @Then("^THIS MONTH tab is appearing$")
	    public void this_month_tab_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyThisMonthTab();
	    }

	    @Then("^LAST MONTH tab is appearing$")
	    public void last_month_tab_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyLastMonthTab();
	    }
	    @Then("^Total Points, Games, Trophies, Perfect Games, Contests won and time played field are appearing$")
	    public void total_points_games_trophies_perfect_games_contests_won_and_time_played_field_are_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,1, table));
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,2, table));
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,3, table));
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,4, table));
	    	objPlayerProfilePage.verifyStatisticsField(Pojo.getObjSeleniumFunctions().getTestData(1,5, table));
	    	}
	    
	    @And("^User play already created game for statistics$")
	    public void user_play_already_created_game_for_statistics(DataTable table) throws Throwable {
	    	List<List<String>> data=table.asLists();
	        String gameName=data.get(1).get(0);
	        gameCount=Integer.parseInt(data.get(1).get(1));
	        String answerType=data.get(1).get(2);
	        expectedGameData= objPlayGameFlow.playAlreadyAddedGameStatistics(gameName, gameCount, answerType);
	    }
	    
	    @And("^User play recently created game for statistics$")
	    public void user_play_recently_created_game_for_statistics(DataTable table) throws Throwable {
	    	List<List<String>> data=table.asLists();
	        String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
	        gameCount=Integer.parseInt(data.get(1).get(0));
	        String answerType=data.get(1).get(1);
	        expectedGameData= objPlayGameFlow.playAlreadyAddedGameStatistics(gameName, gameCount, answerType);	    
	        }
	    
	    @And("^User play recently created game for statistics with different users$")
	    public void user_play_recently_created_game_for_statistics_with_different_users(DataTable table) throws Throwable {
	    	List<List<String>> data=table.asLists();
	        String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
	        gameCount=Integer.parseInt(data.get(1).get(0));
	        String answerType=data.get(1).get(1);
	        expectedGameData= objPlayGameFlow.playRecentlyAddedGameStatisticsForMultiplePlayer(gameName, gameCount,answerType);	    
	    }
	    
	    
	   

	    @Then("^Total Points are correct$")
	    public void total_points_are_correct() throws Throwable {
	    	objPlayerProfilePage.verifyTotalPointsStatistics(expectedGameData.get("TotalPoints"));
	    }

	    @Then("^Games count is correct$")
	    public void games_count_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyGamesCountStatistics(expectedGameData.get("TotalGameCount"));
	    	System.out.println("Total Game Count "+expectedGameData.get("TotalGameCount"));
	    }

	    @Then("^Trophies count is correct$")
	    public void trophies_count_is_correct(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyTrophiesCountStatistics(Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table)));
	    }

	    @Then("^Perfect games count is correct$")
	    public void perfect_games_count_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyPerfectGamesCountStatistics(expectedGameData.get("PerfectGameCount"));
	    }

	    @Then("^Contest won count is correct$")
	    public void contest_won_count_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyContestWonCountStatistics(0);
	    }
	    @Then("^Time Played time is correct$")
	    public void time_played_time_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyTimePlayedCountStatistics();
	    }
	    
	    @Then("^Total Points are correct for last month$")
	    public void total_points_are_correct_for_last_month() throws Throwable {
	    	objPlayerProfilePage.verifyTotalPointsStatistics(0);

	    }

	    @Then("^Games count is correct for last month$")
	    public void games_count_is_correct_for_last_month() throws Throwable {
	    	objPlayerProfilePage.verifyGamesCountStatistics(0);

	    }

	    @Then("^Perfect games count is correct for last month$")
	    public void perfect_games_count_is_correct_for_last_month() throws Throwable {
	    	objPlayerProfilePage.verifyPerfectGamesCountStatistics(0);

	    }

	    @Then("^Contest won count is correct for last month$")
	    public void contest_won_count_is_correct_for_last_month() throws Throwable {
	    	objPlayerProfilePage.verifyContestWonCountStatistics(0);
	    }

	    @Then("^Time Played time is correct for last month$")
	    public void time_played_time_is_correct_for_last_month() throws Throwable {
	    	objPlayerProfilePage.verifyTimePlayedCountLastMonthStatistics();
	    }
	    
	    @Then("^current and lifetime tabs are appearing$")
	    public void current_and_lifetime_tabs_are_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyCurrentTab(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    	objPlayerProfilePage.verifyLifetimeTab(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    }
	    
	    @And("^User selects a random player$")
	    public void user_selects_a_random_player() throws Throwable {
	    	objLeaderboardPage.selectRandomPlayer();
	    }
	    
	    @And("^user selects a player to view its profile$")
	    public void user_selects_a_player_to_view_its_profile() throws Throwable {
	    	objLeaderboardPage.selectPlayer();
	    }
	    
	    @Then("^Player's Level text is appearing$")
	    public void players_level_text_is_appearing(DataTable table) throws Throwable {
	    	objPlayerProfilePage.verifyPlayerLevelText(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
	    }
	    
	    @Then("^weekly streak container is appearing$")
	    public void weekly_streak_container_is_appearing() throws Throwable {
	    	objPlayerProfilePage.verifyWeeklyStreakContainer();
	    }

	    @Then("^weekly streak count is correct$")
	    public void weekly_streak_count_is_correct() throws Throwable {
	    	objPlayerProfilePage.verifyWeeklyStreakCount();
	    }
	    
	    @And("^user scroll on the app$")
	    public void user_scroll_on_the_app(DataTable table) throws Throwable {
	    	Pojo.getObjSeleniumFunctions().androidScroll(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    }
	    
}
