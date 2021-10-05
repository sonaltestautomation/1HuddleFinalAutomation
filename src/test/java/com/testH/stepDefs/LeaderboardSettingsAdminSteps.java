package com.testH.stepDefs;
import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.LeaderboardSettingsPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LeaderboardSettingsAdminSteps {
	
private LeaderboardSettingsPage objLeaderboardSettingsPage;
	
	public LeaderboardSettingsAdminSteps()
	{
		objLeaderboardSettingsPage = new LeaderboardSettingsPage();
	}

    @And("^Manager selects next reset date$")
    public void manager_selects_next_reset_date(DataTable table) throws Throwable {
    	List<List<String>> data=table.asLists();
    	String calType=data.get(1).get(0);
    	String date=data.get(1).get(1);
    	objLeaderboardSettingsPage.setRandomDateLeaderboard(calType, date);
    }

    @And("^Manager Save changes$")
    public void manager_save_changes() throws Throwable {
    	objLeaderboardSettingsPage.clickSave();
    	objLeaderboardSettingsPage.clickYesConfirmation();
    }

}
