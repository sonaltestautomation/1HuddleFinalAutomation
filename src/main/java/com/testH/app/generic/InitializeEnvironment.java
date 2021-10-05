package com.testH.app.generic;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.testH.app.baseHelper.InitializeEnvironmentHelper;
import com.testH.app.generic.Pojo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/*
 This class is for test environment setup as well as terminate the setup.
 */
public class InitializeEnvironment extends InitializeEnvironmentHelper {
	
	private WebDriver webDriver;
	private ChromeOptions options = new ChromeOptions();
	private DesiredCapabilities caps = DesiredCapabilities.chrome();
	static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> androidDriver;


	
	/*
	  @Description : This method initialize web driver for web application by
	                opening the browser and URL specified in config.properties and Excel sheets.
	                file
	 */
	
	@Override
	public WebDriver initializeWebEnvironment(Properties objConfig) {
		
		String browser = objConfig.getProperty("web.browser").trim().toLowerCase();
		String strExecutionMode=objConfig.getProperty("Execution.Mode.Headless").toLowerCase();
		boolean blnFlag = Boolean.parseBoolean(strExecutionMode);
		
		switch (browser) {
		
		case "ie": // If specified browser is Internet Explorer
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.ie.driver").trim());
			
			 webDriver = new InternetExplorerDriver();
			 break;
			 
		case "firefox": // If specified browser is Firefox
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.gecko.driver").trim());
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
			
			webDriver = new FirefoxDriver();
			break;
			
		case "chrome": // If specified browser is chrome



			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.chrome.driver.windows").trim());
			options.setHeadless(blnFlag);
			

			
			//if(blnFlag)
			//	options.addArguments("--window-size=1382,744");
			
			String downloadFilepath = System.getProperty("user.dir")+ Pojo.getObjConfig().getProperty("downloads.path").trim();
 			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
 			chromePrefs.put("profile.default_content_settings.popups", 0);
 			chromePrefs.put("download.default_directory", downloadFilepath);
 			options.setExperimentalOption("prefs", chromePrefs);
            options.setExperimentalOption("useAutomationExtension", false);
            caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            caps.setCapability(ChromeOptions.CAPABILITY, options);
			
			
			webDriver = new ChromeDriver(options);
			break;
			
		case "mobileview":
			
			options=this.setMobileViewChromeOptions();
            
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.chrome.driver.windows").trim());
			options.setHeadless(blnFlag);
			webDriver = new ChromeDriver(options);
			break;
		
		
	case "androidapp": //add android capabilities here
		
		break;
		
	case "iOSApp":  //add iOS cap here
		
		break;
	
	default:
		webDriver = new ChromeDriver();
		
	}
		// Wait for ui-elements to potentially load, up to a second.
//		webDriver.manage().timeouts().implicitlyWait(
//							Integer.parseInt(objConfig.getProperty("driver.implicitlyWait").trim()), TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		return webDriver;
}
	
	@Override
	public WebDriver initializeWebEnvironmentForAdmin(Properties objConfig) {
		
		String browser = objConfig.getProperty("web.browser").trim().toLowerCase();
		String strExecutionMode=objConfig.getProperty("Execution.Mode.Headless").toLowerCase();
		boolean blnFlag = Boolean.parseBoolean(strExecutionMode);
		switch (browser) {
		case "ie": // If specified browser is Internet Explorer
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.ie.driver").trim());
			
			 webDriver = new InternetExplorerDriver();

			break;

		case "firefox": // If specified browser is Firefox
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + objConfig.getProperty("webdriver.gecko.driver").trim());
			
			webDriver = new FirefoxDriver();
			break;

		case "chrome": // If specified browser is Chrome
			
			options.addArguments("--incognito");
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + objConfig.getProperty("webdriver.chrome.driver.windows").trim());
			options.setHeadless(blnFlag);
			if(blnFlag){
				//options.addArguments("--window-size=1382,744");
				options.addArguments("--headless", "window-size=1382,744", "--no-sandbox");
				}
		webDriver = new ChromeDriver(options);
		break;

	default:
		webDriver = new FirefoxDriver();
	}
		
		webDriver.manage().window().maximize();
		// Wait for ui-elements to potentially load, up to a second.
//					webDriver.manage().timeouts().implicitlyWait(
//							Integer.parseInt(objConfig.getProperty("driver.implicitlyWait").trim()), TimeUnit.SECONDS);
					// limit how much time a driver should wait for a page to load
					webDriver.manage().timeouts().pageLoadTimeout(
							Integer.parseInt(objConfig.getProperty("driver.pageLoadTimeout").trim()), TimeUnit.SECONDS);

					return webDriver;

	}
	
	
	private ChromeOptions setMobileViewChromeOptions(){

		try {
			
			options.addArguments("--no-sandbox");
	        options.addArguments("--disable-notifications");
	        caps.setCapability(ChromeOptions.CAPABILITY, options);
	        options.addArguments("--disable-dev-shm-usage");
	        options.addArguments("--disable-infobars");
	        options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
	        options.addArguments("--disable-extensions");
	        Map<String, String> mobileEmulation = new HashMap<>();
	        mobileEmulation.put("deviceName", "Nexus 5");
	        
	      //  mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
	      //  mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Galaxy S5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
	       
	       options.setExperimentalOption("mobileEmulation", mobileEmulation);
	       options.addArguments("window-size=280,768");
	       Map<String, Object> prefs = new HashMap<String, Object>();
	       prefs.put("credentials_enable_service", false);
	       prefs.put("profile.password_manager_enabled", false);
	       options.setExperimentalOption("prefs", prefs);
			
		} catch (Exception exception) {
			
			exception.getMessage().toString();
			exception.printStackTrace();
			return null;
		}

        return options;
	}
	
	public static AppiumDriverLocalService startServer() {

		if (!checkIfServerIsRunnning(4723)) {

			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		return service;

	}
	
	public static boolean checkIfServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);

			serverSocket.close();
		} catch (IOException e) {
			// If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
	public static void startEmulator() throws IOException, InterruptedException {
		if(Pojo.getObjConfig().get("realDevice").equals("no"))
		{
		System.out.println("Emulator Starting...");

		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\main\\resources\\mobileResources\\startEmulator.bat");
		Thread.sleep(25000);
		}
		else
		{
			System.out.println("Real Device Running...");
		}
		
	}

			
	public AndroidDriver<AndroidElement> capabilities(String appName) throws InterruptedException, IOException

	{
        File appDir = new File("src\\main\\resources\\mobileResources");
        File app = new File(appDir, appName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String device =Pojo.getObjConfig().getProperty("device");
        System.out.println("Device Name "+device);

   //  capabilities.setCapability("deviceId", "192.168.43.1:5555");   //To connect real device through wifi
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
	   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "1a0f90b4"); //To connect real device through usb
       capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
       // capabilities.setCapability(MobileCapabilityType.VERSION, "8.1.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
      //  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("disableWindowAnimation", true);
        capabilities.setCapability("newCommandTimeout", 5000); // wait for 1000 milliseconds to run new command.The app was automatically closing while executing testcases  so added this
        //capabilities.setCapability("newCommandTimeout", 300);
       
        
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		return androidDriver;
	}
}
