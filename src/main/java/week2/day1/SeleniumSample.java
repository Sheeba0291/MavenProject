package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VIRTUSA");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sheeba");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
		
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(dd);
		
		select.selectByVisibleText("Direct Mail");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		String verifyLeadPage = "View Lead | opentaps CRM";
		
		if (title.equals(verifyLeadPage))
			System.out.println("Verify Lead page is loaded successfully");
					
	//	WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		
	//	String attribute = logout.getAttribute("value");
		
	//	if(attribute.equals("Logout"))
		//	System.out.println("Welcome to Login Page");
		
		// driver.close();
		

	}
}
