package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLeadsPage extends ProjectSpecificMethods{

	@And ("Click Create Lead Link")
	public void clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And ("Click Find Leads Link")
	public void clickFindLeads()
	{
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	
	@And ("Click Merge Leads Link")
	public void clickMergeLeads()
	{
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
	}
	
}
