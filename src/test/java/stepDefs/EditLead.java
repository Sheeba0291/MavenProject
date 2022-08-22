package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethods{
	
	String companyName;
	
	@And ("Click Find Leads Link")
	public void clickFindLeads()
	{
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	
	@And ("Enter First name as {string}")
	public void enterFirstName(String firstName)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}
	
	@And ("Click Find leads button")
	public void clickFindLeadButon()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And ("Click on first resulting lead")
	public void clickFirstLead() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
	}
	
	@And ("Click Edit")
	public void clickEdit()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@And ("Change the company name as (.*)$")
	public void updateCompanyName(String newCompany)
	{
		companyName = newCompany;
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompany);
	}
	
	@When ("Click Update")
	public void clickUpdate()
	{
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	@Then ("Confirm the changed name appears")
	public void confirmNameUpdated()
	{
		
		if (driver.findElement(By.id("viewLead_companyName_sp")).getText().contains(companyName))
		{
			System.out.println("Company name is updated as "+companyName);
		}
		else
		{
			System.out.println("Company name NOT is updated");
		}
	}

		
}
