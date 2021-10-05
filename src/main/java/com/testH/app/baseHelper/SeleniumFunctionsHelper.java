package com.testH.app.baseHelper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.datatable.DataTable;

public abstract class SeleniumFunctionsHelper 
{
	public abstract void waitForElementPresence(By locator) throws NotFoundException ;


	public abstract void waitForPresenceOfNestedElementLocated(WebElement webElement, By sub_locator) throws NotFoundException;

	
	public abstract void waitForPresenceOfNestedElementsLocated(By locator, By sub_locator) throws NotFoundException ;


	public abstract void waitForElementToBeClickable(By locator) throws NotFoundException ;


	public abstract void waitForElementVisibilityLocated(By locator) throws NotFoundException ;


	public abstract void waitForElementVisibility(WebElement webElement) throws NotFoundException ;

	
	
	public abstract boolean waitForElementInVisibilityLocated(By locator, int timeInMiliSeconds) throws NotFoundException;


	
	public abstract boolean waitFor(int timeUnitSeconds);


	public abstract boolean waitFor(String timeUnitSeconds) ;
	
	public abstract boolean checkElementDisplayed(By locator) ;

	
	public abstract boolean checkElementDisplayed(WebElement webElement);

	public abstract boolean checkElementPresence(By locator);


	public abstract boolean isElementDisplayed(By locator);


	public abstract boolean checkElementVisibile(By locator) ;

	
	public abstract boolean checkElementInVisibile(By locator);

	
	public abstract boolean waitForElementDisplayed(By locator, int timeInMiliSeconds);

	
	public abstract boolean waitForElementIfVisible(By locator, int timeInMiliSeconds);
	
	public abstract void waitForPageLoad(int timeInSeconds);

	
	public abstract boolean checkElementEnabled(By locator);


	public abstract boolean click(By locator);
	

	

	public abstract boolean setText(By locator, String fieldValue);

	
	public abstract void clearText(By locator);

	
	public abstract boolean mouseHover(By locator);


	public abstract boolean selectRadioButton(By locator, boolean status);


	public abstract boolean isRadioButtonSelected(By locator) ;

	
    public abstract boolean checkElementNOTDisplayed(By locator);


	public abstract String getText(By locator, String textBy);

	
	public abstract boolean selectCheckBox(By locator, boolean status);

	
	public abstract boolean isCheckBoxSelected(By locator);


	public abstract void setHighlight(WebElement element);

	public abstract boolean pageRefresh();

	public abstract void deleteAllBrowserCookies();
	
	public abstract boolean scrollToView(By locator);


	public abstract String getTextByUsingJavaScripts(By locator);

    public abstract boolean scrollToView(WebElement webElement);

	
	public abstract String getText(By locator);

	
	public abstract String getText(WebElement webElement);
	
	public abstract String getText(AndroidElement androidElement);


	public abstract String getAttribute(By locator, String sElementAttribute);

	
	public abstract boolean clickUsingActionClass(By locator);


	public abstract String getCSSValue(By locator, String attributeName);
   
	public abstract boolean pressEscapeKeyKeyboard();

	
	
	public abstract List<WebElement> getWebElementList(By locator);

	
	

	public abstract boolean closeBrowserEnvironment();
	
	public abstract boolean navigateToBack();
	
	


	public abstract boolean mouseHover(WebElement webElement);
	      
	public abstract boolean openNewTabInSameBrowser(String pageUrl);
	
	public abstract boolean switchToWindowUsingTitle(String windowTitle);
	
	public abstract boolean switchToWindowContainsURL(String windowURL);

	public abstract String getCurrentURL();
	
	public abstract String getLatestDownloadedFileName();
	
	
	
	
	public abstract boolean scrollToDown(By locator);

	
	public abstract boolean closeBrowserAndAppEnv();
	
	public abstract boolean launchMobileApplication();
	
	public abstract boolean switchContextToHybridApp();
	
	public abstract boolean switchWindowByUsingWindowHandles();
	
	public abstract boolean switchToDefaultContent();
	
	
	public abstract boolean tap(By locator);
	
	public abstract boolean longPress(By locator);
	
	public abstract boolean switchContextToNativeApp();
	
	public abstract boolean selectRadioButtonByTypeIsRadio(By locator, boolean status);

	
	public abstract boolean mouseHoverUsingJavaScript(WebElement webElement);

	
	public abstract boolean selectCheckBoxByClassIsCheckBox(By locator, boolean status);

	
	public abstract String getTitle();
	
	public  abstract String getTestData(int rowNum, int colNum, DataTable table) ;
	
	public abstract WebElement getElementFluent(final By locator) throws NoSuchElementException, TimeoutException;


	public abstract WebElement getNestedElementFluent(final WebElement parentWebElement, final By locator)
			throws NoSuchElementException, TimeoutException ;
	

	public abstract WebElement getElementFluent(final WebElement webElement) throws NoSuchElementException, TimeoutException;
	
	public abstract boolean waitForElementDisappearFluent(By locator);

	
	public abstract boolean verifyElementDisplay(By locator);

	
	public abstract String getTextNode(By locator,int nodeIndex);
	
	public abstract boolean swipe(By locator1,By locator2);
	
	public abstract boolean androidScroll(String textToView);
	
	public abstract boolean hideKeyBoard();
	
	public abstract String getToastMessage(By locator,String attributeName);// //name attribute for toast messages will have content
	
	public abstract boolean androidScrollToScrollableElement(String resourceId,String textToView);
	
	public abstract String getTextByXpath(String text);
	
	public abstract String getTextByAccessibilityIdTest(String IdText);
	
	public abstract boolean landscapeRightRotation();
	
	public abstract boolean landscapeLeftRotation();
	
	public abstract boolean portraitUpsideDown();
	
	public abstract boolean openNotification();
	
	public abstract boolean setClipBoardText(String text);
	
	public abstract String getClipBoardText();
	
	public abstract boolean screenRecordRealDevice(int durationSec) throws InterruptedException;
	
	public abstract boolean gsmCallTest();//Only for emulators
	
	public abstract boolean toggleWiFi();
	
	public abstract boolean toggleAirPlane();
	
	public abstract boolean setNetworkSpeedTest();
	
	
	public abstract boolean isAppInstalled(String bundleId);
	
	public abstract ScreenOrientation getOrientation();
	
	public abstract boolean lockDevice();
	
	public abstract boolean unlockDevice();
	
	public abstract boolean runAppInBackground(int duration);
	
	public abstract String getCurrentPackage();
	
	public abstract boolean pageRefreshNativeApp(By locator1, By locator2); //locator 2 is downside locator
	
	public abstract List<AndroidElement> getWebElementListAndroidApp(By locator);
	
	public abstract void scrollByResourceId(String resourceId, int index);
	public abstract boolean openNewTab();
	
	
	


	public abstract void navigateToBackAndroidApp();

	public abstract boolean hitEnter(By locator);
	
	
	
		
	
}
