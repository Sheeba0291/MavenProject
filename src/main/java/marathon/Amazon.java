package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {


		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Image HTML page
		driver.get("https://www.amazon.in/");

		// Maximize the window
		driver.manage().window().maximize();

		// Type "Bags" in the Search box 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");

		Thread.sleep(2000);

		// Choose the third displayed item in the result (bags for boys)
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();

		// Print the total number of results (like 30000)     1-48 of over 30,000 results for "bags for boys" 
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();

		String[] split = text.split("\\s");
		System.out.println(split[3]);

		// Select the first 2 brands in the left menu     
		// Select 1st Brand - American Tourister, Generic)
		driver.findElement(By.xpath("(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[4]//i[1]")).click();

		Thread.sleep(2000);
		// Select 2nd Brand - Generic
		driver.findElement(By.xpath("((//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[4]//i)[2]")).click();

		// Confirm the results have got reduced 
		/*
		 * Get the count of bags after filtered.
		 * Convert the total count and filtered count from String to Integer
		 * Compare both and verify
		*/
		String text2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();

		String[] split2 = text2.split("\\s");
		System.out.println(split2[3]);
		
		int totalBagCount = Integer.parseInt(text);
		int filteredBagCount = Integer.parseInt(text2);
		
		if (totalBagCount > filteredBagCount)
		{
			System.out.println("It is confirmed that the results got reduced.");
		}
		else
		{
			System.out.println("Results are NOT reduced.");
		}
				// Choose New Arrivals (Sort) // Print the first resulting bag info (name, discounted price) 
		// Confirm the color of the 'Deal of the day' is in kind of Red 
		// Click on the First Deal of the day 
		// Confirm the price on previous and this page are same  
		// Take screenshot and close 
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");


	}

}
