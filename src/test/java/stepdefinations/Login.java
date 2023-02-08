package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.Loginpage;
import WdFactory.factory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver wd;
Loginpage lp=new Loginpage(wd);
	
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
		 wd=  factory.getdriver();
		 HomePage hp=new HomePage(wd);
		 
		hp.clickonmyaccount();
		 hp.clickonlogin();
		//wd.findElement(By.xpath("//span[text()='My Account']")).click();
		//wd.findElement(By.linkText("Login")).click();
		
		
	}
	

	@When("^User enter valid Email address (.+)$")
	public void user_enter_valid_email_address(String emailtext) {// emailtext is pass from feature file
		Loginpage lp=new Loginpage(wd);
		lp.enteremail(emailtext);
		
	  // wd.findElement(By.id("input-email")).sendKeys(emailtext); 
	}

	@And("^User enter valid password (.+)$")
	public void user_enter_valid_password(String passwordText) {
		Loginpage lp=new Loginpage(wd);
		lp.enterpassword(passwordText);
		// wd.findElement(By.id("input-password")).sendKeys(passwordText);
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		Loginpage lp=new Loginpage(wd);
		lp.loginbutton();
	  // wd.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User succesfully login")
	public void user_succesfully_login() {
		
		AccountPage ac=new AccountPage(wd);
		ac.verifymessage();
			
	  Assert.assertTrue(ac.verifymessage());
	}

	@When("User enter invalid Email address   {string}")
	public void user_enter_invalid_email_address(String invalidEmail) {
		
		 wd.findElement(By.id("input-email")).sendKeys(invalidEmail);
	}

	@When("User enter invalid password      {string}")
	public void user_enter_invalid_password(String invalidPassword) {
		wd.findElement(By.id("input-password")).sendKeys(invalidPassword);
	}

	@Then("User get a warning messeage")
	public void user_get_a_warning_messeage() {
	   wd.findElement(By.xpath("/html/body/div[2]/div[1]")).getText().contains("Warning: No match for E-Mail Address and/or Password.");
	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
		Loginpage lp=new Loginpage(wd);
		lp.enteremail("");
		// wd.findElement(By.id("input-email")).sendKeys("");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		
		Loginpage lp=new Loginpage(wd);
		lp.enterpassword("");
		// wd.findElement(By.id("input-password")).sendKeys("");
	}

}