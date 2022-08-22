package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Edit {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Edit.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Edit HTML page
		driver.get("http://leafground.com/pages/Edit.html");
		
		// Maximize the window
		driver.manage().window().maximize();

		// Enter your email address
		driver.findElement(By.id("email")).sendKeys("rsheeba.ms@gmail.com");

		// Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("New word");

		// Get default text entered
		String defaultText = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");

		System.out.println("The Default text entered was "+defaultText);
		
		// Clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		// Confirm that edit field is disabled
		boolean enabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		
		if(enabled)
		{
			System.out.println("The Edit field is NOT DISABLED");
		}
		else
		{
			System.out.println("It is confirmed that the Edit field is DISABLED");
		}
		
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
