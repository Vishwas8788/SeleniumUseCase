package seleniumUseCase.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumUseCase.Base.Base;
import seleniumUseCase.SeleniumUtilities.SeleniumWebElementsActions;

public class HomePage extends Base{
	public void clickOnAccountsTab(String accounts) throws Exception {
		WebElement accountsTab = Base.getDriver().findElement(By.xpath("//span[text()='" + accounts + "']"));
		SeleniumWebElementsActions.clickByJavascript(accountsTab);

	}

}
