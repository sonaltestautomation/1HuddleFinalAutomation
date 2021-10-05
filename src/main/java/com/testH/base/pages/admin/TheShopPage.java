package com.testH.base.pages.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.testH.app.generic.Pojo;

public class TheShopPage {
	
	
	private BuildSpGamePage objBuildSpGamePage=new BuildSpGamePage();
	String gameName="";	
	public ArrayList<String> array_Category;
	
	By loc_moreGameOption= By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]//parent::div//parent::div//child::button//child::mat-icon");
	By loc_companyDropdown= By.xpath("//mat-icon[text()='arrow_drop_down ']");
	By loc_companyName= By.xpath("//span[contains(text(),'Test Company 2020')]");
	By loc_searchCompanyTextBox= By.xpath("//input[@placeholder='Search Company']");
	By loc_gameLibrary= By.xpath("//p[contains(text(),' Game Library ')]//parent::div//preceding-sibling::mat-icon");
	By loc_addToShopOption= By.xpath("//span[contains(text(),'Add to The Shop')]");
	By loc_gameCategoryDropdown= By.xpath("//span[contains(text(),'Select Game Category')]");
	By loc_validationMsgForWrongImageFormat=By.xpath("//div[contains(text(),'Please make sure that you are selecting a PNG / JPG / JPEG image file.')]");
	By loc_selectGameBannerImage= By.xpath("//mat-icon[contains(text(),'add_a_photo')]");
	By loc_authorName= By.xpath("//input[@placeholder='Enter Author Name']");
	By loc_description= By.id("add_description");
	By loc_addButton= By.xpath("//span[contains(text(),'ADD')]");
	By loc_doneButton= By.xpath("//span[normalize-space()='DONE']");
	By loc_gameAddedValdation= By.xpath("//span[contains(text(),'Game added to The Shop successfully.')]");
	By loc_shopMenu= By.xpath("//mat-icon[normalize-space()='storefront']");
	By loc_viewAll=By.xpath("//span[text()=' Workplace Safety ']//parent::div//span[2]");
	By loc_gameCategoryOptions= By.xpath("//mat-option[@role='option']");
	By loc_pagination= By.xpath("//mat-select[@aria-label='Items per page:']");
	
			
	
	static HashMap<String,String> shopGameDetails= new HashMap();
	
	public void selectCompanyFromDropdown(String companyName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on company dropdown", Pojo.getObjSeleniumFunctions().click(loc_companyDropdown));
		Pojo.getObjSeleniumFunctions().waitFor(10);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Entering company name", Pojo.getObjSeleniumFunctions().setText(loc_searchCompanyTextBox,companyName));
	    Pojo.getObjSeleniumFunctions().waitFor(10);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on company name", Pojo.getObjSeleniumFunctions().click(loc_companyName));
	    Pojo.getObjSeleniumFunctions().waitFor(2);		
	}
	
	public void click_GameLibrary()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on game library", Pojo.getObjSeleniumFunctions().click(loc_gameLibrary));
	}
	
	public void click_MoreGameOption()
	{
		gameName=objBuildSpGamePage.expectedData.get("GameName").get(0);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on more game option", Pojo.getObjSeleniumFunctions().click(loc_moreGameOption));		
	}
	public void click_addToShopOption()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on add to shop option", Pojo.getObjSeleniumFunctions().click(loc_addToShopOption));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void click_gameCategoryDropdown()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on game category dropdown", Pojo.getObjSeleniumFunctions().click(loc_gameCategoryDropdown));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void verify_gamecategories()
	{
		List<WebElement> gameCategories=Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameCategoryOptions);
		array_Category= new ArrayList<String>();
		for(WebElement ele_gameCategory:gameCategories)
		{
			String category=ele_gameCategory.getText();
			array_Category.add(category);			
		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(0).equals("Books & Entertainment"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(1).equals("Business & Markets"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(2).equals("Communication & Social Skills"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(3).equals("Company Trivia"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(4).equals("Customer Service"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(5).equals("Diversity & Inclusion"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(6).equals("Health & Wellness"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(7).equals("Hospitality"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(8).equals("Human Resources"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(9).equals("IT"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(10).equals("Leadership & Management"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(11).equals("Personal Development"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(12).equals("Policy & Compliance"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(13).equals("Sales"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(14).equals("Society & Culture"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game categories", array_Category.get(15).equals("Workplace Safety"));		
	}
	public void  clickToSelectGameBannerImage()
	{		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on plus button to select game banner image", Pojo.getObjSeleniumFunctions().click(loc_selectGameBannerImage));		
	}
	public void uploadInvalidGameBannerImage()
	{
		try {
			Runtime.getRuntime().exec("src\\test\\resources\\autoitScripts\\InvalidImageFileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void validationOnInvalidGameBannerImage(String validationMessage)
	{
		String actual_validationMessage= validationMessage;
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_validationMsgForWrongImageFormat, 15);
		String expected_validationMessage= Pojo.getObjSeleniumFunctions().getText(loc_validationMsgForWrongImageFormat).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying validation message on invalid game banner image", actual_validationMessage.equals(expected_validationMessage));
	}
	public void uploadValidGameBannerImage()
	{
		try {
			Runtime.getRuntime().exec("src\\test\\resources\\autoitScripts\\ValidGameBannerImageFileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pojo.getObjSeleniumFunctions().waitFor(2);		
	}
	public void clickonDoneButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on Done button on upload banner",Pojo.getObjSeleniumFunctions().click(loc_doneButton));
		Pojo.getObjSeleniumFunctions().waitFor(4);
	}
	public void selectGameCategory(String category)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Select Game category", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[normalize-space()='"+category+"']")));	
		shopGameDetails.put("ShopGameCategory", category);
	}
	public void enterAuthorName(String authorName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Entering author name", Pojo.getObjSeleniumFunctions().setText(loc_authorName, authorName));
		shopGameDetails.put("Author Name", authorName);			
	}
	public void enterDescription(String description)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Entering author name", Pojo.getObjSeleniumFunctions().setText(loc_description, description));
		shopGameDetails.put("Description", description);			
	}
	public void clickOnAddButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on Done button on upload banner",Pojo.getObjSeleniumFunctions().click(loc_addButton));
	}
	public void gameAddedValidationMessage(String validationMessage)
	{
		String expected_gameAddedValidationMessage= validationMessage;
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameAddedValdation, 15);
		String actual_gameAddedValidationMessage=Pojo.getObjSeleniumFunctions().getText(loc_gameAddedValdation).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying validation message once game is added in the shop", actual_gameAddedValidationMessage.equals(expected_gameAddedValidationMessage));
	}
	public void clickShopmenu()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on Shop menu",Pojo.getObjSeleniumFunctions().click(loc_shopMenu));
	}
	public void clickViewAll()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on View All option of game category on the shop page",Pojo.getObjSeleniumFunctions().click(loc_viewAll));
	}
	public void selectPagination()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on pagination dropdown", Pojo.getObjSeleniumFunctions().click(loc_pagination));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on pagination number", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[text()='200']")));
		
	}
	public void verify_gameIsDisplayedInShopCategory(String gameCategory)
	{	
		By loc_gameCategory=By.xpath("//li[contains(text(),'"+gameCategory+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameCategory, 15);
		String gamecategory=Pojo.getObjSeleniumFunctions().getText(loc_gameCategory);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying game category",shopGameDetails.get("ShopGameCategory").equals(gamecategory) );
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if game is displayed under specified shop category", Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//span[contains(text(),'"+gameName+"')]")));		
	}
	public void verify_authorNameandDescription()
	{
		String actual_authorNameOncard=shopGameDetails.get("Author Name");
		By loc_authorNameOnShopgameCard=By.xpath("//span[contains(text(),'"+gameName+"')]/parent::div/parent::div/following-sibling::div/child::div/span[contains(text(),'"+actual_authorNameOncard+"')]");		
		String expected_authorNameOncard=Pojo.getObjSeleniumFunctions().getText(loc_authorNameOnShopgameCard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying author name on shop game card", actual_authorNameOncard.equals(expected_authorNameOncard));
		String actual_descriptionOncard=shopGameDetails.get("Description");
		By loc_descriptionOnGamecard=By.xpath("//span[contains(text(),'"+gameName+"')]/parent::div/following-sibling::div/span[contains(text(),'"+actual_descriptionOncard+"')]");
		String expected_descriptionOncard=Pojo.getObjSeleniumFunctions().getText(loc_descriptionOnGamecard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying description on shop game card", actual_descriptionOncard.equals(expected_descriptionOncard));
	}
	public void verify_addedGamePoistion()
	{
		List<WebElement> allGamesInShop=Pojo.getObjSeleniumFunctions().getWebElementList(By.xpath("//div[@class=\"shopcard-title\"]/span"));
		String lastPositionGame=allGamesInShop.get(allGamesInShop.size()-1).getText();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if game is added in the last position", lastPositionGame.equals(gameName));
	}
	
}
