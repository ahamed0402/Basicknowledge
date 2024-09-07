package Seleniumviamaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class withoutusingpagefactory {
	
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test	
	void testlogin()
	{
		
		pageobjectwithusingpagefactory po = new pageobjectwithusingpagefactory(driver);
		po.setusername("ahamed");
		po.setpassword("dummy");
		po.setlogin();

		Assert.assertEquals(driver.getTitle(), "Get back on Facebook");

	}
	
	@AfterClass
	void teardown()
	{
		
		driver.close();
	}
	
}
