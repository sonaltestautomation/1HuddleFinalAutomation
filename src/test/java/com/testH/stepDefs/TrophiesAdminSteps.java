package com.testH.stepDefs;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TrophiesAdminSteps {
	
	private TrophiesPageAdmin objTrophiesPageAdmin;
	private DashboardPage objDashboardPage;

    
	public TrophiesAdminSteps()
	{
		objTrophiesPageAdmin=new TrophiesPageAdmin();
		objDashboardPage=new DashboardPage();

	}
	

    @And("^Manager selects Trophy filter$")
    public void manager_selects_trophy_filter() throws Throwable {
    	objTrophiesPageAdmin.selectTrophyFilter();
    }

    @And("^Manager selects tab$")
    public void manager_selects_tab(DataTable table) throws Throwable {
    	objTrophiesPageAdmin.selectTab(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }
    
    @And("^Manager enters trophy name and search$")
    public void manager_enters_trophy_name_and_search() throws Throwable {
    	objTrophiesPageAdmin.enterTrophyName();
    	objTrophiesPageAdmin.clickDoneBtn();
    	
    }
    
    @And("^Manager clicks on option burger button$")
    public void manager_clicks_on_option_burger_button() throws Throwable {
    	objTrophiesPageAdmin.clickOptions();
    }

    @And("^Manager clicks on edit button$")
    public void manager_clicks_on_edit_button() throws Throwable {
    	objTrophiesPageAdmin.clickEdit();
    }

    @And("^Manager enters point$")
    public void manager_enters_point(DataTable table) throws Throwable {
    	objTrophiesPageAdmin.enterPoints(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager enters attempts$")
    public void manager_enters_attempts(DataTable table) throws Throwable {
    	objTrophiesPageAdmin.enterAttempts(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager selects high score$")
    public void manager_selects_high_score(DataTable table) throws Throwable {
    	objTrophiesPageAdmin.setHighScore(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager enters trophy description$")
    public void manager_enters_trophy_description(DataTable table) throws Throwable {
    	objTrophiesPageAdmin.enterDescription(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^Manager clicks on Save button$")
    public void manager_clicks_on_save_button() throws Throwable {
    	objTrophiesPageAdmin.clickSave();
    }
    
    @And("^Manager clicks on Update button$")
    public void manager_clicks_on_update_button() throws Throwable {
    	objTrophiesPageAdmin.clickUpdate();
    }
    
    @And("^Manager enters already created game trophy name and search$")
    public void manager_enters_already_created_game_trophy_name_and_search(DataTable table) throws Throwable {
        objTrophiesPageAdmin.searchAlreayCreatedTrophy(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    	objTrophiesPageAdmin.clickDoneBtn();


    }
    
    @And("^Manager enters recently created game name and select it on game trophies screen$")
    public void manager_enters_recently_created_game_name_and_select_it_on_game_trophies_screen() throws Throwable {
    	objDashboardPage.enterGameName();
    	objTrophiesPageAdmin.clickDoneBtn();


    }
    

}
