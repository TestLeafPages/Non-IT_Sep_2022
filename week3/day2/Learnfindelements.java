package week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnfindelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//img[@alt='Fiction']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(findElements);
		
		
		List<String> book=new ArrayList<String>();
		for (WebElement books : findElements) {		
			String text = books.getText();
			System.out.println(text);
			book.add(text);
						
		}		
		System.out.println(book.size());
		Set<String> s=new LinkedHashSet<String>(book);
	    System.out.println(s.size());
		
		
	}

}
