package com.testH.app.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.HomePage;

public class TestData {
	
	private	Faker getRandomData;
	private HomePage objHomePage;

	public TestData()
	{
		getRandomData = new Faker();
		objHomePage=new PageFactory().getObjHomePage();

	}
	
	private  String firstName="";
	private  String lastName="";
	private  String title="";
	private  String college="";
	private  String collegeMajor="";
	private String status="";
	private  String city="";
	private  String phoneNumber="";
	private  String email="";
	
public String getFirstName() {
		
		firstName=getRandomData.name().firstName().replaceAll("[^0-9a-zA-Z]","");
		return firstName;
	}

public String getLastName() {
	
	lastName=getRandomData.name().lastName().replaceAll("[^0-9a-zA-Z]","");
	return lastName;
}

public String getTitle() {
    
    String randomTitle="";
    List<String> givenList = Arrays.asList("Mr","Ms","Mrs");
 
    	int randomIndex = Pojo.getObjUtilitiesFunctions().getRandomNumber(0, givenList.size()-1);
        randomTitle = givenList.get(randomIndex);
    
    
    return randomTitle;
}

public String getCollege() {
	
	college=getRandomData.educator().university();
	return college;
}

public String getCollegeMajor() {
	
	collegeMajor=getRandomData.educator().university()+" collegeMajor";
	return collegeMajor;
}

public String getStatus() {
	
	status="I love 1huddle gaming "+getRandomData.name().firstName();
	return status;
}

public String getCity() {
	
	city=getRandomData.address().city();
	return city;
}

public String getPhoneNumber() {
	
	phoneNumber=getRandomData.phoneNumber().cellPhone();
	return city;
}

public String getRandomEmail() {
	
	email="vishal.1huddle+"+Pojo.getObjUtilitiesFunctions().getRandomNumber(1, 99999)+"@gmail.com";
	System.out.println("Random Email "+email);
	return email;
}

public String getQualification() {
    
    String randomQualification="";
    List<String> givenList = Arrays.asList("High School","Undergraduate","Graduate");
    int randomIndex = Pojo.getObjUtilitiesFunctions().getRandomNumber(0, givenList.size()-1);
        randomQualification = givenList.get(randomIndex);
        return randomQualification;
}

public String getUserEmail()
{
	String userEmail=objHomePage.playerEmail;
	return userEmail;
}


}
