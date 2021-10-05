package com.testH.base.pages.admin;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class LoginPage {
	
	By loc_enterEmailTextBox=By.xpath("//input[@name='useremail']");
	By loc_btn_Next=By.xpath("//button[contains(@class,'submit')]");
	By loc_passwordTxtBox=By.xpath("//input[@name='userpassword']");	
	
	
	public void verifyHomePage()
	{
		Pojo.getObjSeleniumFunctions().waitFor(20);
		System.out.println("Loading...");
		System.out.println("Admin Title "+Pojo.getObjSeleniumFunctions().getTitle());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is correct", Pojo.getObjSeleniumFunctions().getTitle().equals("1Huddle Admin"));
	}

	public void enterEmail(String email)
	{
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user can enter email",Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox, email));
		
	}
	
	public void clickNext()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btn_Next, 15);
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btn_Next,15 );
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btn_Next));
		
	}
	
	public void enterPw(String pw)
	{
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_passwordTxtBox);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that enter PW is working",Pojo.getObjSeleniumFunctions().setText(loc_passwordTxtBox, pw));
	}
	
}
