package com.testH.stepDefs;

import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.client.MorePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpPageSteps {
	
private MorePage objMorePage;
private GmailLoginPage objGmailLoginPage;

	
	public HelpPageSteps()
	{
		objMorePage= new PageFactory().getMorePage();
		objGmailLoginPage=new GmailLoginPage();

	}

	@And("^User clicks on Help button$")
    public void user_clicks_on_help_button() throws Throwable {
		objMorePage.clickHelp();
    }
	
	@Then("^Help page is opening$")
    public void help_page_is_opening() throws Throwable {
		objMorePage.verifyHelpPage();
    }

	@Then("^Company name is showing correctly$")
    public void company_name_is_showing_correctly(DataTable table) throws Throwable {
		List<List<String>> data=table.asLists();
		String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	objMorePage.verifyCompanyName(userData);
    	
		
    }

    @And("^Topics are showing correctly$")
    public void topics_are_showing_correctly() throws Throwable {
    	objMorePage.verifyTopics();
    }
    
    
    @And("^User edits first name$")
    public void user_edits_first_name(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
		String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	objMorePage.editFirstName(userData);
    	
    	
    }

    @And("^User edits last name$")
    public void user_edits_last_name(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
		String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	objMorePage.editLastName(userData);
    	
    }

    @And("^User selects a topic$")
    public void user_selects_a_topic(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
		String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	objMorePage.selectTopic(userData);
    }

    @And("^User enter comments$")
    public void user_enter_comments(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
		String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	objMorePage.enterCommnet(userData);
    }

    @And("^User clicks on Submit button$")
    public void user_clicks_on_submit_button() throws Throwable {
    	objMorePage.clickSubmitButton();
    }
    
    @Then("^Success message is appearing$")
    public void success_message_is_appearing(DataTable table) throws Throwable {
    	objMorePage.verifySuccessMessageHelp(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @Then("^Cancel button is displaying$")
    public void cancel_button_is_displaying() throws Throwable {
    	objMorePage.verifyCancelBtn();
    }

    @Then("^Submit button is displaying$")
    public void submit_button_is_displaying() throws Throwable {
    	objMorePage.verifySubmitBtnHelp();

    }
    
    @Then("^First name field is appearing on help screen$")
    public void first_name_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifyFirstNameField();
    }

    @Then("^Lasr name field is appearing on help screen$")
    public void lasr_name_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifyLastNameField();
    }

    @Then("^Company name field is appearing on help screen$")
    public void company_name_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifyCompanyNameField();
    }

    @Then("^topics field is appearing on help screen$")
    public void topics_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifySelectATopicField();
    }

    @Then("^Comments field is appearing on help screen$")
    public void comments_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifyCommentsField();
    }

    @Then("^attach screen shot field is appearing on help screen$")
    public void attach_screen_shot_field_is_appearing_on_help_screen() throws Throwable {
    	objMorePage.verifyAttachScreenShotField();
    	objMorePage.verifyNoFileChosenText();
    }
    @Then("^company name field is not editable$")
    public void company_name_field_is_not_editable() throws Throwable {
    	objMorePage.verifyCompanyNameDisabled();
    	
    }
    @Then("^submit button is disabled for webapp$")
    public void submit_button_is_disabled() throws Throwable {
    	objMorePage.verifyDisaledSubmitBtn();
    }
    
    @And("^user verify and open support email$")
    public void user_verify_and_open_support_email(DataTable table) throws Throwable {
    	String mail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objGmailLoginPage.gmailLogin(mail, pw);
    	objGmailLoginPage.verifyAndOpenSupportEmail();
    }
    
    
    @Then("^help email is appearing on email id$")
    public void help_email_is_appearing_on_email_id() throws Throwable {
    }
    @Then("^No file chosen is appearing on help screen if no file is choosen$")
    public void no_file_chosen_is_appearing_on_help_screen_if_no_file_is_choosen() throws Throwable {
    	objMorePage.verifyNoFileChosenText();
    }
    
    @And("^User attaches screenshot$")
    public void user_attaches_screenshot() throws Throwable {
    	objMorePage.AttachScreenShot();
    }
    
    
    @Then("^attachment are displaying on user email$")
    public void attachment_are_displaying_on_user_email() throws Throwable {
    }
    
    @Then("^validation messagen is appering if player does not select topic and click on submit button for mobile app$")
    public void validation_messagen_is_appering_if_player_does_not_select_topic_and_click_on_submit_button_for_mobile_app(DataTable table) throws Throwable {
    	String expectedMsg=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyValidationIfTopicNotSelected(expectedMsg);
    }

    @Then("^validation message is appearing if player does not enter comment and click on submit button for mobile app$")
    public void validation_message_is_appearing_if_player_does_not_enter_comment_and_click_on_submit_button_for_mobile_app(DataTable table) throws Throwable {
    	String expectedMsg=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	
    	objMorePage.verifyValidationIfCommentNotEntered(expectedMsg);

    }
    
}
