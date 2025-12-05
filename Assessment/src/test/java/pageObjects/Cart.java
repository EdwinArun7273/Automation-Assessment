package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void enterCart()
	{
		driver.findElement(By.xpath("//img[@src='../images/cart.gif']")).click();
	}
	
	public void removeFromCart()
	{
		driver.findElement(By.xpath("//a[@href='/actions/Cart.action?removeItemFromCart=&workingItemId=EST-2']")).click();
	}
	
	public void updateCart()
	{
		driver.findElement(By.xpath("//input[@value='Update Cart']")).click();
	}
	
	public void checkoutCart()
	{
		driver.findElement(By.xpath("//a[@href='/actions/Order.action?newOrderForm=']")).click();
	}
	
	public boolean validate()
	{
		if(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Cart.action?removeItemFromCart=&workingItemId=EST-2"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validate1()
	{
		if(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Cart.action"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validate2()
	{
		if(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Order.action?newOrderForm="))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

