package Seleniumviamaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkbox
{
	WebDriver driver;
	WebDriverWait  wait ;
	
	@BeforeClass
	public void setup()
	
	{

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
	}

	@Test
	public void checkboxsceanrio()
	{
		
		WebElement Home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Home')]")));
		Home.click();
		
		boolean ischecked = Home.isSelected();
		
		Assert.assertFalse(ischecked, "Checkbox should be unchecked!");
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
