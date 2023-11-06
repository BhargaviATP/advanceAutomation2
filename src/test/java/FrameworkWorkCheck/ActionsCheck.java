package FrameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		WebDriverUtility Wu=new WebDriverUtility(driver);
		Wu.scrollInToViewAction(element, true);
	}	
}
