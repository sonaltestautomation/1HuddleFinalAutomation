package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class CreateManagerSteps {
	
private AllUsersPage objAllUsersPage;
	
	public CreateManagerSteps()
	{
	   objAllUsersPage = new AllUsersPage();
	}
	
	
	@And("^Manager clicks on Managers$")
    public void manager_clicks_on_managers() throws Throwable {
    	objAllUsersPage.clickManagers();
    }

	@Then("^Managers page is opening$")
    public void managers_page_is_opening() throws Throwable {
		objAllUsersPage.verifyManagersPage();
    }

	@And("^Manager clicks on add new manager button$")
    public void manager_clicks_on_add_new_manager_button() throws Throwable {
		objAllUsersPage.clickAddUserButton();
    }
	
	@Then("^Add manager page is opening$")
    public void add_manager_page_is_opening() throws Throwable {
		objAllUsersPage.verifyAddManagersPage();
	}

	@And("^Manager selects user type$")
    public void manager_selects_user_type(DataTable table) throws Throwable {
		String userType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		System.out.println("User Type "+userType);
		objAllUsersPage.selectUserType(userType);
		
    }

    @And("^Manager enters basic manager info$")
    public void manager_enters_basic_manager_info(DataTable table) throws Throwable {
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objAllUsersPage.setPassword(pw);    	
    }
    
    @Then("^new manager is adding$")
    public void new_manager_is_adding() throws Throwable {
    	objAllUsersPage.verifyNewlyAddedUser();
    }
    
    @And("^Manager add a manager$")
    public void manager_add_a_player(DataTable table) throws Throwable {
    	objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickManagers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	String userType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	
    	System.out.println("User Type "+userType);
    	objAllUsersPage.selectUserType(userType);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAddBtn();
    	
    }
    @And("^Manager searches specific manager$")
    public void manager_searches_specific_manager() throws Throwable {
    	objAllUsersPage.searchSpecificManager();
    }

}
