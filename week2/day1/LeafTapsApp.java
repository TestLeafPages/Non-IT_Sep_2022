package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setup the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser-create instance  shortcut to import -ctrl shift o
		ChromeDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//4 -Maximize the window 		
		driver.manage().window().maximize();
		
		//Enter the username
		WebElement username = driver.findElement(By.id("username"));//stored the element
		username.sendKeys("demosalesManager");//typed the input
		/*
		 * username.clear();//to clear the typed text username.sendKeys("demo");
		 */
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click the Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
	}

}
