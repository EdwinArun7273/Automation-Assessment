package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterTheStore {
	WebDriver driver;

	public EnterTheStore(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void clickEnterTheStore()
	{
		driver.findElement(By.linkText("Enter the Store")).click();
	}
	public boolean validate()
	{
		if(driver.getTitle().contains("JPetStore Demo"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
