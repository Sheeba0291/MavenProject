package marathon;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) {


		// Setup WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create the chromedriver ob
	// 	ject named driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the LeafGround Image HTML page
		driver.get("https://in.bookmyshow.com/");

		// Maximize the window
		driver.manage().window().maximize();

		// Print a message to the user in the console.
		System.out.println("***** ALL THE STEPS WERE EXECUTED SUCCESSFULLY *****");


	}

}
