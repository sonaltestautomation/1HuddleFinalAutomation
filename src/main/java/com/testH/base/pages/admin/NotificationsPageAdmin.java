package com.testH.base.pages.admin;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class NotificationsPageAdmin {
	
	DashboardPage objDashboardPage=new DashboardPage();

	By loc_btnNotification=By.xpath("//p[text()=' Notifications ']");
	By loc_tabCustomNotification=By.xpath("//div[text()='Custom Notification']");
	By loc_textAreaNotification=By.xpath("//textarea[@placeholder='Type your message here']");
	By loc_btnSend=By.xpath("//span[text()='SEND']");
	By loc_successMessageText=By.xpath("//div[@class='title']");
	By loc_btnOk=By.xpath("//span[text()='OK']");
	By loc_emailCheckCustomNoti=By.xpath("//div[contains(text(),'Email')]/parent::div/child::mat-checkbox[2]");

	
	public void clickNotificationSideMenu()
	{
		Pojo.getObjSeleniumFunctions().scrollToView(loc_btnNotification);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNotification));
		objDashboardPage.mouseHove1hLogo();
	}
	
	public void clickCustomNotification()
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that custom notification is clicking", Pojo.getObjSeleniumFunctions().click(loc_tabCustomNotification));

	}
	
	public void clickEmailCheckboxCustomNotification()
	{
		//Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_emailCheckCustomNoti,10);
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_emailCheckCustomNoti);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email checkbox is clicking", Pojo.getObjSeleniumFunctions().click(loc_emailCheckCustomNoti));

	}
	public void enterNotificationText(String text)
	{

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that notification is entering", Pojo.getObjSeleniumFunctions().setText(loc_textAreaNotification, text));

	}
	public void clickSendButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSend));

	}
	
	public void verifySuccessMessage()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that succes message text is correct", Pojo.getObjSeleniumFunctions().getText(loc_successMessageText).trim().equals("Boom! You have successfully sent your notification."));

	}
	
	public void clickOk()
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnOk));

	}


}