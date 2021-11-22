package stepdefs;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;

public class ProductsStepDefs {
	WebDriver driver = BaseClass.driver;
	
	 
	
	@And("^User add a product \"([^\"]*)\"$")
    public void user_add_a_product_something(String productname) throws Throwable {
        
		WebElement product = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='" + productname + "']/following::button[1]"));
		product.click();
		
    }
	
	
    @Then("^product should be added to the cart$")
    public void product_should_be_added_to_the_cart() throws Throwable {
    	WebElement cart_verify = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
		Assert.assertEquals("1", cart_verify.getText());
        
    }

}
