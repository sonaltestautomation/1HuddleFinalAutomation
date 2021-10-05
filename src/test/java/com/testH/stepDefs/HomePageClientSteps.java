package com.testH.stepDefs;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.net.SyslogAppender;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.BaseTest;
import com.testH.app.generic.InitializeEnvironment;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.SeleniumFunctionsAndroidEnv;
import com.testH.app.generic.TestData;
import com.testH.app.generic.UtilitiesFunctions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;



import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.MorePage;




public class HomePageClientSteps {
	
	private HomePage objHomePage;
	private BaseTest objBaseTest;
	private GmailLoginPage objGmailLoginPage;
	private AndroidDriver<AndroidElement> androidDriver;
	private WebDriverWait webDriverWait;
    private UtilitiesFunctions objUtilitiesFunctions;
	private TestData objTestData;
	private SeleniumFunctionsHelper objSeleniumFunctions;
	private InitializeEnvironment objInitializeEnvironment;
	private AppiumDriverLocalService service;







	
	public HomePageClientSteps()
	{
		objHomePage = new PageFactory().getObjHomePage();
		objBaseTest=new BaseTest();
		objGmailLoginPage=new GmailLoginPage();
	}
	
	@Given("^user have 1huddle url or 1huddle app$")
    public void user_have_1huddle_url()
	{
		objBaseTest.loadWebAppUrl();
		String url=Pojo.getObjSeleniumFunctions().getCurrentURL();
		System.out.println("Current Url "+url);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that url is correct", Pojo.getObjConfig().get("AUT_URL").equals(url));
    }

    @When("^user hit or launch 1huddle$")
    public void user_hit_1huddle_url()  {
    	objHomePage.verifyWebAppUrl();
}

    @Then("^One Huddle page should be opened$")
    public void One_Huddle_page_should_be_opened() throws Throwable 
    {
    	//Assert.assertTrue(Pojo.getObjSeleniumFunctions().getTitle().equals("1Huddle"));
    	objHomePage.verify1HuddleHomePage();

    }

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws InterruptedException, IOException {
    	objBaseTest.loadWebAppUrl();
    	objHomePage.verifyWebAppUrl();
		objInitializeEnvironment=new InitializeEnvironment();
		if(Pojo.getObjConfig().get("Target.Device").equals("androidapp"))
    	{
   		System.out.println("Start Server");
   		service=objInitializeEnvironment.startServer();
		Pojo.setAppiumService(service);
    		androidDriver=objInitializeEnvironment.capabilities(Pojo.getObjConfig().getProperty("AppName"));
 			Pojo.setAndroidDriver(androidDriver);
 			androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			webDriverWait = new WebDriverWait(androidDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
		    Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsAndroidEnv();			
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);
    	}
    	objHomePage.verify1HuddleHomePage();
    	}

    @When("^user enters email$")
    public void player_enters_valid_email(DataTable table) {
    	
    	List<List<String>> data=table.asLists();
    	String userData=data.get(1).get(0);
    	System.out.println("User Data "+userData);
    	
    	objHomePage.setEmail(userData);
    	}
    
    @And("^user enters recently added email$")
    public void user_enters_recently_added_email() {
    	
    	String userData=AllUsersPage.expectedDataUser.get("UserEmail");
    	System.out.println("User Data "+userData);
    	objHomePage.setEmail(userData);
    	}
    @And("^user enters recently added password$")
    public void user_enters_recently_added_pw() {
    	
    	String userData=AllUsersPage.expectedDataUser.get("UserPassword");
    	System.out.println("User Data "+userData);
    	objHomePage.setPassword(userData);
    	}
    
    @And("^clicks on Next button$")
    public void clicks_on_next_button() throws Throwable {
    	objHomePage.clickNext();
    }
    
    @And("^clicks on Next button on password reset screen$")
    public void clicks_on_next_button_on_password_reset_screen() throws Throwable {
    	objHomePage.clickNextForgotPwScreen();
    }

    
    @And("^user enters password$")
    public void player_enters_valid_password(DataTable table) throws Throwable {
    	
    	String data=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Test Data "+data);
    	objHomePage.setPassword(data);

    	
    }

    @And("^user click on login button$")
    public void player_click_on_login_button() throws Throwable {
    	objHomePage.clickLogin();
    	
    }

    @Then("^player should be logged In successfully$")
    public void player_should_be_logged_in_successfully() throws Throwable {
    	//Pojo.getObjSeleniumFunctions().waitFor(5);
    	objHomePage.verifyLoggedInScreen();  
    	}

    @Then("^validation message is appearing$")
    public void validation_message_is_appearing(DataTable table) throws Throwable {
    	String testDataWebApp=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String testDataAndroidApp=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Test Data WebApp "+testDataWebApp);
    	objHomePage.verifyValidation(testDataWebApp);
    	
    	String testDataAndroid=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Test Data Android "+testDataAndroid);
    	
    	objHomePage.verifyValidationMobileApp(testDataAndroid);
    	}
    
    @And("^clicks on OK button on validation message popup$")
    public void clicks_on_ok_button_on_validation_message_popup() throws Throwable {
    	objHomePage.clickAndOkButtonValidationPopUp();
    }
    
    @Given("^user selects user type$")
    public void user_selects_user_type(DataTable table) throws Throwable {
    	String testData=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objHomePage.selectUserType(testData);
    }

    @Then("^deactive user validation message is appearing$")
    public void deactive_user_validation_message_is_appearing(DataTable table) throws Throwable {
    	String testDataWebApp=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Test Data WebApp "+testDataWebApp);
    	objHomePage.verifyValidationDeactiveUser(testDataWebApp);    	
    	String testDataAndroid=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Test Data Android "+testDataAndroid);
    	
    	objHomePage.verifyValidationMobileApp(testDataAndroid);
    	}
    	
    @Then("^user should be logged In successfully$")
    public void user_should_be_logged_in_successfully() throws Throwable {
    	objHomePage.verifyLoggedInManagersRole();
    }
    
    @And("^User is logged In$")
    public void user_is_logged_in(DataTable table) throws Throwable {
   	List<List<String>> data=table.asLists();
    	String userName=data.get(1).get(0);
    	String password=data.get(1).get(1);
    	userName=Pojo.getObjConfig().getProperty(userName);
    	password=Pojo.getObjConfig().getProperty(password);
    	
   	    objHomePage.setEmail(userName);
     	objHomePage.clickNext();
     	objHomePage.setPassword(password);
     	objHomePage.clickLogin();
    }
    @When("^user clicks on Forgot Your Password link$")
    public void user_clicks_on_forgot_your_password_link() throws Throwable {
    	objHomePage.verifyAndClickForgotPw();
    }

    @Then("^Confirm email page is opening$")
    public void confirm_email_page_is_opening() throws Throwable {
    	objHomePage.verifyConfirmEmailPage();
    }
    
    @Then("^Confirm email and Please confirm your email address to proceed text is appearing$")
    public void confirm_email_and_please_confirm_your_email_address_to_proceed_text_is_appearing() throws Throwable {
    	objHomePage.verifyTextOnForgotPassword();
    }

    @And("^Email field is autofilled with user email$")
    public void email_field_is_autofilled_with_user_email() throws Throwable {
    	objHomePage.verifyAutofilledEmail();
    }
    @Then("^success message is appearing$")
    public void success_message_is_appearing(DataTable table) throws Throwable {
    	objHomePage.verifySuccessMessage(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^user clicks on Ok button$")
    public void user_clicks_on_ok_button() throws Throwable {
    	objHomePage.clickOk();
    }
    
    @And("^closes current window$")
    public void closes_current_window() throws Throwable {
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	objHomePage.closeBrowserWindowIfMobAppNotOpened();
}

    @And("^Manager closes web app if mobile app is opened$")
    public void manager_closes_web_app_if_mobile_app_is_opened() throws Throwable {
    	Pojo.getObjSeleniumFunctions().waitFor(7);
    	objHomePage.closeBroserWindowIfMobileAppOpened();

    }
    
    @Then("^user verify and open reset password link in email$")
    public void user_is_getting_reset_password_link_in_email(DataTable table) throws Throwable {
    	
    	String mail=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	
    	mail=Pojo.getObjConfig().getProperty(mail);
    	pw=Pojo.getObjConfig().getProperty(pw);
    	
    	objGmailLoginPage.gmailLogin(mail, pw);
    	objGmailLoginPage.verifyAndOpenForgotPwMail();
    	objGmailLoginPage.clickResetPw();
    	
    	
    }
    
    @And("^user is on Gmail home page$")
    public void user_is_on_gmail_home_page() throws Throwable {
    	objBaseTest.loadGmailUrl();
    }
    
    @And("^user enters new password$")
    public void user_enters_new_password(DataTable table) throws Throwable {
    	String newPw=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	newPw=Pojo.getObjConfig().getProperty(newPw);
    	objHomePage.enterNewPassword(newPw);
    	
    }

    @And("^user enters confirm password$")
    public void user_enters_confirm_password(DataTable table) throws Throwable {
    	String confPw=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	confPw=Pojo.getObjConfig().getProperty(confPw);
    	objHomePage.enterConfirmPassword(confPw);
    }
    
    @Then("^Next button is disabled$")
    public void next_button_is_disabled() throws Throwable {
    	objHomePage.verifyNextButtonDisabled();
    }
    
    @Then("^validation message is appearing for password mismatch$")
    public void validation_message_is_appearing() throws Throwable {
    	objHomePage.verifyValidationConfirmPasswordMismatch();
    }
    
    @Then("^Verify that success message$")
    public void verify_that_success_message() throws Throwable {
    	objHomePage.verifySuccessMessageAfterReset();
    }

    @And("^Verify user is able to login with new password$")
    public void verify_user_is_able_to_login_with_new_password() throws Throwable {
    	objHomePage.verifyLoginWithUpdatedPassword();
    }
    
    @Given("^User launch app$")
    public void user_launch_app() throws Throwable {
    	System.out.println("App Launch Successfully");
    }
    
    @When("^User tap on prefrences$")
    public void user_tap_on_prefrences() throws Throwable {
    	objHomePage.clickPrefrences();
    }

    @Then("^Prefrences screen should be opened$")
    public void prefrences_screen_should_be_opened() throws Throwable {
    	objHomePage.verifyPrefrenceScreen();
    }
    
    @And("^Games icon should be selected by default for mobile app$")
    public void games_icon_should_be_selected_by_default_for_mobile_app() throws Throwable {
    	objHomePage.verifyAutoSelectedCentreGameIcon();
    }
    
    @And("^user closes tutorial screen for mobile app$")
    public void user_closes_tutorial_screen_for_mobile_app() throws Throwable {
    	objHomePage.verifyAndClickSkipButton();
    }

    
}
