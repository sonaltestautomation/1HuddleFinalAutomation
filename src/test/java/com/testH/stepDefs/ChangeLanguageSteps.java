package com.testH.stepDefs;

import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.MorePage;
import com.testH.base.pages.client.SelectGamePage;

public class ChangeLanguageSteps {
	
	private MorePage objMorePage;
	private SelectGamePage objSelectGamePage;
	private HomePage objHomePage;
	
	public ChangeLanguageSteps()
	{
		objMorePage= new PageFactory().getMorePage();
		objSelectGamePage= new PageFactory().getSelectGamePage();
		objHomePage=new PageFactory().getObjHomePage();
		
	}

	@And("^User clicks on Change Language button$")
    public void user_clicks_on_change_language_button() throws Throwable {
		objMorePage.clickChangeLanguage();
    }
	
    @Then("^Change language page is opening$")
    public void change_language_page_is_opening() throws Throwable {
    	objMorePage.verifyChangeLanguagePage();
    	
    }
    
    @Then("^Correct languages are showing in list$")
    public void correct_languages_are_showing_in_list() throws Throwable {
    	objMorePage.verifyLanguages();
    }
    
    @And("^User clicks on Save button$")
    public void user_clicks_on_save_button() throws Throwable {
    	objMorePage.clickSave();
    }
    
    @And("^User selects Language$")
    public void user_selects_language(DataTable table) throws Throwable {
    	String language=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.selectLanguage(language);
    }
    
    @And("^User selects Language for mobile app$")
    public void user_selects_language_for_mobile_app(DataTable table) throws Throwable {
    	String language=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.selectLanguageMobileApp(language);   
    	
    	}
    
    @Then("^converted text is correct$")
    public void converted_text_is_correct(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String checkOnMobStatus=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	objMorePage.verifyConvertedText(expectedConvertedText,checkOnMobStatus);
    }
   
    @Then("^converted more text is correct for side menu item$")
    public void converted_more_text_is_correct_for_side_menu_item(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.veriyMoreTextSideMenu(expectedConvertedText);
    }
    
    @Then("^converted more text is correct on More page$")
    public void converted_more_text_is_correct_on_more_page(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyMoreTextMorePage(expectedConvertedText);
    }
    
    @Then("^converted Leaderboard text is correct on sidemenu$")
    public void converted_leaderboard_text_is_correct_on_sidemenu(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyLeaderboardTextSideMenu(expectedConvertedText);
    }
    
    @Then("^converted text is correct for side menu profile$")
    public void converted_text_is_correct_for_side_menu_profile(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyProfileTextSideMenu(expectedConvertedText);
    }
    
    @Then("^converted text is correct for side menu games$")
    public void converted_text_is_correct_for_side_menu_games(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyGamesTextSideMenu(expectedConvertedText);
    	
    }
    
    @Then("^More page is opening for webapp$")
    public void more_page_is_opening_for_webapp() throws Throwable {
    	objMorePage.verifyMorePageDesktopOnly();
    }

    @Then("^Games page is opening for mobile app$")
    public void games_page_is_opening_for_mobile_app() throws Throwable {
    	objSelectGamePage.verifySelectGameScreenAndroidApp();
        
    }
    
    @Then("^converted sound text is correct$")
    public void converted_sound_text_is_correct(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifySoundTextConverted(expectedConvertedText);
    	}
    
    @Then("^converted enter player email title is correct$")
    public void converted_enter_player_email_title_is_correct(DataTable table) throws Throwable {
    	String expectedConvertedText=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objMorePage.verifyEnterEmailText(expectedConvertedText);

    }
    
    @And("^user take action on app update popup on mobile app$")
    public void user_take_action_on_app_update_popup_on_mobile_app(DataTable table) throws Throwable {
    	String expectedAction=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	objHomePage.takeActionOnAppUpdatePopup(expectedAction);
    }
	}
