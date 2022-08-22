package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		/*http://leaftaps.com/opentaps/control/main

		 * 1	Launch the browser
		 * 2	Enter the username
		 * 3	Enter the password
		 * 4	Click Login
		 * 5	Click crm/sfa link
		 * 6	Click Leads link
		 * 7	Click Find leads
		 * 8	Enter first name
		 * 9	Click Find leads button
		 * 10 Click on first resulting lead
		 * 11 Verify title of the page
		 * 12 Click Edit
		 * 13 Change the company name
		 * 14 Click Update
		 * 15 Confirm the changed name appears
		 * 16 Close the browser (Do not log out)
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

		// Enter First name as Sheeba
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sheeba");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Sleep for 5 seconds
		Thread.sleep(5000);

		// Click on first resulting lead
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();

		// Verify the Page Title is "View Lead | opentaps CRM"

		String pageTitle = "View Lead | opentaps CRM";
		driver.getTitle();

		if (pageTitle.equals(driver.getTitle()))
		{
			System.out.println("Page Title is Verified as *View Lead | opentaps CRM* ");
		}
		else
		{
			System.out.println("Page Title is NOT same");
		}
		// Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// Change the company name
		String newCompany = "IBM";

		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompany);

		// Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		// Confirm the changed name appears

		if (driver.findElement(By.id("viewLead_companyName_sp")).getText().contains(newCompany))
		{
			System.out.println("Company name is updated as "+newCompany);
		}
		else
		{
			System.out.println("Company name NOT is updated");
		}

		// Close the browser (Do not log out)
		driver.close();

	}

}
