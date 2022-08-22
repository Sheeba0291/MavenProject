package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethods{

	@And ("Click Leads Hyperlink")
	public void clickLeadsLink()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
}
