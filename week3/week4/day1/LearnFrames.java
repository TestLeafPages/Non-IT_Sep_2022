package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		System.out.println(frameCount.size());		
		
		//to getting into the frame
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='card']/iframe")));	using frame as webelement
		driver.switchTo().frame(0);
		WebElement firframe = driver.findElement(By.id("Click"));		
		firframe.click();
		System.out.println(firframe.getText());
		//to return to the main content of the page
		driver.switchTo().defaultContent();
		
		//handle the nested frame
		driver.switchTo().frame(2);//parent frame /outer frame
		driver.switchTo().frame("frame2");	//inner	
		WebElement nestFrameele = driver.findElement(By.id("Click"));//click the webelement
		nestFrameele.click();
		System.out.println(nestFrameele.getText());		
		
		driver.switchTo().defaultContent();
		
		//if any sibiling iframes is present inside a parent frame
		//driver.switchTo().parentFrame();
		
		
	}

}
