package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Link {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Link.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Link HTML page
		driver.get("http://leafground.com/pages/Link.html");
		
		// Maximize the window
		driver.manage().window().maximize();

		// Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();

		// Return back to Button HTML from Homepage
		driver.navigate().back();

		// Find where the link takes without clicking the link
		// Get the Web element and check for the attribute -> "href" to get the redirecting url.
		String href = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");

		System.out.println("On clicking, the Page will get redirect to --- > "+href);

		// Verify if the link is broken.
		// Click the link, get the pageTitle and verify if it contains TestLeaf
		driver.findElement(By.linkText("Verify am I broken?")).click();

		if (driver.getTitle().contains("TestLeaf"))
		{
			System.out.println("The Link is NOT Broken");
		}
		else
		{
			System.out.println("The Link is BROKEN");
		}
		
		// Go back to previous page.
		driver.navigate().back();
		
		// Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		
		// How many links are available in this page?
		// Get all the WebElements with tagName as "a" in a List and get the size of it.
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println("There are "+findElements.size()+" links in this page.");
		
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");
		
		
	}

}
