package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.CommonClass;

public class WelcomePage extends CommonClass{
		public WelcomePage(ChromeDriver driver) {
			this.driver=driver;
		}
	
	
	
	public HomePage clickCrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
		}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
	//continue to home page for futher action-->1 execution
	
	//to do logout back to login page-->1 execution
	
	
	
	
	
	
	
	

}
