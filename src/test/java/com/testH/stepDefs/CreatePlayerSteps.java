package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.BaseTest;
import com.testH.app.generic.InitializeEnvironment;
import com.testH.app.generic.Pojo;
import com.testH.app.generic.SeleniumFunctionsAndroidEnv;
import com.testH.app.generic.TestData;
import com.testH.app.generic.UtilitiesFunctions;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.EditPlayerPage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.client.HomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class CreatePlayerSteps {
	
	private BaseTest objBaseTest;
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private AllUsersPage objAllUsersPage;
	
	private GmailLoginPage objGmailLoginPage;
	private AndroidDriver<AndroidElement> androidDriver;
	private WebDriverWait webDriverWait;
    private UtilitiesFunctions objUtilitiesFunctions;
	private TestData objTestData;
	private SeleniumFunctionsHelper objSeleniumFunctions;
	private InitializeEnvironment objInitializeEnvironment;
	private AppiumDriverLocalService service;
	
	public static int totalPlayerCount;
	
	public CreatePlayerSteps()
	{
		objBaseTest = new BaseTest();
		objLoginPage = new LoginPage();
		objAllUsersPage = new AllUsersPage();
		objHomePage=new PageFactory().getObjHomePage();	
	}

	
    @When("^Manager clicks on users$")
    public void manager_clicks_on_users() throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    }
    
    @And("^Manager clicks on players$")
    public void manager_clicks_on_players() throws Throwable {
    	objAllUsersPage.clickPlayers();
    }
    
    @Then("^Players page is opening$")
    public void players_page_is_opening() throws Throwable {
    	objAllUsersPage.verifyAllPlayersPage();
    }
    
    @And("^Manager clicks on add player button$")
    public void manager_clicks_on_add_player_button() throws Throwable {
    	objAllUsersPage.clickAddUserButton();
    }
    
    @Then("^Add player page is opening$")
    public void add_player_page_is_opening() throws Throwable {
    	objAllUsersPage.verifyAddPlayerPage();
    }
    
    @And("^Manager enters all basic details$")
    public void manager_add_all_basic_details(DataTable table) throws Throwable {
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.setPassword(pw);
    	}
    
    @And("^Manager clicks on ADD button$")
    public void manager_clicks_on_add_button() throws Throwable {
    	objAllUsersPage.clickAddBtn();
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    }
    
    @Then("^new player is adding$")
    public void new_player_is_adding() throws Throwable {
    	objAllUsersPage.verifyNewlyAddedUser();
    }

    @And("^new player is able to login to app$")
    public void new_player_is_able_to_login_to_webapp() throws Throwable {
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
			//Pojo.setDriver(androidDriver);
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
    	objHomePage.verifyLoginWithNewlyAddedPlayer();


//  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user can enter url", Pojo.getObjConfig().get("AUT_URL").equals(url));
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home page is opening", Pojo.getObjSeleniumFunctions().getTitle().equals("1Huddle"));

    }
    
    @And("^recently created players login to the app$")
    public void recently_created_players_login_to_the_app(DataTable table) throws Throwable {
    	int playerNum=Integer.parseInt(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objHomePage.verifyLoginWithNewlyAddedPlayer(playerNum);
    }
    

    @And("^Manager add a player$")
    public void manager_add_a_player(DataTable table) throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAddBtn();
    	
    }
    
    @And("^Manager add a player to specific location and department$")
    public void manager_add_a_player_to_specific_location_and_department(DataTable table) throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String loctName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Loct Name "+loctName);
    	objAllUsersPage.addLocation(loctName);
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAddBtn();
    }
    
    @And("^Manager add a player to specific location department and group$")
    public void manager_add_a_player_to_specific_location_and_department_and_group(DataTable table) throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String loctName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Loct Name "+loctName);
    	objAllUsersPage.addLocation(loctName);
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAdditionalInfo();
    	String groupName=Pojo.getObjSeleniumFunctions().getTestData(1, 3, table);
    	System.out.println("Group Name "+groupName);
    	objAllUsersPage.selectGroup(groupName);
    	objAllUsersPage.clickAddBtn();
    }
    
    @And("^Manager add players to specific location and department$")
    public void manager_add_players_to_specific_location_and_department(DataTable table) throws Throwable {
    	
    	String strPlayerCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int playerCountToAdd=Integer.parseInt(strPlayerCount);
    	
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	
    	for(int i=1;i<=playerCountToAdd;i++)
    	{
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String loctName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Loct Name "+loctName);
    	objAllUsersPage.addLocation(loctName);
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 3, table);
         objAllUsersPage.setUserEmailaAndPassword(i,pw);
    	objAllUsersPage.clickAddBtn();
    }}
    
    @And("^Manager add players to specific location, department and group$")
    public void manager_add_players_to_specific_location_department_and_group(DataTable table) throws Throwable {
    	
    	String strPlayerCount=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	int playerCountToAdd=Integer.parseInt(strPlayerCount);
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	for(int i=1;i<=playerCountToAdd;i++)
    	{
    	
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	
    	String loctName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.addLocation(loctName);

    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);

    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 3, table);
        objAllUsersPage.setUserEmailaAndPassword(i,pw);

    	objAllUsersPage.clickAdditionalInfo();
    	String groupName=Pojo.getObjSeleniumFunctions().getTestData(1, 4, table);
    	objAllUsersPage.selectGroup(groupName);
    	objAllUsersPage.clickAddBtn();

    }
    }
    @And("^Manager add a player with additional information$")
    public void manager_add_a_player_with_additional_info(DataTable table) throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickPlayers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAdditionalInfo();
    	String groupName=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	objAllUsersPage.selectGroup(groupName);
    	objAllUsersPage.clickAddBtn();
    	
    }
    
    @When("^Manager deactive a user$")
    public void manager_deactive_a_user() throws Throwable {
    	objAllUsersPage.deactivateUser();
    }

    @And("^Manager searches specific player$")
    public void manager_searches_specific_player() throws Throwable {
    	objAllUsersPage.searchSpecificPlayer();
    }

    @Then("^validation message is appearing to deactive user$")
    public void validation_message_is_appearing_to_deactive_user(DataTable table) throws Throwable {
    	String testData=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	
    }

   
    @And("^Manager clicks on user icon in side menu$")
    public void manager_clicks_on_user_icon_in_side_menu() throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    }

    @And("^Manager clicks on Players button in side menu$")
    public void manager_clicks_on_players_button_in_side_menu() throws Throwable {
    	objAllUsersPage.clickPlayers();
    }

    @And("^Manager deactive all the recently added players$")
    public void manager_deactive_the_players_who_played_game_recently() throws Throwable {
    	objAllUsersPage.deactivatAllRecentlyAddedUsers();
    
    }
    
    @And("^Manager gets total player count from all players screen$")
    public void manager_gets_total_player_count_from_all_players_screen() throws Throwable {
    	totalPlayerCount=objAllUsersPage.getTotalPlayerCount();
    }
    
    


    @Then("^download button is appearing under option on all players page$")
    public void download_button_is_appearing_under_option_on_all_players_page() throws Throwable {
    	objAllUsersPage.verifyDownloadBtn();
    }

    @Then("^Upload button is appearing under option on all players page$")
    public void upload_button_is_appearing_under_option_on_all_players_page() throws Throwable {
    	objAllUsersPage.verifyUploadBtn();
    	
    }
    
    


    

    

    
}
