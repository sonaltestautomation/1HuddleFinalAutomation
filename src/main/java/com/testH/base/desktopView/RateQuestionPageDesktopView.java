package com.testH.base.desktopView;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.client.RateQuestionPage;

public class RateQuestionPageDesktopView extends RateQuestionPage {

	
	By loc_btnRateQuestion=By.xpath("//div[contains(@class,'rateQuesbtn')]");
	By loc_headerRateQues=By.xpath("//div[contains(text(),'RATE QUESTION')]");
	By loc_textQuestionCorrectOption=By.xpath("//span[contains(text(),'QUESTION IS CORRECT & I LIKE IT')]");
	By loc_textQuestionSuggestion=By.xpath("//span[contains(text(),'QUESTION IS CORRECT. BUT, I HAVE A SUGGESTION')]");
	By loc_textQuestionWrong=By.xpath("//span[contains(text(),'QUESTION IS WRONG')]");
	By loc_listFeedBackBtnsText=By.xpath("//button[contains(@class,'feedbackbns')]");
	By loc_btnCancel=By.xpath("//span[contains(text(),'CANCEL')]");
	By loc_feedbackTextArea=By.xpath("//textarea[@placeholder='Enter your feedback here']");
	By loc_btnSubmit=By.xpath("//span[contains(text(),'SUBMIT')]");
	By loc_messageSuccess=By.xpath("//*[contains(@class,'mat-snack')]");
	By loc_quesTitle=By.xpath("//span[contains(@class,'card-text')]");

	
	@Override
	public String clickRateQuestionButton() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnRateQuestion, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rate question button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnRateQuestion));
		String quesTitle=Pojo.getObjSeleniumFunctions().getText(loc_quesTitle).trim();
		return quesTitle;
	}

	@Override
	public void verifyRateQuestionScreen() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_headerRateQues, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate question screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_headerRateQues).trim().equals("RATE QUESTION"));
		
	}

	@Override
	public void verifyRateQuestionOptions() {

		List<String> expectedFeedbackOptions=new ArrayList<String>();
		expectedFeedbackOptions.add("QUESTION IS CORRECT & I LIKE IT.");
		expectedFeedbackOptions.add("QUESTION IS CORRECT. BUT, I HAVE A SUGGESTION");
		expectedFeedbackOptions.add("QUESTION IS WRONG");
		
		List<WebElement> actualOptions=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listFeedBackBtnsText);
		
		for(int i=0;i<actualOptions.size();i++)
		{
			System.out.println("Actual Options "+actualOptions.get(i).getText().trim());
			System.out.println("Expected Options "+expectedFeedbackOptions.get(i));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that feedback option is correct",actualOptions.get(i).getText().trim().equals(expectedFeedbackOptions.get(i)));
		}
		
		
	}

	@Override
	public void verifyAndClickCancelBtn() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Cancel button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnCancel));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Cancel button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnCancel));
	}

	@Override
	public void verifyRateQuestionBtn() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Rate Question button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnRateQuestion));
	}

	@Override
	public void clickQuestionCorrectILikeIt() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is correct and I like it option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionCorrectOption));
	}

	@Override
	public void clickQuestionCorrectHaveSuggestion() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is correct but I have suggestion option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionSuggestion));
		
	}

	@Override
	public void clickQuestionWrong() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Question is wrong option is clicking", Pojo.getObjSeleniumFunctions().click(loc_textQuestionWrong));
		
	}

	@Override
	public void verifyFeedbackTextFieldDisabled() {
		
		String attributeAreaInvalid=Pojo.getObjSeleniumFunctions().getAttribute(loc_feedbackTextArea, "aria-invalid");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that feedback text field is disabled",attributeAreaInvalid.trim().equals("false"));
	}

	@Override
	public void verifyAndClickSubmitBtn() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is displaying", Pojo.getObjSeleniumFunctions().getText(loc_btnSubmit).trim().equals("SUBMIT"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is working", Pojo.getObjSeleniumFunctions().click(loc_btnSubmit));
	}

	@Override
	public void verifySuccessMessage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_messageSuccess, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing", Pojo.getObjSeleniumFunctions().getText(loc_messageSuccess).trim().equals("Boom! Feedback sent successfully."));
	}

	@Override
	public void enterFeedback(String strFeedback) {
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that feedback is entering", Pojo.getObjSeleniumFunctions().setText(loc_feedbackTextArea, strFeedback));
	}

	@Override
	public String getQuestionTitle() {
		
		String quesTitle=Pojo.getObjSeleniumFunctions().getText(loc_quesTitle);
		return quesTitle;
	}

}
