package seleniumUseCase.SeleniumUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUseCase.Base.Base;

public class SeleniumWebElementsActions {
	WebDriver driver;

	public static void clickOnWebElement(WebElement element) throws Exception {
		try {
			element.isDisplayed();
			element.isEnabled();
			element.click();
		} catch (Exception e) {
			throw e;
		}
	}

	public static void clickOnWebElement(WebElement element, int time) {
		try {
			element.isDisplayed();
			element.isEnabled();
			element.click();
		} catch (Exception e) {
			throw e;
		}
	}

	public static void enterInputToTextFile(WebElement element, String input) throws Exception {
		try {
			element.isDisplayed();
			element.isEnabled();
			element.clear();
			element.sendKeys(input);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void enterInputToTextFile(WebElement element, String input, int time) throws Exception {
		try {
			element.isDisplayed();
			element.isEnabled();
			element.clear();
			element.sendKeys(input);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void clickByJavascript(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)Base.getDriver() ; //BaseTest.getDriver()
		js.executeScript("arguments[0].click();", element );	
	}
}
