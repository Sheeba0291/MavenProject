package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

public class CreateLead extends BaseClass{
	@DataProvider(name = "create")
	public String[][] fetchData() throws IOException
	{
		/*
		String[][] data = new String[2][6];
		
		data[0][0] ="VIRTUSA";
		data[0][1] ="Raja";
		data[0][2] ="Sheeba";
		data[0][3] ="Sheee";
		data[0][4] ="QA";
		data[0][5] ="QA Role";
		
		data[1][0] ="CTS";
		data[1][1] ="Karthik";
		data[1][2] ="TR";
		data[1][3] ="Kar";
		data[1][4] ="HR";
		data[1][5] ="HR Role";
		*/
		
		String[][] data = ReadExcel.readData("CreateLead");
		
		return data;
	}

	@Test (dataProvider = "create")
	public void createNewLead(String cmpName, String fName, String lName, String fNLocal, String dep, String desc) 
	{
		// TODO Auto-generated method stub

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpName);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNLocal);

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dep);

		driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);

		driver.findElement(By.name("primaryEmail")).sendKeys("rsheeba.ms@gmail.com");

		WebElement select = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dd = new Select(select);

		dd.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();

		System.out.println("Title of the page is : "+title);
		
		System.out.println("Create Lead - COMPLETED");

	}

}
