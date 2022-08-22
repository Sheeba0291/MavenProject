package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandle {

	public static void main(String[] args) throws InterruptedException {

		/*http://leaftaps.com/opentaps/control/main

		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
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

		// Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter Phone Number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8220322");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Sleep for 5 seconds
		// Thread.sleep(5000);

		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));

		// Capture lead ID of First Resulting lead
		try 
		{
			driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		}catch(NoSuchElementException e1)
		{
			System.out.println("Got NoSuchElementException");
			driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("StaleElementReferenceException was Thrown.");
			// wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"))));
			driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		}


	}

}
