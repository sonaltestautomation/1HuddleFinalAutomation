package com.testH.base.pages.androidApp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.client.RateQuestionPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class RateQuestionPageAndroidApp extends RateQuestionPage {
	
	By loc_btnRateQuestion=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_rate_question_tv\")");
	By loc_quesTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/question_view_question_text_tv\")");
	By loc_headerRateQues=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_listFeedBackBtnsText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rate_question_adapter_option_item_tv\")");
	By loc_btnCancel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rate_question_bottom_view_cancel_tv\")");
	By loc_textQuestionCorrectOption=MobileBy.AndroidUIAutomator("new UiSelector().text(\"QUESTION IS CORRECT & I LIKE IT.\")");
	By loc_textQuestionWrong=MobileBy.AndroidUIAutomator("new UiSelector().text(\"QUESTION IS WRONG\")");
	By loc_textQuestionSuggestion=MobileBy.AndroidUIAutomator("new UiSelector().text(\"QUESTION IS CORRECT. BUT, I HAVE A SUGGESTION\")");
	By loc_btnSubmit=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rate_question_bottom_view_submit_tv\")");
	By loc_feedbackTextArea=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/rate_question_comment_et\")");
	By loc_msgSuccess=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
	By loc_btnOk=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
	
	@Override
	public String clickRateQuestionButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnRateQuestion, 10);
		String quesTitle=Pojo.getObjSeleniumFunctions().getText(loc_quesTitle).trim();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rate question button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnRateQuestion));
		//String quesTitle=Pojo.getObjSeleniumFunctions().getText(loc_quesTitle).trim();
		return quesTitle;
	}

	@Override
	public void verifyRateQuestionScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_headerRateQues, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate question screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_headerRateQues).trim().equals("Rate Question"));		
	}

	@Override
	public void verifyRateQuestionOptions() {
		List<String> expectedFeedbackOptions=new ArrayList<String>();
		expectedFeedbackOptions.add("QUESTION IS CORRECT & I LIKE IT.");
		expectedFeedbackOptions.add("QUESTION IS CORRECT. BUT, I HAVE A SUGGESTION");
		expectedFeedbackOptions.add("QUESTION IS WRONG");
		
		List<AndroidElement> actualOptions=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listFeedBackBtnsText);
		
		for(int i=0;i<actualOptions.size();i++)
		{
			System.out.println("Actual Options "+actualOptions.get(i).getText().trim());
			System.out.println("Expected Options "+expectedFeedbackOptions.get(i));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that feedback option is correct",actualOptions.get(i).getText().trim().equals(expectedFeedbackOptions.get(i)));
		}
		
	}

	@Override
	public void verifyAndClickCancelBtn() {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCancel,15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Cancel button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnCancel));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Cancel button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnCancel));		
	}

	@Override
	public void verifyRateQuestionBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnRateQuestion, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate Question button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnRateQuestion));
		
	}

	@Override
	public void clickQuestionCorrectILikeIt() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textQuestionCorrectOption,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is correct and I like it option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionCorrectOption));
		
	}

	@Override
	public void clickQuestionCorrectHaveSuggestion() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textQuestionSuggestion,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is correct but I have suggestion option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionSuggestion));
		
	}

	@Override
	public void clickQuestionWrong() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textQuestionWrong,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is wrong option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionWrong));
		
	}

	@Override
	public void verifyFeedbackTextFieldDisabled() {
//		String	attributeDisabledFeedbackTextBox=Pojo.getObjSeleniumFunctions().getAttribute(loc_feedbackTextArea, "isFocusable");
//	     System.out.println("Attribute disabled feedback textbox "+attributeDisabledFeedbackTextBox);
//	     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verif that enter feedback field is disabled", attributeDisabledFeedbackTextBox.equals("false"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is not entering", Pojo.getObjSeleniumFunctions().setText(loc_feedbackTextArea,"This is for testing")==false);
	}

	@Override
	public void verifyAndClickSubmitBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSubmit, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is displaying", Pojo.getObjSeleniumFunctions().getText(loc_btnSubmit).trim().equals("SUBMIT"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is working", Pojo.getObjSeleniumFunctions().click(loc_btnSubmit));		
	}

	@Override
	public void verifySuccessMessage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct", Pojo.getObjSeleniumFunctions().getText(loc_msgSuccess).trim().equals("Boom! Feedback sent successfully."));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ok button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnOk));
	}

	@Override
	public void enterFeedback(String strFeedback) {
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that feedback is entering", Pojo.getObjSeleniumFunctions().setText(loc_feedbackTextArea, strFeedback));
		
	}

	@Override
	public String getQuestionTitle() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_quesTitle, 10);
		String quesTitle=Pojo.getObjSeleniumFunctions().getText(loc_quesTitle);
		return quesTitle;
	}

}
