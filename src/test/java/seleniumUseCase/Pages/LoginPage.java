package seleniumUseCase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumUseCase.SeleniumUtilities.SeleniumWebElementsActions;

public class LoginPage {
	private WebDriver driver;

	@FindBy(name = "username")
	private WebElement user;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement pass;

	@FindBy(xpath = "//*[@id='Login']")
	private WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String UserName, String Password) throws Exception {
		SeleniumWebElementsActions.enterInputToTextFile(user, UserName);
		SeleniumWebElementsActions.enterInputToTextFile(pass, Password);
		SeleniumWebElementsActions.clickOnWebElement(login);
	}
}
