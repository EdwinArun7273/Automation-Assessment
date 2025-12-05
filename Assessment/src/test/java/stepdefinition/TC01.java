package stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EnterTheStore;
import utilities.screenshot;

public class TC01 {
	EnterTheStore ets = new EnterTheStore(hooks.driver);
	@Given("the user is in the enter the store page")
	public void the_user_is_in_the_enter_the_store_page() {
		System.out.println("User in Enter The Store Page");
	}
	
	@When("he clicks enter the store button")
	public void he_clicks_enter_the_store_button() throws InterruptedException 
	{	
		ets.clickEnterTheStore();
	}
		
	@Then("user navigates to home page")
	public void user_navigates_to_home_page () throws IOException 
	{
		
		boolean sts = ets.validate();
		if (sts == true)
		{
			assertTrue(true);
			System.out.println("Test case 1 passed");
		}
		else
		{
			String tcn = "Enter The Store";
			screenshot.takeScreenshot(tcn);
			System.out.println("Test case 1 failed");
			assertTrue(false);
		}
	}
}
