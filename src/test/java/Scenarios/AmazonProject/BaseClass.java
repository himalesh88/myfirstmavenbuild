package Scenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
