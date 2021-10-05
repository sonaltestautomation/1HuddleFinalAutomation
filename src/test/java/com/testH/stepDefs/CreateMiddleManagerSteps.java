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

public class CreateMiddleManagerSteps {
	
private AllUsersPage objAllUsersPage;
	
	public CreateMiddleManagerSteps()
	{
	   objAllUsersPage = new AllUsersPage();
	}
	
	@And("^Manager enters basic middle manager info$")
    public void manager_enters_basic_middlemanager_info(DataTable table) throws Throwable {
		objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
		String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	objAllUsersPage.addUserEmail();
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objAllUsersPage.setPassword(pw);    	
    }
    
	@Then("^new middle manager is adding$")
    public void new_teamlead_is_adding() throws Throwable {
		objAllUsersPage.verifyNewlyAddedUser();
    }
    
	@And("^Manager add a middlemanager$")
    public void manager_add_a_player(DataTable table) throws Throwable {
		objAllUsersPage.clickUsersIcon();
    	objAllUsersPage.clickManagers();
    	objAllUsersPage.clickAddUserButton();
    	objAllUsersPage.addFirstName();
    	objAllUsersPage.addLastName();
    	
    	String userType=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	System.out.println("UserType "+userType);
    	objAllUsersPage.selectUserType(userType);
    	
    	String deptName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	System.out.println("Dept Name "+deptName);
    	objAllUsersPage.addDepartment(deptName);
    	
    	objAllUsersPage.addUserEmail();
    	
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
    	objAllUsersPage.setPassword(pw);
    	objAllUsersPage.clickAddBtn();
    	
    }
}

