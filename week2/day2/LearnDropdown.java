package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {

		// driver setup
		// Chromedriver instance
		// open url
		// maximize
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// driver.findElement(By.id("username")).sendKeys("demosalesManager");

		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("demosalesmanager");
		System.out.println(uname.getAttribute("value"));

		// stored the element
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		System.out.println(login.getAttribute("class"));
		login.click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crm.getText());

		crm.click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R"); // To handle dropdown // 1.Locate the
																			// dropdown element
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// 2.To create instance for the select class
		Select opt = new Select(source);// pass the webelement as an argument to the select class
		// select using index
		opt.selectByIndex(2);

		// dropdown with select using value
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select op = new Select(campaign);
		op.selectByValue("CATRQ_CAMPAIGNS");// pick the option from value attribute
		// dropdown with select using visibleText
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select value = new Select(industry);
		value.selectByVisibleText("Aerospace");// pick the value from the black text

		Thread.sleep(3000);// to pause the execution
		value.selectByIndex(3);

		Thread.sleep(3000);// to pause the execution
		value.selectByValue("IND_MANUFACTURING");

	}

}
