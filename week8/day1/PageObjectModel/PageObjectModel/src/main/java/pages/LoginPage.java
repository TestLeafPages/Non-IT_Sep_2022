package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.CommonClass;

public class LoginPage extends CommonClass {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// LoginPage obj=new LoginPage();
		// return new LoginPage();
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		// WelcomePage obj=new WelcomePage();
		return new WelcomePage(driver);
	}

}
