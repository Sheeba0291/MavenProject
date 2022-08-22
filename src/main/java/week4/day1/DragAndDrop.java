package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
Assignment 
1_ Open Chrome 
2_ Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
3_ Click TryIt (note: this is inside frame) 
4_ Click Cancel on the alert 
5_ Print the resulting text
*/
public class DragAndDrop {

	public static void main(String[] args) {
		// Refer to http://leafground.com/pages/Button.html for assignment details.

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chrome driver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Button HTML page
		driver.get("https://jqueryui.com/droppable/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Switch to the frame
		driver.switchTo().frame(0);

		// Source web element
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		// Target web element
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		// Print the text before dropping
		System.out.println("Before dropping -> "+driver.findElement(By.id("droppable")).getText());
		
		// Actions class to do drag and drop
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(draggable, droppable).perform();
		
		// Print the text after dropping
		System.out.println("After dropping -> "+driver.findElement(By.id("droppable")).getText());

	}

}
