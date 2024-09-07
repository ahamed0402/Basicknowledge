package Seleniumviamaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class buttonsdemo {

	WebDriver driver;
	Actions act;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		act = new Actions(driver);
		driver.get("https://demoqa.com/buttons");
	
	}
	
	
	@Test
	public void doubleclick()
	{
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(button).perform();
		
	}
	
	
	@Test
	public void rightclick()
	{
		
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(button).perform();
		
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	
}
