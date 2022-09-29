package seleniumUseCase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumUseCase.Base.Base;
import seleniumUseCase.SeleniumUtilities.SeleniumWebElementsActions;

public class CreateNewAccountPage extends Base{
	private WebDriver driver;
	
	@FindBy(xpath="//div[text()='New']") private WebElement newbtn;
	
	public CreateNewAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewAcc() throws Exception {
		SeleniumWebElementsActions.clickOnWebElement(newbtn);
	}

}
