package com.testH.stepDefs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;

import com.testH.base.pages.admin.CreateContestPage;
import com.testH.base.pages.admin.GamePreviewPageAdmin;
import com.testH.base.pages.admin.ScheduleGamePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateContestSteps {
	private BaseTest objBaseTest;
	private CreateContestPage objCreateContestPage;
	
	JavascriptExecutor js = (JavascriptExecutor)Pojo.getDriver();	

	public CreateContestSteps()
	{
		objCreateContestPage= new CreateContestPage();
		objBaseTest=new BaseTest();
	}
		
	@And("^Manager clicks on Contests icon$")
	public void manager_clicks_on_Contests_icon() {
		
		objCreateContestPage.clickContestsIcon();   
	}
	@And("^Manager clicks on Create a contest option$")
	public void manager_clicks_on_Create_a_contest_option() {
		objCreateContestPage.clickCreateAContest();
	}
	@And("^Manager enters contest name$")
	public void manager_enters_contest_name() {
		
		objCreateContestPage.enterContestName();
	}
	@And("^Manager clicks on Create Button$")
	public void manager_clicks_on_Create_Button() {
	   
		objCreateContestPage.clickCreateContestButton();
	}
	@And("^Manager clicks on Contest Library option$")
	public void manager_clicks_on_Contest_Library_option() {
		
		objCreateContestPage.clickContestLibrary();    
	}
	@Then("^Verify state of created contest$")
	public void verify_state_of_created_contest(DataTable table) {
		
		List<List<String>> stateList=table.asLists();
		objCreateContestPage.verifyContestStatus(stateList.get(1).get(0));
		//objCreateContestPage.deleteContest();		
	}
	@And("^Manager adds game to the contest which is already created in the company$")
	public void add_Game_ToContest()
	{
		objCreateContestPage.addGameToContest();
	}
	@And("^Manager adds rules,rewards and players to the contest$")
	public void add_Rules_Rewards_Players()
	{
		objCreateContestPage.addRulesRewardsPlayers("Rules for test Automation","Personal Development","Book");
	}
	@And("^Manager clicks on schedule button$")
	public void click_on_ScheduleButton()
	{
		objCreateContestPage.clickOnScheduleButton();
	}
	@Then("^Verfiy confirmarion popup$")
	public void verify_ConfirmationPopUp()
	{
		objCreateContestPage.verifyConfirmationPopup();	
	}
	@Then("^Verify state of scheduled contest$")
	public void verify_state_of_scheduled_contest(DataTable table) {
		List<List<String>> stateList=table.asLists();
		objCreateContestPage.verifyContestStatus(stateList.get(1).get(0));
		//objCreateContestPage.deleteContest();	
	}
	@And("^Manager clicks on Add a filter button$")
	public void click_on_addFilter()
	{
		objCreateContestPage.click_ContestFilter();
		
	}
	@And("^Manager enters contest name in contest name filter$")
	public void enter_name_inContestFilter()
	{
		objCreateContestPage.enter_ContestName_inContestFilter();
	}
	@And("^Manager selects contest state from state filter$")
	public void select_contestStateFilter()
	{
		objCreateContestPage.select_contestState_inStateFilter();
	}
	@Then("^verify if correct contest is displayed on the page$")
	public void verify_contestIsDisplayed()
	{
		objCreateContestPage.verify_ContestOnContestLibrary_Page();

		//objCreateContestPage.deleteContest();
	}
	@Then("^Verify if contest is correct$")
	public void verify_correct_Contest()
	{
		objCreateContestPage.verify_ContestOnContestLibrary_Page();
	}
	@And("^Manager clicks on more option$")
	public void click_moreOption()
	{
		objCreateContestPage.moreContestOption();
	}
	@And("^Manager clicks on move to draft option$")
	public void click_moveToDraft()
	{
		objCreateContestPage.moveToDraftOption();
	}
	@And("^Manager clicks on yes button on confirmation popup$")
	public void click_yes_onConfirmationPopup()
	{
		objCreateContestPage.click_yesButtonOn_ConfirmationPopup();
	}
	@Then("^Verify if validation message is displayed about contest is moved to draft state$")
	public void verify_validationMessage_OnMoveToDraft()
	{
		objCreateContestPage.verify_confirmationMessageOn_Movetodraft();
	}
	@And("^Manager clicks on delete option$")
	public void click_deleteOption()
	{
		objCreateContestPage.deleteOption();
	}
	@Then("^Verify if validation message is displayed about contest deletion$")
	public void verify_validationMessage_OnContestDeletion()
	{
		objCreateContestPage.verify_confirmationMessageOn_contestDeletion();
	}		
	@And("^Manager clicks on delete game$")
	public void delete_GameFromContest()
	{
		objCreateContestPage.clickOn_DeleteGame_InContestIcon();
	}
	@Then("^Verify game deletion confirmation popup and manager clicks on yes button$")
	public void gameINContest_delete_ConformationPopup()
	{
		objCreateContestPage.deleteGame_FromContest_ConfirmationPopup();
	}
	@Then("^Verify if game is deleted from the contest$")
	public void gameISDeleted_FromContest()
	{
		objCreateContestPage.verify_gameIsDeletedFromContest();
	}
	@Then("^Verify if contest is displayed with correct name on web app$")
	public void verify_contestIsDisplayedOnWebapp()
	{
		objCreateContestPage.verify_contestIsDisplayed_OnWebApp();
	}
	@Then("^Verify if COMING SOON label is displayed for the contest$")
	public void verify_commingSoon_Label()
	{
		objCreateContestPage.verify_commingSoonlabel();
	}
	@Then("^Verify rules and reward category are displyed correctly$")
	public void verify_rulesRewardsOnWebapp()
	{
		objCreateContestPage.verify_RulesRewards_OnWebApp();
	}
	@Then("^Verify launch contest button is disabled$")
	public void verify_launchContestButton_OnWebapp()
	{
		objCreateContestPage.verify_launchContestButton();		
	}
	@And("^user clicks on launch button for the existing contest$")
	public void click_LaunchButtonForExistingContest(DataTable data)
	{
		List<List<String>> list=data.asLists();
		objCreateContestPage.click_launchButtonForExistingContest(list.get(1).get(0));
	}
	@Then("^verify if create button is disabled when contest name field is blank$")
	public void verify_createContestButtonIsDisabled()
	{
		objCreateContestPage.verify_createContestButton_Disabled();
	}
	@Then("^Verify the confirmation popup on schedule button when fields are blank$")
	public void verify_confirmationPopupOn_Schedule_BlankFields()
	{
		objCreateContestPage.verify_confirmationPopupOn_Schedule_BlankFields();
		
	}
	@And("^Manager clicks on Reward button$")
	public void click_onRewardButton()
	{
		objCreateContestPage.click_on_RewardButton();
	}
	@And("^Manager clicks on Reward Category dropdown$")
	public void click_onRewardCategory()
	{
		objCreateContestPage.click_on_RewardCategoryDropdown();
	}
	@Then("^Verify if all reward categories are displayed correctly in the category dropdown$")
	public void verify_rewardCategories()
	{
		objCreateContestPage.verify_rewardCategories();
		Pojo.getObjSeleniumFunctions().pageRefresh();		
	}
	@And("^Manager selects Reward Category from the dropdown$")
	public void verify_rewards(DataTable table)
	{
		List<List<String>> list_rewardCategory=table.asLists();
		list_rewardCategory.forEach(list ->{
			if(list_rewardCategory.get(0) !=list)
			objCreateContestPage.selectAndVerifyRewardCategoryFromDropdown(list.get(0));
		});
		Pojo.getObjSeleniumFunctions().pageRefresh();
	}
	@Then("^Verify if contest rewards are displayed in the dropdown as per selected reward category$")
	public void verify_Category()
	{
	}
	@Then("^Verify new label is displayed for the contest$")
	public void live_contestLabel()
	{
		objCreateContestPage.verify_Contest_NewLabel();
	}
	@Then("^Verify if launch contest button is enabled for the contest$")
	public void verify_launchContestButtonOnWebApp()
	{
		objCreateContestPage.verify_launchContestButtonforLiveContest();
	}
	@And("^user clicks on launch contest button$")
	public void click_launchContestButton()
	{
		objCreateContestPage.click_launchContestButton();

		//objCreateContestPage.deleteContest();
	}
	
	@And("^User wait for banner image to be load$")
    public void user_wait_for_banner_image_to_be_load() throws Throwable {
		objCreateContestPage.waitForBannerImageToLoad();   }

	
//	@And("^Manager clicks on more option$")
//	public void click_moreOption()
//	{
//		objCreateContestPage.moreContestOption();
//	}
//	@And("^Manager clicks on move to draft option$")
//	public void click_moveToDraft()
//	{
//		objCreateContestPage.moveToDraftOption();
//	}
//	@And("^Manager clicks on yes button on confirmation popup$")
//	public void click_yes_onConfirmationPopup()
//	{
//		objCreateContestPage.click_yesButtonOn_ConfirmationPopup();
//	}
//	@Then("^Verify if validation message is displayed about contest is moved to draft state$")
//	public void verify_validationMessage_OnMoveToDraft()
//	{
//		objCreateContestPage.verify_confirmationMessageOn_Movetodraft();
//	}
//	@And("^Manager clicks on delete option$")
//	public void click_deleteOption()
//	{
//		objCreateContestPage.deleteOption();
//	}
//	@Then("^Verify if validation message is displayed about contest deletion$")
//	public void verify_validationMessage_OnContestDeletion()
//	{
//		objCreateContestPage.verify_confirmationMessageOn_contestDeletion();
//	}		
//	@And("^Manager clicks on delete game$")
//	public void delete_GameFromContest()
//	{
//		objCreateContestPage.clickOn_DeleteGame_InContestIcon();
//	}
//	@Then("^Verify game deletion confirmation popup and manager clicks on yes button$")
//	public void gameINContest_delete_ConformationPopup()
//	{
//		objCreateContestPage.deleteGame_FromContest_ConfirmationPopup();
//	}
//	@Then("^Verify if game is deleted from the contest$")
//	public void gameISDeleted_FromContest()
//	{
//		objCreateContestPage.verify_gameIsDeletedFromContest();
//	}
//	@Then("^Verify if contest is displayed with correct name on web app$")
//	public void verify_contestIsDisplayedOnWebapp()
//	{
//		objCreateContestPage.verify_contestIsDisplayed_OnWebApp();
//	}
//	@Then("^Verify if COMING SOON label is displyed for the contest$")
//	public void verify_commingSoon_Label()
//	{
//		objCreateContestPage.verify_commingSoonlabel();
//	}
//	@Then("^Verify rules and reward category are displyed correctly$")
//	public void verify_rulesRewardsOnWebapp()
//	{
//		objCreateContestPage.verify_RulesRewards_OnWebApp();
//	}
//	@Then("^Verify launch contest button is disabled$")
//	public void verify_launchContestButton_OnWebapp()
//	{
//		objCreateContestPage.verify_launchContestButton();		
//	}
//	@And("^user clicks on launch button for the existing contest$")
//	public void click_LaunchButtonForExistingContest(DataTable data)
//	{
//		List<List<String>> list=data.asLists();
//		objCreateContestPage.click_launchButtonForExistingContest(list.get(1).get(0));
//	}
//	@Then("^verify if create button is disabled when contest name field is blank$")
//	public void verify_createContestButtonIsDisabled()
//	{
//		objCreateContestPage.verify_createContestButton_Disabled();
//	}
//	@Then("^Verify the confirmation popup on schedule button when fields are blank$")
//	public void verify_confirmationPopupOn_Schedule_BlankFields()
//	{
//		objCreateContestPage.verify_confirmationPopupOn_Schedule_BlankFields();
//		
//	}
//	@And("^Manager clicks on Reward button$")
//	public void click_onRewardButton()
//	{
//		objCreateContestPage.click_on_RewardButton();
//	}
//	@And("^Manager clicks on Reward Category dropdown$")
//	public void click_onRewardCategory()
//	{
//		objCreateContestPage.click_on_RewardCategoryDropdown();
//	}
//	@Then("^Verify if all reward categories are displayed correctly in the category dropdown$")
//	public void verify_rewardCategories()
//	{
//		objCreateContestPage.verify_rewardCategories();
//		Pojo.getObjSeleniumFunctions().pageRefresh();		
//	}
//	@And("^Manager selects Reward Category from the dropdown$")
//	public void verify_rewards(DataTable table)
//	{
//		List<List<String>> list_rewardCategory=table.asLists();
//		list_rewardCategory.forEach(list ->{
//			if(list_rewardCategory.get(0) !=list)
//			objCreateContestPage.selectAndVerifyRewardCategoryFromDropdown(list.get(0));
//		});
//		Pojo.getObjSeleniumFunctions().pageRefresh();
//	}
//	@Then("^Verify if contest rewards are displayed in the dropdown as per selected reward category$")
//	public void verify_Category()
//	{
//	}
//	@Then("^Verify new label is displayed for the contest$")
//	public void live_contestLabel()
//	{
//		objCreateContestPage.verify_Contest_NewLabel();
//	}
//	@Then("^Verify if launch contest button is enabled for the contest$")
//	public void verify_launchContestButtonOnWebApp()
//	{
//		objCreateContestPage.verify_launchContestButtonforLiveContest();
//	}
//	@And("^user clicks on launch contest button$")
//	public void click_launchContestButton()
//	{
//		objCreateContestPage.click_launchContestButton();
//	}
//	@And("^user clicks on games tab$")
//	public void click_GamesTab()
//	{
//		objCreateContestPage.click_GamesTab();
//	}
//	@Then("^verify game which is added in the contest is displayed in games tab$")
//	public void verify_GamesDisplayed()
//	{
//		objCreateContestPage.verify_gameIsDisplayedUnderLiveContest();
//	}
//	@Then("^Verify message displayed on contest leaderboard$")
//	public void verify_LB_Message()
//	{
//		objCreateContestPage.verify_messageOnLB_forFirstTime();
//	}
//	@And("^User checks the score on global leaderboard screen$")
//	public void score_onGlobalLB(DataTable table)
//	{
//		List<List<String>> score_globalLB= table.asLists();
//		objCreateContestPage.scoreOnGlobalLB(score_globalLB.get(1).get(0));
//	}
//	@And("^user clicks on Games tab in player app$")
//	public void click_gamesTab()
//	{
//		objCreateContestPage.click_gamesTabPlayerApp();
//	}
//	@And("^Check the score on contest LB$")
//	public void scoreOnContestLb_beforeGamePlay(DataTable table)
//	{
//		List<List<String>> existingPlayername=table.asLists();
//		objCreateContestPage.scoreOnContestLB(existingPlayername.get(1).get(0));
//	}
//	@And("^user clicks on game$")
//	public void clickOn_Game(DataTable table)
//	{
//		List<List<String>> liveGame=table.asLists();
//		objCreateContestPage.clickon_game(liveGame.get(1).get(0));
//	}
//	@And("^user closes all the tropies achieved$")
//	public void close_Trophies()
//	{
//		for(int i=1;i<=3;i++)
//		{
//		objCreateContestPage.close_trophies();
//		}
//	}
//	@And("^User clicks on home button and checks the score$")
//	public void clickOn_home()
//	{
//		objCreateContestPage.clickon_homeButton_scoreOn_gameOverScreen();
//	}
//	@And("^User clicks on back button on contest page$")
//	public void click_BackContest()
//	{
//		objCreateContestPage.click_contestBack();
//	}
//	@Then("^Verify score on contest LB after game play$")
//	public void scoreOnContestLb_afterGamePlay()
//	{
//		objCreateContestPage.verify_scoreOnContestLB();
//	}
//	@Then("^Verify score on global LB after game play$")
//	public void scoreOnGlobalLb_afterGamePlay()
//	{
//		objCreateContestPage.verify_scoreOnGlobalLB();
//	}
//	@Then("^Verify player name on contest LB$")
//	public void verify_PlayerName()
//	{
//		objCreateContestPage.playerNameOnContestLB();
//	}
//	@And("^User clicks on name on contest LB$")
//	public void clickOnPlayerOnContestLB()
//	{
//		objCreateContestPage.clickPlayerOnContestLB();
//	}
//	@Then("^Verify if player's profile page is opening$")
//	public void playerProfilePage()
//	{
//		objCreateContestPage.playerProfilePage();
//	}
//	@Then("^Verify if score on contest LB is same as player's profile$")
//	public void playerScoreContestLBAndPlayerProfile()
//	{
//		objCreateContestPage.playerScoreContestLBAndPlayerProfile();
//	}
//	@And("^Refresh the page till created contest is visible$")
//	public void refreshPageTillContestVisibility()
//	{
//		objCreateContestPage.refreshPageTillContestVisibilty();
//	}
//	@And("^User closes tropies achieved for 1st game$")
//	public void close_1stGameTrophies()
//	{
//		for(int i=1;i<=2;i++)
//		{
//		objCreateContestPage.close_trophies();
//		}
//	}	
//	@And("^User clicks on more option$")
//	public void clicks_more()
//	{
//		objCreateContestPage.moreOption();
//	}
//	@Then("^Verify ranking of the players on contest LB$")
//	public void verify_playersRank()
//	{
//		objCreateContestPage.verify_playersRankOnContestLB();
//	}
//	@Then("^Verify if game is grayed out$")
//	public void verify_grayedOutGame()
//	{
//		objCreateContestPage.verify_grayedOutGames();
//	}
//	@And("^Manager clicks on more option for live contest$")
//	public void moreOption_livecontest()
//	{
//		objCreateContestPage.moreLiveContestOption();
//	}
//	@And("^Manager clicks on stop the contest option$")
//	public void stopContestOption()
//	{
//		objCreateContestPage.stopContest();
//	}
//	@And("^Manager clicks on end now button$")
//	public void endContestNowOption()
//	{
//		objCreateContestPage.endContestNowOption();
//	}
//	@Then("^verify admin gets contest ended validation message$")
//	public void contestEndValidationMessage()
//	{
//		objCreateContestPage.verify_contestEndValidation();
//	}
//	@Then("^verify ended contest status$")
//	public void endedContestStatus()
//	{
//		objCreateContestPage.verify_endedContestStatus();
//	}
	
	@And("^user clicks on games tab$")
	public void click_GamesTab()
	{
		objCreateContestPage.click_GamesTab();
	}
	@Then("^verify game which is added in the contest is displayed in games tab$")
	public void verify_GamesDisplayed()
	{
		objCreateContestPage.verify_gameIsDisplayedUnderLiveContest();
	}
	@Then("^Verify message displayed on contest leaderboard$")
	public void verify_LB_Message()
	{
		objCreateContestPage.verify_messageOnLB_forFirstTime();
	}
	@And("^User checks the score on global leaderboard screen$")
	public void score_onGlobalLB(DataTable table)
	{
		List<List<String>> score_globalLB= table.asLists();
		objCreateContestPage.scoreOnGlobalLB(score_globalLB.get(1).get(0));
	}
	@And("^user clicks on Games tab in player app$")
	public void click_gamesTab()
	{
		objCreateContestPage.click_gamesTabPlayerApp();
	}
	@And("^Check the score on contest LB$")
	public void scoreOnContestLb_beforeGamePlay(DataTable table)
	{
		List<List<String>> existingPlayername=table.asLists();
		objCreateContestPage.scoreOnContestLB(existingPlayername.get(1).get(0));
	}
	@And("^user clicks on game$")
	public void clickOn_Game(DataTable table)
	{
		List<List<String>> liveGame=table.asLists();
		objCreateContestPage.clickon_game(liveGame.get(1).get(0));
	}
	@And("^user closes all the tropies achieved$")
	public void close_Trophies()
	{
		for(int i=1;i<=3;i++)
		{
		objCreateContestPage.close_trophies();
		}
	}
	@And("^User clicks on home button and checks the score$")
	public void clickOn_home()
	{
		objCreateContestPage.clickon_homeButton_scoreOn_gameOverScreen();
	}
	@And("^User clicks on back button on contest page$")
	public void click_BackContest()
	{
		objCreateContestPage.click_contestBack();
	}
	@Then("^Verify score on contest LB after game play$")
	public void scoreOnContestLb_afterGamePlay()
	{
		objCreateContestPage.verify_scoreOnContestLB();
	}
	@Then("^Verify score on global LB after game play$")
	public void scoreOnGlobalLb_afterGamePlay()
	{
		objCreateContestPage.verify_scoreOnGlobalLB();
	}
	@Then("^Verify player name on contest LB$")
	public void verify_PlayerName()
	{
		objCreateContestPage.playerNameOnContestLB();
	}
	@And("^User clicks on name on contest LB$")
	public void clickOnPlayerOnContestLB()
	{
		objCreateContestPage.clickPlayerOnContestLB();
	}
	@Then("^Verify if player's profile page is opening$")
	public void playerProfilePage()
	{
		objCreateContestPage.playerProfilePage();
	}
	@Then("^Verify if score on contest LB is same as player's profile$")
	public void playerScoreContestLBAndPlayerProfile()
	{
		objCreateContestPage.playerScoreContestLBAndPlayerProfile();
	}
	@And("^Refresh the page till created contest is visible$")
	public void refreshPageTillContestVisibility()
	{
		objCreateContestPage.refreshPageTillContestVisibilty();
	}
	@And("^User closes tropies achieved for 1st game$")
	public void close_1stGameTrophies()
	{
		for(int i=1;i<=2;i++)
		{
		objCreateContestPage.close_trophies();
		}
	}	
	@And("^User clicks on more option$")
	public void clicks_more()
	{
		objCreateContestPage.moreOption();
	}
	@Then("^Verify ranking of the players on contest LB$")
	public void verify_playersRank()
	{
		objCreateContestPage.verify_playersRankOnContestLB();
	}
	@Then("^Verify if game is grayed out$")
	public void verify_grayedOutGame()
	{
		objCreateContestPage.verify_grayedOutGames();
	}
	@And("^Manager clicks on more option for live contest$")
	public void moreOption_livecontest()
	{
		objCreateContestPage.moreLiveContestOption();
	}
	@And("^Manager clicks on stop the contest option$")
	public void stopContestOption()
	{
		objCreateContestPage.stopContest();
	}
	@And("^Manager clicks on end now button$")
	public void endContestNowOption()
	{
		objCreateContestPage.endContestNowOption();
	}
	@Then("^verify admin gets contest ended validation message$")
	public void contestEndValidationMessage()
	{
		objCreateContestPage.verify_contestEndValidation();
	}
	@Then("^verify ended contest status$")
	public void endedContestStatus()
	{
		objCreateContestPage.verify_endedContestStatus();
	}
	
	@Then("^Manager opens new tab$")
	public void manager_opens_new_tab() throws Throwable
	{    
		objBaseTest.initializEnvironmentIncognito();
	}
	@And("^User clicks on the leaderboard of ended contest$")
	public void clickonEndedContest()
	{    
		objCreateContestPage.clickonLBOfEndedContest();
	}
	@Then("^Verify if player gets YOU WON trophy with correct details$")
	public void youWonTrophy()
	{    
		objCreateContestPage.youWonTrophy();
	}
	@And("^Verify player gets contest reward trophy$")
	public void rewardTrophy()
	{    
		objCreateContestPage.rewardTrophy();
	}
	
	
	
	
	
	

	
	@And("^Manager is logged In to new browser$")
	public void login(DataTable table)throws Throwable
	{
			    List<List<String>> data=table.asLists();
		    	String userName=data.get(1).get(0);
		    	String password=data.get(1).get(1);
		    	Pojo.getObjSeleniumFunctions().setText(By.xpath("//input[@name='useremail']"), userName);
		    	Pojo.getObjSeleniumFunctions().click(By.xpath("//img[@class='logo']"));
		    	By loc_next=By.xpath("//button[contains(@class,'submit')]");
		    	//Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_next);
		    	//Pojo.getObjSeleniumFunctions().checkElementInVisibile(loc_next);
		    	Pojo.getObjSeleniumFunctions().checkElementPresence(loc_next);
		    	js.executeScript("arguments[0].click();",loc_next);	
		    	//Pojo.getObjSeleniumFunctions().clickUsingActionClass(By.xpath("//input[@name='userpassword']"));
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys(Keys.CONTROL);
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys("p");
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys(Keys.CONTROL);
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys("a");
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys(Keys.CONTROL);
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys("s");
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys(Keys.CONTROL);
		    	Pojo.getDriver().findElement(By.xpath("//input[@name='userpassword']")).sendKeys("s");
		    	//boolean value=Pojo.getObjSeleniumFunctions().checkElementEnabled(By.xpath("//button[contains(@class,'submit')]"));
		    	//System.out.println(value);
		    	//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(By.xpath("//button[contains(@class,'submit')]"));
		    	js.executeScript("arguments[0].click();",Pojo.getDriver().findElement(By.xpath("//button[contains(@class,'submit')]")));    
	}	
	
	
}

