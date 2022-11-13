package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecficMethod {

	public  RemoteWebDriver driver;
	public String filename;
	public int sheetindex;
	
	@BeforeSuite
	public void callServer() {
		System.out.println("Cloud Connection");
	}
		
	@Parameters({"browser","url","username","password"})
	@BeforeMethod()
	public void preCondition(String browser,String url, String username,String password) {
		
              
    System.out.println("Before method Thread Id:" + Thread.currentThread().getId());
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {		
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
	}else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 
	//System.out.println(driver);
	}
		
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
		}
	
	@AfterMethod()
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {		
		return ReadExcelData.readData(filename,sheetindex);
	}
	
	
	
	
}
