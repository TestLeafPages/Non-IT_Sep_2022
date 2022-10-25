package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnmouseclick {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//normal click-->left click
		//context click-->right click
		WebElement menu = driver.findElement(By.xpath("//h5[text()='Menu Bar']"));
		Actions act=new Actions(driver);
		act.contextClick(menu).perform();
		
	   WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
	   act.click(customer).perform();
	  
	   driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		WebElement message = driver.findElement(By.xpath("//label[text()='Message']"));
		act.doubleClick(message).perform();
		
	}

}
