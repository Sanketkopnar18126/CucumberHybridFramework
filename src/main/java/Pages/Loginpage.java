package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

WebDriver wd;
	
	public Loginpage(WebDriver wd) {
		
		this.wd=wd;
		PageFactory.initElements(wd,this);
		
		
	}
	@FindBy(id = "input-email")
	private WebElement emailfield;
	

	@FindBy(id = "input-password")
	private WebElement passwordfield;
	
	
	@FindBy(xpath  = "//input[@value='Login']")
	private WebElement continuefield;
	
	public void enteremail(String emailtxt) {
		emailfield.sendKeys(emailtxt);
		
	}
	
	public void enterpassword(String passwordText) {
		passwordfield.sendKeys(passwordText);
		
	}
	
	public void loginbutton() {
		continuefield.click();
		
	}
	
	
	
	
	
	
	
	
}