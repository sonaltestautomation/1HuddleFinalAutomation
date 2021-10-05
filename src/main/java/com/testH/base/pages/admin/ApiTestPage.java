package com.testH.base.pages.admin;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.testH.app.generic.Pojo;

public class ApiTestPage {
	private static String token;
	private static int contestId;
	
	private static Response response;
	private static String jsonString;
	String userName="manager@automation.com";
	String pw="pass";
	RequestSpecification request = RestAssured.given();
	String compId;
	String contestName;
	String contestStartDate;
	String contestEndDate;
	
	private static final String BASE_URL = "https://qa-api.1huddle.co";
	public static HashMap<String,String> liveContestName= new HashMap<String,String>();
	
	public void authorization_API(String uName, String password)
	{
		JSONObject obj = new JSONObject();
	      String userName= uName;
	      String pw=password;
	      
		//RestAssured.baseURI=BASE_URL;
		
		request.header("Content-Type", "application/json");
		request.header("api-key", "3ca09dc649ac5ec61e1a6c0fc17d5819UNia1nirLrBbcVxwSg52wjzrt6yjeHESIGAPwPID");
		request.header("api-secret", "3ca09dc649ac5ec61e1a6c0fc17d5819UNia1nirLrBbcVxwSg52wjzrt6yjeHESIGAPwPID");
		request.header("user-type", "manager");
		request.header("locale", "en");
	
	      obj.put("email", userName);
	      obj.put("password", pw);
	     
	    request.body(obj.toJSONString());
	    response=request.post(BASE_URL+"/api/rest/v1.5/auth/login");
	    String jsonString = response.asString();
	    System.out.println("Authentication Response "+jsonString);
	    token=response.body().jsonPath().get("data.authentication.onehuddletoken");
	    System.out.println("Token "+token);	
	}
	public void addNewContest_API(String companyID)
	{
		JSONObject obj = new JSONObject();
	    request.header("session-token", token);
	    compId=companyID;
	    //contestStartDate=Pojo.getObjSeleniumFunctions().getTestData(1, 1, table);
	    //contestEndDate=Pojo.getObjSeleniumFunctions().getTestData(1, 2, table);
	    contestName="Random Automation Contest "+Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1000);	    
	    liveContestName.put("Live Contest Name", contestName);
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Calendar c = Calendar.getInstance(); 
	    c.add(Calendar.SECOND, 20); 
	    contestStartDate = sdf.format(c.getTime());
	    System.out.println(contestStartDate);
	      
	    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Calendar c1 = Calendar.getInstance();
	    c1.setTime(new Date()); 
	    c1.add(Calendar.DATE, 1); 
	    contestEndDate = sdf1.format(c1.getTime());
	    System.out.println(contestEndDate); 
	    
		      obj.put("company_id", compId);
		      obj.put("contest_name", contestName);
		      obj.put("contest_start_date", contestStartDate);
		      obj.put("contest_end_date", contestEndDate);
		          
		 	  request.body(obj.toJSONString());
		 	  response=request.post(BASE_URL+"/api/rest/v2.0/contest/add");
		 	  String jsonString = response.asString();
		 	  System.out.println("Contest Response "+jsonString); 
		 	 contestId=response.body().jsonPath().get("data.contest_id");
			 System.out.println("Contest Id "+contestId);		
	}
	public void addRewardToContest_API(String reward)
	{
		//request.header("session-token", token);
    	//System.out.println("Session Token "+token);
    	String rewardDesc=reward;
    	JSONObject obj = new JSONObject();
 	    JSONObject rewards = new JSONObject();
 	   String strContestId=Integer.toString(contestId);
 	   obj.put("company_id", compId);
	   obj.put("contest_id", strContestId);
	   
	   rewards.put("category_id", "1");
	   rewards.put("reward_id", "5");
	   rewards.put("reward_desc", rewardDesc);
	   
	   obj.put("rewards",rewards);
	   request.body(obj.toJSONString());
	   System.out.println("Reward Object "+obj);
	   response=request.put(BASE_URL+"/api/rest/v2.0/contest/update");
	   String jsonString = response.asString();
	   System.out.println("Rewards Response "+jsonString); 
	}
	public void updateContest_API()
	{
		JSONObject obj = new JSONObject();
	  	   String strContestId=Integer.toString(contestId);
	  	   obj.put("company_id", compId);
		   obj.put("contest_id", strContestId);
		   obj.put("contest_name",contestName);
		   obj.put("contest_image_url", "www.tempimageurl.com");
		   obj.put("contest_start_date", contestStartDate);
		   obj.put("contest_end_date", contestEndDate);
		   obj.put("trophy_url", "www.troply1.com");
		   obj.put("contest_rule","1 - While contest, user not allowed to use Two Mobiles.");
		   request.body(obj.toJSONString());
		   System.out.println("Contest Update Object "+obj);
		   response=request.put(BASE_URL+"/api/rest/v2.0/contest/update");
		   String jsonString = response.asString();
		   System.out.println("Contest Update Response "+jsonString); 
	}
	public void addGametoContest_API(String gameID,String gameLimit)
	{
		JSONObject obj = new JSONObject();
    	JSONArray gameObject=new JSONArray();
    	String gameId=gameID;
    	String limitType=gameLimit;
    	
   	   String strContestId=Integer.toString(contestId);
   	   gameObject.add(0, gameId);
	   
   	   obj.put("company_id", compId);
 	   obj.put("contest_id", strContestId);
 	   obj.put("limit_type", limitType);
 	   obj.put("game_start_date", contestStartDate);
 	   obj.put("game_end_date", contestEndDate);
 	   obj.put("game_ids", gameObject);
 	      
 	   request.body(obj.toJSONString());
 	   System.out.println("Game Add Object "+obj);
 	   response=request.post(BASE_URL+"/api/rest/v2.0/contest/add_game_to_contest");
 	   String jsonString = response.asString();
 	   System.out.println("Contest Game Response "+jsonString); 
	}
	public void addAssignmentToContest_API(String locID,String locName,String deptID)
	{
		String locationId=locID;
    	String locationName=locName;
    	String deptId=deptID;
    	  	
    	JSONObject obj = new JSONObject();
    	JSONObject recipients = new JSONObject();
    	JSONArray receipientArray=new JSONArray();
    	JSONArray deptArray=new JSONArray();
    	String strContestId=Integer.toString(contestId);
   	
    	obj.put("company_id", compId);
  	    obj.put("contest_id", strContestId);
  	    obj.put("is_all", true);
  	   	
    	recipients.put("location_id", locationId);
    	recipients.put("location_name", locationName);
    	recipients.put("is_all", false);
    	
    	deptArray.add(0,deptId);
    	recipients.put("departments", deptArray);
    	
    	receipientArray.add(0, recipients);  	
    	obj.put("recipients", receipientArray);
    	request.body(obj.toJSONString());
 	    System.out.println("Assignment Object "+obj);
 	    response=request.post(BASE_URL+"/api/rest/v2.0/contest/add_assignment");
 	    String jsonString = response.asString();
 	    System.out.println("Contest assignment Response "+jsonString);
	}
	public void publishContest_API()
	{
		JSONObject obj = new JSONObject();
        String strContestId=Integer.toString(contestId);  	
    	obj.put("company_id", compId);
  	    obj.put("contest_id", strContestId);
  	    request.body(obj.toJSONString());
	   System.out.println("Publish Object "+obj);
	    response=request.post(BASE_URL+"/api/rest/v2.0/contest/publish");
	    String jsonString = response.asString();
	    System.out.println("Publish Response "+jsonString);
	}

}
