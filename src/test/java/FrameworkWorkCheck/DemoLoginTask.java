package FrameworkWorkCheck;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import genericUtilities.TakesScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLoginTask {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		TakesScreenShotUtility tsu=new TakesScreenShotUtility(driver);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
//		driver.findElement(By.id("Email")).sendKeys("Demo@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("abcd1234");
//		WebElement ele = driver.findElement(By.id("RememberMe"));
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
		
//		SoftAssert SA=new SoftAssert();
//		SA.assertTrue(ele.isSelected());
//		tsu.capturingScreenShot("Failure SS");
	}
}

