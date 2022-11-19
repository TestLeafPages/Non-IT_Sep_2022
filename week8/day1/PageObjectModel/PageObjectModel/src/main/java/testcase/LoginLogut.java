package testcase;

import org.testng.annotations.Test;

import baseclass.CommonClass;
import pages.LoginPage;

public class LoginLogut extends CommonClass{
	
	@Test
	public void runLogout() {
		//LoginPage lp =new LoginPage(driver);
	//	lp.enterUsername()
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLogin();
		//.clickLogout();
		}
	
	

}
