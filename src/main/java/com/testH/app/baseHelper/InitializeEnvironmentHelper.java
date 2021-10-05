package com.testH.app.baseHelper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;


public abstract class InitializeEnvironmentHelper {
	
	// Abstract Methods
		public abstract WebDriver initializeWebEnvironment(Properties objConfig);
		public abstract WebDriver initializeWebEnvironmentForAdmin(Properties objConfig);

}
