package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Image HTML page
		driver.get("https://www.redbus.in/");

		// Maximize the window
		driver.manage().window().maximize();

		// Type "Chennai" in the FROM text box 
		driver.findElement(By.id("src")).sendKeys("Chennai");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@data-no='1']")).click();

		// Type "Bangalore" in the TO text box
		driver.findElement(By.id("dest")).sendKeys("Bangalore");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[@data-no='1']")).click();

		// Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//label[text()='Date']")).click();

		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();

		// Click Search Buses 
		driver.findElement(By.id("search_btn")).click();

		Thread.sleep(3000);

		// Print the number of buses shown as results (104 Buses found) 
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text+" found");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Choose SLEEPER in the left menu  
		WebElement element = driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label"));
		driver.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label")).click();

		Thread.sleep(3000);

		// Print the name of the second resulting bus 
		String text2 = driver.findElement(By.xpath("(//div[@class='clearfix row-one'])[2]/div/div")).getText();

		System.out.println(text2);

		// Click the VIEW SEATS of that bus 
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		Thread.sleep(3000);
		
		System.out.println("View the Seats now");
		
		// Take screenshot and close browser 
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/redbus.png");
		FileUtils.copyFile(screenshotAs,desc );

		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");


	}

}
