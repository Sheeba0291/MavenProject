package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		/*http://leaftaps.com/opentaps/control/main

		1) Open the chrome
		2) Login to leaftaps
		3) Click CRM/SFA link
		4) Click Leads Link
		5) Click Merge Leads Link
		6) Click the icon following the from lead
		7) Switch to new window
		8) Enter the first name as Babu
		9) Click Find Leads Button
		10) Click on the first resulting lead
		11) Move the control back to first window

		 */

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the Leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the window
		driver.manage().window().maximize();

		// Enter the username as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// Enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click Merge leads
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();

		// Click the icon following the from lead
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a/img)[1]")).click();

		// Get the set of Window Handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Convert it to a list
		List<String> listOfHandles = new ArrayList<String>(windowHandles);
		
		// Store the 1st window as parentWindow
		String parentWindow = listOfHandles.get(0);

		// Switch to the new window
		driver.switchTo().window(listOfHandles.get(1));

		// Print the Page Title
		System.out.println(driver.getTitle());

		// Enter the first name as Sheeba
		driver.findElement(By.name("firstName")).sendKeys("Sheeba");

		// Click Find Leads Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		// Click on the first resulting lead
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();

		// Move the control back to first window
		driver.switchTo().window(parentWindow);

		// Move the control back to first window
		driver.switchTo().window(listOfHandles.get(0));

		// Print the Page Title
		System.out.println(driver.getTitle());

	}

}
