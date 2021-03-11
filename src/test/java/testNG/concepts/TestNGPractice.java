package testNG.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.postgresql.Driver;
import org.testng.annotations.BeforeMethod;

public class TestNGPractice {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This method executes before each Test");
		driver = new ChromeDriver();
		driver.get("https");
		
		
		
		
	}
 
	
	
	
	
	

}
