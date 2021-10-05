package com.testH.stepDefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.DetailedReportPage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class DetailedReportPageAdminSteps {
	
	private DashboardPage objDashboardPage;
	private DetailedReportPage objDetailedReportPage;
	private GmailLoginPage objGmailLoginPage;


	
	
	
	String timeFilterType;
	
	 

	
	
	public DetailedReportPageAdminSteps()
	{
		objDetailedReportPage=new DetailedReportPage();
		objDashboardPage=new DashboardPage();
		objGmailLoginPage=new GmailLoginPage();

	}

	@And("^Manager clicks on Detailed Report tab$")
    public void manager_clicks_on_detailed_report_tab() throws Throwable {
		objDetailedReportPage.clickDetailedReport();
    }
	
	@Then("^Column header name is correct on detailed report$")
    public void column_header_name_is_correct_on_detailed_report(DataTable table) throws Throwable {
		String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		
		objDetailedReportPage.verifyColumnHeader(expectedText);
		
    }
	
	@And("^Manager selects time duration in time filter on detailed report page$")
    public void manager_selects_time_duration_in_time_filter_on_detailed_report_page(DataTable table) throws Throwable {
		timeFilterType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDashboardPage.selectTimeFilter(timeFilterType);
    }
	
	@And("^Manager selects custom duration from duration list$")
    public void manager_selects_custom_duration_from_duration_list() throws Throwable {
		objDetailedReportPage.selectCustomDuration();
    }

	
	@Then("^SP game count is correct on player wise detailed report$")
    public void sp_game_count_is_correct_on_player_wise_detailed_report() throws Throwable {
		objDetailedReportPage.verifySpgameCount(PlayGameFlow.expectedGamePlayData.get("TotalGameCount"),timeFilterType);
    }

    @Then("^Time SP is correct on player wise detailed report$")
    public void time_sp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifySpPlayedTime(timeFilterType);
    }

    @Then("^Points SP is correct on player wise detailed report$")
    public void points_sp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	int expectedPoint=PlayGameFlow.expectedGamePlayData.get("TotalPoints");
    	objDetailedReportPage.verifySpPointsCount(timeFilterType,expectedPoint);
    }

    @Then("^Last Played SP is correct on player wise detailed report$")
    public void last_played_sp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLastPlayedSPDate(timeFilterType);
    }

    @Then("^MP game count is correct on player wise detailed report$")
    public void mp_game_count_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpGameCount(timeFilterType, 0);
    }

    @Then("^MP time is correct on detailed report$")
    public void mp_time_is_correct_on_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpTime(timeFilterType);
    }
    
    
    @Then("^Points MP is correct on player wise detailed report$")
    public void points_mp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpPoints(timeFilterType, 0);
    }
    

    @Then("^Wins MP is correct on player wise detailed report$")
    public void wins_mp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpWinCount(timeFilterType, 0);

    }

    @Then("^Last Played MP is correct on player wise detailed report$")
    public void last_played_mp_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLastPlayedMpDate(timeFilterType);
    }

    @Then("^Rating is correct on player wise detailed report$")
    public void rating_is_correct_on_player_wise_detailed_report(DataTable table) throws Throwable {
    	double rating=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	System.out.println("Rating "+rating);
    	objDetailedReportPage.verifyRating(timeFilterType,rating);
    }
    
    @Then("^Rating is correct on player wise detailed report if player gives random answers$")
    public void rating_is_correct_on_player_wise_detailed_report_if_player_gives_random_answers() throws Throwable {
    	double rating=PlayerProfileClientSteps.ratings;
    	System.out.println("Rating "+rating);
    	objDetailedReportPage.verifyRating(timeFilterType,rating);    }

    @Then("^Department is correct on player wise detailed report$")
    public void department_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyDepartmentName();
    }

    @Then("^Location is correct on player wise detailed report$")
    public void location_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLocationName();
    }

    @Then("^Group is correct on player wise detailed report$")
    public void group_is_correct_on_player_wise_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyGroupName();
    }
    
    @Then("^correct modal is opening$")
    public void correct_modal_is_opening(DataTable table) throws Throwable {
    	String expectedModalName=Pojo.getObjSeleniumFunctions().getTestData(1,0, table);
    	objDetailedReportPage.verifyModalTitle(expectedModalName);
    }
    
    @And("^user closes default email id chip$")
    public void user_closes_default_email_id_chip() throws Throwable {
    	objDetailedReportPage.closeEmailIdChip();
    }

    @And("^user clicks on Add Email chip$")
    public void user_clicks_on_add_email_chip() throws Throwable {
    	objDetailedReportPage.clickAddEmailChip();
    }

    @And("^user enters email and hit enter$")
    public void user_enters_email_and_hit_enter(DataTable table) throws Throwable {
    	String expectedEmail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.enterEmail(expectedEmail);
    	By loc_textBox=By.xpath("//input[@name='emailInput']");
    	Pojo.getObjSeleniumFunctions().hitEnter(loc_textBox);
    }

    @And("^user clicks on button on the modal$")
    public void user_clicks_on_button_on_the_modal(DataTable table) throws Throwable {
    	String buttonName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.clickButtonOnModal(buttonName);
    	
    }
    
    @Then("^success message is appearing after sending detailed report$")
    public void success_message_is_appearing_after_sending_detailed_report(DataTable table) throws Throwable {
    	String expectedSuccessMsg=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.verifySuccessDetailedReport(expectedSuccessMsg);
    }
    
    @Then("^detailed report should be received to manager on his email$")
    public void detailed_report_should_be_received_to_manager_on_his_email(DataTable table) throws Throwable {
    	String mail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objGmailLoginPage.gmailLogin(mail, pw);
    	objGmailLoginPage.verifyAndOpenDetailedReportEmail();
    }
    
    @Then("^player name is correct in MLG detailed report$")
    public void player_name_is_correct_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyPlayerName();
    	}

    @Then("^games count is correct in MLG detailed report$")
    public void games_count_is_correct_in_mlg_detailed_report() throws Throwable {
    	int gameCount=PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	objDetailedReportPage.verifyGameCountMlgDetailedReport(timeFilterType,gameCount);
    	
    }

    @Then("^Time is correct in MLG detailed report$")
    public void time_is_coorect_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMlgSpPlayedTime(timeFilterType);
    }

    @Then("^Points are correct in MLG detailed report$")
    public void points_are_correct_in_mlg_detailed_report() throws Throwable {
    	int expectedPoints=PlayGameFlow.expectedGamePlayData.get("MLGPoints");
    	objDetailedReportPage.verifyMlgPointsDetailedReport(timeFilterType, expectedPoints);
    	
    }

    @Then("^Last Played date is correct in MLG detailed report$")
    public void last_played_is_correct_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLastPlayedMlgSPDate(timeFilterType);
    }

    @Then("^Rating is correct in MLG detailed report$")
    public void rating_is_correct_in_mlg_detailed_report(DataTable table) throws Throwable {
    	double rating=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	System.out.println("Rating "+rating);
    	objDetailedReportPage.verifyRatingMlgSpDetailedReport(timeFilterType,rating);
    }

    @Then("^Department is correct in MLG detailed report$")
    public void department_is_correct_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyDepartmentNameMlgDetailedReport();
    }

    @Then("^Location is correct in MLG detailed report$")
    public void location_is_correct_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLocationNameMlgDetailedReport();
    }

    @Then("^Group is correct in MLG detailed report$")
    public void group_is_correct_in_mlg_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyGroupNameMlgDetailedReport();
    }

    @Then("^SP game count is correct on single level detailed report$")
    public void sp_game_count_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifySpgameCountSingleLevelDetailedReport(PlayGameFlow.expectedGamePlayData.get("TotalGameCount"),timeFilterType);
    }

    @Then("^Time SP is correct on single level detailed report$")
    public void time_sp_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifySpPlayedTimeSingleLevelDetailedReport(timeFilterType);
    }

    @Then("^Points SP is correct on single level detailed report$")
    public void points_sp_is_correct_on_single_level_detailed_report() throws Throwable {
    	int expectedPoint=PlayGameFlow.expectedGamePlayData.get("TotalPoints");
    	objDetailedReportPage.verifySpPointsCountSingleLevelDetailedReport(timeFilterType, expectedPoint);
    }

    @Then("^Last Played SP is correct on single level detailed report$")
    public void last_played_sp_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLastPlayedSPDateSingleLevelDetailedReport(timeFilterType);
    }

    @Then("^MP game count is correct on single level  detailed report$")
    public void mp_game_count_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpGameCountSingleLevelDetailedReport(timeFilterType, 0);
    }

    @Then("^MP time is correct on single level detailed report$")
    public void mp_time_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpTimeSingleLevelDetailedReport(timeFilterType);
    }
    

    @Then("^Points MP is correct on single detailed report$")
    public void points_mp_is_correct_on_single_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpPointsSingleLevelDetailedReport(timeFilterType, 0);
    }

    @Then("^Wins MP is correct on single level detailed report$")
    public void wins_mp_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyMpWinCountSingleLevelDetailedReport(timeFilterType, 0);
    }

    @Then("^Last Played MP is correct on single level detailed report$")
    public void last_played_mp_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLastPlayedMpDateSingleLevelDetailedReport(timeFilterType);
    }

    @Then("^Rating is correct on single level detailed report$")
    public void rating_is_correct_on_single_level_detailed_report(DataTable table) throws Throwable {
    	double rating=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	System.out.println("Rating "+rating);
    	objDetailedReportPage.verifyRatingSingleLevelDetailedReport(timeFilterType,rating);
    }

    @Then("^Department is correct on single level detailed report$")
    public void department_is_correct_on_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyDepartmentNameSingleLevelDetailedReport();
    }

    @Then("^Location is correct single level detailed report$")
    public void location_is_correct_single_level_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyLocationNameSingleLevelDetailedReport();
    }

    @Then("^Group is correct on single level detailed report$")
    public void group_is_correct_on_single_level_detailed_report() throws Throwable {
    	
    	objDetailedReportPage.verifyGroupNameSingleLevelDetailedReport();
    }
    @And("^Manager clicks on column header to sorting$")
    public void manager_clicks_on_column_header_to_sorting(DataTable table) throws Throwable {
    	objDetailedReportPage.clickColumnHeaderToSortTheValues(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    
    @And("^Manager clicks on player to open its report$")
    public void manager_clicks_on_player_to_open_its_report() throws Throwable {
    	objDetailedReportPage.selectPlayerResultDetailedReport();
    }
    
    @Then("^Verify that correct tabs are appearing on player report card$")
    public void verify_that_correct_tabs_are_appearing_on_player_report_card(DataTable table) throws Throwable {
    	String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.verifyText(expectedText);
    }
    
    @Then("^Verify that correct text is appearing on the card$")
    public void verify_that_correct_text_is_appearing_on_the_card(DataTable table) throws Throwable {
    	String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.verifyText(expectedText);    
    	}
    
    @Then("^verify that game played count is correct for Single Player game on the card$")
    public void verify_that_game_played_count_is_correct_for_single_player_game_on_the_card() throws Throwable {
		objDetailedReportPage.verifySpgameCountPlayerCard(PlayGameFlow.expectedGamePlayData.get("TotalGameCount"));

    }
    
    @Then("^verify that time played is correct for Single Player game on the card$")
    public void verify_that_time_played_is_correct_for_single_player_game_on_the_card() throws Throwable {
    	objDetailedReportPage.verifySpPlayedTimePlayerCard();
    }
    
    @Then("^verify that game played count is correct for Multi Player game on the card$")
    public void verify_that_game_played_count_is_correct_for_multi_player_game_on_the_card() throws Throwable {
    	objDetailedReportPage.verifyMpGamesPlayerCard(0);

    }

    @Then("^verify that time played is correct for Multi Player game on the card$")
    public void verify_that_time_played_is_correct_for_multi_player_game_on_the_card() throws Throwable {
    	objDetailedReportPage.verifyMpTimePlayerCard();
    }
    
    @Then("^verify that achieved date is correct with rookie level card$")
    public void verify_that_achieved_date_is_correct_on_rookie_level_card() throws Throwable {
    	objDetailedReportPage.verifyDateAchievedWithRookieLevel();
    }
    
    @Then("^game count is correct with Rookie, Starter, Professional, All Star and Master level in player card under detailed report$")
    public void game_count_is_correct_with_rookie_starter_professional_all_star_and_master_level_in_player_card_under_detailed_report(DataTable table) throws Throwable {
    	
    	int rookieCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	int startterCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
    	int professionalCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
    	int allstarCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 3, table));
    	String masterCount=Pojo.getObjSeleniumFunctions().getTestData(1, 4, table); //taking this String because master count display as 1,000
    	
    	int gameCount=PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	
    	
    	objDetailedReportPage.verifyGameCountRookie(gameCount,rookieCount);
    	objDetailedReportPage.verifyGameCountStarterPlayerCard(gameCount,startterCount);
    	objDetailedReportPage.verifyGameCountProfessionalPlayerCard(gameCount,professionalCount);
    	objDetailedReportPage.verifyGameCountAllStarPlayerCard(gameCount,allstarCount);
    	objDetailedReportPage.verifyGameCountMasterPlayerCard(gameCount,masterCount);
    }
    
    @And("^Manager selects tab in detailed report$")
    public void manager_selects_tab_in_detailed_report(DataTable table) throws Throwable {
    	String expectedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objDetailedReportPage.clickTab(expectedText);
    }


    @Then("^verify that total games in game list is showing correctly in single player games report$")
    public void verify_that_total_games_in_game_list_is_shoing_correctly_in_single_player_games_report() throws Throwable {
    	int gameCount=PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
    	objDetailedReportPage.verifyTotalGamesInGameList(gameCount);

    }
    
    @Then("^verify that game name is showing correctly in the single player games report$")
    public void verify_that_game_name_is_showing_correctly_in_the_single_player_games_report() throws Throwable {
    	objDetailedReportPage.verifyGameName();
    }

    @Then("^verify that points are showing correctly in the single player games report$")
    public void verify_that_points_are_showing_correctly_in_the_single_player_games_report() throws Throwable {
    	
    	int expectedPoint=PlayGameFlow.expectedGamePlayData.get("TotalPoints");
        objDetailedReportPage.verifyPointsSingleLevelDetailedReport(expectedPoint);    
        }
    
    @Then("^verify that game accuracy is showing correctly in the single player games report$")
    public void verify_that_game_accuracy_is_showing_correctly_in_the_single_player_games_report() throws Throwable {
    	int totalQuestionsInGame=BuildSpGamePage.expectedDataCount.get("QuestionCount");
    	int correctAns=PlayGameFlow.expectedGamePlayData.get("TotalCorrectAns"); 
    	objDetailedReportPage.verifyAccuracySingleLevelDetailedReport(totalQuestionsInGame, correctAns);
    	}
    
    @Then("^verify that time spent is showing corectly in the single player games report$")
    public void verify_that_time_spent_is_showing_corectly_in_the_single_player_games_report() throws Throwable {
    	objDetailedReportPage.verifyTimeSpentSingleLevelDetailedReport();
    }
    
    @Then("^verify that played on date is showing corectly in the single player games report$")
    public void verify_that_played_on_date_is_showing_corectly_in_the_single_player_games_report() throws Throwable {
    	objDetailedReportPage.verifyPlayedOnDateSingleLevelDetailedRport();
    }
    
    @Then("^verify that items per page count is showing correctly$")
    public void verify_that_items_per_page_count_is_showing_correctly() throws Throwable {
    	objDetailedReportPage.verifyItemsPerPageCount();
    }

    @Then("^options icon is appearing and working on detailed report$")
    public void options_icon_is_appearing_on_detailed_report() throws Throwable {
    	objDetailedReportPage.verifyAndClickOptionsIcon();
    }

    @Then("^download button is appearing under option on detailed report$")
    public void download_button_is_appearing_under_option_on_detailed_report(DataTable table) throws Throwable {
    	objDetailedReportPage.verifyDownloadButton(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @Then("^send by email button is appearing under option on detailed report$")
    public void send_by_email_button_is_appearing_under_option_on_detailed_report(DataTable table) throws Throwable {
    	objDetailedReportPage.verifySendByEmailButton(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

    }
    
    @And("^Manager clicks on send by email button$")
    public void manager_clicks_on_send_by_email_button() throws Throwable {
    	objDetailedReportPage.clickSendByEmailBtn();
    }
    
    @And("^Manager clicks on download button$")
    public void manager_clicks_on_download_button() throws Throwable {
    	objDetailedReportPage.clickDownlaodButton();
    }
    
    @Then("^success message is appearing after downloading report$")
    public void success_message_is_appearing_after_downloading_report(DataTable table) throws Throwable {
    	objDetailedReportPage.verifySuccessDownloadReport(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }
    
    @Then("^text is correct on blank screen$")
    public void text_is_correct_on_blank_screen(DataTable table) throws Throwable {
    	objDetailedReportPage.verifyTextBlankScreen(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @Then("^verify that total achieved trophy count is correct$")
    public void verify_that_total_achieved_trophy_count_is_correct(DataTable table) throws Throwable {
    	int trophyCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objDetailedReportPage.verifyTrophyAchievedCount(trophyCount);
    }
    
    @Then("^verify that trophy title and sub title is correct under achievement tab in detailed report$")
    public void verify_that_trophy_title_and_sub_title_is_correct_under_achievement_tab_in_detailed_report(DataTable table) throws Throwable {
        String title=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
        String subTitle=Pojo.getObjSeleniumFunctions().getTestData(1,1, table);
        objDetailedReportPage.verifyTrophyTitleSubTitle(title, subTitle);
    }
    
    @And("^Manager clicks on game to open question attempt report$")
    public void manager_clicks_on_game_to_open_question_attempt_report() throws Throwable {
    	objDetailedReportPage.clickGameSpGamesReport();
    }



    @Then("^verify that correct tick is appearing with the correct answered question and points and time is correct with the question$")
    public void verify_that_correct_tick_is_appearing_with_the_correct_answered_question_and_points_and_time_is_correct_with_the_question() throws Throwable {
    	objDetailedReportPage.verifyCorrectIncorrectTickQuestionTitle();
    }

   
    
    
}


