package com.testH.base.pages.admin;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class CreateCompanyPage {
	
	By loc_Btnsettings=By.xpath("//p[contains(text(),'Settings')]");
	By loc_BtnCompanies=By.xpath("//p[contains(text(),'Companies')]");
	By loc_TxtCompanies=By.xpath("//span[contains(text(),'Showing All Companies')]");
	By loc_BtnAddCompany=By.xpath("//button[contains(@class,'add-company')]");
	By loc_TxtHeadquarters=By.xpath("//label[contains(text(),'HEADQUARTERS')]");
	By loc_BtnSave=By.xpath("//button[@type='submit']");
	By loc_TextBoxCompany=By.xpath("//input[@name='company_name']");
	By loc_TextBoxCompanyId=By.xpath("//input[@name='company_slug']");
	By loc_TextBoxIndustry=By.xpath("//input[@name='industry']");
	By loc_DrpdownCountry=By.xpath("//input[@placeholder='Select Country']");
	By loc_DrpDownSelectState=By.xpath("//input[@placeholder='Select State']");
	By loc_TextBoxCity=By.xpath("//input[@name='city']");
	By loc_DrpDownTimeZone=By.xpath("//input[@placeholder='Select Time Zone']");
	
	
	public void clickSettingsBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Settings button is clicking",Pojo.getObjSeleniumFunctions().click(loc_BtnCompanies));
    }
	
	public void clickCompaniesBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Companies button is clicking",Pojo.getObjSeleniumFunctions().click(loc_Btnsettings));
    }
	
	public void verifyAllCompanyPage()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All Company page is opening",Pojo.getObjSeleniumFunctions().getText(loc_TxtCompanies).trim().equals("Showing All Companies"));
	}

	public void verifyAddnewCompanyPage()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add new Company page is opening",Pojo.getObjSeleniumFunctions().getText(loc_TxtHeadquarters).trim().equals("HEADQUARTERS"));

	}
	
	public void enterCompanyName(String cName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is entering", Pojo.getObjSeleniumFunctions().setText(loc_TextBoxCompany,cName));
	}
	
	public void enterCompanyId(String cId)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is entering", Pojo.getObjSeleniumFunctions().setText(loc_TextBoxCompanyId,cId));
	}
	
	public void enterIndustry(String industryName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that industry is entering", Pojo.getObjSeleniumFunctions().setText(loc_TextBoxIndustry,industryName));
	}
	
	public void enterCity(String cityName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that city is entering", Pojo.getObjSeleniumFunctions().setText(loc_TextBoxCity,cityName));
	}
	
	public void selectCountry(String countryName)
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpdownCountry) );
		By loc_country=By.xpath("//*[contains(text(),' "+countryName+" ')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country is selecting", Pojo.getObjSeleniumFunctions().click(loc_country));
	}
	
	public void selectState(String state) {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownSelectState) );
		By loc_state=By.xpath("//*[contains(text(),' "+state+" ')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state is selecting", Pojo.getObjSeleniumFunctions().click(loc_state));
	}
	
	public void selectTimeZone(String timeZone) {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timezone drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownTimeZone));
		By loc_tz=By.xpath("//*[contains(text(),' "+timeZone+" ')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that timezone is selecting", Pojo.getObjSeleniumFunctions().click(loc_tz));
	}
	
	
	
}
