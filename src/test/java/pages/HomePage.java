package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends ProjectSpecificMethods{

	@Given ("Click CRMSFA")
	public void clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
