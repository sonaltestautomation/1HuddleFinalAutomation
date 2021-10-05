package com.testH.stepDefs;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.ApiTestPage;


public class ApiTestSteps {
	
	ApiTestPage apitestpage;
	
	public ApiTestSteps()
	{
		apitestpage= new ApiTestPage();
	}
	
	@Given("^I am an authorized user$")
    public void i_am_an_authorized_user(DataTable table) throws Throwable {
	      	
		
    	
		apitestpage.authorization_API(Pojo.getObjConfig().getProperty(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table)),Pojo.getObjConfig().getProperty(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table)));
    }

    @When("^I add new contest$")
    public void i_add_new_contest(DataTable table) throws Throwable {
    	
    	apitestpage.addNewContest_API(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^I add reward to contest$")
    public void i_add_reward_to_contest(DataTable table) throws Throwable {
    	
    	apitestpage.addRewardToContest_API(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	
    }
    @And("^I update contest$")
    public void i_update_contest() throws Throwable {
    	
    	apitestpage.updateContest_API();
	  }
    
    @And("^I add game to contest$")
    public void i_add_game_to_contest(DataTable table) throws Throwable {
    	
    	apitestpage.addGametoContest_API(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table),Pojo.getObjSeleniumFunctions().getTestData(1, 1, table)); 	  	
    }
    
    @And("^I add assignment in contest$")
    public void i_add_assignment_in_contest(DataTable table) throws Throwable {
    	
    	String locationId=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String locationName=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	String deptId=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);  	
    	apitestpage.addAssignmentToContest_API(locationId,locationName,deptId);  	
    }
    
    @Then("^Contest publish successfully$")
    public void contest_publish_successfully() throws Throwable {
    	apitestpage.publishContest_API();
    }

   

    

   

}
