package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Button {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Button.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Button HTML page
		driver.get("http://leafground.com/pages/Button.html");
		
		// Maximize the window
		driver.manage().window().maximize();

		// Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		// Return back to Button HTML from Homepage
		driver.navigate().back();
		
		// Find the position of button (x,y)
		/* 
		 * Get the location of the element.
		 * Then, from the location(point), get the x and y co-ordinates. Print it to the user.
		*/
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();

		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X co-ordinate - "+x);
		System.out.println("Y co-ordinate - "+y);
		
		// Find the button color
		String buttonColor = driver.findElement(By.id("color")).getAttribute("style");
		System.out.println("Color of the Button is : "+buttonColor);
		
		// Find the height and width
		Dimension size = driver.findElement(By.id("color")).getSize();
		
		System.out.println("Size of the Web Element is : "+size);
				
		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");

	}

}
