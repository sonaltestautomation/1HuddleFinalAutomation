package com.testH.app.generic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.testH.app.baseHelper.SeleniumFunctionsHelper;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.android.SupportsSpecialEmulatorCommands;
import io.appium.java_client.screenrecording.CanRecordScreen;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;


import io.cucumber.datatable.DataTable;

public class SeleniumFunctionsAndroidEnv extends SeleniumFunctionsHelper {

	
	
	
	
	@Override
	public void waitForElementPresence(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

	
	
	@Override
	public void waitForPresenceOfNestedElementLocated(WebElement webElement, By sub_locator)
			throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfNestedElementLocatedBy(webElement, sub_locator));
		
	}

	

	@Override
	public void waitForPresenceOfNestedElementsLocated(By locator, By sub_locator)
			throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfNestedElementsLocatedBy(locator, sub_locator));
		
	}

	
	
	@Override
	public void waitForElementToBeClickable(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
		
	}

	
	
	@Override
	public void waitForElementVisibilityLocated(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

	

	
	
	@Override
	public boolean waitForElementInVisibilityLocated(By locator, int timeInMiliSeconds) throws NotFoundException {
		WebDriverWait webDriverWait = new WebDriverWait(Pojo.getAndroidDriver(), timeInMiliSeconds);

		return	webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	
	@Override
	public boolean waitFor(int timeUnitSeconds) {
		try {
			Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitSeconds, TimeUnit.SECONDS));
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean waitFor(String timeUnitSeconds) {
		try {
			Thread.sleep(TimeUnit.MILLISECONDS.convert(Integer.parseInt(timeUnitSeconds), TimeUnit.SECONDS));
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}

	
	
	@Override
	public boolean checkElementDisplayed(By locator) {
		try {
		    this.waitForElementVisibilityLocated(locator);
			//this.setHighlight(Pojo.getDriver().findElement(locator));
			return Pojo.getAndroidDriver().findElement(locator).isDisplayed();
		}
		
		catch (NoSuchElementException e) {  
	        return false;  
	   }
		catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} 
		catch (Exception exception) {
			return false;
		}
	}
	

	@Override
	public boolean checkElementDisplayed(WebElement webElement) {
		try {

			this.waitForElementVisibility(webElement);
			return webElement.isDisplayed();

		} catch (NotFoundException exception) {

			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;

		} catch (Exception exception) {

			return false;
		}
	}

	
	
	@Override
	public boolean checkElementPresence(By locator) {
		try {
			this.waitForElementPresence(locator);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
	

	
	
	@Override
	public boolean isElementDisplayed(By locator) {
		try {
			Pojo.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	
	
	@Override
	public boolean checkElementVisibile(By locator) {
		try {
			this.waitForElementVisibilityLocated(locator);
			return Pojo.getAndroidDriver().findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
	}

	
	
	
	@Override
	public boolean checkElementInVisibile(By locator) {
		try {
			boolean blnFlag=this.waitForElementInVisibilityLocated(locator,10);
			Pojo.getObjUtilitiesFunctions().consoleLogPrinter("Verify Locator InVisibility Status -----> " +blnFlag);
			return !this.checkElementDisplayed(locator);
		} catch (Exception exception) {
			Pojo.getObjUtilitiesFunctions().consoleLogPrinter("Error Message -------> "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	
	
	@Override
	public boolean waitForElementDisplayed(By locator, int timeInMiliSeconds) {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(Pojo.getAndroidDriver(), timeInMiliSeconds);
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			return Pojo.getDriver().findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
	}

	

	@Override
	public boolean waitForElementIfVisible(By locator, int timeInMiliSeconds) {
		try {
			
			WebDriverWait webDriverWait = new WebDriverWait(Pojo.getAndroidDriver(), timeInMiliSeconds);
			
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
			return Pojo.getAndroidDriver().findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
	}
	
	
	@Override
	public boolean checkElementEnabled(By locator) {
		try {
			this.waitForElementVisibilityLocated(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			return Pojo.getAndroidDriver().findElement(locator).isEnabled();
		} catch (Exception exception) {
			return false;
		}
	}

	
	
	@Override
	public boolean click(By locator) {
		try {
			//this.waitForElementPresence(locator);
		//	this.waitForElementToBeClickable(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			Pojo.getAndroidDriver().findElement(locator).click();
			return true;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			try {
				waitForElementPresence(locator);
				waitForElementToBeClickable(locator);
				Pojo.getAndroidDriver().findElement(locator).click();				
				return true;
			} catch (Exception exceptionJavascript) {
				System.out.println("NoSuchElement Exception");
				return false;
			}
		}
	}


	

	@Override
	public boolean setText(By locator, String fieldValue) {
try {
			//this.setHighlight(Pojo.getDriver().findElement(locator));
			clearText(locator);
			// webElement.clear();
			Pojo.getAndroidDriver().findElement(locator).sendKeys(fieldValue);
			return true;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public void clearText(By locator) {
		Pojo.getAndroidDriver().findElement(locator).clear();
		
	}

	@Override
	public boolean mouseHover(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public boolean selectRadioButton(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			if (webElement.getAttribute("class").contains("radio")) {
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				return true;
			} else
				return false;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}

	
	
	@Override
	public boolean isRadioButtonSelected(By locator) {
		boolean state = false;
		try {
			waitForElementPresence(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			if (webElement.getAttribute("class").contains("radio"))
				state = webElement.isSelected();

			return state;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}

	
	
	@Override
	public boolean checkElementNOTDisplayed(By locator) {
		try {

			this.waitForElementPresence(locator);
			return !(Pojo.getAndroidDriver().findElement(locator).isDisplayed());
		} catch (Exception e) {

			// e.printStackTrace();
			return true;
		}
	}

	
	
	@Override
	public String getText(By locator, String textBy) {
		String strText = "";
		try {
			//waitForElementPresence(locator);
			//this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			switch (textBy.toLowerCase()) {
			case "value":
				strText = webElement.getAttribute("value");
				break;

			case "text":
				strText = webElement.getText();
				break;
			default:
				strText = webElement.getText();
				break;
			}

		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
		}
		return strText;
	}
	
	@Override
	public String getText(By locator) {
		this.setHighlight(Pojo.getAndroidDriver().findElement(locator));
		String strText = "";
		strText=Pojo.getAndroidDriver().findElement(locator).getText();
		return strText;
	}

	
	
	@Override
	public boolean selectCheckBox(By locator, boolean status) {
		try {
			WebElement webElement=Pojo.getAndroidDriver().findElement(locator);
			waitForElementPresence(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			if (webElement.getAttribute("type").equals("checkbox")) {
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				return true;
			} else
				return false;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean isCheckBoxSelected(By locator) {
		boolean state = false;
		try {
			waitForElementPresence(locator);
		//	this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			if (webElement.getAttribute("type").equals("checkbox"))
				state = webElement.isSelected();

			return state;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			return false;
		}
			}
	
	@Override
	public void setHighlight(WebElement element) {
		
	}

	@Override
	public boolean pageRefresh() {   //Only for web view. Not for native app
try {
			
			Pojo.getAndroidDriver().navigate().refresh();
			return true;
		} catch (Exception exception) {
			
			exception.getMessage();
			return false;
		}
		
	}

	@Override
	public void deleteAllBrowserCookies() {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public boolean scrollToView(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTextByUsingJavaScripts(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean scrollToView(WebElement webElement) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public String getText(WebElement webElement) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public String getAttribute(By locator, String sElementAttribute) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			return webElement.getAttribute(sElementAttribute);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	

	@Override
	public boolean clickUsingActionClass(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCSSValue(By locator, String attributeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> getWebElementList(By locator) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public boolean closeBrowserEnvironment() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean navigateToBack() {
		try
		{
		Pojo.getAndroidDriver().pressKeyCode(AndroidKeyCode.BACK);
		return true;
		}
		catch(Exception exception)
		{
			return false;

		}
	}

	@Override
	public boolean mouseHover(WebElement webElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean openNewTabInSameBrowser(String pageUrl) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchToWindowUsingTitle(String windowTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchToWindowContainsURL(String windowURL) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCurrentURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLatestDownloadedFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean scrollToDown(By locator) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean closeBrowserAndAppEnv() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean launchMobileApplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchContextToHybridApp() {
		try {
		Set<String> contextNames = Pojo.getAndroidDriver().getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);// prints out something like NATIVE_APP \n WEBVIEW_1
		}
		Pojo.getAndroidDriver().context((String) contextNames.toArray()[1]);
		System.out.println("Hybrid");
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean switchWindowByUsingWindowHandles() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchToDefaultContent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tap(By locator) {
		try
		{
		WebElement e=Pojo.getAndroidDriver().findElement(locator);
		TouchAction t=new TouchAction(Pojo.getAndroidDriver());
		t.tap(tapOptions().withElement(element(e))).perform();
		return true;
		}
		catch (Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean longPress(By locator) {
		try
		{
		WebElement e=Pojo.getAndroidDriver().findElement(locator);
		TouchAction t=new TouchAction(Pojo.getAndroidDriver());
		t.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2))).release().perform();
		return true;
		}
		catch (Exception e)
		{
		return false;
		}
	}
	
	@Override
	public boolean swipe(By locator1, By locator2) {
		try {
		WebElement first=Pojo.getAndroidDriver().findElement(locator1);
		WebElement second=Pojo.getAndroidDriver().findElement(locator2);
		TouchAction t=new TouchAction(Pojo.getAndroidDriver());
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		return true;
		}
		catch (Exception e)
		{
		return false;
		}
		}

	
	
	@Override
	public boolean selectRadioButtonByTypeIsRadio(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			if (webElement.getAttribute("type").equals("radio")) {
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					this.click(locator);
				return true;
			} else
				return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean mouseHoverUsingJavaScript(WebElement webElement) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean selectCheckBoxByClassIsCheckBox(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			//this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getAndroidDriver().findElement(locator);
			if (webElement.getAttribute("class").contains("checkbox")) {
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				return true;
			} else
				return false;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTestData(int rowNum, int colNum, DataTable table) {
		List<List<String>> data=table.asLists();
	   	String userData=data.get(rowNum).get(colNum);
	   	
			return userData;
	}

	
	
	@Override
	public WebElement getElementFluent(By locator) throws NoSuchElementException, TimeoutException {
		System.out.println("              **************** into getElementFluent");
		Wait<AndroidDriver> wait = new FluentWait<AndroidDriver>(Pojo.getAndroidDriver())
				.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
				.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
				.ignoring(NoSuchElementException.class);

		WebElement webElement = wait.until(new Function<AndroidDriver, WebElement>() {
			public WebElement apply(AndroidDriver driver) {
				return Pojo.getAndroidDriver().findElement(locator);
			}
		});

		return webElement;
	}
	

	
	
	@Override
	public WebElement getNestedElementFluent(WebElement parentWebElement, By locator)
			throws NoSuchElementException, TimeoutException {
		// System.out.println("**************** into getNestedElementFluent");
				Wait<AndroidDriver> wait = new FluentWait<AndroidDriver>(Pojo.getAndroidDriver())
						.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
						.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
						.ignoring(NoSuchElementException.class);

				WebElement webElement = wait.until(new Function<AndroidDriver, WebElement>() {
					public WebElement apply(AndroidDriver driver) {
						return parentWebElement.findElement(locator);
					}
				});

				return webElement;
	}

	@Override
	public WebElement getElementFluent(WebElement webElement) throws NoSuchElementException, TimeoutException {
System.out.println("              **************** into getElementFluent");
		
		Wait<AndroidDriver> wait = new FluentWait<AndroidDriver>(Pojo.getAndroidDriver())
		.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
		.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
		.ignoring(NoSuchElementException.class);

		WebElement weElement = wait.until(new Function<AndroidDriver, WebElement>() {
			public WebElement apply(AndroidDriver driver) {
				return webElement;
			}
		});

		return webElement;
	}

	
	
	@Override
	public boolean verifyElementDisplay(By locator) {
		try {
		    Pojo.getAndroidDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        Pojo.getAndroidDriver().findElement(locator).isDisplayed();
	        return true;
			}
			catch(NoSuchElementException e){
				return false;
			}
			catch(Exception e)
			{
				return false;
			}
			finally
			{
				Pojo.getAndroidDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
			}
	}

	@Override
	public String getTextNode(By locator, int nodeIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean androidScroll(String textToView) {
		
		try
		{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		String text="\""+textToView+"\""+"";
	//	Pojo.getAndroidDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+textToView+"\").instance(0))");
		Pojo.getAndroidDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+textToView+"\").instance(0))");
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean switchContextToNativeApp() {	
		try{
		Set<String> contextNames = Pojo.getAndroidDriver().getContextHandles();
		for (String contextName : contextNames) {

			System.out.println(contextName);// prints out something like NATIVE_APP \n WEBVIEW_1
		}
		Pojo.getAndroidDriver().context((String) contextNames.toArray()[0]);
		System.out.println("Native");
		return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean hideKeyBoard() {
		try {
			Pojo.getAndroidDriver().hideKeyboard();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public String getToastMessage(By locator,String attributeName) { //name attribute for toast messages will have toast message content

        String toastMessage=Pojo.getAndroidDriver().findElement(locator).getAttribute(attributeName);
		return toastMessage;
		}

	@Override
	public boolean androidScrollToScrollableElement(String resourceId, String textToView) {
		try
		{

		String text="\""+textToView+"\""+"";
		String resourceIdConverted="\""+resourceId+"\""+"";
		Pojo.getAndroidDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId("+resourceIdConverted+")).scrollIntoView(new UiSelector().text("+text+").instance(0));");//remove instance if it does not work. There is no intance in appium documentation
		Pojo.getObjSeleniumFunctions().waitFor(5);
	    return true;
	    
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public String getTextByXpath(String text) {
		By loc_text=By.xpath("//android.widget.TextView[contains(@text, '"+text+"')]");
		String actualText=Pojo.getAndroidDriver().findElement(loc_text).getText();
		return actualText;
	}

	@Override
	public String getTextByAccessibilityIdTest(String IdText) {
		String text=Pojo.getAndroidDriver().findElement(MobileBy.AccessibilityId(IdText)).getText().trim();
		return text;
	}

	@Override
	public boolean landscapeRightRotation() {
		try {
		DeviceRotation landscapeRightRotation = new DeviceRotation(0, 0, 90);
        Pojo.getAndroidDriver().rotate(landscapeRightRotation);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean landscapeLeftRotation() {
		try
		{
		DeviceRotation landscapeLeftRotation = new DeviceRotation(0, 0, 270);
        Pojo.getAndroidDriver().rotate(landscapeLeftRotation);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean portraitUpsideDown() {
		try {
		DeviceRotation landscapeRightRotation = new DeviceRotation(0, 0, 180);
        Pojo.getAndroidDriver().rotate(landscapeRightRotation);		
        return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean openNotification() {
		try
		{
		Pojo.getAndroidDriver().closeApp();
		Pojo.getAndroidDriver().openNotifications();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}

	@Override
	public boolean setClipBoardText(String text) {
		try
		{
		final String textSet=text;
		Pojo.getAndroidDriver().setClipboardText(textSet);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public String getClipBoardText() {
		String clipBoardText=Pojo.getAndroidDriver().getClipboardText();
		return clipBoardText;
	}

	@Override
	public boolean screenRecordRealDevice(int durationSec) throws InterruptedException {
		try {
			((CanRecordScreen) Pojo.getDriver()).startRecordingScreen(new AndroidStartScreenRecordingOptions()
                            .withTimeLimit(Duration.ofSeconds(durationSec)));
			Thread.sleep(5000);
	        Pojo.getAndroidDriver().stopRecordingScreen();
			
			return true;
		}
		catch(WebDriverException e)
		{
	     return false;
		}
		
		
	}

	@Override
	public boolean gsmCallTest() {
		try {
            ((SupportsSpecialEmulatorCommands) Pojo.getDriver()).makeGsmCall("11111111", GsmCallActions.CALL);
            ((SupportsSpecialEmulatorCommands) Pojo.getDriver()).makeGsmCall("11111111", GsmCallActions.ACCEPT);
            return true;
        } catch (Exception e) {
        	return false;
        }
    }
	

	@Override
	public boolean toggleWiFi() {
		try {
            ((SupportsNetworkStateManagement) Pojo.getDriver()).toggleWifi();
            return true;
        } catch (Exception e) {
        	return false;
        }
    }
    
	

	@Override
	public boolean toggleAirPlane() {
		// TODO Auto-generated method stub
		try {
            ((SupportsNetworkStateManagement) Pojo.getDriver()).toggleAirplaneMode();
            return true;
        } catch (Exception e) {
        	return false;
        }
    
	}

	@Override
	public boolean setNetworkSpeedTest() {
		try {
            ((SupportsSpecialEmulatorCommands) Pojo.getDriver()).setNetworkSpeed(NetworkSpeed.EDGE);
            return true;
        } catch (Exception e) {
        	return false;
        }
    }
	

	@Override
	public ScreenOrientation getOrientation() {
		ScreenOrientation orientation=Pojo.getAndroidDriver().getOrientation();
		return orientation;
	}

	@Override
	public boolean lockDevice() {
		try
		{
		Pojo.getAndroidDriver().lockDevice();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean unlockDevice() {
		try
		{
		Pojo.getAndroidDriver().unlockDevice();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean runAppInBackground(int duration) {
		try
		{
        Pojo.getAndroidDriver().runAppInBackground(Duration.ofSeconds(duration));
        return true;
		}
        catch(Exception e)
        {
		return false;
        }
	}

	@Override
	public String getCurrentPackage() {
		
		return Pojo.getAndroidDriver().getCurrentPackage();
	}

	@Override
	public boolean isAppInstalled(String bundleId) {
		try
		{
		Pojo.getAndroidDriver().isAppInstalled(bundleId);
		return true;
	}
		catch(Exception e)
		{
			return false;
		}

	}

	@Override
	public boolean pageRefreshNativeApp(By locator1, By locator2) {
	try
	    {
		WebElement first=Pojo.getAndroidDriver().findElement(locator1);
		WebElement second=Pojo.getAndroidDriver().findElement(locator2);
		TouchAction t=new TouchAction(Pojo.getAndroidDriver());
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(1))).moveTo(element(second)).release().perform();
		return true;
		}
		catch (Exception e)
		{
		return false;
		}
		
	}

	@Override
	public List<AndroidElement> getWebElementListAndroidApp(By locator) {
		// TODO Auto-generated method stub
		return Pojo.getAndroidDriver().findElements(locator);
	}



	@Override
	public void waitForElementVisibility(WebElement webElement) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
		
	}



	@Override
	public String getText(AndroidElement androidElement) {
     String returnText=androidElement.getText();
	 return returnText;
	}



	@Override
	public void scrollByResourceId(String resourceId, int index) {
        Pojo.getAndroidDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+resourceId+"\").instance("+index+"));")); 
		
	}



	


	@Override
	public boolean pressEscapeKeyKeyboard() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void waitForPageLoad(int timeInSeconds) {
		Pojo.getDriver().manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);
		
	}

	@Override
	public boolean waitForElementDisappearFluent(By locator) {
		// TODO Auto-generated method stub
		return false;

	}



	@Override
	public boolean openNewTab() {
		// TODO Auto-generated method stub
		return false;
	}




	@SuppressWarnings("deprecation")
	@Override
	public void navigateToBackAndroidApp() {
		try
		{
		Pojo.getAndroidDriver().pressKeyCode(AndroidKeyCode.BACK);
		}
		catch(Exception exception)
		{

		}		
	}



	@Override
	public boolean hitEnter(By locator) {
		return false;
		// TODO Auto-generated method stub
		
	}

	
	
	    
		
	}

	

	

	
	

	

	

	

	

	

	
