package Seleniumviamaven;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverallmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Nokia lumia 1520']")));
		product.click();
		
		WebElement addtocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add to cart')]")));
		addtocart.click();	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement gotocart = driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
		gotocart.click();
		
		WebElement placeorder = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[contains(text(),'Place Order')]")));
		
		placeorder.click();
		
		//Fill the form to purchase the product
		
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		name.sendKeys("test");
		
		WebElement creditcard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card']")));
		creditcard.sendKeys("12324");
		
		WebElement purchase = driver.findElement(By.xpath("//button[contains(text(),'Purchase')]"));
		purchase.click();
		
		
	}

	
}
