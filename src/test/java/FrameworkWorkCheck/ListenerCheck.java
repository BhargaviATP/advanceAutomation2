package FrameworkWorkCheck;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.BaseClass2;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class ListenerCheck extends BaseClass{
	
	@Test

	public void navigatingToFB() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		assertTrue(false);
	}
	
	@Test

	public void navigatingToInsta() throws InterruptedException {
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		assertTrue(false);
	}
	@Test

	public void navigatingToGoogle() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		assertTrue(false);
	}
	
}
