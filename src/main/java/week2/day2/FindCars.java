package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.zoomcar.com/in/bangalore");

		// driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//div[@class='multiselect__select']")).click();
		
	//	driver.findElement(By.xpath("//span[text()='India']")).click();
		
	//	driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Pick Up City, Airport, Address or Hotel')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Bangalore International Airport')]")).click();
		
		driver.findElement(By.xpath("//span[@class='field-date start-time']")).click();
		
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		
		
		//div[@class='ride-time']
		// driver.findElement(By.xpath("//div[@class='placeholder']"));

	//	driver.findElement(By.xpath("//button[contains(text(),'Find cars')]"));

		// driver.findElement(By.xpath("//button[@class='button-primary']"));
	}

}
