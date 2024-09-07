package Seleniumviamaven;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchchrome {

	public static void main(String[] args) throws InterruptedException {

		//ChromeOptions option = new ChromeOptions();
		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://economictimes.indiatimes.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement industry= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://economictimes.indiatimes.com/industry'][1]")));
		industry.click();
	
	
		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sideMenu")));
		menu.click();
		WebElement markets = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
		markets.click();
		
		
		/*String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		if (pageTitle.equals("Selenium automates browsers. That's it!")) {
			System.out.println("Test is passed");
		}

		else {
			System.out.println("Test is failed");
		}
*/
		driver.close();
	}
}