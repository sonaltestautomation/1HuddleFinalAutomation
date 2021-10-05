package com.testH.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.client.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class SideMenuAdminSteps {
	
	private DashboardPage objDashboardPage;
	private BuildSpGamePage objBuildSpGamePage;
	
	public SideMenuAdminSteps()
	{
		objDashboardPage=new DashboardPage();
		objBuildSpGamePage=new  BuildSpGamePage();
		
	}

	@And("^Manager clicks on Companies$")
    public void manager_clicks_on_companies() throws Throwable {
    }

	
	@And("^Manager clicks on Settings$")
    public void manager_clicks_on_settings() throws Throwable {
		objDashboardPage.clickSettings();
    }
	
	@And("^Manager clicks on Leaderboard$")
    public void manager_clicks_on_leaderboard() throws Throwable {
		objDashboardPage.clickLeaderBoard();

    }
	@And("^Manager clicks on attempts$")
    public void manager_clicks_on_attempts() throws Throwable {
		objDashboardPage.clickAttempts();
		objDashboardPage.mouseHove1hLogo();
    }
	
	@And("^manager clicks on game library$")
    public void manager_clicks_on_game_library() throws Throwable {
		objBuildSpGamePage.clickGameIcon();
		objBuildSpGamePage.clickGameLibrary();
    }
	
	@And("^Manager clicks on GamesIcon$")
    public void manager_clicks_on_gamesicon() throws Throwable {
		objDashboardPage.clickGameIcon();
    }

    @And("^Manager clicks on Player Feedback$")
    public void manager_clicks_on_player_feedback() throws Throwable {
    	objDashboardPage.verifyAndClickPlayerFeedback();
    }
    
    @And("^Manager clicks on Trophies$")
    public void manager_clicks_on_trophies() throws Throwable {
    	objDashboardPage.verifyAndClickTrophies();
    }
    @And("^Manager clicks on VIP codes under settings$")
    public void manager_clicks_on_vip_codes_under_settings() throws Throwable {
    	objDashboardPage.clickVipCode();
    }
    
    @And("^Manager mouse hover on game icon$")
    public void manager_mouse_hover_on_side_menu_item() throws Throwable {
    	objBuildSpGamePage.mouseHoverGameIcon();
    }
    

    @And("^Manger clicks on Questions in side menu$")
    public void manger_clicks_on_questions_in_side_menu() throws Throwable {
    	
    	objDashboardPage.clickQuestions();
    	
    }
    
    @And("^Manager mouse hover on 1h logo on admin$")
    public void manager_mouse_hover_on_1h_logo_on_admin() throws Throwable {
    	objDashboardPage.mouseHove1hLogo();
    }
    
    @And("^Manager clicks on reports in side menu$")
    public void manager_clicks_on_reports_in_side_menu() throws Throwable {
    	objDashboardPage.clickReports();
    }

    @And("^Manager clicks on side menu sub item$")
    public void manager_clicks_on_side_menu_sub_item(DataTable table) throws Throwable {
    	objDashboardPage.clickSideMenuSubItem(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

}
