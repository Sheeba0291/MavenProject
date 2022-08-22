package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


/*
 * Assignment:1 (Leaftaps Application)
=======================
1. Create BaseClass with preCondition() and postCondition() with @BeforeMethod and @AfterMethod 
2. Move the common code from all the 5 testcases into preCondition() and postCondition()
3. Extend the DuplicateLead and MergeLead test cases with BaseClass and execute sequentially and parallely using testng.xml
=============================

Assignment :2
=========
Try applying all the attributes of TestNg in your testcases
Try to apply the today's learnt concepts in your testcases
 */

public class DuplicateLead extends BaseClass{

	@Test()
	public void duplicate_Lead() {

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VIRTUSA");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sheeba");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sheee");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Role");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rsheeba.ms@gmail.com");

		WebElement select = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dd = new Select(select);

		dd.selectByValue("NY");

		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();

		System.out.println("Title of the page is : " + title);

		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).clear();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");

		driver.findElement(By.id("createLeadForm_firstName")).clear();

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujatha M");

		driver.findElement(By.className("smallSubmit")).click();

		String newTitle = driver.getTitle();

		System.out.println("Title of the page is : " + newTitle);
		
		System.out.println("Duplicate Lead -TC Completed");

	}

}
