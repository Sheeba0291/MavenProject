package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8. Select the price range (900-1200)
9. Filter with color Navy 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window
 */


public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeOptions and disable Browser notifications
		ChromeOptions options = new ChromeOptions();

		options.addArguments("-disable-notifications");

		// Launch ChromeDriver
		ChromeDriver driver = new ChromeDriver(options);

		// 1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");

		// Maximize the window
		driver.manage().window().maximize();

		// add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		// 2. Go to Mens Fashion (MouseHover action)
		WebElement mensFashion = driver.findElement(By.xpath("//span[@class='labelIcon']/following::span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();

		// 3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();

		// 4. Get the count of the sports shoes
		String text = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println("Count of Men Sports Shoes :  "+text.replaceAll("//s()", ""));

		// 5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// 6. Sort by Low to High
		driver.findElement(By.xpath("//span[@class='sort-label']/following::i[1]")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();

		// 7. Check if the items displayed are sorted correctly
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//span[@class='lfloat product-price']"))));

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		for (int i=0; i<price.size(); i++)
		{
			System.out.print(price.get(i).getText()+"  ");
		}

		// 8.Select the price range (900-1200)
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");

		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");

		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

		// 9.Filter with color Navy 
		WebElement viewMore = driver.findElement(By.xpath("(//button[text()='View More '])[1]"));
		driver.executeScript("arguments[0].click();", viewMore);
		Thread.sleep(3000);
		WebElement navy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
		driver.executeScript("arguments[0].click();", navy);

		// 10 verify the all applied filters 
		List<WebElement> filters = driver.findElements(By.xpath("//a[@class='clear-filter-pill']"));

		for (int i=0; i<filters.size(); i++)
		{
			System.out.println(filters.get(i).getText());
		}
/*
		// 11. Mouse Hover on first resulting Training shoes
		WebElement firstResult = driver.findElement(By.xpath("//img[@class='product-image wooble']"));

		// driver.executeScript("arguments[0].scrollIntoView();", firstResult);

		try {
			// Actions builder1 = new Actions(driver);
			builder.moveToElement(firstResult).perform();
		} catch (StaleElementReferenceException e) {
			wait.until(ExpectedConditions.stalenessOf(firstResult));
			builder.moveToElement(firstResult).perform();
		}  */

		//Mouse Hover on first resulting Training shoes
		WebElement E3 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(E3).perform();

		// 12. click QuickView button
		// Thread.sleep(3000);
		WebElement quickView = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
		driver.executeScript("arguments[0].click();", quickView);
		/*WebElement quickView = driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
		wait.until(ExpectedConditions.stalenessOf(quickView));
		quickView.click();*/


		// 13. Print the cost and the discount percentage
		System.out.println("Cost : Rs. "+driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println("Discount Percentage : "+driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());

		// 14. Take the snapshot of the shoes.
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snapdeal/ss.png");
		FileUtils.copyFile(src, desc);

		// 15. Close the current window
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		

		// 16. Close the main window
		driver.close();

	}

}
