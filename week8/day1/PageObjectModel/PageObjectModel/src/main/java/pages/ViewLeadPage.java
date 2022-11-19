package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.CommonClass;

public class ViewLeadPage extends CommonClass {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyFirstName() {
		System.out.println("Verified FirstName");
		return this;

	}

	// edit
	// duplicate/
	// delete
}
