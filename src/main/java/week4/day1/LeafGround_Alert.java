package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Alert {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Button.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chrome driver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Button HTML page
		driver.get("http://www.leafground.com/pages/Alert.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.sendKeys("TestLeaf");

		alert.accept();

		System.out.println(driver.findElement(By.id("result1")).getText());	

		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
