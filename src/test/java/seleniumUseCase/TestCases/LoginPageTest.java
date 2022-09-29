package seleniumUseCase.TestCases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumUseCase.Base.Base;
import seleniumUseCase.DataDrivers.readPropertiesFile;
import seleniumUseCase.Pages.CreateNewAccountPage;
import seleniumUseCase.Pages.HomePage;
import seleniumUseCase.Pages.LoginPage;

public class LoginPageTest extends Base{
	LoginPage login;
	HomePage home;
	CreateNewAccountPage create;
	@BeforeMethod
	public void setUp() throws Exception {
		initialization("Chrome", readPropertiesFile.readData("url"));
		login = new LoginPage(driver);
		home = new HomePage();
		create = new CreateNewAccountPage(driver);
	}
	@Test
	public void loginpageTest() throws Exception {
		login.login(readPropertiesFile.readData("username"), readPropertiesFile.readData("password"));
//		home.clickOnAccountsTab("Accounts");
//		create.createNewAcc();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void exit() {
		Base.getDriver().close();
	}

}
