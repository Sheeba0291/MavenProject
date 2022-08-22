package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
Assignment 
1_ Open Chrome 
2_ Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
3_ Click TryIt (note: this is inside frame) 
4_ Click Cancel on the alert 
5_ Print the resulting text
*/
public class Frames {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Button.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chrome driver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Button HTML page
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		// Maximize the window
		driver.manage().window().maximize();

		// Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		// Click on TryIt
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Switch to Alert
		Alert alert = driver.switchTo().alert();
		
		// Cancel the alert
		alert.dismiss();
		
		//Print the Text
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		// Come out of the Frame
		driver.switchTo().defaultContent();

		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
