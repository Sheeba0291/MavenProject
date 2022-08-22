package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Classroom Assignment 1 : Sequential / Parallel 
 * 1) Create a new package (week6.day1) 
 * 2) Copy any 2 working testcases (Leaftaps) to new package 
 * 3) Convert them as TestNG testcases 
 * 4) Create a XML that can run sequentially 
 * 5) Change 2nd testcase browser as firefox / edge 
 * 6) Create a new XML to run in parallel
 */

/*
 * Classroom Assignment 2: 
1) Understand the common test steps that are repeating
2) Push those lines of code to @BeforeMethod and to @AfterMethod
3) Place them inside the common class 'ProjectSpecificMethods'
4) Extend the above class from the testcases (and remove the duplicated code)
5) Run and Confirm - all works fine !
Keep in mind
1) Common class level variable declaration !
2) No duplicate declarations !
*/

/*
 * Classroom Assignment : 3
1) Run one of the test (CreateLead) 2 times
2) Make another test (EditLead) depends on the other test (CreateLead)
    - Confirm the CreateLead (first/dependency test) runs first
    - Confirm the dependent test runs second
    - Then make the dependency / first / createlead to fail using timeout (like 1s)
    - Confirm the dependency gets skipped (7.6.1 --> please change to 7.4.0)
 */

public class DuplicateLead_Old extends ProjectSpecificMethods{

	@Test(dependsOnMethods = "week6.day1.CreateLead.createNewLead")
	public void duplicateLead() {

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
		
		System.out.println("Duplicate Lead - COMPLETED");

	}

}
