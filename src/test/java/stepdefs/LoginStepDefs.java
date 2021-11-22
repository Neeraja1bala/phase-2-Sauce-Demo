package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	
	WebDriver driver = BaseClass.driver;
	

	 @Given("^User has launched the Swag Labs Application$")
	    public void user_has_launched_the_swag_labs_application() throws Throwable {
		 driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	    }
	 
	 @When("^User eneters username \"([^\"]*)\"$")
	    public void user_eneters_username_something(String UserNameval) throws Throwable {
		 WebElement UserName = driver.findElement(By.xpath("//input[@name='user-name']"));
			UserName.sendKeys(UserNameval);
	    }

	    @Then("^User should be landed on the products page$")
	    public void user_should_be_landed_on_the_products_page() throws Throwable {
	        WebElement check = driver.findElement(By.xpath("//span[text()='Products']"));
	        
	        String Exp = "PRODUCTS";
	        Assert.assertEquals(Exp,check.getText());
	    }

	    @And("^User eneters password \"([^\"]*)\"$")
	    public void user_eneters_password_something(String Passwordval) throws Throwable {
	    	WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
			Password.sendKeys(Passwordval);
	    }

	    @And("^User click on Login Button$")
	    public void user_click_on_login_button() throws Throwable {
	    	WebElement LoginButton = driver.findElement(By.xpath("//input[@name='login-button']"));
			LoginButton.click();
	    }
	    
	    @Then("^User should be Getting the error \"([^\"]*)\"$")
	    public void user_should_be_getting_the_error_something(String ExpMsg) throws Throwable {
	    	WebElement Error = driver.findElement(By.xpath("//h3[starts-with(text(),'Epic sadface: ')]")) ;
			String ActualMsg = Error.getText();
			Assert.assertEquals(ActualMsg, ExpMsg);
	    }
	    
	  
	    
	    
	    
    

}
