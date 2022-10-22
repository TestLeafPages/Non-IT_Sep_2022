package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();	
		
		//switch the driver control to alert box		
		  Alert alert = driver.switchTo().alert(); 
		  //simple alert
		  String text = alert.getText();//to get the text from the alert box 
		  System.out.println(text); //accept the alert
		  alert.accept();		
	 			
		  //confirmation Alert
		  driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		  alert.dismiss();		  
		  
		  //Prompt alert
		  driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		  alert.sendKeys("Vidya");
		  String text2 = alert.getText();
		  System.out.println(text2);
		  alert.accept();		  
		  
		  String text3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();		  
		  System.out.println(text3);
		
		  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		 //alert.dismiss();// cannot write for sweet alert		  
		  
		  driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
		
		
		

	}

}
