package Scenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase3_LoginSearchWishlistLogout extends BaseClass
{
	@Test
	public void WithValidCredentials() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountlisthoverover(driver);
		homepage.signinfromhomepage();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.un();
		loginpage.cnt();
		loginpage.pwd();
		loginpage.signinclick();
		
		homepage.productsearch();		
		
		SearchResultpage searchpage=new SearchResultpage(driver);
		searchpage.clickonfirstproduct();
		searchpage.producttowishlist();
		
		homepage.accountlisthoverover(driver);
		homepage.signoutclick();
	}
}
