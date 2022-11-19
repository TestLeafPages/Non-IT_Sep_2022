package testcase;

import org.testng.annotations.Test;

import baseclass.CommonClass;
import pages.LoginPage;

public class CreateLeadTc extends CommonClass{
	
	@Test
	public void runLead() {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrm()
		.verifyPage()
		.clickLeads()
		.clickCreaLeadform()
		.enterCompanyname()
		.enterfirstName()
		.enterLastname()
		.clickCreate()
		.verifyFirstName();
		
		
		
		
	}
	

}
