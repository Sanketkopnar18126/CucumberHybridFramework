package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver wd;
	
	public HomePage(WebDriver wd) {
		
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
		
	}
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText = "Login")
	private WebElement clickonlogin;
	
	@FindBy(linkText = "Register")
	private WebElement clickonrgister;
	
	public void clickonmyaccount() {
		myAccountDropMenu.click();
	}
	
	public void clickonlogin() {
		clickonlogin.click();
	}
	
	public void clickonrgister() {
		clickonrgister.click();
	}
	
	
	// SearchContent
	
	
	
	@FindBy(name  = "search")
	private WebElement search;
	
	public void searchbox(String validproducttxt) {
		search.sendKeys(validproducttxt);
	}
	
	//Search button
	
	@FindBy(xpath   = "/html/body/header/div/div/div[2]/div/span/button")
	private WebElement searchbutton;
	
	public void searchbutton() {
		searchbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
