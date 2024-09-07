package Seleniumviamaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchfirefox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Fashion")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		WebElement watch = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Watches	']")));
		watch.click();

		WebElement fastrack = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@alt='Fastrack Analog Unisex-Adult Watch']")));
		fastrack.click();
		
		WebElement addtocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));
		addtocart.click();
		
		WebElement proceedtobuy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='proceedToRetailCheckout']")));
		proceedtobuy.click();
		
		driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("9566898876");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//driver.close();
		

	}

}
