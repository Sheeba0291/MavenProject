package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Invisibility {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/disapper.html");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("btn"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.invisibilityOf(element));

		WebElement text = driver.findElement(By.xpath("//button[@id='btn']/following::p"));

		System.out.println(text.getText());


	}

}
