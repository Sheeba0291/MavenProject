package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ChromeDriver driver;
	
	/*
	 * Driver Initialization and Chrome Driver Setup
	 * Login to Leaftaps application.
	 */
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void setUp(String url, String userName, String password) {

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		driver = new ChromeDriver();

		// Launch the Leaftaps URL
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();

		// Enter UserName Using Id Locator
		driver.findElement(By.id("username")).sendKeys(userName);

		// Enter Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys(password);

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
