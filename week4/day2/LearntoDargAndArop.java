package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoDargAndArop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         WebElement drag = driver.findElement(By.xpath("//span[@class='ui-panel-title']"));
		
         Point location = drag.getLocation();
         int x = location.getX();//horizontal
         int y = location.getY();//veritcal
         
         Actions act=new Actions(driver);
         act.dragAndDropBy(drag, 230,300).perform();
         
         WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
        
         WebElement target = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
         
         act.dragAndDrop(source, target).perform();
         act.clickAndHold(source).dragAndDropBy(source,x,y).perform();
         
         

		
	}

}
