package FrameworkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.WebDriverutility;
//import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		/******If we get error to launch the browser, then we need to go for this option*****/
		//		ChromeOptions options=new ChromeOptions();
		//		options.addArguments("--remote-allow-origins=*");
		//		WebDriver driver= new ChromeDriver(options);

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		WebDriverutility Wu=new WebDriverutility(driver);
		Wu.scrollInToViewAction(element, true);
	}	
}


