package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VIRTUSA");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sheeba");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sheee");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Role");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("rsheeba.ms@gmail.com");
		
		WebElement select = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(select);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the page is : "+title);
		
	}

}
