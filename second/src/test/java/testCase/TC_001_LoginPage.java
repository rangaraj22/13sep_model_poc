package testCase;

import testBase.BaseClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import org.openqa.selenium.WebDriver;
public class TC_001_LoginPage extends BaseClass {
	
	
	@Test
	void test_login_application() throws InterruptedException
	{
			
		LoginPage lpage = new LoginPage(driver);
		
		
		lpage.SetUserName("raj");
		Thread.sleep(8000);
		lpage.setPassword("123");
	//	Thread.sleep(8000);
		lpage.ClickOnLoginButton();
		//Thread.sleep(8000);
		//lpage.locationselection();
		
		
	
	}
}
