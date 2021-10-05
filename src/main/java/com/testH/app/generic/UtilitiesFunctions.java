package com.testH.app.generic;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.opencsv.*;

import java.util.Iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import com.testH.app.generic.Pojo;
import com.testH.app.generic.UtilitiesFunctions;
import com.testH.base.pages.admin.BuildSpGamePage;

//import freemarker.template.utility.CollectionUtils;

import com.testH.app.generic.PropertyReaderManager;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.MediaEntityModelProvider;
//import com.aventstack.extentreports.model.Log;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.Markup;





/*
   This class contains UtilitiesFunctions function
*/

public class UtilitiesFunctions {
	
	By loc_clickNextResetCal=By.xpath("//input[@name='futureReset']");
	By loc_clickStartDateCal=By.xpath("//input[@name='pastReset']");
	By loc_selectYear=By.xpath("//button[@aria-label='Choose month and year']");
	By loc_nextBtn=By.xpath("//button[contains(@aria-label,'Next')]");
	By loc_previousBtn=By.xpath("//button[contains(@aria-label,'Previous')]");
	By loc_startDate=By.xpath("//span[text()='Start Date:']//following-sibling::input");
	By loc_endDate=By.xpath("//span[text()='End Date:']//following-sibling::input");
	By loc_selectedDateScheduleGame=By.xpath("//td[@aria-selected='true']/child::div");
	By loc_selectedDate=By.xpath("//td[@aria-selected='true']/child::div");
	By loc_datesExceptSelected=By.xpath("//td[@aria-selected='false']/child::div");
	By loc_disabledDates=By.xpath("//td[@aria-disabled='true']");
	By loc_totalEnabledDatesIfNoDateSelected=By.xpath("//td[@aria-selected='false']/child::div");
    By loc_loadingCircle=By.xpath("assets/img/OHloader.gif");

	
    public static Map<String,Map<String,List<String>>> DUMMY_DATA;
    public static HashMap<String, String> expectedDataDate = new HashMap<String, String>();
    public static HashMap<String, List> actualCsvData = new HashMap<String, List>();


    
    public  String getDateInSpecifiedFormat(String dateFormat) {
    	
        String current_date = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		current_date = formatter.format(today);
		// System.out.println("getDateInSpecifiedFormat "+dateFormat + " -
		// "+current_date);
		return current_date;
	}
	
	public  boolean takeScreenShot(WebDriver webDriver, String fileWithPath) {
		TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(fileWithPath);
		try {
			FileUtils.moveFile(srcFile, destFile);
			return true;
		} catch (IOException iOException) {
			iOException.printStackTrace();
			return false;

		}
	}
	
  public String getCurrentDate(){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd");  
	    Date date = new Date();  
		String currentDate=formatter.format(date);
		return currentDate;
	}

public String getRandomStringWithSmallAndCapitalLetters(int lenght) 
{
	String allowedChars = "abcdefghiklABCDEFGHIJKLMNOmnopqrstuvwxyz";
	String randomstring = "";
	for (int i=0; i < lenght; i++) 
	{
		int rnum = (int) Math.floor(Math.random() * allowedChars.length() );
		randomstring += allowedChars.substring(rnum,rnum+1);
	}
	return randomstring;
}

public String getRandomDatesFormList() {
    
    Random rand = new Random();
    String randomDate="";
    List<String> givenList = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28");
 
    int numberOfElements = 28;
 
    for (int i = 0; i < numberOfElements; i++) {
        int randomIndex = rand.nextInt(givenList.size());
        randomDate = givenList.get(randomIndex);
    }
    return randomDate;
}
public String getRandomNumbers(int length) 
{
	String allowedChars = "1234567890";
	String randomstring = "";
	for (int i=0; i < length; i++) 
	{
		int rnum = (int) Math.floor(Math.random() * allowedChars.length() );
		randomstring += allowedChars.substring(rnum,rnum+1);
	}
	return randomstring;
}

public void consoleLogPrinter(String passMessage){
	
	System.out.println("              "+passMessage);
}

public void logTestCaseStatus(String step,boolean status)
{
 
	Assert.assertTrue(step, status);
	
}

public int getRandomNumber(int min, int max)
{
    int random_int = (int)(Math.random() * (max - min + 1) + min);
	
	return random_int;
}

public  void loadGameMetaData(List<Integer> categoryQuestionInfo)
{
	if (DUMMY_DATA != null) {
		return;
	}
	Map<String,Map<String,List<String>>> gameMetaData =new HashMap();
	
	String gameName = "Game Name: "+getRandomStringWithSmallAndCapitalLetters(6);
	List<String> category =new ArrayList<String>();
	Map<String,List<String>> categoryQuestionEntry = new HashMap();
	

	for (int categoryId:categoryQuestionInfo)
	{
		String categoryName = "Category: "+ getRandomStringWithSmallAndCapitalLetters(categoryId);
		List<String> questions = new ArrayList<String>();
		for(int i=1;i<=categoryId;i++)
		{
			questions.add("This is Question "+i);
		}
		
		categoryQuestionEntry.put(categoryName, questions);
			
	}
	gameMetaData.put(gameName, categoryQuestionEntry);
	
	DUMMY_DATA = gameMetaData;
}

public void setDate(String calType,String date)
{
    HashMap<Integer, String> month = new HashMap<Integer, String>();
	ArrayList<String> startDate = new ArrayList<String>();
   
	month.put(1, "January");
    month.put(2, "February");
    month.put(3, "March");
    month.put(4, "April");
    month.put(5, "May");
    month.put(6, "June");
    month.put(7, "July");
    month.put(8, "August");
    month.put(9, "September");
    month.put(10, "October");
    month.put(11, "November");
    month.put(12, "December");

	String dateSplit[]=date.split("/");
	String sYear=dateSplit[2];
	String sDate=dateSplit[1];
	String sMonth=dateSplit[0];
	
	int intYear=Integer.parseInt(sYear);
	int intDate=Integer.parseInt(sDate);
	int intMonth=Integer.parseInt(sMonth);
	
System.out.println("Year "+intYear);
System.out.println("Date "+intDate);
System.out.println("Month "+intMonth);

if(calType.equals("NextReset"))
{
	Pojo.getObjSeleniumFunctions().waitFor(5);
	Pojo.getObjSeleniumFunctions().click(loc_clickNextResetCal);
}
else if(calType.equals("StartDate"))
{
	Pojo.getObjSeleniumFunctions().waitFor(5);
	Pojo.getObjSeleniumFunctions().click(loc_clickStartDateCal);
}

String strCurrentYear=Pojo.getObjSeleniumFunctions().getText(loc_selectYear);
System.out.println("Current Year "+strCurrentYear);
strCurrentYear=strCurrentYear.replaceAll("[^0-9]","");
Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_selectYear);
Pojo.getObjSeleniumFunctions().click(loc_selectYear);
int intCurrentYear=Integer.parseInt(strCurrentYear);

int yearDiff=intYear-intCurrentYear;

By loc_yearXpath=By.xpath("//td[@aria-label='"+intYear+"']");

if(yearDiff>0)
{

while(Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_yearXpath)==false)
{
	Pojo.getObjSeleniumFunctions().click(loc_nextBtn);
}
}

else if(yearDiff<0)
{
	while(Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_yearXpath)==false)
	{
		Pojo.getObjSeleniumFunctions().click(loc_previousBtn);
	}
}

Pojo.getObjSeleniumFunctions().click(loc_yearXpath);

String monthName=month.get(intMonth);
String monthNameShort=month.get(intMonth).substring(0, 3);
By loc_month=By.xpath("//td[contains(@aria-label,'"+monthName+"')]");
Pojo.getObjSeleniumFunctions().click(loc_month);

String dateNumber=monthName+" "+intDate+", "+intYear;
System.out.println("Date "+dateNumber);

By selectDate=By.xpath("//td[(@aria-label='"+dateNumber+"')]");
Pojo.getObjSeleniumFunctions().click(selectDate);

String leaderBoardDateNotification=monthName+" "+intDate;
startDate.add(leaderBoardDateNotification);
System.out.println("Leaderboard Start Reset Date "+leaderBoardDateNotification);
BuildSpGamePage.expectedData.put("LeaderboardResetDate",startDate);
}


public  HashMap<String, String> setRandomEndDateScheduleGame()
{
//Pojo.getObjSeleniumFunctions().click(loc_startDate);


//int totalDates=datesExceptSelectedDate.size()+1;
//int totalDisabledDates=disabledDates.size();
//int enabledDateCount=totalDates-totalDisabledDates;
//int ranNum=getRandomNumber(1,enabledDateCount);
//int randomDate=totalDisabledDates+ranNum;

//System.out.println("Random Start Date "+randomDate);
//By loc_ranStartDate=By.xpath("//div[text()='"+randomDate+"']");
//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that start date is selecting", Pojo.getObjSeleniumFunctions().click(loc_ranStartDate));

Pojo.getObjSeleniumFunctions().click(loc_endDate); 
Pojo.getObjSeleniumFunctions().click(loc_nextBtn);
List<WebElement> enabledDates=Pojo.getObjSeleniumFunctions().getWebElementList(loc_totalEnabledDatesIfNoDateSelected);
int enabledDateCount=enabledDates.size();
int ranNum=getRandomNumber(1,enabledDateCount);

System.out.println("Random End Date "+ranNum);
expectedDataDate.put("EndDate",String.valueOf(ranNum));

By loc_monthYear=By.xpath("//button[@aria-label='Choose month and year']/child::span"); 
By loc_ranEndDate=By.xpath("//div[text()='"+ranNum+"']");

String monthYear=Pojo.getObjSeleniumFunctions().getText(loc_monthYear).trim();
System.out.println("Month and Year "+monthYear);
String month=monthYear.replaceAll("[0-9]", "");
System.out.println("Month "+month);
expectedDataDate.put("Month",month);
String year=monthYear.replaceAll("[A-Za-z]", "");
System.out.println("Year "+year);
expectedDataDate.put("Year",year);



Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end date is selecting", Pojo.getObjSeleniumFunctions().click(loc_ranEndDate));
return expectedDataDate;
}


public void waitForWebAppLoadingAnimationToDisappear()
{
	Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 30);

}

public void waitForPageLoad(int timeInSeconds) {
Pojo.getDriver().manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);

}

public String getEncodedPassword(String pwd)
{
	byte[] encodedString = Base64.encodeBase64(pwd.getBytes());
	return  new String(encodedString);

}

public String getDecodedPassword(String pwd)
{
	byte[] decodedString = Base64.decodeBase64(pwd);
	return  new String(decodedString );

}

public HashMap<String, List> getCsvData() throws IOException
{
	String path =  System.getProperty("user.dir")+ Pojo.getObjConfig().getProperty("downloads.path").trim()+"/"+Pojo.getObjSeleniumFunctions().getLatestDownloadedFileName();
	ArrayList<String> cellData;
	
    FileReader filereader = new FileReader(path);
    CSVReader csvReader = new CSVReader(filereader);
    
    int count=1;
    String rowName="Row";
    //rowName=rowName+" "+count;
    String[] nextRecord;
 // we are going to read data line by line
    while ((nextRecord = csvReader.readNext()) != null) {
    	rowName=rowName+" "+count;
    	cellData=new ArrayList<String>();
    	for (String cell : nextRecord) 
    	{
        	cellData.add(cell);
        	actualCsvData.put(rowName, cellData);
        }
    	count=count+1;
    	rowName="Row";
    	
    	}
    
    //System.out.println(actualCsvData);
    return actualCsvData;
}

}


	
	








