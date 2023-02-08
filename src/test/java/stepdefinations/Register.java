package stepdefinations;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.Registerpage;
import WdFactory.factory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Register {
	WebDriver wd;
	Registerpage rp;
	 @Given("^User navigate to register page$")
	    public void user_navigate_to_register_page()  {
		 wd=  factory.getdriver();
		 
		 HomePage hp= new HomePage(wd);
		 hp.clickonmyaccount();
		 hp.clickonrgister();
			//wd.findElement(By.xpath("//span[text()='My Account']")).click();
			//wd.findElement(By.linkText("Register")).click();
	    }
	 
	 
	 
	 

	    @When("User enter into  below fields")
	    public void User_enter_into_below_fields(DataTable dataTable) 
	    {
	    	 rp=new Registerpage(wd);
	    	
	    	
	Map<String, String>  datamap    = dataTable.asMap(String.class,String.class); 
	        rp.enterfirstname(datamap.get("firstName"));
	        rp.enterlastname(datamap.get("lastName"));
	        rp.enteremailfield(datamap.get("email"));
	        rp.entertelephoneno(datamap.get("telephone"));
	        rp.enterpasswordfield(datamap.get("password"));
	        rp.enterconfirmpasswordt(datamap.get("password"));
	        
	        
	   
	        
	        
//	       wd.findElement(By.id("input-firstname")).sendKeys(datamap.get("firstName"));
//	       wd.findElement(By.id("input-lastname")).sendKeys(datamap.get("lastName"));
//	       wd.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
//	       wd.findElement(By.id("input-telephone")).sendKeys(datamap.get("telephone"));
//	       wd.findElement(By.id("input-password")).sendKeys(datamap.get("password"));
//	       wd.findElement(By.id("input-confirm")).sendKeys(datamap.get("password"));
//	     
	    }
	
	
	
	
	    
	    
	    
	    @And("^User click newsletter$")
	    public void user_click_newsletter()  {
	        rp.newsletterbox();
	    	//wd.findElement(By.xpath("//input[@value='0']")).click();
	    }
	    
	    
	    
	    @And("^User accept private policy$")
	    public void user_accept_private_policy()  {
	    	
	    	rp.privacypolicybox();
	       // wd.findElement(By.xpath("//input[@name='agree']")).click();
	    }
	    
	    
	    
	    @And("^User click on continue button$")
	    public void user_click_on_continue_button()  {
	    	
	    	rp.continuebutton();
	       // wd.findElement(By.xpath("//input[@value='Continue']")).click();
	    }
	    
	    

	    @Then("^User account sucessfully created$")
	    public void user_account_sucessfully_created()  {
	        
	    }
	    

	    @When("User dont enter any data")
	    public void User_dont_enter_any_data() {
	    	rp.continuebutton();
	    	// wd.findElement(By.xpath("//input[@value='Continue']")).click();
	    }


	    @Then("^User get a warning message$")
	    public void User_get_a_warning_message()  {
	     System.out.println( wd.getTitle())  ;
	    }

	   

	  

	  
	
	}
	    
	    
	    

