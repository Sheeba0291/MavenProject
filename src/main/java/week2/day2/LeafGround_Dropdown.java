package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Dropdown {

	public static void main(String[] args) {
		// Refer to http://www.leafground.com/pages/Dropdown.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Dropdown HTML page
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Select the Training program using Index
		Select dropdown1 = new Select(driver.findElement(By.id("dropdown1")));

		dropdown1.selectByIndex(1);

		// Select the Training program using Text
		Select dropdown2 = new Select(driver.findElement(By.name("dropdown2")));

		dropdown2.selectByVisibleText("Selenium");

		// Select the Training program using Value
		Select dropdown3 = new Select(driver.findElement(By.id("dropdown3")));

		dropdown3.selectByValue("1");

		// Get the number of dropdown options
		Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));

		List<WebElement> options = dropdown4.getOptions();

		System.out.println("Size of the Dropdown is "+options.size());

		// Using sendKeys to select the dropdown.
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Selenium");

		//Select program from scroll bar
		Select scrollBar = new Select(driver.findElement(By.xpath("(//div[@class='example'])[6]/select")));

		scrollBar.selectByVisibleText("Selenium");
		
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");



	}

}
