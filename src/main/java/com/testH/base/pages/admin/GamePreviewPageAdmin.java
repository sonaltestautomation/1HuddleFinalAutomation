package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class GamePreviewPageAdmin  {
	
	By loc_titleTextBox=By.xpath("//div[contains(@class,'infoDiv')]//following-sibling::input[(@placeholder='Enter Title')]");
	By loc_scenarioTextBox=By.xpath("//textarea[@placeholder='Enter Scenario']");
	By loc_infoTitle=By.xpath("//div[contains(@class,'infoDiv')]//following-sibling::div[4]//child::input");
	By loc_infoDescription=By.xpath("//div[contains(@class,'infoDiv')]//following-sibling::div[4]//child::textarea");
    By loc_doneButton=By.xpath("//span[contains(text(),'DONE')]/parent::div");
    By loc_yesButtonConfirmAction=By.xpath("//span[text()='YES']");
    
    By loc_noButtonConfirmAction=By.xpath("//span[text()='NO']");
    By loc_addMoreBtn=By.xpath("//span[contains(text(),'Add More')]");
    By loc_titleInfo=By.xpath("//span[contains(text(),'INFORMATION')]/parent::div/following-sibling::div[1]//child::input");
	By loc_descInfo=By.xpath("//span[contains(text(),'INFORMATION')]/parent::div/following-sibling::div[1]//child::textarea");
    
	public static HashMap<String, String> expectedProfileData = new HashMap<String, String>();
	public static HashMap<String, List> expectedProfileDataList = new HashMap<String, List>();

    
    public void enterTitle(String title)
    {
    	
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleTextBox, 10);
    	Pojo.getObjSeleniumFunctions().clearText(loc_titleTextBox);
    	expectedProfileData.put("ProfileName", title);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is entering",Pojo.getObjSeleniumFunctions().setText(loc_titleTextBox,title));
    }
    
    public void enterScenario(String scenario)
    {
    	Pojo.getObjSeleniumFunctions().clearText(loc_scenarioTextBox);
    	expectedProfileData.put("Scenario", scenario);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that scenario is entering",Pojo.getObjSeleniumFunctions().setText(loc_scenarioTextBox,scenario));
    }
    
   
    
    public void enterInformation(int infoCount)
    {
    	ArrayList<String> information=new ArrayList<String>();
    	

    	for(int i=1;i<=infoCount;i++)   //infoCount+1 bcz 1 info is already by default present
    	{
    		loc_titleInfo=By.xpath("//span[contains(text(),'INFORMATION')]/parent::div/following-sibling::div["+i+"]//child::input");
    		loc_descInfo=By.xpath("//span[contains(text(),'INFORMATION')]/parent::div/following-sibling::div["+i+"]//child::textarea");
    		String titleInfo="This is info title "+i;
    		String titleDesc="This is info description "+i;
    		Pojo.getObjSeleniumFunctions().scrollToView(loc_addMoreBtn);
    		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that information title is entering",Pojo.getObjSeleniumFunctions().setText(loc_titleInfo, titleInfo));
    		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that information description is entering",Pojo.getObjSeleniumFunctions().setText(loc_descInfo, titleDesc));
    		information.add(titleInfo);
    		information.add(titleDesc);
    		expectedProfileDataList.put("Information", information);
    		Pojo.getObjSeleniumFunctions().scrollToView(loc_addMoreBtn);
    		if(i<infoCount)
    		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add more button is clicking", Pojo.getObjSeleniumFunctions().click(loc_addMoreBtn));
    	}
    }
    
    public void clickDoneButton()
    {
    
    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_doneButton, 20);
    Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_doneButton);
    Pojo.getObjSeleniumFunctions().waitFor(3);
    
     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_doneButton));

    }
    
    public void clickYesScheduleGame()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_yesButtonConfirmAction, 10);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that yes button is clicking", Pojo.getObjSeleniumFunctions().click(loc_yesButtonConfirmAction));
        Pojo.getObjSeleniumFunctions().waitFor(3);
    }
    public void clickNoScheduleGame()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_noButtonConfirmAction, 10);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that no button is clicking", Pojo.getObjSeleniumFunctions().click(loc_noButtonConfirmAction));
        Pojo.getObjSeleniumFunctions().waitFor(3);
    }
}
