package com.testH.base.pages.client;

public abstract class NotificationsPage {
	
	public abstract void clickNotifications();
	public abstract void selectNotification(String notificationType);
	public abstract void clearAllNotifications();
	public abstract void clickYesOnConfirmation();
	public abstract void verifyNoNotificationText();
	public abstract void verifyCustomNotificationText(String expectedText);
	public abstract void verifyNotificationTextNewGame();
	public abstract void verifyNotificationTextLeaderboardReset();
	public abstract void verifyNotificationTextCustomNotification(String expectedText);
	public abstract void verifyNotificationTextExtraAttempt();
	public abstract void verifyNotificationCountRedBubble();
	public abstract void verifyNotificationTimeDetails(String expectedTime);
	public abstract void verifyNotificationUnread();
	public abstract void clickBurgerIcon();
	public abstract void verifyAndClickMarkAsRead();
	public abstract void verifyNotificationRead();


}
