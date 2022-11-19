package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.CommonClass;

public class CreateLeadPage extends CommonClass {

	public CreateLeadPage(ChromeDriver driver) {		
		this.driver=driver;
		
	}
	
	
	public CreateLeadPage enterCompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	public CreateLeadPage enterfirstName() {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		return this;
	}

	public CreateLeadPage enterLastname() {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}

	public ViewLeadPage clickCreate() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
