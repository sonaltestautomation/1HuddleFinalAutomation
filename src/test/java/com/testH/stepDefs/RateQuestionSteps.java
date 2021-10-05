package com.testH.stepDefs;
import java.util.ArrayList;

import org.openqa.selenium.By;


import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.QuestionCategoryPageDesktopView;
import com.testH.base.desktopView.SelectAnswerPageDesktopView;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.PlayerFeedbackPageAdmin;
import com.testH.base.pages.client.RateQuestionPage;
import com.testH.base.pages.client.SelectAnswerPage;
import com.testH.base.pages.client.SelectGamePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class RateQuestionSteps {
	
	private SelectAnswerPage objSelectAnswerPage;
	private RateQuestionPage objRateQuestionPage;
	private PlayerFeedbackPageAdmin objPlayerFeedBackPageAdmin=new PlayerFeedbackPageAdmin();
	
	String quesTitle="";
	String feedback="";

	
	public RateQuestionSteps()
	{
		objSelectAnswerPage= new PageFactory().getSelectAnswerPage();
		objRateQuestionPage=new PageFactory().getRateQuestionPage();

	}

	@Then("^Rate question option is enabled with every question$")
    public void rate_question_option_is_enabled_with_every_question() throws Throwable{
		
		objSelectAnswerPage.verifyRateQuestionEveryQues();
    }
	
	@When("^user clicks on Rate Question button$")
    public void user_clicks_on_rate_question_button() throws Throwable {
		objRateQuestionPage.clickRateQuestionButton();
    }

    @Then("^Rate question screen is opening$")
    public void rate_question_screen_is_opening() throws Throwable {
    	objRateQuestionPage.verifyRateQuestionScreen();
    }
    @Then("^Rate question options are showing correctly$")
    public void rate_question_options_are_showing_correctly() throws Throwable {
    	objRateQuestionPage.verifyRateQuestionOptions();
    }
    
    @When("^user clicks on Cancel button$")
    public void user_clicks_on_cancel_button() throws Throwable {
    	objRateQuestionPage.verifyAndClickCancelBtn();
    }

    @Then("^Question screen is opening with rate question button$")
    public void question_screen_is_opening_with_rate_question_button() throws Throwable {
    	objRateQuestionPage.verifyRateQuestionBtn();
    }

    @When("^user selects Question is correct and I like it option$")
    public void user_selects_question_is_correct_and_i_like_it_option() throws Throwable {
    	objRateQuestionPage.clickQuestionCorrectILikeIt();
    }

    @Then("^enter your feedback field is disabled$")
    public void enter_your_feedback_field_is_disabled() throws Throwable {
    	objRateQuestionPage.verifyFeedbackTextFieldDisabled();
    }
    @When("^user selects Submit button$")
    public void user_selects_submit_button() throws Throwable {
    	objRateQuestionPage.verifyAndClickSubmitBtn();
    }

    @Then("^success message is appearing after submitting feedback$")
    public void success_message_is_appearing() throws Throwable {
    	objRateQuestionPage.verifySuccessMessage();
    }
    
    @And("^user selects Question is correct but I have suggestion option$")
    public void user_selects_question_is_correct_but_i_have_suggestion_option() throws Throwable {
    	objRateQuestionPage.clickQuestionCorrectHaveSuggestion();
    }

    @And("^user enters feedback$")
    public void user_enters_feedback(DataTable table) throws Throwable {
    	String strFeedback=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	feedback=strFeedback;
    	objRateQuestionPage.enterFeedback(strFeedback);
    	
    }
    @And("^user selects Question is wrong feedback$")
    public void user_selects_question_is_wrong_feedback() throws Throwable {
    	objRateQuestionPage.clickQuestionWrong();
    }
    
    @And("^user gets question title$")
    public void user_gets_question_title() throws Throwable {
    	quesTitle=objRateQuestionPage.getQuestionTitle().trim();
    }
    @Then("^question and no comment is appearing on feedback page of admin panel for correct question$")
    public void question_is_appearing_on_feedback_page_of_admin_panel_for_correct_question() throws Throwable {
    	System.out.println("Question Title Rate Question "+quesTitle);
    	objPlayerFeedBackPageAdmin.verifyRatedQuestionFeedbackCorrect(quesTitle);
    }
    @Then("^question and comment is appearing on feedback page of admin panel for wrong question$")
    public void question_ans_question_type_is_appearing_on_feedback_page_of_admin_panel_for_wrong_question() throws Throwable {
    	objPlayerFeedBackPageAdmin.verifyWrongQuestion(quesTitle,feedback);
    }
    @Then("^question and comment is appearing on feedback page of admin panel for question correct but have suggestion$")
    public void question_with_feedback_type_and_comment_is_appearing_on_feedback_page_of_admin_panel_for_question_correct_but_have_suggestion() throws Throwable {
    	objPlayerFeedBackPageAdmin.verifySuggestionQues(quesTitle,feedback);
    }
 
    
}

