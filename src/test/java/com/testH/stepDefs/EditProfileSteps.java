package com.testH.stepDefs;

import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.EditPlayerPage;
import com.testH.base.pages.admin.LoginPage;
import com.testH.base.pages.client.MorePage;
import com.testH.base.pages.client.PlayerProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class EditProfileSteps {

	private MorePage objMorePage;
	private BaseTest objBaseTest;
	private LoginPage objLoginPage;
	private AllUsersPage objAllPlayersPage;
	private EditPlayerPage objEditPlayerPage;


	public EditProfileSteps() {
		objMorePage = new PageFactory().getMorePage();
		objBaseTest = new BaseTest();
		objLoginPage = new LoginPage();
		objAllPlayersPage = new AllUsersPage();
		objEditPlayerPage = new EditPlayerPage();
	}

	@And("^User clicks on edit profile button$")
	public void user_clicks_on_edit_profile_button() throws Throwable {

		objMorePage.clickEditProfile();
	}

	@Then("^edit profile page is opening$")
	public void edit_profile_page_is_opening() throws Throwable {

		objMorePage.verifyEditProfilePage();
	}

	@And("^User click on Qualification$")
	public void user_click_on_qualification() throws Throwable {
		objMorePage.selectQualification();
	}

	@Then("^correct qualification list is appearing$")
	public void correct_qualification_list_is_appearing() throws Throwable {
		objMorePage.verifyQualificationListItems();
	}

	@Then("^Emp id field is disabled$")
	public void emp_id_field_is_disabled() throws Throwable {
		objMorePage.verifyEmpIdDisable();
	}

	@Then("^defaut status message is appearing$")
	public void defaut_status_message_is_appearing() throws Throwable {
		objMorePage.verifyDefaultStatus();
	}

	@And("^User edit first name$")
	public void user_edit_first_name() throws Throwable {
		objMorePage.verifyAndEditFirstName();
	}

	@And("^User edit last name$")
	public void user_edit_last_name() throws Throwable {
		objMorePage.verifyAndEditLastName();
	}

	@And("^User enters Title$")
	public void user_enters_title() throws Throwable {
		objMorePage.verifyAndEnterTitle();
	}

	@And("^User selects DOB$")
	public void user_selects_dob(DataTable table) throws Throwable {
		By loc_dob=By.xpath("//input[@placeholder='Date Of Birth']");
		Pojo.getObjSeleniumFunctions().setText(loc_dob, "2016-12-16");

	}

	@And("^User selects country$")
	public void user_selects_country(DataTable table) throws Throwable {
		List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
		objMorePage.verifyAndSelectCountry(userData);
	}

	@And("^User selects state$")
	public void user_selects_state(DataTable table) throws Throwable {
		List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
		objMorePage.verifyAndSelectState(userData);
	}

	@And("^User enters City$")
	public void user_enters_city() throws Throwable {
		objMorePage.verifyAndEnterCity();
	}

	@And("^User enters College$")
	public void user_enters_college() throws Throwable {
		objMorePage.verifyAndEnterCollege();
	}

	@And("^User enters year$")
	public void user_enters_year(DataTable table) throws Throwable {
		List<List<String>> data = table.asLists();
		String userData = data.get(1).get(0);
		System.out.println("User Data " + userData);
		objMorePage.verifyAndSelectYear(userData);

	}

	@And("^User enters college Major$")
	public void user_enters_college_major() throws Throwable {
		objMorePage.verifyAndEnterCollegeMajor();

	}

	@And("^User can click and select Qualification$")
	public void user_selects_qualification() throws Throwable {
		objMorePage.selectQualification();

	}

	@And("^User update status$")
	public void user_update_status() throws Throwable {
		objMorePage.addStatus();
	}

	@Then("^All details are saving and reflecting to user$")
	public void all_details_are_saving_and_reflecting_to_user() throws Throwable {
		objMorePage.clickSave();
		objMorePage.clickEditProfile();
		objMorePage.verifyProfileDataWeb();

	}

	@And("^All details are reflecting in admin panel$")
	public void all_details_are_reflecting_in_admin_panel() throws Throwable {
//		objBaseTest.initializeWebEnvironmentIncognitoForAdmin();
//		List<List<String>> data = table.asLists();
//
//		String userName = data.get(1).get(0);
//		String password = data.get(1).get(1);
//		objLoginPage.enterEmail(userName);
//		objLoginPage.clickNext();
//		objLoginPage.enterPw(password);
//		objLoginPage.clickNext();

		objAllPlayersPage.clickUsersIcon();
		objAllPlayersPage.clickPlayers();
		objAllPlayersPage.clickFilter();
		objAllPlayersPage.clickEmail();
		objAllPlayersPage.enterEmail();
		objAllPlayersPage.clickDone();
		objAllPlayersPage.selectUser();

		 objEditPlayerPage.verifyFirstName(); 
		 objEditPlayerPage.verifyLastName();
		 
        Pojo.getObjSeleniumFunctions().waitFor(3);
		objEditPlayerPage.clickAdditionalInfo();

		
		  objEditPlayerPage.verifyTitle(); objEditPlayerPage.verifyCountry();
		  objEditPlayerPage.verifyState(); objEditPlayerPage.verifyCity();
		  objEditPlayerPage.verifyCollege(); objEditPlayerPage.verifyYear();
		  objEditPlayerPage.verifyCollegeMajor();
		 
		objEditPlayerPage.verifyQualification();

	}
	
	@Then("^change password button is displaying$")
    public void change_password_button_is_displaying() throws Throwable {
		objMorePage.verifyChangePwBtn();
    }
	@Then("^change password screen is opening$")
    public void change_password_screen_is_opening() throws Throwable {
		objMorePage.verifyChangePwScreen();
    }

    @And("^User clicks on change password button$")
    public void user_clicks_on_change_password_button() throws Throwable {
    	objMorePage.clickChangePw();
    }
	
    @And("^User enters current password for resetting password through edit profile$")
    public void user_enters_current_password_for_resetting_password_through_edit_profile() throws Throwable {
    	objMorePage.enterCurrentPw();
    }

    @And("^user enters new password for resetting password through edit profile$")
    public void user_enters_new_password_for_resetting_password_through_edit_profile(DataTable table) throws Throwable {
    	objMorePage.enterNewPw(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));
    }

    @And("^user enters confirm password for resetting password through edit profile$")
    public void user_enters_confirm_password_for_resetting_password_through_edit_profile(DataTable table) throws Throwable {
    	objMorePage.enterConfirmPw(Pojo.getObjSeleniumFunctions().getTestData(1, 0, table));

    }

    @And("^user clicks on save button on change password screen$")
    public void user_clicks_on_save_button_on_change_password_screen() throws Throwable {
    	objMorePage.clickSaveChangePw();
    }

    @Then("^Verify that success message after changing password$")
    public void verify_that_success_message_after_changing_password() throws Throwable {
    	objMorePage.verifySuccessPasswordChange();
    }
    

    @And("^user clicks on cancel button on edit profile screen$")
    public void user_clicks_on_cancel_button_on_edit_profile_screen() throws Throwable {
    	objMorePage.clickCancelEditPlayer();
    }


}
