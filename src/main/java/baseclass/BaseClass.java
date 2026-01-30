package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.awwwards.com/websites/e-commerce/");
	}
	
	@AfterClass
	public void terminate() {
		driver.quit();
	}

}
