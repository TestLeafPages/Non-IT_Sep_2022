package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecficMethod {

	@Test(dataProvider = "fetchData")
	public void runCreate(String cname, String fname, String lastname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}

	/*
	 * @DataProvider(name = "fetchData") public String[][] sendData() throws
	 * IOException { filename="CreateLeadxl"; sheetindex=0; return
	 * ReadExcelData.readData(filename,sheetindex); }
	 */
	
	@BeforeTest
	public void setFile() {
		filename="CreateLeadxl"; 
		sheetindex=0;
	}
	
	
	
	

}
