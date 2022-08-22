package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethods{
		
		@Given ("Click CRMSFA")
		public void clickCRMSFA()
		{
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		@And ("Click Leads Hyperlink")
		public void clickLeadsLink()
		{
			driver.findElement(By.linkText("Leads")).click();
		}
		
		@And ("Click Create Lead Link")
		public void clickCreateLead()
		{
			driver.findElement(By.linkText("Create Lead")).click();
		}
		
		@And ("Type CompanyName as (.*)$")
		public void typeCompanyName(String companyName)
		{
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		}
		
		@And ("Type FirstName as (.*)$")
		public void typeFirstName(String firstName)
		{
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		}
		
		@And ("Type LastName as (.*)$")
		public void typeLastName(String lastName)
		{
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		}
		
		@When ("Click CreateLead button")
		public void clickSubmit()
		{
			driver.findElement(By.className("smallSubmit")).click();
		}
		
		@Then ("Verify Page Title")
		public void verifyPageTitle()
		{
			String title = driver.getTitle();
			driver.getTitle();

			if (title.contains("View Lead"))		
			{
				System.out.println("Page Title is Verified as *View Lead | opentaps CRM* ");
			}
			else
			{
				System.out.println("Page Title is NOT same");
			}
		}

}
