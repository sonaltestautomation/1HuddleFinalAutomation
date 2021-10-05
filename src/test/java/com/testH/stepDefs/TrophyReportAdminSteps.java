package com.testH.stepDefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.DashboardPage;
import com.testH.base.pages.admin.DetailedReportPage;
import com.testH.base.pages.admin.GmailLoginPage;
import com.testH.base.pages.admin.TrophiesReportPageAdmin;
import com.testH.businessFlow.client.PlayGameFlow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class TrophyReportAdminSteps {
	
	private TrophiesReportPageAdmin objTrophiesReportPageAdmin;
	
	

	
	public TrophyReportAdminSteps()
	{
		objTrophiesReportPageAdmin=new TrophiesReportPageAdmin();
		

	}

	@And("^Manager clicks on general trophy type$")
    public void manager_clicks_on_general_trophy_type(DataTable table) throws Throwable {
		objTrophiesReportPageAdmin.selectGeneralTrophy(Pojo.getObjSeleniumFunctions().getTestData(1,0, table));
    }
	
	@And("^Manager clicks on download icon$")
    public void manager_clicks_on_download_icon() throws Throwable {
		
		
		objTrophiesReportPageAdmin.clickDownloadIcon();
    }
	
	@And("^Manager selects item from the list$")
    public void manager_selects_item_from_the_list(DataTable table) throws Throwable {
		objTrophiesReportPageAdmin.selectListItem(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }
}


