package Seleniumviamaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectwithusingpagefactory {
	
	WebDriver driver;
	
	pageobjectwithusingpagefactory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath= "//input[@id='email']") WebElement email;
	@FindBy(xpath= "//input[@id='pass']") WebElement pwd;
	@FindBy(xpath="//button[@id='loginbutton']") WebElement btn;
	
	public void setusername(String user)
	{
		email.sendKeys("ahamed");
			
	}
	public void setpassword(String pass)
	{
		pwd.sendKeys(pass);
		
	}

	public void setlogin()
	{
		btn.click();
	}
	
}
