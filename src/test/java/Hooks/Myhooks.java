package Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import WdFactory.factory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.configatorclass;

public class Myhooks {
	WebDriver wd;
	@Before
	public void setup() throws Exception {
		
	Properties prop=configatorclass.intialiseprop();
	
     factory.initialisebrowser(prop.getProperty("browser"));
 
     wd=  factory.getdriver();

     wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get(prop.getProperty("url"));
	}

	
	@After
	
public void teardown() {
		wd.quit();
		
		
	}
	
	
	
	
}
