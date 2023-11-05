package FrameworkWorkCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.TakesScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShotCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		TakesScreenShotUtility Ts=new TakesScreenShotUtility(driver);
		Ts.capturingScreenShot("First SS");
	}
}
