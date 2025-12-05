package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BuyFish;
import pageObjects.EnterTheStore;
import utilities.screenshot;

public class TC02 {
	BuyFish bf = new BuyFish(hooks.driver);
	EnterTheStore ets = new EnterTheStore(hooks.driver);
	@Given("the user is in the home page")
	public void the_user_is_in_the_home_page() {
		ets.clickEnterTheStore();
		System.out.println("User in Home Page");
	}
	
	@When("he clicks the preferred fish and adds it to the cart")
	public void he_clicks_the_preferred_fish_and_adds_it_to_the_cart() throws InterruptedException 
	{	
		bf.clickFish();
		bf.clickProduct();
		bf.clickItem();
		bf.clickAddToCart();
	}
		
	@Then("user stays in item page")
	public void user_stays_in_item_page () throws IOException 
	{
		
		boolean sts = bf.validate();
		if (sts == true)
		{
			assertTrue(true);
			System.out.println("Test case 2 passed");
		}
		else
		{
			String tcn = "Buy Fish";
			//screenshot.takeScreenshot(tcn);
			System.out.println("Test case 2 failed");
			assertTrue(false);
		}
	}
}
