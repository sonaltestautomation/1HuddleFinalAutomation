package com.testH.base.pages.androidApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.VipCodePage;
import com.testH.base.pages.client.VipCode;

import io.appium.java_client.MobileBy;

public class VipCodeAndroidApp extends VipCode {
	
	By loc_textVipCode=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_sign_up_tv\")");
	By loc_textEnterVipCode=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_validate_code_frag_emailId_til\")");
	By loc_textBoxEnterVipCode=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_validate_code_identifier_et\")");
	By loc_btnHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_validate_code_contact_support_tv\")");
	By loc_btnNext=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_validate_code_register_btn\")");
	By loc_msgValidation=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
	By loc_btnOk=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
	By loc_titleSignUp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_btnSubmit=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_submit_tv\")");
    By loc_toastMsg=MobileBy.xpath("//android.widget.Toast[1]");
	By loc_textBoxFirstName=MobileBy.xpath("//android.widget.TextView[@text='First Name']/following-sibling::android.widget.EditText");
	By loc_textBoxLastName=MobileBy.xpath("//android.widget.TextView[@text='Last Name']/following-sibling::android.widget.EditText");
	By loc_textBoxEmail=MobileBy.xpath("//android.widget.TextView[@text='Email ID']/following-sibling::android.widget.EditText");
	By loc_textBoxPassword=MobileBy.xpath("//android.widget.TextView[@text='Password']/following-sibling::android.widget.EditText");
	By loc_textBoxConfirmPw=MobileBy.xpath("//android.widget.TextView[@text='Confirm Password']/following-sibling::android.widget.EditText");
	By loc_sucessResendLink=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/verify_link_tv\")");
	By loc_btnResendLink=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/verify_link_tv\")");
	By loc_alertTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/title_tv\")");
	By loc_alertSubTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/sub_title_tv\")");
	By loc_alertDesc=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/description_tv\")");
	By loc_btnOkAlt=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/okay_btn\")");
	By loc_btnLimitedAccess=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/limited_access_tv\")");

	
	@Override
	public void verifyVipCodeButton() {
		 
		String actualVipCode=Pojo.getObjSeleniumFunctions().getText(loc_textVipCode);
		System.out.println("Actual VIP code Text "+actualVipCode);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that vip code button is appearing", actualVipCode.equals("VIP Code?"));
	}


	@Override
	public void clickVipCodeButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that vip code button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_textVipCode));
		
	}


	@Override
	public void verifyEnterVipCodeScreen() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that enter vip code screen is opening", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_textEnterVipCode));
		
	}


	@Override
	public void verifyHelpButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Help button is appearing",Pojo.getObjSeleniumFunctions().getText(loc_btnHelp).trim().equals("Need help?"));
	}


	@Override
	public void enterVipCode(String vipCode) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that vip code is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterVipCode, vipCode));
	}


	@Override
	public void clickNext() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnNext));
	}

  @Override
	public void verifyValidationMessage(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", Pojo.getObjSeleniumFunctions().getText(loc_msgValidation).trim().equals(expectedText));
	}


	@Override
	public void clickOkBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnOk, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnOk));
	}


	@Override
	public void verifySignUpScreen() {	
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that signup screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleSignUp).trim().equals("Sign Up"));
	}


	@Override
	public void clickSubmit() {
		Pojo.getObjSeleniumFunctions().hideKeyBoard();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that submit button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnSubmit));
		
	}


	@Override
	public void verifyToastMsg(String expectedText) {
		//WebElement toastView = Pojo.getAndroidDriver().findElement(By.xpath("//android.widget.Toast[1]"));
		//String text = toastView.getAttribute("name");
		//System.out.println("Toast "+text);
		String toastMsg=Pojo.getObjSeleniumFunctions().getToastMessage(loc_toastMsg, "name");
		System.out.println("Toast Message is "+toastMsg);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct toast message is appearing",toastMsg.equals(expectedText));
	}


	@Override
	public void enterFirstName(String name) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxFirstName, name));
		
	}


	@Override
	public void enterLastName(String name) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxLastName, name));
		
	}


	@Override
	public void enterEmailId(String id) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEmail, id));
		VipCodePage.vipCodeData.put("UniqueEmail", id);
		
	}


	@Override
	public void enterPw(String pw) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that pw is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxPassword, pw));
		VipCodePage.vipCodeData.put("Password", pw);
	}


	@Override
	public void enterConfirmPw(String pw) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm pw is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxConfirmPw, pw));
		
	}


	@Override
	public void verifySuccessVipCode(String successMsg) {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		 System.out.println("Expected Success Resend Link "+Pojo.getObjSeleniumFunctions().getText(loc_sucessResendLink).trim());
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct", Pojo.getObjSeleniumFunctions().getText(loc_sucessResendLink).trim().equals(successMsg));
	}


	@Override
	public void clickResendLink() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that resend link button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnResendLink));
		
	}


	@Override
	public void verifyAlertTitle(String expectedText) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_alertTitle, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that alert title is correct", Pojo.getObjSeleniumFunctions().getText(loc_alertTitle).trim().equals(expectedText));
	}


	@Override
	public void verifyAlertSubTitle(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that alert sub title is correct", Pojo.getObjSeleniumFunctions().getText(loc_alertSubTitle).trim().equals(expectedText));
		
	}


	@Override
	public void verifyAlertDetails(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that alert descis correct", Pojo.getObjSeleniumFunctions().getText(loc_alertDesc).trim().equals(expectedText));
		
	}


	@Override
	public void clickOkAlertPopup() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnOkAlt));
	}


	@Override
	public void verifyLimitedAccess() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that limited access is appearing", Pojo.getObjSeleniumFunctions().getText(loc_btnLimitedAccess).trim().equals("Limited Access"));
	}


	

}
