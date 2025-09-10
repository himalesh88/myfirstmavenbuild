package Scenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	
	@FindBy(name="email")
	private WebElement username;
	
	public void un()
	{
		username.sendKeys("9154799127");
	}
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	public void cnt()
	{
		continuebutton.click();
	}
	
	@FindBy(name="password")
	private WebElement password;
	
	public void pwd()
	{
		password.sendKeys("Welcom31");
	}
	
	@FindBy(id="auth-signin-button")
	private WebElement signinfromloginpage;
	
	public void signinclick()
	{
		signinfromloginpage.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
	
