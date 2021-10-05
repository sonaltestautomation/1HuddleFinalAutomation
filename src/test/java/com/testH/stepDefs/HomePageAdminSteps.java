package com.testH.stepDefs;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.BaseTest;
import com.testH.app.generic.InitializeEnvironment;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.SeleniumFunctionsWebApp;
import com.testH.app.generic.TestData;
import com.testH.app.generic.UtilitiesFunctions;
import com.testH.base.desktopView.HomePageDesktopView;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;


public class HomePageAdminSteps extends BaseTest {
	
	private LoginPage objLoginPage;
	private DashboardPage objDashboardPage;
	private BaseTest objBaseTest;
	private WebDriverWait webDriverWait;
    private UtilitiesFunctions objUtilitiesFunctions;
	private TestData objTestData;
	private SeleniumFunctionsHelper objSeleniumFunctions;
	private InitializeEnvironment objInitializeEnvironment;
	private WebDriver webDriver;
	private String baseURL = "";



	
	public HomePageAdminSteps() 
	{
		objLoginPage=new LoginPage();
		objDashboardPage=new DashboardPage();
		objBaseTest=new BaseTest();

	}
	
	
	@Given("^Manager is on Admin Home page$")
    public void manager_is_on_home_screen() throws Throwable {
		objBaseTest.loadAdminAppUrl();
		
		if(Pojo.getObjConfig().get("Target.Device").equals("androidapp"))
		{
			objInitializeEnvironment=new InitializeEnvironment();
			webDriver=objInitializeEnvironment.initializeWebEnvironment(Pojo.getObjConfig());
			Pojo.setDriver(webDriver); 
			webDriverWait = new WebDriverWait(webDriver,
					Integer.parseInt(Pojo.getObjConfig().getProperty("driver.WebDriverWait").trim()));
			Pojo.setWebDriverWait(webDriverWait);
			objUtilitiesFunctions = new UtilitiesFunctions();
			Pojo.setObjUtilitiesFunctions(objUtilitiesFunctions);
			objSeleniumFunctions = new SeleniumFunctionsWebApp();
			Pojo.setObjSeleniumFunctions(objSeleniumFunctions);
			objTestData = new TestData();
			Pojo.setObjTestData(objTestData);
			baseURL = Pojo.getObjConfig().getProperty("AUT_ADMIN_URL");
			Pojo.setBaseURL(baseURL);		
			this.loadBaseURL();			
			}
		objLoginPage.verifyHomePage();
    }

    @When("^Manager enters valid username$")
    public void manager_enters_valid_username(DataTable table) throws Throwable {
    	
    	
    	String data=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Test Data "+data);
    	objLoginPage.enterEmail(data);
    }

    @Then("^Manager should be logged In$")
    public void manager_should_be_logged_in() throws Throwable {
    	
    	System.out.println("Manager Logged In");
    }

    @And("^Manager enters valid password$")
    public void manager_enters_valid_password(DataTable table) throws Throwable {
    	String data=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Test Data "+data);
    	objLoginPage.enterPw(data);

    }
    
    @And("^Manager clicks next button$")
    public void manager_clicks_next_button() throws Throwable {
    	objLoginPage.clickNext();
    }

    @And("^Manager logs out$")
    public void manager_logs_out() throws Throwable {
    	objDashboardPage.verifyAndClickLogout();
    }

}
