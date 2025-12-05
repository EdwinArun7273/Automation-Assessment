package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyFish {
	WebDriver driver;

	public BuyFish(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void clickFish()
	{
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
	}
	
	public void clickProduct()
	{
		driver.findElement(By.linkText("FI-SW-01")).click();
	}
	
	public void clickItem()
	{
		driver.findElement(By.linkText("EST-2")).click();
	}
	
	public void clickAddToCart()
	{
		driver.findElement(By.xpath("//*[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-2']")).click();
	}
	public boolean validate()
	{
		if(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Catalog.action?viewItem=&itemId=EST-2"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
