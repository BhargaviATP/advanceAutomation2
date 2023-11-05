package GenericUtilities;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutility {
	WebDriver driver;
	JavascriptExecutor js;
	public WebDriverutility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor)driver;
	}
	public  void clickonElementJS(WebElement Ele) {
		js.executeScript("arguments[0].click();", Ele);
	}
	public void enterDataJS(WebElement Ele2,String data) {
		js.executeScript("arguments[0].value='"+data+"'",Ele2);
	}
	public void scrollActionJS(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+");");
	}
	public void scrollToJS(int x, int y) {
		js.executeScript("window.scrollTo("+x+","+y+");");
	}
	public void scrollInToViewAction(WebElement element, Boolean status) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+status+")",element);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of index
	 * @param index
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of name
	 * @param name
	 */
	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of WebElement
	 * @param element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch the driver control from frame to window
	 */
	public void switchingBackToMainWindow() {
		driver.switchTo().defaultContent();
	}
	/**
	 * this method is returning the alert reference
	 */
	public Alert returnAlertReference() {
		return driver.switchTo().alert();
	}
	/**
	 * This method is used to switch the driver control from one window to another
	 * @param allWindowids
	 * @param expectedTilte
	 * @param parentid
	 */
	public void switchingToWindow(Set<String> allWindowids,String expectedTitle, String parentid) {
		allWindowids.remove(parentid);
		for(String id:allWindowids) {
			driver.switchTo().window(id);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())){
				break;
			}
			
		}
	}
		public void handlingDropdown(WebElement element, String value) {
			Select select = new Select(element);
			try {
				select.selectByVisibleText(value);
			}catch (NoSuchElementException e) {
				try {
				select.selectByValue(value);
				
			}catch (Exception e1) {
				
				select.selectByIndex(Integer.parseInt(value));
			}
			}
			//int val = Integer.parseInt(value);
			//select.selectByIndex(val);
		}
	/**
	 * This method is used to switch the driver control from 
	 * @param parentID
	 */
	public void switchingBackToMainWindow(String parentID) {
		driver.switchTo().window(parentID);
	}
	
 }

