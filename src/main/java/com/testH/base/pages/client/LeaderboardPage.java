package com.testH.base.pages.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;

public abstract class LeaderboardPage {

	
	public abstract void verifyLeaderboardPage();
	public abstract void clickLeaderboardsSideMenu();
    public abstract int getLeaderboardPoint(String alreadyAddedPlayerName);
    public abstract void verifyLeaderBoardPoint(int gamePoints);
    public abstract void verifyCompanyName(String cName);
    public abstract void verifyAllDeptTabs();
    public abstract void verifyAllDeptGroupTabs();
    public abstract void clickLeaderboard(String leaderboardType);
    public abstract void verifyDeptName();
    public abstract void verifyGroupName();
    public abstract void verifyFirstRank();
    public abstract void verifySecondRank();
    public abstract void verifuThirdRank();
    public abstract void verifyUserInLeaderboardRankingList();
    public abstract void selectRandomPlayer();
    public abstract void selectPlayer();
    public abstract void selectGroupLeaderboard();
    public abstract void verifyPlayerRankingOrder();
    public abstract void verifyInfoMessageToVerifyEmailLimitedAccess(String expectedText);
	
	
	
	
	
	
	/*
	 * public LinkedHashMap<Integer, List<Object>> getAllPlayersPointLeaderboard() {
	 * 
	 * LinkedHashMap<Integer, List<Object>> playerRanking = new
	 * LinkedHashMap<Integer, List<Object>>();
	 * 
	 * 
	 * By loc_rankingListOrder=By.xpath("//mat-card/child::mat-card-title[1]");
	 * List<WebElement> rankList=Pojo.getObjSeleniumFunctions().getWebElementList(
	 * loc_rankingListOrder);
	 * 
	 * By loc_playerNames=By.xpath("//div[contains(@class,'parent')]");
	 * List<WebElement>
	 * playerList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_playerNames);
	 * 
	 * 
	 * By loc_playerPoints=By.xpath("//mat-card/child::mat-card-title[2]");
	 * List<WebElement>
	 * playerPointsList=Pojo.getObjSeleniumFunctions().getWebElementList(
	 * loc_playerPoints);
	 * 
	 * for(int i=1;i<=rankList.size();i++) { List<Object> player_name_score=new
	 * ArrayList<Object>(); By
	 * loc_rank=By.xpath("//mat-card["+i+"]/child::mat-card-title[1]"); By
	 * loc_playerName=By.xpath("//mat-card["+i+
	 * "]/child::mat-card-title//following-sibling::div[2]"); By
	 * loc_points=By.xpath("//mat-card["+i+"]/child::mat-card-title[2]");
	 * 
	 * int
	 * rank=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_rank).trim()
	 * ); System.out.println("Rank "+rank); String
	 * playerName=Pojo.getObjSeleniumFunctions().getText(loc_playerName).trim();
	 * System.out.println("Player Name "+playerName); int
	 * playerPoint=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(
	 * loc_points).trim().replaceAll("[^0-9]", ""));
	 * System.out.println("Player Point "+playerPoint);
	 * 
	 * 
	 * player_name_score.add(playerName); player_name_score.add(playerPoint);
	 * 
	 * playerRanking.put(rank,player_name_score);
	 * 
	 * }
	 * 
	 * List<Object> player_name_score=new ArrayList<Object>();
	 * player_name_score.add("Player automation"); player_name_score.add(0);
	 * playerRanking.put(2,player_name_score);
	 * 
	 * player_name_score=new ArrayList<Object>();
	 * player_name_score.add("Brian Bayer"); player_name_score.add(1700);
	 * playerRanking.put(1,player_name_score);
	 * 
	 * 
	 * System.out.println("Player Ranking "+playerRanking); return playerRanking; }
	 * 
	 * public void verifyPlayerRankingLeaderboard() { LinkedHashMap<Integer,
	 * List<Object>> actualPlayerRanking=getAllPlayersPointLeaderboard();
	 * 
	 * TreeMap<Integer, List<Object>> expectedPlayerRanking = new TreeMap<Integer,
	 * List<Object>>(); expectedPlayerRanking.putAll(actualPlayerRanking);
	 * System.out.println("Actual Ranking "+actualPlayerRanking);
	 * System.out.println("Expected Ranking "+ expectedPlayerRanking);
	 * 
	 * Pojo.getObjUtilitiesFunctions().
	 * logTestCaseStatus("Verify that Ranking is showing correctly" ,
	 * actualPlayerRanking.equals(expectedPlayerRanking));
	 * 
	 * 
	 * actualPlayerRanking.keySet().iterator().hasNext();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */


}