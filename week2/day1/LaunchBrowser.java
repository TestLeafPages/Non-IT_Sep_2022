package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {		
	
		//Step:1 Set up the driver/Connect the webdriver
		/*
		 * WebDriverManager.chromedriver().setup(); //Step 2 Create an instance to
		 * launch the browser ChromeDriver driver= new ChromeDriver();
		 */
		//
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver =new EdgeDriver();
		
	//	Step:3 open the url /address of the application
		driver.get("https://www.google.com/");
		
		
		
		
		

	}

}
