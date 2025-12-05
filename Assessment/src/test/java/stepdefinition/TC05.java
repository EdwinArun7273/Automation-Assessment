package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Cart;

public class TC05 {
Cart c = new Cart(hooks.driver);
	
	@When("he clicks the checkout button")
	public void he_clicks_the_checkout_button() throws InterruptedException 
	{	
		c.checkoutCart();
	}
		
	@Then("checkout product")
	public void checkout_product() throws IOException 
	{
		
		boolean sts = c.validate2();
		if (sts == true)
		{
			assertTrue(true);
			System.out.println("Test case 5 passed");
		}
		else
		{
			String tcn = "Checkout Product";
			//screenshot.takeScreenshot(tcn);
			System.out.println("Test case 5 failed");
			assertTrue(false);
		}
	}
}
