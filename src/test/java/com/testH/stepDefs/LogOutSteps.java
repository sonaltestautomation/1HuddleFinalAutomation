package com.testH.stepDefs;

import java.util.List;

import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.MorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class LogOutSteps {
	
	private MorePage objMorePage;
	private HomePage objHomePage;
	
	
	
	public LogOutSteps()
	{
		objMorePage= new PageFactory().getMorePage();
		objHomePage=new PageFactory().getObjHomePage();
		
	}
	
	@When("^User clicks on more Button$")
    public void user_clicks_on_more_button() throws Throwable {
		objMorePage.clickMoreOption();
		
    }

	@Then("^More page is opening$")
    public void more_page_is_opening() throws Throwable {
		objMorePage.verifyMorePage();
    }
	
    @And("^Correct options are appearing$")
    public void correct_options_are_appearing(DataTable table) throws Throwable {
    	
    	List<List<String>> data=table.asLists();
    	String editProfileText=data.get(0).get(0);
    	String helpText=data.get(0).get(1);
    	String changeLanguageText=data.get(0).get(2);
    	String logOutText=data.get(0).get(3);
    	
    	objMorePage.verifyMoreOptions(editProfileText,helpText,changeLanguageText,logOutText);
    	
    	
    }

    @And("^Clicks on Logout button$")
    public void clicks_on_logout_button() throws Throwable {
    	objMorePage.clickLogout();
    }
    
    @Then("^Home page is appearing$")
    public void home_page_is_appearing() throws Throwable {
    	objHomePage.verifyPlayerToggleText();
    }
    
    @And("^User clicks on more button for mobile app$")
    public void user_clicks_on_more_button_for_mobile_app() throws Throwable {
    	objMorePage.clickMoreOptionMobApp();
    }
}
