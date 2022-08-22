package week6.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

/*
 Assignment 3:Create New Caller
"1. Launch ServiceNow application
2. Login with valid credential
3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller"
 */

public class ServiceNow_NewCaller {

	public static void main(String[] args) throws InterruptedException {

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch ServiceNow application
		driver.get("https://dev126079.service-now.com");

		// Maximize the window
		driver.manage().window().maximize();

		// Login with valid credential
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("$=sS8QijE8tV");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		// Click-All and Enter Callers in filter navigator and press enter
		
		Shadow shadow=new Shadow(driver); 
		Thread.sleep(15000); 
		WebElement ele = shadow.findElementByXPath("//div[@id='all']");
		ele.click();
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		
		shadow.findElementByXPath("//mark[text()='Callers']").click();
	
		/*
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
		
		*/

	}

}
