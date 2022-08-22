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
2. Click on the toggle menu button from the left corner 
3. Click View All and click Individuals from App Launcher  
4. Click on the Individuals tab  
5. Search the Individuals 'Kumar' 
6. Click on the Dropdown icon and Select Edit 
7.Select Salutation as 'Mr' 
8.Enter the first name as 'Ganesh'. 
9. Click on Save and Verify the first name as 'Ganesh'

 */

public class Edit_Individual {

	public static void main(String[] args) throws IOException, InterruptedException {
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

		// 3. Click view All and click Individuals from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));

		// used JS executor scroll into view bcos it was not scrolling the page and throeing ClickIntercepted Exception.
		driver.executeScript("arguments[0].scrollIntoView();", individuals);

		individuals.click();

		// 4. Click on the Dropdown icon in the Individuals tab
		WebElement individualsTab = driver.findElement(By.xpath("//span[text()='Individuals']"));
		//bcos it is a JS script, used JavaScript Executor click
		driver.executeScript("arguments[0].click();", individualsTab);

		// 5. Search the Individuals 'Kumar' 
		driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys("Kumar",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys(Keys.ENTER);

		// 6. Click on the Dropdown icon and Select Edit

		WebElement dd = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
		
		Thread.sleep(10000);
		wait.until(ExpectedConditions.stalenessOf(dd));
		
		dd.click();

		WebElement edit = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);

		// 7.Select Salutation as 'Mr'
		

		/*
		 * 6. Click on the Dropdown icon and Select Edit 
 
8.Enter the first name as 'Ganesh'. 
9. Click on Save and Verify the first name as 'Ganesh'
		 */

		/*
		//	5. Click on New Individual
		driver.findElement(By.xpath("//div[text()='New']")).click();

		// 6. Enter the Last Name as 'Kumar'
		String lastName = "Kumar";
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);

		// 7. Click save and verify Individuals Name
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String lastNameCaptured = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();

		if(lastNameCaptured.equals(lastName))
		{
			System.out.println("Individual Name Verified");
		}
		else
		{
			System.out.println("Individual Name MIS-MATCH");
		}

		// Capture Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/marathon_day2/individual.png");
		FileUtils.copyFile(src, desc);

		System.out.println("Screenshot captured."); */


	}

}
