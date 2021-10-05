package com.testH.base.desktopView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.PlayerProfilePage;

public class PlayerProfilePageDesktopView extends PlayerProfilePage  {
	
	By loc_btnProfile=By.xpath("//span[text()='Profile']");
	By loc_titleProfileScreen=By.xpath("//*[contains(text(),'PROFILE')]");
	By loc_tabTextAchievement=By.xpath("//div[contains(text(),'ACHIEVEMENTS')]");
	By loc_tabTextStatistics=By.xpath("//div[contains(text(),'STATISTICS')]");
	By loc_departmentName=By.xpath("//span[text()='Department: ']//following-sibling::span");
	By loc_locationName=By.xpath("//span[text()='Location: ']//following-sibling::span");
	By loc_activeSinceDate=By.xpath("//span[text()=' Active Since: ']//following-sibling::span");
	By loc_playerRating=By.xpath("//span[text()=' Rating: ']//following-sibling::span");
	By loc_statusText=By.xpath("//span[contains(text(),'Status: ')]/parent::*");
	By loc_playerNameText=By.xpath("//*[contains(text(),'PROFILE')]/parent::div/following-sibling::div[2]");
	By loc_btnViewDownloadScoreCard=By.xpath("//span[contains(text(),'View/Download Scorecard')]");
	By loc_textScorecardPopUp=By.xpath("//span[contains(text(),'SCORECARD')]");
	By loc_textWhatNext=By.xpath("//span[text()='What Next?']");
	By loc_textDownloadScorecard=By.xpath("//span[text()='What Next?']//following-sibling::span[1]");
	By loc_textShareSocialIcon=By.xpath("//span[contains(text(),'Share on social/resume')]");
	By loc_linkedInIcon=By.xpath("//img[@src='assets/img/social/linkedin_scorecard.png']");
	By loc_fbIcon=By.xpath("//img[@src='assets/img/social/facebook_scorecard.png']");
	By loc_twitterIcon=By.xpath("//img[@src='assets/img/social/twitter_scorecard.png']");
	By loc_instaIcon=By.xpath("//img[@src='assets/img/social/instagram_scorecard.png']");
	By loc_btnDownload=By.xpath("//span[contains(text(),'DOWNLOAD')]");
	By loc_successMessageDownload=By.xpath("//*[contains(@class,'mat-snack')]");
	By loc_btnClose=By.xpath("//div[contains(@class,'contentSection')]/child::div[1]");
	By loc_levelImage=By.xpath("//img[contains(@class,'levelImage')]");
	By loc_btnLevelShare=By.xpath("//img[contains(@class,'levelShareIcon')]");
	By loc_textMyLevel=By.xpath("//mat-card-title[contains(text(),'My Level')]");
	By loc_imgLevelName=By.xpath("//mat-card-title[contains(@class,'LevelTitle')]");
	By loc_gameCountRookie=By.xpath("//span[text()='Rookie']//following-sibling::div");
	By loc_gameCountStarter=By.xpath("//span[text()='Starter']//following-sibling::div");
	By loc_gameCountProfessional=By.xpath("//span[text()='Professional']//following-sibling::div");
	By loc_gameCountAllStar=By.xpath("//span[text()='All Star']//following-sibling::div");
	By loc_gameCountMaster=By.xpath("//span[text()='Master']//following-sibling::div");
	By loc_textMyAccomplishment=By.xpath("//mat-card-title[contains(text(),'My Accomplishments')]");
	By loc_textTrophies=By.xpath("//mat-card-title[contains(text(),'Trophies')]");
	By loc_textContest=By.xpath("//mat-card-title[contains(text(),'Contests')]");
	By loc_textRewards=By.xpath("//mat-card-title[contains(text(),'Rewards')]");
	By loc_textMultilevel=By.xpath("//mat-card-title[contains(text(),'Multilevel')]");
	By loc_trophyCountBubble=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[1]/child::span/child::span");
	By loc_contestCountBubble=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[2]/child::span/child::span");
	By loc_rewardCountBubble=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[3]/child::span/child::span");
	By loc_multilevelCountBubble=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[4]/child::span/child::span");
    By loc_iconTrophies=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[1]");
	By loc_trophiesTitle=By.xpath("//mat-card-title[(text()=' TROPHIES ')]");
	By loc_iconContest=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[2]");
	By loc_contestTitle=By.xpath("//mat-card-title[(text()=' CONTESTS ')]");
	By loc_iconRewards=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[3]");
	By loc_rewardsTitle=By.xpath("//mat-card-title[(text()=' REWARDS ')]");
	By loc_iconMultilevel=By.xpath("//div[contains(@class,'group-achivemnt')]/child::div[4]");
	By loc_multilevelTitle=By.xpath("//mat-card-title[(text()=' MULTILEVEL ')]");
	By loc_iconBackBtn=By.xpath("//i[contains(text(),'arrow_back')]");
	By loc_unlockedTrophyCount=By.xpath("//mat-card-title[contains(text(),'TOTAL UNLOCKED')]/parent::div/following-sibling::div[1]");
	By loc_textTrophyAchieved=By.xpath("//span[contains(text(),'TROPHY ACHIEVED')]");
    By loc_closePopupBtn=By.xpath("//*[contains(text(),'close')]/parent::div");
    By loc_singleLevelGameTrophy=By.xpath("//mat-card-title[contains(text(),'SINGLE LEVEL GAMES')]/parent::div/following-sibling::div/child::div");
    By loc_trophyHeader=By.xpath("//span[contains(text(),'TROPHY ACHIEVED')]");
    By loc_trophyName=By.xpath("//span[contains(text(),'YOU HAVE SCUCCESSFULLY COMPLETED ALL REQUIREMENTS TO EARN THE TROPHY FOR THIS GAME.')]//parent::div//following-sibling::div[1]/child::span");
    By loc_trophyTotalPoints=By.xpath("//span[contains(text(),'Total Points')]");
    By loc_trophyAttempts=By.xpath("//span[contains(text(),'Attempts')]");
    By loc_trophyHighScore=By.xpath("//span[contains(text(),'High Score')]");
    By loc_totalPointsStatisticsTab=By.xpath("//span[contains(text(),'TOTAL POINTS')]");
    By loc_tabLifeTime=By.xpath("//span[contains(text(),'LIFETIME')]");
    By loc_tabThisYear=By.xpath("//span[contains(text(),'THIS YEAR')]");
    By loc_tabThisMonth=By.xpath("//span[contains(text(),'THIS MONTH')]");
    By loc_tabLastMonth=By.xpath("//span[contains(text(),'LAST MONTH')]");
    By loc_totalPointsStatis=By.xpath("//span[text()='TOTAL POINTS']/parent::div/child::span[1]");
    By loc_totalGamesStatis=By.xpath("//span[text()='GAMES']/parent::div/child::span[1]");
    By loc_totalTrophiesStatis=By.xpath("//span[text()='TROPHIES']/parent::div/child::span[1]");
    By loc_perfectGamesStatis=By.xpath("//span[text()='PERFECT GAMES']/parent::div/child::span[1]");
    By loc_contestWonStatis=By.xpath("//span[text()='CONTESTS WON']/parent::div/child::span[1]");
    By loc_timePlayedStatis=By.xpath("//span[text()='TIME PLAYED']/parent::div/child::div");
    By loc_textCurrentTab=By.xpath("//div[contains(text(),'CURRENT')]");
    By loc_textLifeTimeTab=By.xpath("//div[contains(text(),'LIFETIME')]");
    By loc_textPlayerLevel=By.xpath("//span[contains(text(),'Player')]");
    
    
    

	@Override
	public void clickProfileBtn() {
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnProfile, 20);
		Pojo.getObjSeleniumFunctions().waitFor(1);

	//	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnProfile);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that profile button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnProfile));
	}

	@Override
	public void verifyProfileScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleProfileScreen,15);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that profile screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleProfileScreen).trim().equals("PROFILE"));
	}

	@Override
	public void verifyAchievementAndStatisticsTab() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_tabTextAchievement, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Achievement text is correct", Pojo.getObjSeleniumFunctions().getText(loc_tabTextAchievement).trim().equals("ACHIEVEMENTS"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Statistics text is correct", Pojo.getObjSeleniumFunctions().getText(loc_tabTextStatistics).trim().equals("STATISTICS"));

	}

	@Override
	public void verifyDepartment() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept name is correct ", Pojo.getObjSeleniumFunctions().getText(loc_departmentName).trim().equals(AllUsersPage.expectedDataUser.get("Department")));
	}

	@Override
	public void verifyLocation() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Location name is correct ", Pojo.getObjSeleniumFunctions().getText(loc_locationName).trim().equals(AllUsersPage.expectedDataUser.get("Location")));
		
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
		String expectedDate= monthName+" "+intYear;
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that active since date is correct", actualDate.equals(expectedDate));

		
		
		    System.out.println("Current Date "+expectedDate);
	}

	

	@Override
	public void verifyStatus() {
		System.out.println(" Actual Status "+Pojo.getObjSeleniumFunctions().getTextNode(loc_statusText, 1));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that status is correct",Pojo.getObjSeleniumFunctions().getTextNode(loc_statusText, 1).trim().equals("Hey! I am crushing it with 1Huddle 😎"));
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
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnViewDownloadScoreCard, 10);
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
		String textDownloadScoreCard=Pojo.getObjSeleniumFunctions().getText(loc_textDownloadScorecard).trim();
		textDownloadScoreCard=textDownloadScoreCard.replaceAll("[0-9][.]", "").trim();
		System.out.println("Download Scorecard Text "+textDownloadScoreCard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download scorecard text is appearing", textDownloadScoreCard.equals("Download Scorecard"));

	}

	@Override
	public void verifyShareOnSocialResumeText() {
		String textShareSocial=Pojo.getObjSeleniumFunctions().getTextNode(loc_textShareSocialIcon, 0).trim();
	//	textShareSocial=textShareSocial.replaceAll("[0-9][.]", "").trim();
		System.out.println("Social Text "+textShareSocial);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share on social text is appearing", textShareSocial.equals("2. Share on social/resume"));

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
		String btnText=Pojo.getObjSeleniumFunctions().getTextNode(loc_btnDownload, 1).trim();
		btnText=btnText.replaceAll("[^A-Z]", "");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that download button is appearing on scorecard", btnText.equals("DOWNLOAD"));
		
	}

	@Override
	public void verifySuccessDownloadScorecard() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnDownload));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that success is appearing", Pojo.getObjSeleniumFunctions().getText(loc_successMessageDownload).trim().equals("Downloading Scorecard"));
	}

	@Override
	public void verifyAndClickCloseBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose));
	}

	@Override
	public void verifyLevelImage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level image is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_levelImage));
	}

	@Override
	public void verifyAndClickLevelShareIcon() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share level button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnLevelShare));
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnLevelShare);

		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that level share icon is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_btnLevelShare));
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
	public void verifyGameCountBeforePlaying(int gameRequiredForRookie, int gameRequiredForStarter,int gameRequiredForProfessional, int gameRequiredForAllStar, int gameRequiredForMaster) {
		
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
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textMultilevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that multilevel text is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textMultilevel).trim().equals("Multilevel"));
		
	}

	@Override
	public void verifyTrophyCountBubble(int expectedCount) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy count is correct", Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_trophyCountBubble).trim().replaceAll("[^0-9]", ""))==expectedCount);
	}

	@Override
	public void clickTrophies() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconTrophies);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that trophies button is clicking",Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_iconTrophies));
	}

	@Override
	public void verifyTrophiesScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophiesTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_trophiesTitle).trim().equals("TROPHIES"));
	}

	@Override
	public void clickContests() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconContest);


		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that contest button is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconContest));

	}

	@Override
	public void verifyContestsScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contestTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that contest screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_contestTitle).trim().equals("CONTESTS"));
		
	}

	@Override
	public void clickRewards() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconRewards);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that rewards button is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconRewards));
		
	}

	@Override
	public void verifyRewardsScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rewardsTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that reward screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_rewardsTitle).trim().equals("REWARDS"));
		
	}

	@Override
	public void clickMultilevel() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_iconMultilevel);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that Multilevel button is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconMultilevel));
		
	}

	@Override
	public void verifyMultilevelScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_multilevelTitle, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that multilevel screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_multilevelTitle).trim().equals("MULTILEVEL"));
		
	}

	@Override
	public void verifyAndClickBackButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_iconBackBtn, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconBackBtn));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconBackBtn));
	}

	@Override
	public void verifyFieldName(String expectedName) {
		By loc_fieldName=By.xpath("//mat-card-title[contains(text(),'"+expectedName+"')]");
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
		By loc_textTitle=By.xpath("//span[contains(text(),'"+expectedTitle+"')]");
		By loc_textSubtitle=By.xpath("//span[contains(text(),'"+expectedSubtitle+"')]");
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy title is correct", Pojo.getObjSeleniumFunctions().getText(loc_textTitle).trim().equals(expectedTitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy subtitle is correct", Pojo.getObjSeleniumFunctions().getText(loc_textSubtitle).trim().equals(expectedSubtitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy achieved text is not appearing", Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_textTrophyAchieved)==false);

	}

	@Override
	public void closeTrophyPopup() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_closePopupBtn, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is working", Pojo.getObjSeleniumFunctions().click(loc_closePopupBtn));
	}

	@Override
	public void selectTrophy(int trophyNum) {
		 By loc_trophyNumber=By.xpath("//mat-card-title[contains(text(),'CAREER TROPHIES')]/parent::div/following-sibling::div[1]/child::div["+trophyNum+"]");
		 Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_trophyNumber);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that trophy is selecting",Pojo.getObjSeleniumFunctions().click(loc_trophyNumber));
	}

	@Override
	public void openSingleLevelGameTrophy() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_singleLevelGameTrophy, 10);
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_singleLevelGameTrophy);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that single level game trophy is opening", Pojo.getObjSeleniumFunctions().click(loc_singleLevelGameTrophy));
		
	}

	@Override
	public void verifyTrophyTitle(String expectedTitle) {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy title is correct", Pojo.getObjSeleniumFunctions().getText(loc_trophyHeader).trim().equals(expectedTitle));
	}

	@Override
	public void verifyGameTrophyName() {
		System.out.println("Trophy Name Expected "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		System.out.println("Trophy Name Actual "+Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game trophy name is correct",TrophiesPageAdmin.gameTrophyData.get("TrophyName").equals(Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim()));
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game trophy name is correct","The Shop(Clone): GameForH..".equals(Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim()));

	}

	@Override
	public void verifyTotalPoints() {
		String totalPointActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyTotalPoints).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are correct",("Total Points: "+(TrophiesPageAdmin.gameTrophyData.get("Points"))).equals(totalPointActual));
	}

	@Override
	public void verifyAttempts() {
		String totalAttemptActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyAttempts).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total attempts are correct",("Attempts: "+(TrophiesPageAdmin.gameTrophyData.get("Attempts"))).equals(totalAttemptActual));
	}

	@Override
	public void verifyHighScore() {
		String highScoreActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyHighScore).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",("High Score: "+(TrophiesPageAdmin.gameTrophyData.get("HighScore"))+"%").equals(highScoreActual));
	}

	@Override
	public void selectTab(String tabName) {
		 By tabNameText=By.xpath("//*[contains(text(),'"+tabName+"')]");
		 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(tabNameText, 10);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that tab is selecting "+tabName, Pojo.getObjSeleniumFunctions().click(tabNameText));
		 Pojo.getObjSeleniumFunctions().waitFor(2);

	}

	@Override
	public void verifyStatisticsTabOpening() {
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify last month tab is appearing", Pojo.getObjSeleniumFunctions().getText(loc_tabLastMonth).trim().equals("LAST MONTH"));

	}

	@Override
	public void verifyStatisticsField(String expectedText) {
		 By loc_expectedFieldName=By.xpath("//span[text()='"+expectedText+"']");
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
		Pojo.getObjSeleniumFunctions().scrollToView(loc_totalGamesStatis);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyWeeklyStreakCount() {
		// TODO Auto-generated method stub
		
	}		
	
	

	
	}
	
	


