package testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecficMethod{
	
		

	@Test(dataProvider="fetchData")
	public void runCreate(String cname,String firstname,String lastname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
	
  }
	
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		String[][] data=new String[2][3];
		
		data[0][0]="TL";
		data[0][1]="Vidya";
		data[0][2]="R";
		
		
		data[1][0]="Testleaf";
		data[1][1]="Princilla";
		data[1][2]="R";
				
		return data;
	}
	
	
	
	
	
}






