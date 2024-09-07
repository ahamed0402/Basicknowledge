package Seleniumviamaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitandexplicitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver;
		
	   driver = new ChromeDriver();
	   
	   //implicit wait for all the scripts 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
	   
	   driver.get("https://www.amazon.in/");
	   
		
	
	}

}
