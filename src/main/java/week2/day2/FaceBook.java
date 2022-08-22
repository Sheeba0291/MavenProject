package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		/*
		 * Step 1: Download and set the path 
		 * Step 2: Launch the chrome browser 
		 * Step 3: Load the URL https://en-gb.facebook.com/ 
		 * Step 4: Maximize the window 
		 * Step 5: Add implicit wait 
		 * Step 6: Click on Create New Account button 
		 * Step 7: Enter the first name 
		 * Step 8: Enter the last name 
		 * Step 9: Enter the mobile number
		 * Step 10: Enter the password 
		 * Step 11: Handle all the three drop downs 
		 * Step 12: Select the radio button "Female" ( A normal click will do for this step)
		 */

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Maximize the window 
		driver.manage().window().maximize();

		// Add implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on Create New Account button 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sheeba");
		
		// Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murugan");
		
		// Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8220322");
		
		// Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("Oneplus6@");
		
		// Handle the dropdowns date, month and Year to enter 02, Dec, 1991
		Select date = new Select(driver.findElement(By.id("day")));
		
		date.selectByIndex(1);
		
		Select month = new Select(driver.findElement(By.id("month")));
		
		month.selectByValue("12");
		
		Select year = new Select(driver.findElement(By.id("year")));
		
		year.selectByVisibleText("1991");
		
		// Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@value='1']")).click();
		            
		// Print a message to the user in the console.
		System.out.println("Data was successfully entered for FaceBook account Creation.");

	}

}
