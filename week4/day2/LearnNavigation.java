package week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement link = driver.findElement(By.linkText("Find the URL without clicking me."));
		String attribute = link.getAttribute("href");
		driver.navigate().to(attribute);
		driver.navigate().refresh();
	}

}
