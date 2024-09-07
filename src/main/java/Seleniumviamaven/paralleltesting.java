package Seleniumviamaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltesting {

	WebDriver driver;

	@BeforeClass	
	@Parameters({"browser"})
	void setup(String br)
	{
switch(br.toLowerCase()) 
{
case "chrome": driver = new ChromeDriver(); break;
case "edge" : driver = new EdgeDriver(); break;
case "firefox" : driver = new FirefoxDriver(); break;
default: System.out.println("Invalid browser"); return;
}
	}

	@Test(dataProvider="dp")	
	void testlogin(String email, String pwd)
	{
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@AfterClass	
	void teardown()
	{
	driver.close();
	}

	 	@DataProvider(name="dp")
	 	Object[][] loginData()
	 	{
	 	
	 		Object data[][]= {
	 				{"abc123", "abc123"},
	 				{"abc456", "abc456"},
	 				{"abc789", "abc789"},
	 				{"abc1231", "abc1231"},
	 				
	 				
	 		};
	 		return data;
	 	}

}
