package com.testH.stepDefs;


import java.io.IOException;
import java.util.Date;

import com.testH.app.generic.BaseTest;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;



public class BeforeActions extends BaseTest {
	
	@Before
    public void setUp() throws InterruptedException, IOException {
		System.out.println("InitilizeEnvironment......!!!!");
		this.initializEnvironmentIncognito();

    }
	
	

}
