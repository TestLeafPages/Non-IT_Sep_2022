package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoSelect {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		Actions act=new Actions(driver);        
		act.keyDown(Keys.CONTROL).click(item1).click(item2).keyUp(Keys.CONTROL).perform();
		
		//to take a screenshot of webpage
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/pic.jpg");
		FileUtils.copyFile(screenshotAs, destn);
		
		//to get the screenshot of particular webElement
		File ele = item1.getScreenshotAs(OutputType.FILE);
		File des=new File("./snap/pic1.jpg");
		FileUtils.copyFile(ele, des);
		
		
	//	WebElement widget = driver.findElement(By.xpath("//a[text()='Widget Factory']"));
		act.scrollByAmount(230,300).perform();
		
		
	}

}
