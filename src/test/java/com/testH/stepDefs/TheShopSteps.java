package com.testH.stepDefs;

import java.util.List;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.admin.TheShopPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TheShopSteps {
	
	TheShopPage objTheShopPage;
	private LoginPage objLoginPage;
	
	public TheShopSteps()
	{
		objTheShopPage= new TheShopPage();
		objLoginPage=new LoginPage();
	}
	@When("^SuperAdmin is logged In$")
	public void SuperAdmin_is_logged_In(DataTable table) {
		
		List<List<String>> data=table.asLists();
		String userName=data.get(1).get(0);
		String password=data.get(1).get(1);
		
		userName=Pojo.getObjConfig().getProperty(userName);
		password=Pojo.getObjConfig().getProperty(password);
		
		 objLoginPage.enterEmail(userName);
		   objLoginPage.clickNext();
		   
		   objLoginPage.enterPw(password);
		   objLoginPage.clickNext();
	}
	@And("^Selects company from dropdown$")
	public void selects_company_from_dropdown(DataTable table) {
		List<List<String>> data=table.asLists();
		objTheShopPage.selectCompanyFromDropdown(data.get(1).get(0));
	    
	}	
	@And("^Admin clicks on game library menu$")
	public void Admin_clicks_on_game_library_menu() {
		
		objTheShopPage.click_GameLibrary();
	    
	}		
	@When("^Admin clicks on more game options$")
	public void admin_clicks_on_more_game_options() {
		
		objTheShopPage.click_MoreGameOption();
	    
	}
	@When("^Admin clicks on Add To The Shop option$")
	public void admin_clicks_on_Add_To_The_Shop_option() {
		
		objTheShopPage.click_addToShopOption();    
	}
	@When("^Admin clicks on Game Category Dropdown$")
	public void admin_clicks_on_Game_Category_Dropdown() {
		
		objTheShopPage.click_gameCategoryDropdown();	   
	}
	@Then("^Admin veryfies if game categories are shown correctly$")
	public void admin_veryfies_if_game_categories_are_shown_correctly() {
	   
		objTheShopPage.verify_gamecategories();
	}
	@And("^Admin clicks on plus icon to select banner image$")
	public void Admin_clicks_on_plus_icon_to_select_banner_image() {
	   
		objTheShopPage.clickToSelectGameBannerImage();
	}	
	@And("^Admin uploads game banner image with invalid format Other than PNG,JPG and JPEG$")
	public void admin_uploads_image_with_invalid_format_Other_than_PNG_JPG_JPEG() {
	  
		objTheShopPage.uploadInvalidGameBannerImage();		
	}
	@Then("^Verify validation message is displayed$")
	public void verify_validation_message_is_displayed(DataTable table) {
	    List<List<String>> validationMessage=table.asLists();
		objTheShopPage.validationOnInvalidGameBannerImage(validationMessage.get(1).get(0));		
	}
	@When("^Admin uploads valid game banner image$")
	public void admin_uploads_valid_game_banner_image() {
		objTheShopPage.uploadValidGameBannerImage();
	}
	@And("^Admin clicks on done button$")
	public void admin_clicks_on_done_button() {
		objTheShopPage.clickonDoneButton();
	}
	@When("^Admin Selects game category$")
	public void admin_Selects_game_category(DataTable table) {
		List<List<String>> categoryList=table.asLists();
		objTheShopPage.selectGameCategory(categoryList.get(1).get(0));	  
	}
	@When("^Admin Enters valid Author Name$")
	public void admin_Enters_valid_Author_Name(DataTable table) {
		List<List<String>> authorNameList=table.asLists();
		objTheShopPage.enterAuthorName(authorNameList.get(1).get(0));
	}
	@When("^Admin Enters valid discription$")
	public void admin_Enters_valid_discription(DataTable table) {
		List<List<String>> descList=table.asLists();
		objTheShopPage.enterDescription(descList.get(1).get(0));
	}
	@When("^Admin clicks on ADD button$")
	public void admin_clicks_on_ADD_button() {
		objTheShopPage.clickOnAddButton();
	}
	@Then("^Verify if validation message is displayed after adding game to the shop$")
	public void verify_if_validation_message_is_displayed_after_adding_game_to_the_shop(DataTable table) {
		List<List<String>> validationMessage=table.asLists();
		objTheShopPage.gameAddedValidationMessage(validationMessage.get(1).get(0));
	}
	@Then("^Click on The Shop menu$")
	public void click_on_The_Shop_menu() {
		objTheShopPage.clickShopmenu();
	}
	@Then("^Click on view all option of selected category$")
	public void click_on_view_all_option_of_selected_category() {
		objTheShopPage.clickViewAll();
	}
	@And("^Select number from pagination dropdown$")
	public void Select_number_from_pagination_dropdown() {
		objTheShopPage.selectPagination();
	}	
	@Then("^Verify if game is displayed under selected game category on the shop page$")
	public void verify_if_game_is_displayed_under_selected_game_category_on_the_shop_page(DataTable table) {
		List<List<String>> data=table.asLists();
		objTheShopPage.verify_gameIsDisplayedInShopCategory(data.get(1).get(0));
	}
	@Then("^Verify author name and description on the shop game card$")
	public void verify_author_name_and_description_on_the_shop_game_card() {
		objTheShopPage.verify_authorNameandDescription();
	}
	@Then("^Verify if game is added in the last postion$")
	public void verify_if_game_is_added_in_the_last_postion() {
		objTheShopPage.verify_addedGamePoistion();
	}




}
