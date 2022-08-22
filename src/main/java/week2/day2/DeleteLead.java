package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		Thread.sleep(5000);

		// Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();

		leadID = leadID.replaceAll("[a-zA-Z()\\s]", "");

		System.out.println("Lead ID "+leadID+" is Captured.");

		// Click First Resulting lead
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();

		// Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		// Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		// Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		/*
		 * Verify message "No records to display" in the Lead List. 
		 * This message confirms the successful deletion
		 */
		String actualText = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();

		if (actualText.equals("No records to display"))
		{
			System.out.println(leadID + " is deleted successfully");
		}
		else
		{
			System.out.println(leadID + " is NOT deleted");
		}

		Thread.sleep(1000);
		
		// Close the browser (Do not log out)
		driver.close();

	}

}
