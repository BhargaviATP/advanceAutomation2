package FrameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class alertCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		/******If we get error to launch the browser, then we need to go for this option*****/
		//		ChromeOptions options=new ChromeOptions();
		//		options.addArguments("--remote-allow-origins=*");
		//		WebDriver driver= new ChromeDriver(options);

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		WebDriverUtility Wu=new WebDriverUtility(driver);

		//Wu.explicitWaitReference(4000);
		Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		Wu.returnAlertReference().accept();
		driver.quit();
	}
}
