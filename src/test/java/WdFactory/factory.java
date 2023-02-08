package WdFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class factory {
  static WebDriver wd;
	public static WebDriver initialisebrowser( String browserName) {
		
		if(browserName.equals("chrome")) {
			
				
					wd=new ChromeDriver();
				
					
			
			
		}else {
		
				wd=new FirefoxDriver();
			
			
		}
		
		return wd;
	}
	
	
	public static WebDriver getdriver() {
		return wd;
		
	}
	
	
	
	
	
	}
	
	

