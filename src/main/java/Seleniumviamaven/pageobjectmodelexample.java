package Seleniumviamaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodelexample {

	WebDriver driver;
	
	pageobjectmodelexample(WebDriver driver)
	{
		this.driver= driver;
	}
	
//without page factory model
By email= By.xpath("//input[@id='email']");
By pwd= By.xpath("//input[@id='pass']");
By btn= By.xpath("//button[@id='loginbutton']");
	

public void setusername(String user)
{
	driver.findElement(email).sendKeys(user);
	
}
public void setpassword(String pass)
{
	driver.findElement(pwd).sendKeys(pass);
	
}

public void setlogin()
{
	driver.findElement(btn).click();
	
}
}
