package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/*
 * MARATHON DAY-02
Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Search the Opportunity 'Salesforce Automation by *Your Name*'
6. Click on the Dropdown icon and Select Edit
7. Choose close date as Tomorrow date
8. Select 'Stage' as Perception Analysis
9. Select Deliver Status as In Progress
10. Enter Description as SalesForce
11. Click on Save and Verify Stage as Perception Analysis
 */

public class Edit_Opportunitity {

	public static void main(String[] args) throws IOException {
		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-disable-notifications");

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver(options);

		// 1. Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");

		// Maximize the window
		driver.manage().window().maximize();

		// 2. Login with username as "ramkumar.ramaiah@testleaf.com " 
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		// password as "Password$123"
		driver.findElement(By.id("password")).sendKeys("India$321");

		// click on the login button
		driver.findElement(By.id("Login")).click();

		// Implicit wait for the WebElement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// 3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		// 4. Click on Opportunity tab
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		//bcos it is a JS script, used JavaScript Executor click
		driver.executeScript("arguments[0].click();", opportunityTab);
		
		// 5. Search the Opportunity 'Salesforce Automation by *Your Name*'
		String opportunityName = "Salesforce Automation by SHEEBA";
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(opportunityName,Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(Keys.ENTER);
		
		// 6. Click on the Dropdown icon and Select Edit
		
		WebElement dd = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.stalenessOf(dd));
		dd.click();
		
		WebElement edit = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);
		
		// 7. Choose close date as Tomorrow date
		
		
		/*
		
		
		
		8. Select 'Stage' as Perception Analysis
		9. Select Deliver Status as In Progress
		10. Enter Description as SalesForce
		11. Click on Save and Verify Stage as Perception Analysis

		// 5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();

		// 6. Enter Opportunity name as 'Salesforce Automation by *Your Name*,
		// Get the text and Store it
		String opportunityName = "Salesforce Automation by SHEEBA";
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]")).sendKeys(opportunityName);

		// 7. Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();

		// 8. Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();

		// 9. click Save and VerifyOppurtunity Name
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String opportunityNameCaptured = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();

		if(opportunityNameCaptured.equals(opportunityName))
		{
			System.out.println("Opportunity Name Verified");
		}
		else
		{
			System.out.println("Opportunity Name MIS-MATCH");
		}

		// Capture Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/marathon_day2/opportunity.png");
		FileUtils.copyFile(src, desc);
		
		System.out.println("Screenshot captured.");
		
		*/
	}

}
