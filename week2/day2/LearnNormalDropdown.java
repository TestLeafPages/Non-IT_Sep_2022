package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNormalDropdown {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		//wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ui = driver.findElement(By.className("ui-selectonemenu"));
		ui.click();
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
			
		driver.findElement(By.xpath("//li[text()='India']")).click();	

		driver.close();
		
	}

}
