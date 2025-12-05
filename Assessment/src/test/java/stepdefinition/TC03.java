package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BuyFish;
import pageObjects.Cart;
import pageObjects.EnterTheStore;

public class TC03 {
	Cart c = new Cart(hooks.driver);
	EnterTheStore ets = new EnterTheStore(hooks.driver);
	BuyFish bf = new BuyFish(hooks.driver);
	@Given("the user is in the cart page")
	public void the_user_is_in_the_cart_page() {
		ets.clickEnterTheStore();
		bf.clickFish();
		bf.clickProduct();
		bf.clickItem();
		bf.clickAddToCart();
		System.out.println("User in Home Page Page");
		c.enterCart();
	}
	
	@When("he clicks the remove button")
	public void he_clicks_the_remove_button() throws InterruptedException 
	{	
		c.removeFromCart();
	}
		
	@Then("remove product")
	public void remove_product() throws IOException 
	{
		
		boolean sts = c.validate();
		if (sts == true)
		{
			assertTrue(true);
			System.out.println("Test case 3 passed");
		}
		else
		{
			String tcn = "Remove Product";
			//screenshot.takeScreenshot(tcn);
			System.out.println("Test case 3 failed");
			assertTrue(false);
		}
	}
}