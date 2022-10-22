package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//prints the session id of the driver
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		//to get the address of the parent window/current window
		String windowHandle = driver.getWindowHandle();
		System.out.println("Main window Address : " +windowHandle);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String windowHandle2 = driver.getWindowHandle();		
		System.out.println("Control is still in First main window " +windowHandle2);
		
		//to get the number of opened windows
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
				for (String string : windowHandles) {
			System.out.println("Unqiue address of opened Tabs: " +string);
				}
		//to access through	the index ->conver set to list 
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));//child tab
		String windowHandle3 = driver.getWindowHandle();
		System.out.println("Control is given to child tab "+windowHandle3);
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		System.out.println(driver.getTitle());
		driver.close();//close the current active window -dashboard
		//switchto parent
		driver.switchTo().window(window.get(0));	
		
		
		//second scenario
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();		
		Set<String> secwindowHandles = driver.getWindowHandles();
		System.out.println(secwindowHandles.size());
		List<String> secwindow=new ArrayList<String>(secwindowHandles);		
		driver.switchTo().window(secwindow.get(2));	
		System.out.println(driver.getTitle());
		String windowHandle4 = driver.getWindowHandle();
		System.out.println(windowHandle4);
		driver.quit();//close all the browsers
				
		
		//first know no of windows-->getWindowHandles
		//convert set to list
		//switchTo window with index
		
		
	}

}
