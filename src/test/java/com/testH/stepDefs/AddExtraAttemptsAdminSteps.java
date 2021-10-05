package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AddExtraAttemptsPage;
import com.testH.base.pages.admin.LeaderboardSettingsPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


public class AddExtraAttemptsAdminSteps {
	
private AddExtraAttemptsPage objAddExtraAttemptsPage;
	
	public AddExtraAttemptsAdminSteps()
	{
		objAddExtraAttemptsPage= new AddExtraAttemptsPage();
	}
	

    @And("^Manager clicks on add attempts button$")
    public void manager_clicks_on_add_attempts_button() throws Throwable {
    	Pojo.getObjSeleniumFunctions().waitFor(5);
    	objAddExtraAttemptsPage.clickAddExtraButton();
    }

    @And("^Manager searches game$")
    public void manager_searches_game() throws Throwable {
    	
    	objAddExtraAttemptsPage.enterGameName();
    }
    
    @And("^Manager searches already created game$")
    public void manager_searches_already_created_game(DataTable table) throws Throwable { 
    	objAddExtraAttemptsPage.enterAlreadyCreatedGameName(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager selects game$")
    public void manager_selects_game() throws Throwable {
    	objAddExtraAttemptsPage.selectSearchedCheckbox();
    	}

    @And("^Manager clicks on Next$")
    public void manager_clicks_on_next() throws Throwable {
    	objAddExtraAttemptsPage.clickNext();
    }

    @And("^Manager clicks on Add a filter$")
    public void manager_clicks_on_add_a_filter() throws Throwable {
    	objAddExtraAttemptsPage.clickAddFilter();
    }

    @And("^Manager selecyt name filter$")
    public void manager_selecyt_name_filter() throws Throwable {
    	objAddExtraAttemptsPage.clickName();
    }

    @And("^Manager enters player name$")
    public void manager_enters_player_name(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
    	String playerName=data.get(1).get(0);
    	objAddExtraAttemptsPage.enterPlayerName(playerName);
    	
    }

    @And("^Manager clicks on done icon$")
    public void manager_clicks_on_done_button() throws Throwable {
    	objAddExtraAttemptsPage.clickDoneIcon();
    }

    @And("^Manager selects player$")
    public void manager_selects_player() throws Throwable {
    	objAddExtraAttemptsPage.selectSearchedCheckbox();
    }

    @And("^Manager enter extra attempts$")
    public void manager_enter_extra_attempts(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
    	String attempt=data.get(1).get(0);
    	objAddExtraAttemptsPage.enterAttempts(attempt);
    }

    @And("^click on done button$")
    public void click_on_done() throws Throwable {
    	objAddExtraAttemptsPage.clickDoneButton();
    }

}
