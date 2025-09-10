package Scenarios.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class HomePage
{
	WebDriver driver;
	
	//Explicit Wait
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
	
	//Fluent Wait
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(1)).ignoring(NullPointerException.class).ignoring(NoSuchElementException.class);
		
	/*@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountlist;	
	
	public void accountlisthoverover(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(accountlist));
		Actions a=new Actions(driver);
		a.moveToElement(accountlist).perform();	
	}
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signin;
	
	public void signinfromhomepage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}*/
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	public void signoutclick() throws InterruptedException
	{
		Thread.sleep(2000);
		signout.click();
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;	
	
	public void productsearch()
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("shoe"+Keys.ENTER);
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
