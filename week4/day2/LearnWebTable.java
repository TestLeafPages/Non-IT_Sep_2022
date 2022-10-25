package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to loacte a table and get the particular row and column data
		String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);

		// to find the number rows in a table
		List<WebElement> rowSize = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowSize.size();
		System.out.println("Number of rows: " + rsize);
		
		// to finrd the number of columns specific to 1 row
		// driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td"));
		List<WebElement> colSize = driver.findElements(By.xpath("//thead[@id='form:j_idt89_head']/tr/th"));
		int csize = colSize.size();
		System.out.println("Number of Columns " + csize + " in the table");

		// get the values from all rows with respect to one column
		// table[@role='grid']/tbody/tr[vary]/[td[1]
		System.out.println("********************************");
		System.out.println("Row values from column 1 Name");

		List<String> listOfNames = new ArrayList<String>();
		for (int i = 1; i <= rsize; i++) {
			String Name = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr/td[1]")).getText();
			System.out.println(Name);
			listOfNames.add(Name);
		}

		Set<String> rowNames = new LinkedHashSet<String>(listOfNames);
		System.out.println(rowNames);

		System.out.println("********************************");
		System.out.println("All column values from row 1 ");

		for (int i = 1; i <= csize; i++) {
			String row1Value = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[" + i + "]"))
					.getText();
			System.out.println(row1Value);
		}

		System.out.println("********************************");
		System.out.println("All Column values and Row Values ");

		for (int i = 1; i <= rsize; i++) {
			for (int j = 1; j <= csize; j++) {
				String AllValues = driver
						.findElement(By.xpath("//table[@role='grid']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(AllValues);
			}

		}

	}

}
