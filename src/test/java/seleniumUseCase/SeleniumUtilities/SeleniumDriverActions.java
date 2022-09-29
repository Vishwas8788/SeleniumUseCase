//package seleniumUseCase.SeleniumUtilities;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebElement;
//
//import com.makeMyTrip.Base.Base;
//
//public class SeleniumDriverActions {
//
//	public static void handleAlerts(String value, String status) {
//		if (value.isEmpty() && status.equalsIgnoreCase("accept")) {
//			Base.getDriver().switchTo().alert().accept();
//		} else if (value.isEmpty() && status.equalsIgnoreCase("dismiss")) {
//			Base.getDriver().switchTo().alert().dismiss();
//		} else {
//			Base.getDriver().switchTo().alert().sendKeys(value);
//			Base.getDriver().switchTo().alert().accept();
//		}
//	}
//
//	public static void pageLoadTimeOut() {
//		Base.getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	public static void switchToFrameByElement(WebElement element) {
//		Base.getDriver().switchTo().frame(element);
//	}
//	
//	public static void switchToDefaultContent() {
//		Base.getDriver().switchTo().defaultContent();
//	}
//}
