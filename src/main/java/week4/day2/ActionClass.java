package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		WebElement operators = driver.findElement(By.xpath("//h6[text()='Top Operators']"));

		Actions builder = new Actions(driver);

		builder.scrollToElement(operators).perform();

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snapshot.png");
		FileUtils.copyFile(src, desc);

	}

}
