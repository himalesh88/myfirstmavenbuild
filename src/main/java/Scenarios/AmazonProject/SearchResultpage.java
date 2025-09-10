package Scenarios.AmazonProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultpage
{
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	private WebElement firstproduct;	
	
	public void clickonfirstproduct() throws InterruptedException
	{
		firstproduct.click();
		
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> iterate= windowids.iterator();
		String parentwindow=iterate.next();
		String childwindow=iterate.next();
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
	}
	
	@FindBy(id="wishListMainButton")
	private WebElement selecttowishlist;
	
	public void producttowishlist() throws InterruptedException
	{
		selecttowishlist.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//button[@class=' a-button-close a-declarative']")
	private WebElement wishlistwindowclose;
	
	public void wishlistwindowclose() throws InterruptedException
	{
		wishlistwindowclose.click();
		Thread.sleep(3000);
	}
	
	
	public SearchResultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
