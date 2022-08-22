package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Image {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Image.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Image HTML page
		driver.get("http://leafground.com/pages/Image.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Click on the image to go home page
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		
		System.out.println("Title of the Page is : "+driver.getTitle());

		// Return back to Button HTML from Homepage
		driver.navigate().back();

		// Check if the image is Broken
		driver.findElement(By.xpath("//label[@for='position']/following-sibling::img")).click();
		
		// Click me using Keyboard or Mouse
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).sendKeys(Keys.ENTER);
		
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
