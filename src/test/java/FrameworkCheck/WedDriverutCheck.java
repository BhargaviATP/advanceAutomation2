package FrameworkCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.PropertiesUtility;
import GenericUtilities.WebDriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WedDriverutCheck {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	PropertiesUtility pu=new PropertiesUtility();
	String urllink = pu.readDatafromProprtyfile("url");
	driver.get(urllink);
	
	WebDriverutility wu=new WebDriverutility(driver);
	
	WebElement clickEle = driver.findElement(By.linkText("Log in"));
	wu.clickonElementJS(clickEle);
	
	WebElement enterEle = driver.findElement(By.id("Email"));
	wu.enterDataJS(enterEle, "xyz");
	
	wu.scrollActionJS(0, 200);
	wu.scrollToJS(0, 300);
	
	Thread.sleep(2000);
	driver.quit();
}
}
