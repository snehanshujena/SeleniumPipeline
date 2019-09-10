package Selenium.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	
	@Test
	public void loginpage() throws InterruptedException
    {
		System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\sdas\\eclipse-workspace\\Project\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost:3001/");
    }
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
}
