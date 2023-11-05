package FrameworkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.WebDriverutility;
//import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		/******If we get error to launch the browser, then we need to go for this option*****/
		//		ChromeOptions options=new ChromeOptions();
		//		options.addArguments("--remote-allow-origins=*");
		//		WebDriver driver= new ChromeDriver(options);

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement element = driver.findElement(By.id("Course"));
		WebDriverutility Wu=new WebDriverutility(driver);
		Wu.handlingDropdown(element, "3");
	}
}


