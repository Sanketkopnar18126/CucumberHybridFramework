package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import WdFactory.factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver wd;
	
	@Given("User open the application")
	public void user_open_the_application() {
		 wd=  factory.getdriver();
	}

	@When("User enter valid product {string} into search box field")
	public void user_enter_valid_product_into_search_box_field(String validproducttxt) {
		HomePage hp=new HomePage(wd);
		hp.searchbox(validproducttxt);
		//wd.findElement(By.name("search")).sendKeys("validproducttxt");
		
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		HomePage hp=new HomePage(wd);
		hp.searchbutton();
	//	wd.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		
	}

	@Then("User should get valid product displayed in search result")
	public void user_should_get_valid_product_displayed_in_search_result() {
	    Assert.assertTrue(wd.findElement(By.linkText("HP LP3065")).isDisplayed());
	}

	@When("User enter invalid product {string} into search box field")
	public void user_enter_invalid_product_into_search_box_field(String string) {
		
		
		wd.findElement(By.name("search")).sendKeys("string");
	}

	@Then("User should get message about no product matching")
	public void user_should_get_message_about_no_product_matching() {
	  System.out.println(wd.getTitle());
	}

	@When("User dont enter any product into search box field")
	public void user_dont_enter_any_product_into_search_box_field() {
	   // kept blank
	}
}
