package com.testH.app.generic;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.testH.app.baseHelper.SeleniumFunctionsHelper;
import com.testH.app.generic.Pojo;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.datatable.DataTable;

public class SeleniumFunctionsWebApp extends SeleniumFunctionsHelper {
	
	@Override
	public void waitForElementPresence(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	@Override
	public void waitForPresenceOfNestedElementLocated(WebElement webElement, By sub_locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfNestedElementLocatedBy(webElement, sub_locator));
	}

	
	@Override
	public void waitForPresenceOfNestedElementsLocated(By locator, By sub_locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.presenceOfNestedElementsLocatedBy(locator, sub_locator));
	}

	
	@Override
	public void waitForElementToBeClickable(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
	}

	
	

	@Override
	public void waitForElementVisibility(WebElement webElement) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
	}
	
	
	
	
	
	@Override
	public boolean waitForElementInVisibilityLocated(By locator, int timeInMiliSeconds) throws NotFoundException {
		
		
		WebDriverWait webDriverWait = new WebDriverWait(Pojo.getDriver(), timeInMiliSeconds);


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
			this.setHighlight(Pojo.getDriver().findElement(locator));
			return Pojo.getDriver().findElement(locator).isDisplayed();
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
		}}
		

	@Override
	public void waitForElementVisibilityLocated(By locator) throws NotFoundException {
		Pojo.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
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
			return Pojo.getDriver().findElement(locator).isDisplayed();
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
			WebDriverWait webDriverWait = new WebDriverWait(Pojo.getDriver(), timeInMiliSeconds);
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return Pojo.getDriver().findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
		}
	@Override
	public boolean waitForElementIfVisible(By locator, int timeInMiliSeconds) {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(Pojo.getDriver(), timeInMiliSeconds);
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return Pojo.getDriver().findElement(locator).isDisplayed();
		} catch (Exception exception) {
			return false;
		}
		}

	
	@Override
	public boolean checkElementEnabled(By locator) {
		try {
			this.waitForElementVisibilityLocated(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			return Pojo.getDriver().findElement(locator).isEnabled();
		} catch (Exception exception) {
			return false;
		}
	}
	
	
   @Override
	public boolean click(By locator) {
		try {
			this.waitForElementPresence(locator);
			this.waitForElementToBeClickable(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			Pojo.getDriver().findElement(locator).click();
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
				Pojo.getDriver().findElement(locator).click();				
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
			
			this.setHighlight(Pojo.getDriver().findElement(locator));
			clearText(locator);
			// webElement.clear();
			Pojo.getDriver().findElement(locator).sendKeys(fieldValue);
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
		
		Pojo.getDriver().findElement(locator).clear();

	}

	
	@Override
	public boolean mouseHover(By locator) {
		try {
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
			Actions actionBuilder = new Actions(Pojo.getDriver());
			actionBuilder.moveToElement(webElement).build().perform();
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
	public boolean selectRadioButton(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
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
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
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
			return !(Pojo.getDriver().findElement(locator).isDisplayed());
		} catch (Exception e) {

			// e.printStackTrace();
			return true;
		}

	}

	
	@Override
	public String getText(By locator, String textBy) {
		String strText = "";
		try {
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
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
	public boolean selectCheckBox(By locator, boolean status) {
		try {
			WebElement webElement=Pojo.getDriver().findElement(locator);
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
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
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
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

		if (Pojo.getObjConfig().getProperty("HighlightElements").equalsIgnoreCase("true")) {
			
			String attributevalue = "background: lime; border: 5px solid red;";
			// String attributevalue = "background: yellow; border: 2px solid red;";
			// String attributevalue = "border:3px solid red;";
			JavascriptExecutor executor = (JavascriptExecutor) Pojo.getDriver();
			String getattrib = element.getAttribute("style");
			executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, attributevalue);
			
			executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, getattrib);
		}
	}

	@Override
	public boolean pageRefresh() {
		try {
			
			Pojo.getDriver().navigate().refresh();
			return true;
		} catch (Exception exception) {
			
			exception.getMessage();
			return false;
		}
		
	}

	// Below code will delete all cookies of your browser
	@Override
	public void deleteAllBrowserCookies() {
		Pojo.getDriver().manage().deleteAllCookies();
	}

	/**
	 * Scroll element to view using javascript
	 */
	@Override
	public boolean scrollToView(By locator) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getDriver().findElement(locator);
			((JavascriptExecutor) Pojo.getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
			return true;
		} catch (Exception exception) {
			// exception.printStackTrace();
			return false;
		}
	}

	
	@Override
	public String getTextByUsingJavaScripts(By locator) {
		String strText = "";
		try {
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) Pojo.getDriver();
			strText = (String) js.executeScript("return arguments[0].text;", webElement);

		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
			return null;
		}
		return strText;
	}

	@Override
	public boolean scrollToView(WebElement webElement) {
		try {
			this.waitForElementVisibility(webElement);
			((JavascriptExecutor) Pojo.getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
			return true;
		} catch (Exception exception) {
			// exception.printStackTrace();
			return false;
		}
	}

    @Override
	public String getText(By locator) {
    	this.setHighlight(Pojo.getDriver().findElement(locator));
		String strText = "";
		strText=Pojo.getDriver().findElement(locator).getText();
		return strText;
	}

	
	
	@Override
	public String getAttribute(By locator, String sElementAttribute) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getDriver().findElement(locator);
			return webElement.getAttribute(sElementAttribute);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean clickUsingActionClass(By locator) {
		try {
			waitForElementPresence(locator);
			WebElement element = Pojo.getDriver().findElement(locator);
			Actions action = new Actions(Pojo.getDriver());
			action.moveToElement(element).click().perform();
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
	public String getCSSValue(By locator, String attributeName) {
		try {
			String strValue = null;
			waitForElementPresence(locator);
			waitForElementToBeClickable(locator);
			WebElement webElement = Pojo.getDriver().findElement(locator);
			strValue = webElement.getCssValue(attributeName);
			String[] numbers = strValue.replace("rgba(", "").replace(")", "").split(",");
			int number1 = Integer.parseInt(numbers[0]);
			numbers[1] = numbers[1].trim();
			int number2 = Integer.parseInt(numbers[1]);
			numbers[2] = numbers[2].trim();
			int number3 = Integer.parseInt(numbers[2]);
			strValue = String.format("#%02x%02x%02x", number1, number2, number3);
			return strValue;
		} catch (NoSuchElementException exception) {
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (TimeoutException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (NotFoundException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (ElementNotVisibleException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (ElementNotInteractableException exception) {
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return null;
		} catch (Exception exception) {
			System.out.println("NoSuchElement Exception");
			exception.printStackTrace();
			return null;
		}
	}

	
	
	@Override
	public List<WebElement> getWebElementList(By locator) {
		return Pojo.getDriver().findElements(locator);
	}
	
	
	
	
	@Override
	public boolean closeBrowserEnvironment(){
	
		try {
			System.out.println( "Browser Instance ===> "+(Pojo.getDriver())==null);
			System.out.println( "Browser Instance using Not ===> "+!((Pojo.getDriver())==null));
			
			if(!((Pojo.getDriver())==null))
				Pojo.getDriver().close();
			return true;
		} catch (Exception exception) {

			System.out.println("Exception Message ---> "+exception.getMessage());
			return false;
		}
	
	}
	
	@Override
	public boolean navigateToBack(){
		
		try {
			this.waitFor(3);
			Pojo.getDriver().navigate().back();
			return true;
			
		} catch (Exception exception) {

			exception.printStackTrace();
			return false;
		}
	}
		
	@Override
	public boolean mouseHover(WebElement webElement) {
		try {
			this.waitForElementVisibility(webElement);
			this.setHighlight(webElement);
			Actions actionBuilder = new Actions(Pojo.getDriver());
			actionBuilder.moveToElement(webElement).build().perform();
			this.waitFor(3);
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
	public boolean openNewTabInSameBrowser(String pageUrl){
		
		try {
			  this.waitFor(5);
			  JavascriptExecutor jsExecutor = (JavascriptExecutor)Pojo.getDriver();
			  String openNewWindow = "window.open('"+pageUrl+"');";
			  for(int i=0;i<1;i++)
			  {
				  jsExecutor.executeScript(openNewWindow);
				  this.waitFor(2);

			  }	
	   	return true;
			
		} catch (Exception exception) {
			System.out.println("ERROR MESSAGE ----> "+exception.getMessage());
			exception.printStackTrace();
			return false;
		
		}
		
	}
	
	@Override
	public boolean switchToWindowUsingTitle(String windowTitle) {
		try {
			String mainWindowHandle = Pojo.getDriver().getWindowHandle();
			Set<String> openWindows = Pojo.getDriver().getWindowHandles();

			if (!openWindows.isEmpty()) {
				for (String windows : openWindows) {
					String window = Pojo.getDriver().switchTo().window(windows).getTitle();
					if (windowTitle.equals(window))
						return true;
					else
						Pojo.getDriver().switchTo().window(mainWindowHandle);
				}
			}
			return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public boolean switchToWindowContainsURL(String windowURL) {
		try {
			String mainWindowHandle = Pojo.getDriver().getWindowHandle();
			Set<String> openWindows = Pojo.getDriver().getWindowHandles();

			if (!openWindows.isEmpty()) {
				for (String windows : openWindows) {
					String currentWindowURL = Pojo.getDriver().switchTo().window(windows).getCurrentUrl();
					if (currentWindowURL.contains(windowURL))
						return true;
					else
						Pojo.getDriver().switchTo().window(mainWindowHandle);
				}
			}
			return false;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}

	
	@Override
	public String getCurrentURL() {
		try {
			this.waitFor(5);
			Pojo.getObjSeleniumFunctions().waitForPageLoad(10);
			return Pojo.getDriver().getCurrentUrl();
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	

	@Override
	public String getLatestDownloadedFileName() {

		String latestFile = "";
		try {
			String downloadFilepath = System.getProperty("user.dir")
					+ Pojo.getObjConfig().getProperty("downloads.path").trim();
			Pojo.getObjUtilitiesFunctions().consoleLogPrinter("get file download path : " + downloadFilepath);
			File directoryForDownload = new File(downloadFilepath);
			File[] downloadedFiles = directoryForDownload.listFiles();

			if (downloadedFiles == null || downloadedFiles.length == 0) {
				return "";
			}
			this.waitFor(10);
			File lastModifiedFile = downloadedFiles[0];
			for (int i = 1; i < downloadedFiles.length; i++) {
				if (lastModifiedFile.lastModified() < downloadedFiles[i].lastModified()) {
					lastModifiedFile = downloadedFiles[i];
				}
			}
			this.waitFor(10);
			latestFile = lastModifiedFile.getName().trim().toString();
		} catch (Exception exception) {
			System.out.println("Error Message -----> "+exception.toString());
			exception.printStackTrace();
		}
		return latestFile;
	}

	
	@Override
	public boolean scrollToDown(By locator) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getDriver().findElement(locator);
			((JavascriptExecutor) Pojo.getDriver()).executeScript("scroll(0, 250);", webElement);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean closeBrowserAndAppEnv() {

		boolean blnFlag=false;
		try {
			Pojo.getDriver().close();
			return blnFlag=true;
		} catch (Exception exception) {
			System.out.println("Error Message -------> "+exception.getMessage());
			exception.printStackTrace();
			return blnFlag;
		}
	
	}

	@Override
	public boolean launchMobileApplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchContextToHybridApp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchWindowByUsingWindowHandles() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchToDefaultContent() {
		try {
			Pojo.getDriver().switchTo().defaultContent();
			return true;
		} catch (Exception exception) {
			System.out.println("Error Message -------> "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	
	@Override
	public boolean selectRadioButtonByTypeIsRadio(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			WebElement webElement = Pojo.getDriver().findElement(locator);
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
		try {
			this.waitForElementVisibility(webElement);
			this.setHighlight(webElement);
			String strJavaScript = "var evObj = document.createEvent('MouseEvents');" +
                    "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                    "arguments[0].dispatchEvent(evObj);";
		    ((JavascriptExecutor) Pojo.getDriver()).executeScript(strJavaScript, webElement);
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
	public boolean selectCheckBoxByClassIsCheckBox(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			this.setHighlight(Pojo.getDriver().findElement(locator));
			WebElement webElement = Pojo.getDriver().findElement(locator);
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
		return Pojo.getDriver().getTitle();
	
		
	}

	@Override
	public String getTestData(int rowNum, int columnNum, DataTable table) {
		
   	List<List<String>> data=table.asLists();
   	String userData=data.get(rowNum).get(columnNum);
   	
		return userData;
	}

	@Override
	public String getText(WebElement webElement) {
		this.setHighlight(webElement);
		String returnText=webElement.getText();
		
		return returnText;
	}
	
	@Override
	public WebElement getElementFluent(final By locator) throws NoSuchElementException, TimeoutException {
		System.out.println("              **************** into getElementFluent");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Pojo.getDriver())
				.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
				.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
				.ignoring(NoSuchElementException.class);

		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return Pojo.getDriver().findElement(locator);
			}
		});

		return webElement;
	}

	@Override
	public WebElement getNestedElementFluent(final WebElement parentWebElement, final By locator)
			throws NoSuchElementException, TimeoutException {
		// System.out.println("**************** into getNestedElementFluent");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Pojo.getDriver())
				.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
				.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
				.ignoring(NoSuchElementException.class);

		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return parentWebElement.findElement(locator);
			}
		});

		return webElement;
	}

	@Override
	public WebElement getElementFluent(final WebElement webElement) throws NoSuchElementException, TimeoutException {
		System.out.println("              **************** into getElementFluent");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Pojo.getDriver())
		.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.WebDriverWait"))))
		.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
		.ignoring(NoSuchElementException.class);

		WebElement weElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return webElement;
			}
		});

		return webElement;
	}

	@Override
	public boolean verifyElementDisplay(By locator) {
		
		try {
	    Pojo.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
        Pojo.getDriver().findElement(locator).isDisplayed();
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
			Pojo.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		}
        
		
	}

	@Override
	public String getTextNode(By locator,int indexNode) {
		WebElement myElement = Pojo.getDriver().findElement(locator);
		String textReturn = ((JavascriptExecutor)Pojo.getDriver()).executeScript("return arguments[0].childNodes["+indexNode+"].textContent;", myElement).toString().trim();
		System.out.println("Node Text "+textReturn);
		return textReturn;
	}

	

	@Override
	public boolean androidScroll(String textToView) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchContextToNativeApp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hideKeyBoard() {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean androidScrollToScrollableElement(String resourceId, String textToView) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTextByXpath(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextByAccessibilityIdTest(String IdText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean landscapeRightRotation() {
		return false;
	}

	@Override
	public boolean landscapeLeftRotation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean portraitUpsideDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean openNotification() {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean setClipBoardText(String text) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getClipBoardText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean screenRecordRealDevice(int durationSec) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gsmCallTest() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleWiFi() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleAirPlane() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setNetworkSpeedTest() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lockDevice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlockDevice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runAppInBackground(int duration) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCurrentPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAppInstalled(String appId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ScreenOrientation getOrientation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tap(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean longPress(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swipe(By locator1, By locator2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getToastMessage(By locator, String attributeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pageRefreshNativeApp(By locator1, By locator2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AndroidElement> getWebElementListAndroidApp(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(AndroidElement androidElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scrollByResourceId(String resourceId, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean pressEscapeKeyKeyboard() {
		try
		{
		Actions action = new Actions(Pojo.getDriver());
		action.sendKeys(Keys.ESCAPE).build().perform();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override

	public void waitForPageLoad(int timeInSeconds) {
		Pojo.getDriver().manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);
	}
	public boolean waitForElementDisappearFluent(By locator) {
		try {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Pojo.getDriver())
				.withTimeout(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWait"))))
				.pollingEvery(Duration.ofSeconds(Long.parseLong(Pojo.getObjConfig().getProperty("driver.FluentWaiPulling"))))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
       System.out.println("True");

		return true;
		
		}
		catch(Exception e)
		{
			System.out.println("False");
			return false;
		}
	}

	@Override
	public boolean openNewTab() {
		try {
		  	  ((JavascriptExecutor) Pojo.getDriver()).executeScript("window.open('about:blank','_blank');");
		  	Pojo.getDriver().manage().deleteAllCookies();
		  	  return true;
				}
				catch(Exception e)
				{
				return false;
				}
	}
	
	
	
  	  
	

	@Override
	public void navigateToBackAndroidApp() {
		
	}

	@Override
	public boolean hitEnter(By locator) 
	{
	try
	{
    Pojo.getDriver().findElement(locator).sendKeys(Keys.ENTER);
	return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

	
	  

	

	

	}