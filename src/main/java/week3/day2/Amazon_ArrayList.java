package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	/*
	 * 1) Go to https://amazon.in
	 * 2) Type phones
	 * 3) Print price of every phone
	 * 4) Print the lowest price !
	 * Time: 20 minutes	
	 * Hints: 	
	 * Look what is common locator for all price info of every phone. 
	 * Use Collection sort to get the lowest price 
	 * (make sure the stored values are in Integer to support sorting) Integer.parseInt
	 */
public class Amazon_ArrayList {

	public static void main(String[] args) throws InterruptedException {
		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver object named driver
		ChromeDriver driver = new ChromeDriver();

		// Go to https://amazon.in
		driver.get("https://www.amazon.in/");

		// Maximize the window
		driver.manage().window().maximize();

		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);

		// Print price of every phone
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> price = new ArrayList<Integer>();

		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			text = text.replace(",", "");
			int parseInt = Integer.parseInt(text);
			System.out.println(text);
			price.add(parseInt);

		}

		Collections.sort(price);
		System.out.println("The Lowest priced phone - Rs." + price.get(0));
		Thread.sleep(2000);

	}

}
