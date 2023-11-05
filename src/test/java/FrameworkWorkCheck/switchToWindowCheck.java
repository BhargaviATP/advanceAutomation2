package FrameworkWorkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class switchToWindowCheck {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);

		WebDriverUtility Wu=new WebDriverUtility(driver);
		WebElement ele = driver.findElement(By.id("newWindowBtn"));
		Wu.scrollInToViewAction(ele,true);
		//Wu.scrollByJS(0, 200);
		//By locator = By.id("newWindowBtn");
		//Wu.explicitWaitReference(5).until(ExpectedConditions.elementToBeClickable(locator));
		ele.click();
		Wu.switchingToWindow(driver.getWindowHandles(), "abcxyz", driver.getWindowHandle());
		driver.findElement(By.id("firstName")).sendKeys("Bhargavi");
		Thread.sleep(2000);
		driver.close();
		//Wu.switchingBackToMainWindow(driver.getWindowHandle());		
	}
}
