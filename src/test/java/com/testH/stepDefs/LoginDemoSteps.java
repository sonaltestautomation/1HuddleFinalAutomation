package com.testH.stepDefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginDemoSteps {
	private HomePage objHomePage;

	public LoginDemoSteps()
	{
		objHomePage = new PageFactory().getObjHomePage();
	}
	
	
	@Given("^player is on home page$")
    public void player_is_on_home_page(DataTable table) throws Throwable {
		String url=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		Pojo.getDriver().get(url);
		Pojo.getObjSeleniumFunctions().waitFor(10);
    }

    @When("^player enters email and password$")
    public void player_enters_email_and_password(DataTable table) throws Throwable {
    	String uName=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
    	String pw=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
    	
    WebElement textBoxUserName=	Pojo.getDriver().findElement(By.xpath("//input[@name='username']"));
    textBoxUserName.sendKeys(uName);
    
    WebElement btnNext=Pojo.getDriver().findElement(By.xpath("//span[contains(text(),'NEXT')]"));
    btnNext.click();
    
    Pojo.getObjSeleniumFunctions().waitFor(5);
    WebElement textBoxPw=Pojo.getDriver().findElement(By.xpath("//input[@name='password']"));
    textBoxPw.sendKeys(pw);
    
    WebElement btnLogin=Pojo.getDriver().findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
    btnLogin.click();
    
    }
    
    @Then("^player is logged In successfully$")
    public void player_is_logged_in_successfully(DataTable table) throws Throwable {
    	
    	Pojo.getObjSeleniumFunctions().waitFor(5);
    	WebElement titleText=Pojo.getDriver().findElement(By.xpath("//span[text()='Games']"));
    	
        String expectedTitle=Pojo.getObjSeleniumFunctions().getTestData(1, 0, table);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is on logged In successfully", titleText.getText().trim().equals(expectedTitle));

    }

}
