package com.testH.base.desktopView;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.NotificationsPage;

public class NotificationsPageDesktopView extends NotificationsPage  {
	
	
	By loc_btnNotificationsSideMenu=By.xpath("//span[text()='Notifications']/parent::div");
	
	By loc_btnClearAll=By.xpath("//span[text()='CLEAR ALL']");
	By loc_confirmationYes=By.xpath("//button[text()='Yes']");
	By loc_noNotificationText=By.xpath("//div[text()=' No Notifications ']");
	By loc_customNotiTitle=By.xpath("//mat-card-title[text()='New Message']");
	By loc_customNotiMessage=By.xpath("//mat-card-title[text()='New Message']/following-sibling::mat-card-subtitle");
	By loc_notificationText=By.xpath("//div[@class='notificationText']/following-sibling::div");
	By loc_gamesSideMenu=By.xpath("//span[contains(text(),'Games')]");
	By loc_redBubbleNotification=By.xpath("//span[text()='Notifications']//parent::div/following-sibling::span");
	By loc_notificationTime=By.xpath("//div[@class='notificationTimeDetails']/child::span");
	By loc_unreadNotification=By.xpath("//mat-card[contains(@class,'backgroundColorUnseen')]");
	By loc_burgerIcon=By.xpath("//i[contains(text(),'more_vert')]");
	By loc_btnMarkAsRead=By.xpath("//button[contains(text(),'Mark as read')]");
	By loc_readNotification=By.xpath("//mat-card[contains(@class,'backgroundColorSeen')]");
	By loc_loadingCircle=By.xpath("assets/img/OHloader.gif");
	By loc_gameList=By.xpath("//div[contains(@class,'gameList')]");

	@Override
	public void clickNotifications() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 25);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnNotificationsSideMenu, 25);
		//Pojo.getObjSeleniumFunctions().waitFor(2);

		//Pojo.getObjSeleniumFunctions().waitFor(4);
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 15);

        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Notifications are clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNotificationsSideMenu));
	}

	
	@Override
	public void clearAllNotifications() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClearAll, 10);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that clear all button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_btnClearAll));

	}


	@Override
	public void selectNotification(String notificationType) {
	//	Pojo.getObjSeleniumFunctions().waitFor(5);

		By loc_newGameNotification=By.xpath("//div[text()=' "+notificationType+" ']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_newGameNotification, 15);
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_newGameNotification);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that notification is selecting", Pojo.getObjSeleniumFunctions().click(loc_newGameNotification));
	//	Pojo.getObjSeleniumFunctions().waitFor(5);
	}


	@Override
	public void clickYesOnConfirmation() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_confirmationYes, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that Yes button on confirmation popup is clicking", Pojo.getObjSeleniumFunctions().click(loc_confirmationYes));
		//Pojo.getObjSeleniumFunctions().waitFor(5);
		
	}


	@Override
	public void verifyNoNotificationText() {
		//Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_noNotificationText, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verfy that No notification text is appearing after clearing all notifications", Pojo.getObjSeleniumFunctions().getText(loc_noNotificationText).trim().equals("No Notifications"));
		
	}


	@Override
	public void verifyCustomNotificationText(String expectedText) {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that custom notification title is correct", Pojo.getObjSeleniumFunctions().isElementDisplayed(loc_customNotiTitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that custom notification text is correct", Pojo.getObjSeleniumFunctions().getText(loc_customNotiMessage).trim().equals(expectedText));
		Pojo.getObjSeleniumFunctions().pageRefresh();
	}


	@Override
	public void verifyNotificationTextNewGame() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_notificationText, 15);
		String expectedNotificationText="Game "+BuildSpGamePage.expectedData.get("GameName").get(0)+" is available to play.";
		System.out.println("Expected new game notification "+expectedNotificationText);
		String actualNotificationText=Pojo.getObjSeleniumFunctions().getText(loc_notificationText).trim();
		System.out.println("Actual new game notification " +actualNotificationText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification text is correct", actualNotificationText.equals(expectedNotificationText));
	}


	@Override
	public void verifyNotificationTextLeaderboardReset() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_notificationText, 15);
		String expectedNotificationText="Your Leaderboard has been reset to a start date of "+BuildSpGamePage.expectedData.get("LeaderboardResetDate").get(0)+"."+" Go get it!";
		System.out.println("Expected new game notification "+expectedNotificationText);
		String actualNotificationText=Pojo.getObjSeleniumFunctions().getText(loc_notificationText).trim();
		System.out.println("Actual new game notification " +actualNotificationText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification text is correct", actualNotificationText.equals(expectedNotificationText));
	}


	@Override
	public void verifyNotificationTextCustomNotification(String expectedText) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_notificationText,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that custom notification text is correct", Pojo.getObjSeleniumFunctions().getText(loc_notificationText).trim().equals(expectedText));		
	}


	@Override
	public void verifyNotificationTextExtraAttempt() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_notificationText, 15);
		System.out.println("Extra attempt count "+BuildSpGamePage.expectedData.get("ExtraAttempt").get(0));
		String expectedNotificationText="You've been awarded "+BuildSpGamePage.expectedData.get("ExtraAttempt").get(0)+" attempt(s) for "+BuildSpGamePage.expectedData.get("GameName").get(0)+" game!";
		System.out.println("Expected new game notification "+expectedNotificationText);
		String actualNotificationText=Pojo.getObjSeleniumFunctions().getText(loc_notificationText).trim();
		System.out.println("Actual new game notification " +actualNotificationText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification text is correct", actualNotificationText.equals(expectedNotificationText));
	}


	@Override
	public void verifyNotificationCountRedBubble() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesSideMenu, 25);
		String countNotification=Pojo.getObjSeleniumFunctions().getText(loc_redBubbleNotification);
		int countNoti=Integer.parseInt(countNotification);
		System.out.println("Notification Count "+countNoti);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification count is correct", countNoti>=1);
		
	}


	@Override
	public void verifyNotificationTimeDetails(String expectedTime) {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_notificationTime,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification time details are correct", Pojo.getObjSeleniumFunctions().getText(loc_notificationTime).trim().equals(expectedTime));
	}


	@Override
	public void verifyNotificationUnread() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_unreadNotification,5);
		String textAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_unreadNotification, "class");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification is unread",textAttribute.contains("backgroundColorUnseen"));
	}


	@Override
	public void clickBurgerIcon() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_burgerIcon,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that burger more button is clicking", Pojo.getObjSeleniumFunctions().click(loc_burgerIcon));
	}


	@Override
	public void verifyAndClickMarkAsRead() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnMarkAsRead, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Mark as read button is displaying" , Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnMarkAsRead));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Mark as read button is clicking" , Pojo.getObjSeleniumFunctions().click(loc_btnMarkAsRead));

	}


	@Override
	public void verifyNotificationRead() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_readNotification,10);
		//Pojo.getObjSeleniumFunctions().waitFor(3);
		String textAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_readNotification, "class");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification is read",textAttribute.contains("backgroundColorSeen"));		
	}




}
