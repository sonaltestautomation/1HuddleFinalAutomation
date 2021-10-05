package com.testH.stepDefs;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.HomePageDesktopView;
import com.testH.base.desktopView.LeaderboardPageDesktopView;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.admin.VipCodePage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.LeaderboardPage;
import com.testH.base.pages.client.VipCode;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class VipCodeSteps {
	
	private VipCode objVipCode;
	private VipCodePage objVipCodePage;
	private GmailLoginPage objGmailLoginPage;
	private HomePage objHomePage;
	private LeaderboardPage objLeaderboardPage;


	
	public VipCodeSteps()
	{
		objHomePage = new PageFactory().getObjHomePage();
		objVipCode=new PageFactory().getVipCodePage();
		objVipCodePage=new VipCodePage();
		objGmailLoginPage=new GmailLoginPage();
		objLeaderboardPage=new PageFactory().getLeaderboardPage();

	}

	@Then("^VIP Code button is appearing$")
    public void vip_code_button_is_appearing() throws Throwable {
		objVipCode.verifyVipCodeButton();
		
    }
	 @And("^user clicks on Vip Code button$")
	    public void user_clicks_on_vip_code_button() throws Throwable {
		 objVipCode.clickVipCodeButton();
		 
	    }
	 
	@Then("^Enter Vip code screen is opening$")
    public void enter_vip_code_screen_is_opening() throws Throwable {
		objVipCode.verifyEnterVipCodeScreen();
    }

	@Then("^help button is appearing$")
    public void help_button_is_appearing() throws Throwable {
		objVipCode.verifyHelpButton();
    }
	@Then("^Signup screen should be opened$")
    public void signup_screen_should_be_opened() throws Throwable {
        
    }

    @And("^user enters VIP code$")
    public void user_enters_vip_code(DataTable table) throws Throwable {
    	objVipCode.enterVipCode(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    @And("^user enters recently created VIP code$")
    public void user_enters_recently_created_vip_code() throws Throwable {
    	objVipCode.enterVipCode(VipCodePage.vipCodeData.get("VipCode"));

    }

    @And("^user tap on next button$")
    public void user_tap_on_next_button() throws Throwable {
    	objVipCode.clickNext();
    }
    @Then("^correct validation should get appeared for vip code$")
    public void correct_validation_should_get_appeared_for_vip_code(DataTable table) throws Throwable {
    	objVipCode.verifyValidationMessage(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    
    @And("^user clicks on Ok button on validation popup$")
    public void user_clicks_on_ok_button_on_validation_popup() throws Throwable {
    	objVipCode.clickOkBtn();
    }
    @And("^Manager clicks on Add new vip code button$")
    public void manager_clicks_on_add_new_vip_code_button() throws Throwable {
    	objVipCodePage.clickAddNewVipCodeBtn();
    }

    @And("^Manager enters random VIP code$")
    public void manager_enters_random_vip_code() throws Throwable {
    	objVipCodePage.enterVipCode();
    }

    @And("^Manager selects a specific location$")
    public void manager_selects_a_specific_location(DataTable table) throws Throwable {
    	objVipCodePage.selectLocation(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }

    @And("^Manager selects a specific department$")
    public void manager_selects_a_specific_department(DataTable table) throws Throwable {
    	objVipCodePage.selectDept(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    
    @And("^Manager selects expiration date$")
    public void manager_selects_expiration_date(DataTable table) throws Throwable {
    	objVipCodePage.setExpirationDate(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    @And("^Manager clicks on Add button to create vip code$")
    public void manager_clicks_on_add_button_to_create_vip_code() throws Throwable {
    	objVipCodePage.clickAddBtn();
    }
    @And("^Manager clicks on expire vip code button with recently created vip code$")
    public void manager_clicks_on_expire_vip_code_button_with_recently_created_vip_code() throws Throwable {
    	objVipCodePage.clickExpireBtn();
    }
    @And("^Manager clicks on Yes button in confirmation popup$")
    public void manager_clicks_on_yes_button_in_confirmation_popup() throws Throwable {
    	objVipCodePage.clickYesOnConfirmationPopUp();
    }
    @Then("^Signup screen is opening for vip code$")
    public void signup_screen_is_opening_for_vip_code() throws Throwable {
    	objVipCode.verifySignUpScreen();
    }
    @Then("^toast error message is correct$")
    public void toast_error_message_is_correct(DataTable table) throws Throwable {
    	
    	objVipCode.verifyToastMsg(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^user tap on submit button$")
    public void user_tap_on_submit_button() throws Throwable {
    	
    	objVipCode.clickSubmit();
    }
    @And("^user enters first name for vip code signup$")
    public void user_enters_first_name_for_vip_code_signup(DataTable table) throws Throwable {
    	objVipCode.enterFirstName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^user enters last name for vip code code signup$")
    public void user_enters_last_name_for_vip_code_code_signup(DataTable table) throws Throwable {
    	objVipCode.enterLastName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

    }

    @And("^user enters email id for vip code signup$")
    public void user_enters_email_id_for_vip_code_signup(DataTable table) throws Throwable {
    	objVipCode.enterEmailId(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

    }
    
    @And("^user enters unique email id for vip code signup$")
    public void user_enters_unique_email_id_for_vip_code_signup(DataTable table) throws Throwable {
    	String email=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
        String[] arrOfStr = email.split("@"); 
        System.out.println("Before @ "+arrOfStr[0]);
        email=arrOfStr[0]+"+"+Pojo.getObjUtilitiesFunctions().getRandomNumber(3, 9999);
        email=email+"@"+arrOfStr[1];
    	objVipCode.enterEmailId(email);
    }
    
    @And("^user verify and open account activation link$")
    public void user_verify_and_open_account_activation_link(DataTable table) throws Throwable {
    	String mail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objGmailLoginPage.gmailLogin(mail, pw);
    	objGmailLoginPage.verifyAndOpenAccountActivationLinkVipCode();
    }
    
    @And("^user enters random email id for vip code signup$")
    public void user_enters_random_email_id_for_vip_code_signup() throws Throwable {
		String userEmail=Pojo.getObjTestData().getRandomEmail();
    	objVipCode.enterEmailId(userEmail);
      }
    
    
    @And("^user enters password for vip code signup$")
    public void user_enters_password_for_vip_code_signup(DataTable table) throws Throwable {
    	objVipCode.enterPw(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    @And("^user enters confirm password for vip code signup$")
    public void user_enters_confirm_password_for_vip_code_signup(DataTable table) throws Throwable {
    	objVipCode.enterConfirmPw(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
    @And("^user hides keyboard$")
    public void user_hides_keyboard() throws Throwable {
    	Pojo.getObjSeleniumFunctions().hideKeyBoard();
    }
    @Then("^verify that success is appearing for verification link$")
    public void verify_that_success_is_appearing_for_verification_link() throws Throwable {
		String email=VipCodePage.vipCodeData.get("UniqueEmail");
		objVipCode.verifySuccessVipCode("Link sent to "+email);
    }
    
    
    
    @And("^user clicks on active button$")
    public void user_clicks_on_active_button() throws Throwable {
    	objGmailLoginPage.clickActiveButton();
    }
    
    
    @And("^user clicks on continue to login button$")
    public void user_clicks_on_continue_to_login_button() throws Throwable {
    	objGmailLoginPage.clickContinueToLogin();
    }
    @And("^user enters player email generated through vip code$")
    public void user_enters_player_email_generated_through_vip_code() throws Throwable {
    	HomePage objHomePage=new HomePageDesktopView();
    	objHomePage.setEmail(VipCodePage.vipCodeData.get("UniqueEmail"));
    }
    @And("^clicks on Next button on web app if mob app is opened$")
    public void clicks_on_next_button_on_web_app_if_mob_app_is_opened() throws Throwable {
    	HomePage objHomePage=new HomePageDesktopView();
    	objHomePage.clickNext();
    	
    }
    @And("^user enters player password generated through vip code$")
    public void user_enters_player_password_generated_through_vip_code() throws Throwable {
    	HomePage objHomePage=new HomePageDesktopView();
    	objHomePage.setPassword(VipCodePage.vipCodeData.get("Password"));
    }
    @When("^user click on login button on web app if mob app is opened$")
    public void user_click_on_login_button_on_web_app_if_mob_app_is_opened() throws Throwable {
    	HomePage objHomePage=new HomePageDesktopView();
    	objHomePage.clickLogin();
    }
    @Then("^player should be logged In on web app successfully if mob app is opened$")
    public void player_should_be_logged_in_on_web_app_successfully_if_mob_app_is_opened() throws Throwable {
    	HomePage objHomePage=new HomePageDesktopView();
    	objHomePage.verifyLoggedInScreen();
    }
    
    @Then("^Leaderboards page is opening on web app if mob app is opened$")
    public void leaderboards_page_is_opening_on_web_app_if_mob_app_is_opened() throws Throwable {
    	LeaderboardPage objLeaderboardPage=new LeaderboardPageDesktopView();
    	objLeaderboardPage.verifyLeaderboardPage();
    }

    @Then("^All and Department tabs are appearing on web app if mob app is opened$")
    public void all_and_department_tabs_are_appearing_on_web_app_if_mob_app_is_opened() throws Throwable {
    	LeaderboardPage objLeaderboardPage=new LeaderboardPageDesktopView();
    	objLeaderboardPage.verifyAllDeptTabs();
    }

    @And("^User clicks on Leaderboards on web app if mob app is opened$")
    public void user_clicks_on_leaderboards_on_web_app_if_mob_app_is_opened() throws Throwable {
    	LeaderboardPage objLeaderboardPage=new LeaderboardPageDesktopView();
    	objLeaderboardPage.clickLeaderboardsSideMenu();

    	
    }

    
    @And("^user tap on resend link button$")
    public void user_tap_on_resend_link_button() throws Throwable {
    	objVipCode.clickResendLink();
    }
    
    @Then("^verify that verify email alert is appearing$")
    public void verify_that_verify_email_alert_is_appearing(DataTable table) throws Throwable {
    	objVipCode.verifyAlertTitle(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }

    @Then("^verify that alert sub title is correct$")
    public void verify_that_alert_sub_title_is_correct(DataTable table) throws Throwable {
    	objVipCode.verifyAlertSubTitle(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));

    }

    @Then("^verify that alert description is correct$")
    public void verify_that_alert_description_is_correct(DataTable table) throws Throwable {
    	objVipCode.verifyAlertDetails(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));;

    }
    
    @Then("user clicks on Ok button on alert popup")
    public void user_clicks_on_Ok_button_on_alert_popup() {
    	objVipCode.clickOkAlertPopup();
    }
    

    @Then("^limited access is appearing on select game screen$")
    public void limited_access_is_appearing_on_select_game_screen() throws Throwable {
    	objVipCode.verifyLimitedAccess();
    }
}
