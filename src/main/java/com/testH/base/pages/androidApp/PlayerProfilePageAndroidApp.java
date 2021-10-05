package com.testH.base.pages.androidApp;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.PlayerProfilePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class PlayerProfilePageAndroidApp extends PlayerProfilePage {
	
	By loc_trophyHeader=MobileBy.xpath("//android.widget.TextView[@text='TROPHY ACHIEVED']");
	By loc_trophyName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/gameName\")");
	By loc_trophyTotalPoints=MobileBy.xpath("//android.widget.TextView[contains(@text,'Total Points')]");
	By loc_trophyAttempts=MobileBy.xpath("//android.widget.TextView[contains(@text,'Attempt')]");
	By loc_trophyHighScore=MobileBy.xpath("//android.widget.TextView[contains(@text,'High Score')]");
	
	By loc_btnProfile=MobileBy.xpath("//android.widget.HorizontalScrollView[@resource-id='com.ionicframework.SaleshuddleApp:id/leaderboard_activity_tab_layout']//child::android.widget.LinearLayout/child::*[2]");
	By loc_titleProfileScreen=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_tabTextAchievement=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profileAchievementTab\")");
	By loc_tabTextStatistics=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profileStatisticTab\")");
	By loc_departmentName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/userDesignation\")");
	By loc_locationName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/userAddress\")");
	By loc_activeSinceDate=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/userActivationDate\")");
	By loc_playerRating=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/txtRating\")");
	By loc_statusText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/userStatus\")");
	By loc_playerNameText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/userName\")");
	By loc_btnViewDownloadScoreCard=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/view_download__certificate_txt\")");
	By loc_textScorecardPopUp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog_fragment_level_achieved_tv\")");
	By loc_textWhatNext=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_what_next_tv\")");
	By loc_textDownload=MobileBy.xpath("//android.widget.TextView[@text='1. Download']");
	By loc_textScoreCard=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_scorecard_tv\")");

	By loc_textShareSocialIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_download_share_tv\")");
	By loc_linkedInIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_linked_in_icon_iv\")");
	By loc_fbIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_fb_icon_iv\")");
	By loc_twitterIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_twitter_icon_iv\")");
	By loc_instaIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_inst_icon_iv\")");
	By loc_btnDownload=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profile_preview_download_tv\")");
	By loc_successMessageDownload=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
	//By loc_btnClose=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
	By loc_levelImage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_achievement_badge_iv\")");
	By loc_btnLevelShare=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/shareIcon\")");
	By loc_textMyLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_level_tv\")");
	By loc_imgLevelName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_level_shutter_image\")");
	
	By loc_gameCountRookie=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_rookie_value_tv\")");
	By loc_gameCountStarter=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_started_value_tv\")");
	By loc_gameCountProfessional=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_pro_valiue_tv\")");
	By loc_gameCountAllStar=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_star_value_tv\")");
	By loc_gameCountMaster=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_master_value_tv\")");
	By loc_textMyAccomplishment=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/myAccomplishment\")");
	By loc_textTrophies=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/trophyName\")");
	By loc_textContest=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/contestName\")");
	By loc_textRewards=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rewardName\")");
	//By loc_textMultilevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
	By loc_trophyCountBubble=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/trophyCount\")");
	By loc_contestCountBubble=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/contestCount\")");
	By loc_rewardCountBubble=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rewardCount\")");
//	By loc_multilevelCountBubble=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
    By loc_iconTrophies=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/trophiesLogo\")");
	By loc_trophiesTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_iconContest=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/contestsLogo\")");
	By loc_contestTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_iconRewards=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rewardLogo\")");
	By loc_rewardsTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	
//	By loc_iconMultilevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
//	By loc_multilevelTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
	By loc_iconBackBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_left_logo_iv\")");
	By loc_unlockedTrophyCount=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/txtTotalPoints\")");
	By loc_textTrophyAchieved=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_tv\")");
//    By loc_closePopupBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
   // By loc_singleLevelGameTrophy=MobileBy.xpath("//android.widget.TextView[@text='SINGLE LEVEL GAMES']");
	By loc_singleLevelGameTrophy=MobileBy.xpath("//android.widget.TextView[@text='SINGLE LEVEL GAMES']//following-sibling::androidx.recyclerview.widget.RecyclerView//child::android.widget.ImageView");
    By loc_totalPointsStatisticsTab=MobileBy.xpath("//android.widget.TextView[@text='TOTAL POINTS']");
    By loc_tabLifeTime=MobileBy.xpath("//android.widget.TextView[@text='LIFETIME']");
    By loc_tabThisYear=MobileBy.xpath("//android.widget.TextView[@text='THIS YEAR']");
    By loc_tabThisMonth=MobileBy.xpath("//android.widget.TextView[@text='THIS MONTH']");
    By loc_tabLastMonth=MobileBy.xpath("//android.widget.TextView[@text='LAST MONTH']");
    By loc_totalPointsStatis=MobileBy.xpath("//android.widget.TextView[@text='TOTAL POINTS']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_totalGamesStatis=MobileBy.xpath("//android.widget.TextView[@text='GAMES']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_totalTrophiesStatis=MobileBy.xpath("//android.widget.TextView[@text='TROPHIES']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_perfectGamesStatis=MobileBy.xpath("//android.widget.TextView[@text='PERFECT GAMES']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_contestWonStatis=MobileBy.xpath("//android.widget.TextView[@text='CONTESTS WON']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_timePlayedStatis=MobileBy.xpath("//android.widget.TextView[@text='TIME PLAYED']/parent::android.view.ViewGroup/child::android.widget.TextView[1]");
    By loc_textCurrentTab=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profileAchievementTab\")");
    By loc_textLifeTimeTab=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/profileStatisticTab\")");
    By loc_textPlayerLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_section_level_tv\")");
    By loc_containerWeeklyStreak=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/week_streak_container\")");
    By loc_datesWeeklyStreakCal=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/calendarDayText\")");
	By loc_totalRows=MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/wk_day_title']/parent::android.view.ViewGroup/following-sibling::android.widget.LinearLayout");
	By loc_leftArrow=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/leftArrow\")");
	By loc_rightArrow=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rightArrow\")");
    By loc_calMonth=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/calendarHeaderText\")");
    By loc_StreakCountTextHeader=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/week_streak\")");

    
	@Override
	public void clickProfileBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnProfile, 20);
		Pojo.getObjSeleniumFunctions().waitFor(1);

	//	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnProfile);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that profile button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnProfile));		
	}

	@Override
	public void verifyProfileScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleProfileScreen,15);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that profile screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleProfileScreen).trim().equals("Profile"));		
	}

	@Override
	public void verifyAchievementAndStatisticsTab() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_tabTextAchievement, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Achievement text is correct", Pojo.getObjSeleniumFunctions().getText(loc_tabTextAchievement).trim().equals("ACHIEVEMENTS"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Statistics text is correct", Pojo.getObjSeleniumFunctions().getText(loc_tabTextStatistics).trim().equals("STATISTICS"));		
	}

	@Override
	public void verifyDepartment() {
		String deptName=Pojo.getObjSeleniumFunctions().getText(loc_departmentName).trim();
		deptName=deptName.substring(11).trim();
		System.out.println("Actual Dept Name "+deptName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept name is correct ", deptName.equals(AllUsersPage.expectedDataUser.get("Department")));
		
	}

	@Override
	public void verifyLocation() {
		String locName=Pojo.getObjSeleniumFunctions().getText(loc_locationName).trim();
		locName=locName.substring(9).trim();
		System.out.println("Actual Location Name "+locName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Location name is correct ", locName.equals(AllUsersPage.expectedDataUser.get("Location")));
		
	}

	@Override
	public void verifyActiveSince() {
		  HashMap<Integer, String> month = new HashMap<Integer, String>();
		    month.put(1, "January");
		    month.put(2, "February");
		    month.put(3, "March");
		    month.put(4, "April");
		    month.put(5, "May");
		    month.put(6, "June");
		    month.put(7, "July");
		    month.put(8, "August");
		    month.put(9, "September");
		    month.put(10, "October");
		    month.put(11, "November");
		    month.put(12, "December");
		    
			
		    String currentDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");

			String dateSplit[]=currentDate.split("/");
			String sYear=dateSplit[2];
			String sDate=dateSplit[1];
			String sMonth=dateSplit[0];
			
			int intYear=Integer.parseInt(sYear);
			int intDate=Integer.parseInt(sDate);
			int intMonth=Integer.parseInt(sMonth);
			
			String monthName=month.get(intMonth);
			
			String actualDate=Pojo.getObjSeleniumFunctions().getText(loc_activeSinceDate).trim();
			actualDate=actualDate.substring(14).trim();
			String expectedDate= monthName+" "+intYear;
		    System.out.println("Current Date "+expectedDate);	
		    System.out.println("Actual Date "+actualDate);

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that active since date is correct", actualDate.equals(expectedDate));

			
			
	}

	
	@Override
	public void verifyStatus() {
		
		String status=Pojo.getObjSeleniumFunctions().getText(loc_statusText).trim();
		status=status.substring(8).trim();
		System.out.println(" Actual Status "+status);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that status is correct",status.equals("Hey! I am crushing it with 1Huddle 😎"));		
	}

	@Override
	public void verifyPlayerName() {
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		String playerFullName=playerFirstName+" "+playerLastName;
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerNameText, 15);
        Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is correct", Pojo.getObjSeleniumFunctions().getText(loc_playerNameText).trim().equals(playerFullName));		
	}

	@Override
	public void verifyRating(double rating) {

		DecimalFormat df = new DecimalFormat("#.#");
		rating=Double.parseDouble(df.format(rating));
		
		String playerRating=Pojo.getObjSeleniumFunctions().getText(loc_playerRating).trim();
	    double ftPlayerRating=Double.parseDouble(playerRating);
	    System.out.println("Expected Rating "+ftPlayerRating);
       
        
	    String numberD = String.valueOf(rating);
        numberD = numberD.substring (numberD.indexOf ("." )+1);
       // double dblNumDecimal=Double.parseDouble(numberD);
        int intNum=Integer.parseInt(numberD);
        
        if(intNum>5)
        {
        	 df = new DecimalFormat("#.#");
             df.setRoundingMode(RoundingMode.CEILING);
             rating=Double.parseDouble(df.format(rating));
             System.out.println("Rating greter than 5 decimal "+rating);
        }
        else
        {
       	 df = new DecimalFormat("#.#");
         rating=Double.parseDouble(df.format(rating));
         System.out.println("Rating less than 5 decimal "+rating);
        }
       Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rating is calculating correctly if player play only SP game",ftPlayerRating==rating);		
	}

	@Override
	public void verifyAndClickViewDownloadScoreCard() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnViewDownloadScoreCard, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that View/Download scorecard button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnViewDownloadScoreCard));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that View/Download scorecard button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnViewDownloadScoreCard));		
	}

	@Override
	public void verifyScoreCardPopup() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textScorecardPopUp, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text scorecard popup is opening", Pojo.getObjSeleniumFunctions().getText(loc_textScorecardPopUp).trim().equals("SCORECARD"));		
	}

	@Override
	public void verifyWhatNextText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textWhatNext, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that what next text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textWhatNext).trim().equals("What Next?"));		
	}

	@Override
	public void verifyDownloadScoreCardText() {
		String textDownload=Pojo.getObjSeleniumFunctions().getText(loc_textDownload).trim();
		textDownload=textDownload.trim();
		String textScoreCard=Pojo.getObjSeleniumFunctions().getText(loc_textScoreCard).trim();
		String textDownloadScoreCard=textDownload+" "+textScoreCard;
		System.out.println("Download Scorecard Text "+textDownloadScoreCard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download scorecard text is appearing", textDownloadScoreCard.equals("1. Download Scorecard"));		
	}

	@Override
	public void verifyShareOnSocialResumeText() {
		String textShareSocial=Pojo.getObjSeleniumFunctions().getText(loc_textShareSocialIcon).trim();
		//	textShareSocial=textShareSocial.replaceAll("[0-9][.]", "").trim();
			System.out.println("Social Text "+textShareSocial);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share on social text is appearing", textShareSocial.equals("2. Share on social/resume"));		
	}

	@Override
	public void verifySocialIcons() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that linkedin icon is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_linkedInIcon));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that fb icon is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_fbIcon));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that twitter icon is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_twitterIcon));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that insta icon is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_instaIcon));		
	}

	@Override
	public void verifyDownloadButtonScorecard() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnDownload, 10);
		String btnText=Pojo.getObjSeleniumFunctions().getText(loc_btnDownload).trim();
		//btnText=btnText.replaceAll("[^A-Z]", "");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that download button is appearing on scorecard", btnText.equals("DOWNLOAD"));		
	}

	@Override
	public void verifySuccessDownloadScorecard() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnDownload));
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that success is appearing", Pojo.getObjSeleniumFunctions().getText(loc_successMessageDownload).trim().equals("Downloading Scorecard"));
		Pojo.getObjSeleniumFunctions().navigateToBack();
	}

	@Override
	public void verifyAndClickCloseBtn() {
	//	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that back button is clicking", Pojo.getObjSeleniumFunctions().navigateToBack());		
	}

	@Override
	public void verifyLevelImage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level image is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_levelImage));
		
	}

	@Override
	public void verifyAndClickLevelShareIcon() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLevelShare, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share level button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnLevelShare));

		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that level share icon is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnLevelShare));		
	}

	@Override
	public void verifyMyLevelText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textMyLevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that my level text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textMyLevel).trim().equals("My Level"));		
	}

	@Override
	public void verifyLevelNameImage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_imgLevelName, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level name image is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_imgLevelName));		
	}

	@Override
	public void verifyRookieAchieved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGameCountBeforePlaying(int gameRequiredForRookie, int gameRequiredForStarter,
			int gameRequiredForProfessional, int gameRequiredForAllStar, int gameRequiredForMaster) {
		// TODO Auto-generated method stub
		
	}

	

	

	@Override
	public void verifyGameCountRookie(int totalGamePlayCount, int gameRequiredForRookie) {
		int expectedGameCount=gameRequiredForRookie-totalGamePlayCount;
		
		if(expectedGameCount<=0)
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameCountRookie, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameCountRookie).trim().equals("Achieved"));
		}
		else
		{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameCountRookie, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for rookie",Pojo.getObjSeleniumFunctions().getText(loc_gameCountRookie).trim().equals(expectedGameCount+" "+"Game to go"));
		}		
	}

	@Override
	public void verifyGameCountStarter(int totalGamePlayCount, int gameRequiredForStarter) {
		 int expectedGameCount=gameRequiredForStarter-totalGamePlayCount;
			
			if(expectedGameCount<=0)
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameCountStarter).trim().equals("Achieved"));
			}
			else
			{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for Starter",Pojo.getObjSeleniumFunctions().getText(loc_gameCountStarter).trim().equals(expectedGameCount+" "+"Games to go"));
			}		
		
	}

	@Override
	public void verifyGameCountProfessional(int totalGamePlayCount, int gameRequiredForProfessional) {
		int expectedGameCount=gameRequiredForProfessional-totalGamePlayCount;
		
		if(expectedGameCount<=0)
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameCountProfessional).trim().equals("Achieved"));
		}
		else
		{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for professional",Pojo.getObjSeleniumFunctions().getText(loc_gameCountProfessional).trim().equals(expectedGameCount+" "+"Games to go"));
		}
		
	}

	@Override
	public void verifyGameCountAllStar(int totalGamePlayCount, int gameRequiredForAllStar) {
		 int expectedGameCount=gameRequiredForAllStar-totalGamePlayCount;
			
			if(expectedGameCount<=0)
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameCountAllStar).trim().equals("Achieved"));
			}
			else
			{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for all star",Pojo.getObjSeleniumFunctions().getText(loc_gameCountAllStar).trim().equals(expectedGameCount+" "+"Games to go"));
			}		
	}

	@Override
	public void verifyGameCountMaster(int totalGamePlayCount, String gameRequiredForMaster) {
		String tempStr= gameRequiredForMaster.replaceAll("[^0-9]", "").trim();
		
		
		int intGameRequiredMaster=Integer.parseInt(tempStr);
        int expectedGameCount=intGameRequiredMaster-totalGamePlayCount;
		
		if(expectedGameCount==0)
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameCountMaster).trim().equals("Achieved"));
		}
		else if(expectedGameCount>999)
		{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for master before playing ",Pojo.getObjSeleniumFunctions().getText(loc_gameCountMaster).trim().equals(gameRequiredForMaster+" "+"Games to go"));
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for master after playing ",Pojo.getObjSeleniumFunctions().getText(loc_gameCountMaster).trim().equals(expectedGameCount+" "+"Games to go"));

		}		
	}

	@Override
	public void verifyMyAccomplishment() {
		Pojo.getObjSeleniumFunctions().androidScroll("Trophies");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textMyAccomplishment, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Accomplishments text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textMyAccomplishment).trim().equals("My Accomplishments"));		
	}

	@Override
	public void verifyTrophiesField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textTrophies, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Trophies text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textTrophies).trim().equals("Trophies"));		
	}

	@Override
	public void verifyContestField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textContest, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that contest text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textContest).trim().equals("Contests"));		
	}

	@Override
	public void verifyRewardsField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textRewards, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that reward text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textRewards).trim().equals("Rewards"));		
	}

	@Override
	public void verifyMultilevelField() {
		// Not on android app
	//	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textMultilevel, 10);
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that multilevel text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textMultilevel).trim().equals("Multilevel"));		
	}

	@Override
	public void verifyTrophyCountBubble(int expectedCount) {
		Pojo.getObjSeleniumFunctions().androidScroll("Trophies");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy count is correct", Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_trophyCountBubble).trim().replaceAll("[^0-9]", ""))==expectedCount);
		
	}

	@Override
	public void clickTrophies() {
		Pojo.getObjSeleniumFunctions().androidScroll("Trophies");
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconTrophies);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that trophies button is clicking",Pojo.getObjSeleniumFunctions().tap(loc_iconTrophies));		
	}

	@Override
	public void verifyTrophiesScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophiesTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_trophiesTitle).trim().equals("TROPHIES"));	//Need to discuss with design and log bug for entire text is not capital	
	}

	@Override
	public void clickContests() {
		Pojo.getObjSeleniumFunctions().androidScroll("Trophies");
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconContest);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that contest button is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconContest));		
	}

	@Override
	public void verifyContestsScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contestTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that contest screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_contestTitle).trim().equals("CONTEST"));	//Need to discuss with design and log bug for entire text is not capital	
	}

	@Override
	public void clickRewards() {
		Pojo.getObjSeleniumFunctions().androidScroll("Trophies");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_iconRewards, 10);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that rewards button is clicking",Pojo.getObjSeleniumFunctions().tap(loc_iconRewards));		
	}

	@Override
	public void verifyRewardsScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rewardsTitle, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that reward screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_rewardsTitle).trim().equals("Rewards"));	//Need to discuss with design and log bug for entire text is not capital	
	}

	@Override
	public void clickMultilevel() {
		//This is removed now
	//	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconMultilevel);
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that Multilevel button is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconMultilevel));		
	}

	@Override
	public void verifyMultilevelScreen() {
		//This is removed now
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_multilevelTitle, 10);

		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that multilevel screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_multilevelTitle).trim().equals("MULTILEVEL"));		
	}

	@Override
	public void verifyAndClickBackButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_iconBackBtn, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconBackBtn));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconBackBtn));		
	}

	@Override
	public void verifyFieldName(String expectedName) {
		By loc_fieldName=MobileBy.xpath("//android.widget.TextView[@text='"+expectedName+"']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_fieldName, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that field name is correct", Pojo.getObjSeleniumFunctions().getText(loc_fieldName).trim().equals(expectedName));		
	}

	@Override
	public void verifyTrophyCount(int expectedTrophyCount) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_unlockedTrophyCount, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that trophy count is correct",Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_unlockedTrophyCount).trim())==expectedTrophyCount);		
	}

	@Override
	public void verifyTrophyTitleSubTitle(String expectedTitle, String expectedSubtitle) {
		By loc_textTitle=MobileBy.xpath("//android.widget.TextView[@text='"+expectedTitle+"']");
		By loc_textSubtitle=MobileBy.xpath("//android.widget.TextView[@text='"+expectedSubtitle+"']");
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy title is correct", Pojo.getObjSeleniumFunctions().getText(loc_textTitle).trim().equals(expectedTitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy subtitle is correct", Pojo.getObjSeleniumFunctions().getText(loc_textSubtitle).trim().equals(expectedSubtitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy achieved text is not appearing", Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_textTrophyAchieved)==false);		
	}

	@Override
	public void closeTrophyPopup() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_closePopupBtn, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is working", Pojo.getObjSeleniumFunctions().navigateToBack());		
	}

	@Override
	public void selectTrophy(int trophyNum) {
		 By loc_trophyNumber=MobileBy.xpath("//android.widget.TextView[@text='CAREER TROPHIES']//following-sibling::androidx.recyclerview.widget.RecyclerView//child::android.widget.FrameLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/trophy_container']["+trophyNum+"]");
		 Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_trophyNumber);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that trophy is selecting",Pojo.getObjSeleniumFunctions().click(loc_trophyNumber));		
	}

	@Override
	public void openSingleLevelGameTrophy() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_singleLevelGameTrophy, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that single level game trophy is opening", Pojo.getObjSeleniumFunctions().click(loc_singleLevelGameTrophy));		
	}

	@Override
	public void verifyTrophyTitle(String expectedTitle) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyHeader, 10);
		System.out.println("Actual Title "+Pojo.getObjSeleniumFunctions().getText(loc_trophyHeader).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy title is correct", Pojo.getObjSeleniumFunctions().getText(loc_trophyHeader).trim().equals(expectedTitle));

		
	}

	@Override
	public void verifyGameTrophyName() {
		System.out.println("Trophy Name Expected "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		System.out.println("Trophy Name Actual "+Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game trophy name is correct",TrophiesPageAdmin.gameTrophyData.get("TrophyName").equals(Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim()));
		
	}

	@Override
	public void verifyTotalPoints() {
		String totalPointActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyTotalPoints).trim();
		//totalPointActual=totalPointActual.replaceAll("[^0-9]", "").trim();
		System.out.println("Total Points "+totalPointActual);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are correct",("Total Points: "+(TrophiesPageAdmin.gameTrophyData.get("Points"))).equals(totalPointActual));
		
	}

	@Override
	public void verifyAttempts() {
		String totalAttemptActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyAttempts).trim();
		//totalAttemptActual.replaceAll("[^0-9]", "");
		System.out.println("Total Attempts "+totalAttemptActual);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total attempts are correct",("Attempts: "+(TrophiesPageAdmin.gameTrophyData.get("Attempts"))).equals(totalAttemptActual));
		
	}

	@Override
	public void verifyHighScore() {
		String highScoreActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyHighScore).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",("High Score: "+(TrophiesPageAdmin.gameTrophyData.get("HighScore"))+"%").equals(highScoreActual));
		
	}

	@Override
	public void selectTab(String tabName) {
		 By tabNameText=MobileBy.xpath("//android.widget.TextView[@text='"+tabName+"']");
		 
		 if(tabName.equalsIgnoreCase("LAST MONTH"))
		 {
				Pojo.getObjSeleniumFunctions().swipe(loc_tabThisMonth,loc_tabLifeTime);
         }
		 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(tabNameText, 10);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that tab is selecting "+tabName, Pojo.getObjSeleniumFunctions().click(tabNameText));
		 Pojo.getObjSeleniumFunctions().waitFor(2);		
	}

	@Override
	public void verifyStatisticsTabOpening() {
		Pojo.getObjSeleniumFunctions().androidScroll("TOTAL POINTS");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalPointsStatisticsTab, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that statistics tab is opening", Pojo.getObjSeleniumFunctions().getText(loc_totalPointsStatisticsTab).trim().equals("TOTAL POINTS"));		
	}

	@Override
	public void verifyLifeTimeTab() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify Lifetime tab is appearing", Pojo.getObjSeleniumFunctions().getText(loc_tabLifeTime).trim().equals("LIFETIME"));
		
	}

	@Override
	public void verifyThisYearTab() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify this year tab is appearing", Pojo.getObjSeleniumFunctions().getText(loc_tabThisYear).trim().equals("THIS YEAR"));
		
	}

	@Override
	public void verifyThisMonthTab() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify this month tab is appearing", Pojo.getObjSeleniumFunctions().getText(loc_tabThisMonth).trim().equals("THIS MONTH"));
		
	}

	@Override
	public void verifyLastMonthTab() {
		Pojo.getObjSeleniumFunctions().swipe(loc_tabThisMonth,loc_tabLifeTime);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify last month tab is appearing", Pojo.getObjSeleniumFunctions().getText(loc_tabLastMonth).trim().equals("LAST MONTH"));
		
	}

	@Override
	public void verifyStatisticsField(String expectedText) {
		By loc_expectedFieldName=MobileBy.xpath("//android.widget.TextView[@text='"+expectedText+"']");
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that field name is correct ", Pojo.getObjSeleniumFunctions().getText(loc_expectedFieldName).trim().equals(expectedText));		
	}

	@Override
	public void verifyTotalPointsStatistics(int gamePoints) {
		int actualPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_totalPointsStatis).trim().replaceAll("[^0-9]", ""));
		System.out.println("Actual Points "+actualPoints);
		System.out.println("Expected Points "+gamePoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are correct",actualPoints== gamePoints);
		
	}

	@Override
	public void verifyGamesCountStatistics(int gameCount) {
		Pojo.getObjSeleniumFunctions().androidScroll("GAMES");
		int actualgameCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_totalGamesStatis).trim().replaceAll("[^0-9]", ""));
		System.out.println("Actual Game Count "+actualgameCount);
		System.out.println("Expected Game Count "+gameCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total games are correct",gameCount==actualgameCount);		
	}

	@Override
	public void verifyTrophiesCountStatistics(int trophiesCount) {
		int trophiesCountActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_totalTrophiesStatis).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total trophies count is correct",trophiesCountActual==trophiesCount);		
	}

	@Override
	public void verifyPerfectGamesCountStatistics(int perfectGameCount) {
		int perfectGameCountActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_perfectGamesStatis).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that perfect game count is correct",perfectGameCountActual==perfectGameCount);				
	}

	@Override
	public void verifyContestWonCountStatistics(int contestCount) {
		int contestCountActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_contestWonStatis).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total contest count is correct",contestCountActual==contestCount);				
	}

	@Override
	public void verifyTimePlayedCountStatistics() {
		int totalTimeActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_timePlayedStatis).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is correct",totalTimeActual>0);				
	}

	@Override
	public void verifyTimePlayedCountLastMonthStatistics() {
		int totalTimeActual=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_timePlayedStatis).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is correct",totalTimeActual==0);			
	}

	@Override
	public void verifyCurrentTab(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that current tab is displaying", Pojo.getObjSeleniumFunctions().getText(loc_textCurrentTab).trim().equals(expectedText));
		
	}

	@Override
	public void verifyLifetimeTab(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lifetime tab is displaying", Pojo.getObjSeleniumFunctions().getText(loc_textLifeTimeTab).trim().equals(expectedText));
		
	}

	@Override
	public void verifyPlayerLevelText(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player level text is correct", Pojo.getObjSeleniumFunctions().getText(loc_textPlayerLevel).trim().equals(expectedText));
		
	}

	@Override
	public void verifyWeeklyStreakContainer() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that weekly streak container is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_containerWeeklyStreak));
	}

	@Override
	public void verifyWeeklyStreakCount() {
		
		while(Pojo.getObjSeleniumFunctions().getAttribute(loc_leftArrow,"clickable").equals("true"))
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().click(loc_leftArrow));
		}
		
		List<AndroidElement> datesRow=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_totalRows);
		int rowCount=datesRow.size();
        System.out.println("Total Rows "+rowCount);
		int streakCount=0;
		rowCount=rowCount-1; //reducing row count by 1 because last row of the month appear as a first row of next month
	    System.out.println("Week Count "+rowCount);
		
		while(Pojo.getObjSeleniumFunctions().getAttribute(loc_rightArrow,"clickable").equals("true"))
		{
		 for(int i=1;i<=rowCount;i++)
		{
		   By loc_datesInRow=MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/wk_day_title']/parent::android.view.ViewGroup/following-sibling::android.widget.LinearLayout["+i+"]//child::android.widget.LinearLayout/android.widget.TextView");
           List<AndroidElement> datesInRow=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_datesInRow);
           System.out.println("Loc "+loc_datesInRow);
           boolean state=false;
           for(AndroidElement e1:datesInRow)
            	{
            		if(e1.getAttribute("clickable").equals("false"))
            		{
            			System.out.println("Date "+e1.getText());
            			System.out.println("Attribute "+e1.getAttribute("clickable"));
            			System.out.println("Streak Count 0");
            			state=false||state;
            			System.out.println("Final State "+state);
            		}
            		else
            		{
            			System.out.println("Date Played "+e1.getText());

            			System.out.println("Streak Counter "+streakCount);
            			state=true;
            			break;
            		}
            	    }
           if(state==true)
           {
        	   streakCount=streakCount+1;
        	   
           }
           else
           {
        	   streakCount=0;
           }
		}
	        System.out.println("Month "+Pojo.getObjSeleniumFunctions().getText(loc_calMonth));

        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking", Pojo.getObjSeleniumFunctions().click(loc_rightArrow));
		}
		
	System.out.println("Streak Count Previous Months "+streakCount);
	
	
	String currentDate=Pojo.getObjUtilitiesFunctions().getCurrentDate();
	By loc_currentDate=MobileBy.xpath("//android.widget.TextView[@text='"+currentDate+"']");
	List<AndroidElement> currentDateCount=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_currentDate); //It happens that next month date's appear in current month
    By loc_currentDateNextRow=MobileBy.xpath("//android.widget.TextView[@text='"+currentDate+"']/parent::android.widget.LinearLayout/parent::android.widget.LinearLayout/following-sibling::android.widget.LinearLayout");
    List<AndroidElement> nextRowsFromCurrentDateRow=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_currentDateNextRow);
   
    System.out.println("Next Row From Current Date Row "+nextRowsFromCurrentDateRow.size());
        
        if(nextRowsFromCurrentDateRow.size()>=1)
        {
        	rowCount=rowCount-nextRowsFromCurrentDateRow.size();  //Because we don't consider next weeks of currect date because games yet to be played for those weeks
        }
        
        for(int i=1;i<=rowCount;i++)
		{
		   By loc_datesInRow=MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.ionicframework.SaleshuddleApp:id/wk_day_title']/parent::android.view.ViewGroup/following-sibling::android.widget.LinearLayout["+i+"]//child::android.widget.LinearLayout/android.widget.TextView");
           List<AndroidElement> datesInRow=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_datesInRow);
           System.out.println("Loc "+loc_datesInRow);
           boolean state=false;
           for(AndroidElement e1:datesInRow)
            	{
            		if(e1.getAttribute("clickable").equals("false"))
            		{
            			System.out.println("Date "+e1.getText());
            			System.out.println("Attribute "+e1.getAttribute("clickable"));
            			System.out.println("Streak Count 0");
            			state=false||state;
            			System.out.println("Final State "+state);
            		}
            		else
            		{
            			System.out.println("Date Played "+e1.getText());

            			System.out.println("Streak Counter "+streakCount);
            			state=true;
            			break;
            		}
            	    }
           if(state==true)
           {
        	   streakCount=streakCount+1;
        	   
           }
           else
           {
        	   streakCount=0;
           }
		}
        
        System.out.println("Current Month "+Pojo.getObjSeleniumFunctions().getText(loc_calMonth));
    	System.out.println("Final Streak Count "+streakCount);
    	
    	String expectedText=streakCount+" "+"Week Streak";
    	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_StreakCountTextHeader).trim();
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that streak count is correct",expectedText.equals(actualText));

		}

	}
		
