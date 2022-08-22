package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethods{

	@Given ("Type the username as {string}")
	public void typeUserName(String userName)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@And ("Type the password as {string}")
	public void typePassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When ("Click on the Login Button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then ("Verify the Homepage is displayed")
	public void verifyHomePage()
	{
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
		{
			System.out.println("Home Page is verified");
		}
		else
		{
			System.out.println("Home Page is NOT verified");
		}
	} 

	@But ("Verify the Error message is displayed")
	public void verifyErrorMessage()
	{
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.err.println(text);
	}
}
