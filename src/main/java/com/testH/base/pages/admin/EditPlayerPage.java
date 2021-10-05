package com.testH.base.pages.admin;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.client.MorePage;

public class EditPlayerPage {
	
	
	String expectedTestData="";
	
	By loc_txtBoxFirstName=By.xpath("//input[@name='first_name']");
	By loc_txtBoxLastName=By.xpath("//input[@name='last_name']");
	By loc_additionalInfo=By.xpath("//div[text()='Additional Information']");
    By loc_title=By.xpath("//input[@id='title']");
    By loc_country=By.xpath("//input[@placeholder='Select Country']");
    By loc_state=By.xpath("//input[@placeholder='Select State']");
    By loc_city=By.xpath("//input[@id='city']");
    By loc_college=By.xpath("//input[@id='college']");
    By loc_year=By.xpath("//select[@id='colg-grad-year']");
    By loc_collegeMajor=By.xpath("//input[@id='colg-major']");
    By loc_qualification=By.xpath("//option[text()='Select Highest Degree Completed']//parent::select");
    
   
    
    public void verifyFirstName()
    {
    	expectedTestData=MorePage.expectedData.get("FirstName");
    	System.out.println("Expected First Name Admin "+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that First name is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_txtBoxFirstName, "value").trim().equals(expectedTestData));
    }
    public void verifyLastName()
    {
    	expectedTestData=MorePage.expectedData.get("LastName");
    	System.out.println("Expected Last Name Admin "+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Last name is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_txtBoxLastName, "value").trim().equals(expectedTestData));
    }
    public void clickAdditionalInfo()
    {
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veiryf that additional info tab is selecting", Pojo.getObjSeleniumFunctions().click(loc_additionalInfo));
    }
    public void verifyTitle()
    {
    	expectedTestData=MorePage.expectedData.get("Title");
    	System.out.println("Expected Title in Admin"+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Title is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_title, "value").trim().equals(expectedTestData));
    }
    public void verifyCountry()
    {
    	expectedTestData=MorePage.expectedData.get("Country");
    	System.out.println("Expected Country in Admin"+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_country, "value").trim().equals(expectedTestData));
    }
    public void verifyState()
    {
    	
    	expectedTestData=MorePage.expectedData.get("State");
    	System.out.println("Expected State in Admin"+expectedTestData);
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_state, 15);
    	
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_state, "value").trim().equals(expectedTestData));
    }
    public void verifyCity()
    {
    	expectedTestData=MorePage.expectedData.get("City");
    	System.out.println("Expected City in Admin"+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that city is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_city, "value").trim().equals(expectedTestData));
    }
    public void verifyCollege()
    {
    	expectedTestData=MorePage.expectedData.get("College");
    	System.out.println("Expected College in Admin"+expectedTestData);
    	Pojo.getObjSeleniumFunctions().scrollToView(loc_college);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that college is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_college, "value").trim().equals(expectedTestData));
    }
    public void verifyYear()
    {
    	expectedTestData=MorePage.expectedData.get("Year");
    	System.out.println("Expected Year in Admin"+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that year is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_year, "value").trim().equals(expectedTestData));
    }
    public void verifyCollegeMajor()
    {
    	expectedTestData=MorePage.expectedData.get("CollegeMajor");
    	System.out.println("Expected Year in Admin"+expectedTestData);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that college major is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_collegeMajor, "value").trim().equals(expectedTestData));
    }
    public void verifyQualification()
    {
    	expectedTestData=MorePage.expectedData.get("Qualification");
    	System.out.println("Expected qualification in Admin"+expectedTestData);
    	System.out.println("Actual qualification in Admin"+Pojo.getObjSeleniumFunctions().getAttribute(loc_qualification, "value"));
    	String selectedEduIndex=Pojo.getObjSeleniumFunctions().getAttribute(loc_qualification, "value");
    	By loc_selectEducationText=By.xpath("//option[@value='"+selectedEduIndex+"']");
    	String selectedHigherEducation=Pojo.getObjSeleniumFunctions().getText(loc_selectEducationText);
    	System.out.println("HigherEducation "+selectedHigherEducation);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that qualification is correct", selectedHigherEducation.trim().equals(expectedTestData));
    }
}
