package Scenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase1_LoginLogout extends BaseClass
{
	@Test
	public void WithValidCredentials() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		//homepage.accountlisthoverover(driver);
		//homepage.signinfromhomepage();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.un();
		loginpage.cnt();
		loginpage.pwd();
		loginpage.signinclick();
		//homepage.accountlisthoverover(driver);
		homepage.signoutclick();
	}
}
