package FrameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class wedDriverUtilityCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverUtility Wu=new WebDriverUtility(driver);
		
		WebElement loginele = driver.findElement(By.linkText("Log in"));
		Wu.clickonElementusingJS(loginele);
		
		WebElement enterdata = driver.findElement(By.id("Email"));
		Wu.enterDataintoElement(enterdata, "demo@gmail.com");
		
		Wu.scrollByJS(0, 200);
		Wu.scrollToJS(0, 300);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
