package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.StaleElementReferenceException;
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
5. Click the sort arrow in the Name 
6. Verify the Individuals displayed in ascending order by Name.
 */

public class Sort_Individual {

	public static void main(String[] args) {
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
		WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));

		// used JS executor scroll into view bcos it was not scrolling the page and throeing ClickIntercepted Exception.
		driver.executeScript("arguments[0].scrollIntoView();", individuals);

		individuals.click();
		
		// 4. Click on the Individuals tab 
		WebElement individualsTab = driver.findElement(By.xpath("//span[text()='Individuals']"));
		//bcos it is a JS script, used JavaScript Executor click
		driver.executeScript("arguments[0].click();", individualsTab);

		//	5. Click the sort arrow in the Name 
		WebElement sortName = driver.findElement(By.xpath("(//span[text()='Sort'])[1]"));
		driver.executeScript("arguments[0].click();", sortName);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
		
		
		//	6. Verify the Individuals displayed in ascending order by Name.
		List<WebElement> individual = driver.findElements(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a"));
		
//		wait.until(ExpectedConditions.stalenessOf(individual.get(0)));
		
		List<String> individualNameSorted = new ArrayList<String>();
		List<String> individualNameDisplayed = new ArrayList<String>();
		String str = "";
		
		for(int i=0; i<individual.size(); i++)
		{
			try {
				str = individual.get(i).getText();
				individualNameSorted.add(i,str );
				individualNameDisplayed.add(i, str);
			} catch (StaleElementReferenceException e) {
				
				System.out.println("StaleElementReferenceException is THROWN");
				wait.until(ExpectedConditions.stalenessOf(individual.get(i)));
				str = individual.get(i).getText();
				individualNameSorted.add(i,str );
				individualNameDisplayed.add(i, str);
			}
		}
		
		Collections.sort(individualNameSorted);
		
		boolean isSorted = individualNameSorted.equals(individualNameDisplayed);
		
		if (isSorted)
		{
			System.out.println("Individuals are displayed in ascending order by Name");
		}
		else
		{
			System.out.println("Individuals are NOT sorted by Name");
		}

	}

}
