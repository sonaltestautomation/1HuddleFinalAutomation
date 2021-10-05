package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.NotificationsPageAdmin;
import com.testH.base.pages.client.GamePreviewPage;
import com.testH.base.pages.client.NotificationsPage;

public class NotificationSteps {
	
	private NotificationsPage objNotificationPage;
	private GamePreviewPage objGamePreviewPage;
	private BuildSpGamePage objBuildSpGamePage;
	private NotificationsPageAdmin objNotificationsPageAdmin;
	
	public NotificationSteps()
	{
		objNotificationPage=new PageFactory().getNotificationsPage();
		objGamePreviewPage=new PageFactory().getGamePreviewPage();
		objBuildSpGamePage=new BuildSpGamePage();
		objNotificationsPageAdmin=new NotificationsPageAdmin();
	}
	
	@And("^player clicks on notifications$")
    public void user_clicks_on_notifications() throws Throwable {
		objNotificationPage.clickNotifications();
    }

    @And("^player clicks on new game live notification$")
    public void user_clicks_on_new_game_live_notification(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationPage.selectNotification(userData);
    }
    @Then("^player is redirecting to the game preview screen$")
    public void user_is_redirecting_to_the_gamepreview_screen() throws Throwable {
    	objGamePreviewPage.verifyGamepreviewScreen();
    }
    @And("^player clicks on clearall$")
    public void player_clicks_on_clearall() throws Throwable {
    	objNotificationPage.clearAllNotifications();
    }

    @And("^player clicks on yes on confirmation popup$")
    public void player_clicks_on_yes_on_confirmation_popup() throws Throwable {
    	objNotificationPage.clickYesOnConfirmation();
    }
    @Then("^No Notifications text is appearing on the screen$")
    public void no_notifications_is_appearing_on_the_screen() throws Throwable {
    	objNotificationPage.verifyNoNotificationText();
    }
    @When("^Manager clicks game icon$")
    public void manager_clicks_game_icon() throws Throwable {
    	objBuildSpGamePage.clickGameIcon();
    }

    @And("^Manager clicks on Notifications$")
    public void manager_clicks_on_notifications() throws Throwable {
    	
    	objNotificationsPageAdmin.clickNotificationSideMenu();
    }

    @And("^Manager clicks on Custom Notification$")
    public void manager_clicks_on_custom_notification() throws Throwable {
    	objNotificationsPageAdmin.clickCustomNotification();
    	objNotificationsPageAdmin.clickEmailCheckboxCustomNotification();

    }

    @And("^Manager Enters Notification message$")
    public void manager_enters_notification_message(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationsPageAdmin.enterNotificationText(userData);
    }

    @And("^Manager clicks on Send button$")
    public void manager_clicks_on_send_button() throws Throwable {
    	objNotificationsPageAdmin.clickSendButton();
    }
    @And("^Manager clicks on Ok button on success popup$")
    public void manager_clicks_on_ok_button_on_success_popup() throws Throwable {
    	objNotificationsPageAdmin.clickOk();
    }
    @And("^Player selects custom notification$")
    public void player_selects_custom_notification(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationPage.selectNotification(userData);
    }
    @Then("^Correct notification text is appearing$")
    public void correct_notification_text_is_appearing(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationPage.verifyCustomNotificationText(userData);
    }
    
    @And("^player clicks on leaderboard update notification$")
    public void player_clicks_on_leaderboard_update_notification(DataTable table) throws Throwable {
    	
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationPage.selectNotification(userData);
    	
    }
    
    @And("^player clicks on extra attempt notification$")
    public void player_clicks_on_extra_attempt_notification(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
    	objNotificationPage.selectNotification(userData);
    }
   
    @Then("^notification text is correct new game$")
    public void notification_text_is_correct_newgame() throws Throwable {
    	objNotificationPage.verifyNotificationTextNewGame();
    }
    @Then("^notification text is correct custom notification$")
    public void notification_text_is_correct_custom(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		objNotificationPage.verifyNotificationTextCustomNotification(userData);
		
    }
    
    @Then("^notification text is correct extra attempt$")
    public void notification_text_is_correct_extra_attempt() throws Throwable {
    	objNotificationPage.verifyNotificationTextExtraAttempt();
    }

    @Then("^notification text is correct leaderboard reset$")
    public void notification_text_is_correct_leaderboard_reset() throws Throwable {
    	objNotificationPage.verifyNotificationTextLeaderboardReset();
    }
    
    @Then("^notification count is correct in red bubble$")
    public void notification_count_is_correct_in_red_bubble() throws Throwable {
    	objNotificationPage.verifyNotificationCountRedBubble();
    }
    
    @Then("^notification time details are correct$")
    public void notification_time_details_are_correct(DataTable table) throws Throwable {
    	List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		objNotificationPage.verifyNotificationTimeDetails(userData);
    }

    @Then("^notification is highlighted$")
    public void notification_is_highlighted() throws Throwable {
    	objNotificationPage.verifyNotificationUnread();
    }
    

    @And("^player clicks on burger icon$")
    public void player_clicks_on_burger_icon() throws Throwable {
    	objNotificationPage.clickBurgerIcon();
    }

    @And("^player verify and clicks on mark as read$")
    public void player_clicks_on_mark_as_read() throws Throwable {
    	objNotificationPage.verifyAndClickMarkAsRead();
    }
    @Then("^notification is seen$")
    public void notification_is_unread() throws Throwable {
    	objNotificationPage.verifyNotificationRead();
    }
    
}
