package com.testH.stepDefs;

import java.util.List;

import org.apache.log4j.net.SyslogAppender;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;



import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.HomePage;
import com.testH.base.pages.client.MorePage;

public class PlayerLoginSteps {
	
	private HomePage objHomePage;
	private BaseTest objBaseTest;

	
	public PlayerLoginSteps()
	{
		objHomePage = new PageFactory().getObjHomePage();
		objBaseTest=new BaseTest();
	}
	
	@And("^player logged In$")
	public void player_logged_In(DataTable table)
	{
		objBaseTest.initializeWebEnvironment();
    	List<List<String>> data=table.asLists();
    	String userName=data.get(1).get(0);
    	String password=data.get(1).get(1);
    	System.out.println("User Name: "+userName);
    	System.out.println("Password: "+password);
    	objHomePage.setEmail(userName);
    	objHomePage.clickNext();
    	objHomePage.setPassword(password);
    	objHomePage.clickLogin();
	}
	
	
}
