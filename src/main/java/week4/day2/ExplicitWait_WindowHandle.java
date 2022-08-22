package week4.day2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WindowHandle {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("color")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(windowHandles);

		driver.switchTo().window(list.get(1));

		File src = driver.getScreenshotAs(OutputType.FILE);

		File desc = new File("./snaps/window1.png");

		FileUtils.copyFile(src, desc);

		driver.switchTo().window(list.get(2));

		File src1 = driver.getScreenshotAs(OutputType.FILE);

		File desc1 = new File("./snaps/window2.png");

		FileUtils.copyFile(src1, desc1);


	}

}
