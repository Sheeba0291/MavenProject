package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_CheckBox {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/checkbox.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Checkbox HTML page
		driver.get("http://leafground.com/pages/checkbox.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Select the languages that you know?
		// selected Java
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input")).click();

		// Confirm Selenium is checked
		boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();

		if(enabled)
		{
			System.out.println("Selenium is Enabled");
		}
		else
		{
			System.out.println("Selenium is Disabled");
		}

		// DeSelect only checked
		for (int i=1; i<=2; i++)
		{
			boolean selected = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input["+i+"]")).isSelected();
			if (selected)
			{
				driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input["+i+"]")).click();
			}

		}
		
		// Select all below checkboxes
		for (int j=1; j<=6; j++)
		{
			driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input["+j+"]")).click();
		}
		System.out.println("All the Checkboxes were checked");
		
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
