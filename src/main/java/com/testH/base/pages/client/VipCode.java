package com.testH.base.pages.client;

public abstract class VipCode {
	
	public abstract void verifyVipCodeButton();
	public abstract void clickVipCodeButton();
	public abstract void verifyEnterVipCodeScreen();
	public abstract void verifyHelpButton();
	public abstract void enterVipCode(String vipCode);
	public abstract void clickNext();
	public abstract void verifyValidationMessage(String expectedText);
	public abstract void clickOkBtn();
	public abstract void verifySignUpScreen();
	public abstract void clickSubmit();
	public abstract void verifyToastMsg(String expectedText);
	public abstract void enterFirstName(String name);
	public abstract void enterLastName(String name);
	public abstract void enterEmailId(String id);
	public abstract void enterPw(String pw);
	public abstract void enterConfirmPw(String pw);
	public abstract void verifySuccessVipCode(String successMsg);
	public abstract void clickResendLink();
	public abstract void verifyAlertTitle(String expectedText);
	public abstract void verifyAlertSubTitle(String expectedText);
	public abstract void verifyAlertDetails(String expectedText);
	public abstract void clickOkAlertPopup();
	public abstract void verifyLimitedAccess();
	
	



	

}
