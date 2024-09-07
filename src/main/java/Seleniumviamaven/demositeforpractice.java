package Seleniumviamaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demositeforpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
		//checkbox
		WebElement expand = driver.findElement(By.xpath("//button[@title='Expand all']"));
		expand.click();
		
		WebElement expandcommands = driver.findElement(By.xpath("//span[contains(text(),'Commands')]"));
		expandcommands.click();
		
		
		WebElement collapse = driver.findElement(By.xpath("//button[@title='Collapse all']"));
		collapse.click();
		
		
		
		//radiobutton
		
		
		
		
		
	}

	}



