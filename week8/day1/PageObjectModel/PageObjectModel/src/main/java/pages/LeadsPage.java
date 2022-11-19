package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.CommonClass;

public class LeadsPage extends CommonClass {
	
	public LeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	

	public CreateLeadPage clickCreaLeadform() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

	public FindLeadsPage clickFindLead() {

		return new FindLeadsPage();

	}

	public void clickMergeLead() {

	}

}
