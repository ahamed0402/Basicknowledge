package Seleniumviamaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class practiceform {

	
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		act = new Actions(driver);
		driver.get("https://demoqa.com/automation-practice-form");
	
	}
	
	@Test
	public void form()
	{
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		name.sendKeys("ahamed");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("amayra");
				
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("test@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		gender.click();
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("9876543210");
		
		
		
	}
}
