package com.testH.stepDefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
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

public class CSVDownloadSteps {
	
	private DashboardPage objDashboardPage;
	private DetailedReportPage objDetailedReportPage;
	private GmailLoginPage objGmailLoginPage;
	private AllUsersPage objAllUsersPage;

	
	
	
	
	public static HashMap<String, List> expectedCsvData = new HashMap<String, List>();
	ArrayList<String> expectedDataRow1=new ArrayList<String>();
	ArrayList<String> expectedDataRow2=new ArrayList<String>();
	ArrayList<String> expectedDataRow3=new ArrayList<String>();
	ArrayList<String> expectedDataRow4=new ArrayList<String>();
	ArrayList<String> expectedDataRow5=new ArrayList<String>();
	ArrayList<String> expectedDataRow6=new ArrayList<String>();
	ArrayList<String> expectedDataRow7=new ArrayList<String>();
	ArrayList<String> expectedDataRow8=new ArrayList<String>();
	ArrayList<String> expectedDataRow9=new ArrayList<String>();
	ArrayList<String> expectedDataRow10=new ArrayList<String>();

	
	
	public CSVDownloadSteps()
	{
		objDetailedReportPage=new DetailedReportPage();
		objDashboardPage=new DashboardPage();
		objGmailLoginPage=new GmailLoginPage();
		objAllUsersPage = new AllUsersPage();

	}

	@Then("^options burger button is appearing and working$")
    public void options_burger_button_is_appearing_and_working() throws Throwable {
    	objAllUsersPage.verifyAndClickOptionBurgerBtn();
    }
	
	@And("^Manager clicks on upload button$")
    public void manager_clicks_on_upload_button() throws Throwable {
    	objAllUsersPage.clickUploadBtn();
    	}
    
    @And("^Manager clicks on download sample csv button$")
    public void manager_clicks_on_download_sample_csv_button() throws Throwable {
    	objAllUsersPage.clickDownloadSampleCsv();
    }

	 @And("^correct data is showing in downloaded csv for player statistics$")
	    public void correct_data_is_showing_in_downloaded_csv_for_statistics(DataTable table) throws Throwable {
	    	
		    String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
			String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
			String playerFullName=playerFirstName+" "+playerLastName;
			String playerEmail=AllUsersPage.expectedDataUser.get("UserEmail");
			int gameCount=PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
			String strGameCount=String.valueOf(gameCount);
			int gameTime=PlayGameFlow.expectedGamePlayData.get("TotalGameTime");
			String strGameTime="";
			
			if(gameTime>9)
			{
				strGameTime="00:00:"+gameTime;
			}
			else
			{
				strGameTime="00:00:0"+gameTime;
			}

	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	
	    	expectedDataRow2.add(playerFullName);
	    	expectedDataRow2.add(playerEmail);
	    	expectedDataRow2.add(strGameTime);
	    	expectedDataRow2.add("00:00:00");
	    	expectedDataRow2.add(strGameCount);
	    	expectedDataRow2.add("0");
	    	
	    	expectedDataRow3.add("");
//	    	expectedDataRow3.add("");
//	    	expectedDataRow3.add("");
//	    	expectedDataRow3.add("");
//	    	expectedDataRow3.add("");
//	    	expectedDataRow3.add("");
	    	
	    	expectedDataRow4.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow4.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow4.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow4.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	
	    	expectedDataRow5.add("1");
	    	expectedDataRow5.add("ROOKIE");
	    	expectedDataRow5.add("Achieved");
	    	expectedDataRow5.add(Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy"));
	    	
	    	expectedDataRow6.add("2");
	    	expectedDataRow6.add("STARTER");
	    	expectedDataRow6.add("No");
	    	expectedDataRow6.add("");
	    	
	    	expectedDataRow7.add("3");
	    	expectedDataRow7.add("PROFESSIONAL");
	    	expectedDataRow7.add("No");
	    	expectedDataRow7.add("");
	    	
	    	expectedDataRow8.add("4");
	    	expectedDataRow8.add("ALL_STAR");
	    	expectedDataRow8.add("No");
	    	expectedDataRow8.add("");
	    	
	    	expectedDataRow9.add("5");
	    	expectedDataRow9.add("MASTER");
	    	expectedDataRow9.add("No");
	    	expectedDataRow9.add("");
	    	
	        expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        expectedCsvData.put("Row 3",expectedDataRow3);
	        expectedCsvData.put("Row 4",expectedDataRow4);
	        expectedCsvData.put("Row 5",expectedDataRow5);
	        expectedCsvData.put("Row 6",expectedDataRow6);
	        expectedCsvData.put("Row 7",expectedDataRow7);
	        expectedCsvData.put("Row 8",expectedDataRow8);
	        expectedCsvData.put("Row 9",expectedDataRow9);
	        
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	        
 }

	 @And("^correct data is showing in downloaded csv for player detail report$")
	    public void correct_data_is_showing_in_downloaded_csv_for_player_detail_report(DataTable table) throws Throwable {
		 String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
			String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
			String playerFullName=playerFirstName+" "+playerLastName;
			String playerEmail=AllUsersPage.expectedDataUser.get("UserEmail");
			int gameCount=PlayGameFlow.expectedGamePlayData.get("TotalGameCount");
			String strGameCount=String.valueOf(gameCount);
			int gameTime=PlayGameFlow.expectedGamePlayData.get("TotalGameTime");
			String strGameTime="";
			
			if(gameTime>9)
			{
				strGameTime="00:00:"+gameTime;
			}
			else
			{
				strGameTime="00:00:0"+gameTime;
			}
			
			int gamePoints=PlayGameFlow.expectedGamePlayData.get("TotalPoints");
			String strGamePoints=String.valueOf(gamePoints);
			
			String gameEndTime=PlayGameFlow.expectedGameData.get("Game 1 End Time").get(0)+" PM IST";
			
			
			

	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	
	    	
	    	
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(playerFullName);
	    	expectedDataRow2.add(playerEmail);
	    	expectedDataRow2.add(strGameCount);
	    	expectedDataRow2.add(strGameTime);
	    	expectedDataRow2.add(strGamePoints);
	    	expectedDataRow2.add(gameEndTime);
	    	
	    	expectedDataRow2.add("0");
	    	expectedDataRow2.add("00:00:00");
	    	expectedDataRow2.add("0");
	    	expectedDataRow2.add("0");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("100");
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Department"));
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Location"));
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Group"));
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        
	        
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    }
	 
	 @And("^correct data is showing in downloaded players csv$")
	    public void correct_data_is_showing_in_downloaded_players_csv(DataTable table) throws Throwable {
		 
		 String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		 String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
			String playerFullName=playerFirstName+" "+playerLastName;
			String playerEmail=AllUsersPage.expectedDataUser.get("UserEmail");
		 
		 
		 
		    expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 16, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 17, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 18, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 19, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 20, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 21, table));
	    	
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(playerFullName);
	    	expectedDataRow2.add("Active");
	    	expectedDataRow2.add("AmazonPrime");
	    	expectedDataRow2.add(playerEmail);
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Location"));
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Department"));
	    	expectedDataRow2.add(AllUsersPage.expectedDataUser.get("Group"));
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add(Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy"));
	    	expectedDataRow2.add(playerEmail);
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	    	expectedCsvData.put("Row 2",expectedDataRow2);
	    	objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    }
	 
	 @And("^correct data is showing in downloaded manager csv$")
	    public void correct_data_is_showing_in_downloaded_manager_csv(DataTable table) throws Throwable {
		 String managerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		 String managerLastName=AllUsersPage.expectedDataUser.get("LastName");
			String managerFullName=managerFirstName+" "+managerLastName;
			String managerEmail=AllUsersPage.expectedDataUser.get("UserEmail");
		 
			expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 16, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 17, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 18, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 19, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 20, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 21, table));
	    	
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(managerFullName);
	    	expectedDataRow2.add("active");
	    	expectedDataRow2.add("AmazonPrime");
	    	expectedDataRow2.add(managerEmail);
	    	expectedDataRow2.add("Manager");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	
	    	expectedDataRow2.add(Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy"));
	    	expectedDataRow2.add(managerEmail);
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	    	expectedCsvData.put("Row 2",expectedDataRow2);
	    	objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    }

	 
	 @And("^correct data is showing in sample player csv$")
	    public void correct_data_is_showing_in_sample_player_csv(DataTable table) throws Throwable {
		    expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
		    expectedDataRow1.add("");
	    	expectedDataRow1.add("");
	    	expectedDataRow1.add("");
	    	expectedDataRow1.add("");
	    	expectedDataRow1.add("");
		    
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	
	    	expectedDataRow3.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow3.add("");
	    	expectedDataRow3.add("");
	    	expectedDataRow3.add("");
	    	expectedDataRow3.add("");
	    	expectedDataRow3.add("");
	    	
	    	expectedDataRow4.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow4.add("");
	    	expectedDataRow4.add("");
	    	expectedDataRow4.add("");
	    	expectedDataRow4.add("");
	    	expectedDataRow4.add("");
	    	
	    	expectedDataRow5.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow5.add("");
	    	expectedDataRow5.add("");
	    	expectedDataRow5.add("");
	    	expectedDataRow5.add("");
	    	expectedDataRow5.add("");
	    	
	    	expectedDataRow6.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow6.add("");
	    	expectedDataRow6.add("");
	    	expectedDataRow6.add("");
	    	expectedDataRow6.add("");
	    	expectedDataRow6.add("");
	    	
	    	expectedDataRow7.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow7.add("");
	    	expectedDataRow7.add("");
	    	expectedDataRow7.add("");
	    	expectedDataRow7.add("");
	    	expectedDataRow7.add("");
	    	
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow8.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow9.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 16, table));
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 17, table));
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 18, table));
	    	expectedDataRow10.add(Pojo.getObjSeleniumFunctions().getTestData(0, 19, table));
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        expectedCsvData.put("Row 3",expectedDataRow3);
	        expectedCsvData.put("Row 4",expectedDataRow4);
	        expectedCsvData.put("Row 5",expectedDataRow5);
	        expectedCsvData.put("Row 6",expectedDataRow6);
	        expectedCsvData.put("Row 7",expectedDataRow7);
	        expectedCsvData.put("Row 8",expectedDataRow8);
	        expectedCsvData.put("Row 9",expectedDataRow9);
	        expectedCsvData.put("Row 10",expectedDataRow10);
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    	
	    }
	 
	 @Then("^correct data is showing in downloaded question csv$")
	    public void correct_data_is_showing_in_downloaded_question_csv(DataTable table) throws Throwable {
		 
		    expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 16, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 17, table));
	    	
	    	expectedDataRow2.add("1");
	    	String catName=BuildSpGamePage.expectedData.get("Categories").get(0);
	    	catName=catName.toUpperCase();
	    	expectedDataRow2.add(catName);
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("QuesPoints").get(0));
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("QuesTimer").get(0));
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Questions").get(0));
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Options").get(0));
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Options").get(1));
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Options").get(2));
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Options").get(3));
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	expectedDataRow2.add("");
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    	}
	 
	 @Then("^correct data is showing in downloaded sample question csv$")
	    public void correct_data_is_showing_in_downloaded_sample_question_csv(DataTable table) throws Throwable {
		    expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 8, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 9, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 10, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 11, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 12, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 13, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 14, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 15, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 16, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 17, table));
	    	
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 1, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 2, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 3, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 4, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 5, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 6, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 7, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 8, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 9, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 10, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 11, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 12, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 13, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 14, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 15, table));
	    	expectedDataRow2.add(Pojo.getObjSeleniumFunctions().getTestData(1, 16, table));
	    	expectedDataRow2.add("#"+Pojo.getObjSeleniumFunctions().getTestData(1, 17, table));
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	        
	    } 
	 
	 @Then("^correct data is showing in downloaded accuracy report csv$")
	    public void correct_data_is_showing_in_downloaded_accuracy_report_csv(DataTable table) throws Throwable {
		    expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 0, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 1, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 2, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 3, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 4, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 5, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 6, table));
	    	expectedDataRow1.add(Pojo.getObjSeleniumFunctions().getTestData(0, 7, table));
	    	
	    	
	    	expectedDataRow2.add("1");
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("Questions").get(0));
	    	expectedDataRow2.add(BuildSpGamePage.expectedData.get("GameName").get(0));
	    	expectedDataRow2.add("1");
	    	String strQuesCount=String.valueOf(PlayGameFlow.expectedGamePlayData.get("TotalQuesCount"));
	    	expectedDataRow2.add(strQuesCount);
	    	String strCorrectAnsCount=String.valueOf(PlayGameFlow.expectedGamePlayData.get("TotalCorrectAns"));
	    	expectedDataRow2.add(strCorrectAnsCount);
	    	String strIncorrectAnsCount=String.valueOf(PlayGameFlow.expectedGamePlayData.get("TotalIncorrectAns"));
	    	expectedDataRow2.add(strIncorrectAnsCount);
	    	int accuracy=(PlayGameFlow.expectedGamePlayData.get("TotalCorrectAns")/PlayGameFlow.expectedGamePlayData.get("TotalQuesCount"))*100;
	    	String strAccuracy=String.valueOf(accuracy);
	    	expectedDataRow2.add(strAccuracy);
	    	
	    	
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	        expectedCsvData.put("Row 2",expectedDataRow2);
	        objDetailedReportPage.verifyDownloadedReportData(expectedCsvData);
	    }

	 @Then("^correct data is showing in downloaded fix trophy report$")
	    public void correct_data_is_showing_in_downloaded_fix_trophy_report() throws Throwable {
		 
		    TrophiesReportPageAdmin objTrophiesReportAdmin=new TrophiesReportPageAdmin();
		    
		    if(objTrophiesReportAdmin.trophyReportType.equals("Not Achieved"))
		    {
		    	expectedDataRow1.add("No");
		    	expectedDataRow1.add("Name");
		    	expectedDataRow1.add("Player Email");
		    	expectedDataRow1.add("Location");
		    	expectedDataRow1.add("Department");
		    	expectedDataRow1.add("Status");
		    }
		    else {
		    expectedDataRow1.add("No");
	    	expectedDataRow1.add("Name");
	    	expectedDataRow1.add("Player Email");
	    	expectedDataRow1.add("Location");
	    	expectedDataRow1.add("Department");
	    	expectedDataRow1.add("Date Achieved");
	    	expectedDataRow1.add("Status");
		    }
		    
	    	expectedCsvData.put("Row 1",expectedDataRow1);
	    	
	    	
	    	
	    	objDetailedReportPage.verifyColumnHeaderDownloadedReportData(expectedCsvData);

}
}

