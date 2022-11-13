package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoeleInvisible {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();

		WebElement hide = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		hide.getText();
		// to apply wait explicitly
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(hide));

		// Wait for the element to clickable
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		String text = clickable.getText();
		System.out.println(text);

		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		WebElement didyouNotice = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
		String text2 = didyouNotice.getText();
		wait.until(ExpectedConditions.textToBePresentInElement(didyouNotice, text2));

//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	}

}
