package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
1. Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print it
 */

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		// Set up the WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");

		// Maximize the screen
		driver.manage().window().maximize();

		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags",Keys.ENTER);

		// Implicit wait for the webelement.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();

		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		Thread.sleep(5000);

		// Print the count of the items Found.
		// findElements (bags returned), store it in a list and get the size.
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']"));
		
		System.out.println("Count of the items Found : "+findElements.size());

		// Get the list of brand of the products displayed in the page and print the list.
		System.out.println("List of Brands : ");

		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='contentHolder']/div[1]"));

		for (WebElement eachElement : brandNames)
		{
			System.out.println(eachElement.getText());
		}

		System.out.println("*************************************");
		
		// Get the list of names of the bags and print it
		System.out.println("List of Brands : ");

		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='contentHolder']/div[2]"));

		for (WebElement eachElement : bagNames)
		{
			System.out.println(eachElement.getText());
		}

		System.out.println("*************************************");

	}

}
