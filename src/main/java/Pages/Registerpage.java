package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	WebDriver wd;
	
	public Registerpage(WebDriver wd) {
		
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(id = "input-firstname")
	private WebElement firstnamefield;
	
	@FindBy(id = "input-lastname")
	private WebElement lasttnamefield;
	
	@FindBy(id = "input-email")
	private WebElement emailfield;
	
	@FindBy(id = "input-telephone")
	private WebElement telephonefield;
	
	
	@FindBy(id = "input-password")
	private WebElement passwordfield;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmpasswordfield;
	
	
	public void enterfirstname(String firstName) {
		firstnamefield.sendKeys(firstName);;
	}
	
	public void enterlastname(String lastname) {
		lasttnamefield.sendKeys(lastname);
	}
	
	public void enteremailfield(String email) {
		emailfield.sendKeys(email);
	}
	
	public void entertelephoneno(String telephone) {
		telephonefield.sendKeys(telephone);
	}
	
	public void enterpasswordfield(String password) {
		passwordfield.sendKeys(password);
	}
	
	
	public void enterconfirmpasswordt(String confirmpassword) {
		confirmpasswordfield.sendKeys(confirmpassword);
	}
	
	
	
	
	//news letter
	
	@FindBy(xpath  = "//input[@value='0']")
	private WebElement newsletter;
	
	public void newsletterbox() {
		
		newsletter.click();
	}
	
	//Privacy policy
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacypolicy;
	
     public void privacypolicybox() {
		
    	 privacypolicy.click();
	}
	
	
	// Continue button
     
	
     @FindBy(xpath = "//input[@value='Continue']")
 	private WebElement continuebutton;
 	
      public void continuebutton() {
 		
    	  continuebutton.click();
 	}
	
	
	
	
	
	
	
	
	
	
}
