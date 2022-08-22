package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDefs.ProjectSpecificMethods;

public class Hooks extends ProjectSpecificMethods{
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Step - "+i+" is running");
	}
	
	@AfterStep
	public void takeSnapShot() throws IOException
	{
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("snaps/cucumber/ss"+i);
		FileUtils.copyFile(src, desc);
		i++;
	}

}
