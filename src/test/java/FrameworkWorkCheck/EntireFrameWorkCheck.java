package FrameworkWorkCheck;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class EntireFrameWorkCheck extends BaseClass{
	@Test
	/**
	 * This Method is used to run the test case1, as it's annotated with @Test
	 */
	public void sampleTestCase1() {
		//driver.findElement(By.linkText("Log in")).click();
		assertFalse(true);
	}
	
	@Test
	/**
	 * This Method is used to run the test case2, as it's annotated with @Test
	 */
	public void sampleTestCase2() {
		//driver.findElement(By.linkText("Log in")).click();
	}

	@Test(dataProvider="data",dataProviderClass=ExcelUtility.class)
	/**
	 * This Method is used to read data from excel file, using data Provider.
	 */
	public void read(String a, String b) {
		System.out.println(a+" "+b);
		}
	}
