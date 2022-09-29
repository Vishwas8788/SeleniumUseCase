package seleniumUseCase.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initialization(String browserName, String url) {
		switch (browserName) {
		case "Chrome":
			ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver(ops);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "FireFox":
			System.setProperty("webdriver.geckodriver.driver", "BrowserDrivers/firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "BrowserDrivers/internetexplorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		default:
			driver = null;
		}
		return driver;
	}

}
