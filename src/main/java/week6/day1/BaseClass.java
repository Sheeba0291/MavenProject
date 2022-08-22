package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ChromeDriver driver;
	
	/*
	 * Driver Initialization and Chrome Driver Setup
	 * Login to Leaftaps application.
	 */
	@BeforeMethod
	public void setUp() {

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		driver = new ChromeDriver();

		// Launch the Leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the window
		driver.manage().window().maximize();

		// Enter UserName Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// Enter Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	/*
	 * Close all the browsers
	 */
	@AfterMethod
	public void tearDown()
	{
		// Close all the Browsers
		driver.quit();
	}
}
