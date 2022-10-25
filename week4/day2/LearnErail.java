package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnErail {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.click();
		fromStation.sendKeys("MAS", Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.click();
		toStation.sendKeys("MDU", Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("buttonFromTo")).click();

		List<WebElement> train = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		int size = train.size();
		System.out.println(size);

		List<String> trainNames = new ArrayList<String>();
		
		  for (WebElement names : train) {
			  String text = names.getText(); //tr[1]/td[1]
			  //tr[2][td[1]
		  trainNames.add(text); 
		  }
		 	
		System.out.println(trainNames);
		System.out.println(trainNames.size());
		Set<String> trName = new LinkedHashSet<String>(trainNames);
		System.out.println(trName);
		System.out.println(trName.size());
		
		

		if (trainNames.size() == trName.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates Found");
		}

	}

}
