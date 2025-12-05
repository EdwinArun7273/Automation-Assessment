package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Cart;
import pageObjects.EnterTheStore;

public class TC04 {
	Cart c = new Cart(hooks.driver);
	
	@When("he clicks the update cart button")
	public void he_clicks_the_update_cart_button() throws InterruptedException 
	{	
		c.updateCart();
	}
		
	@Then("update cart")
	public void update_cart() throws IOException 
	{
		
		boolean sts = c.validate();
		if (sts == true)
		{
			assertTrue(true);
			System.out.println("Test case 4 passed");
		}
		else
		{
			String tcn = "Update Cart";
			//screenshot.takeScreenshot(tcn);
			System.out.println("Test case 4 failed");
			assertTrue(false);
		}
	}
}