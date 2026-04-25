package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Initialization.BaseClass;

public class HomePageTestCase extends BaseClass {
	
	@Test(priority=1)
	public void verifyUrl()
	{
		
		String actUrl = homePage.getAppUrl();
		Assert.assertTrue(actUrl.contains("crm"),"Test Fail: Url not matched");
		System.out.println("Test pass: Url matched");
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String actTitle = homePage.getAppTitle();
		Assert.assertTrue(actTitle.contains("Customer"), "Test Fail! Title is not matched");
		System.out.println("Test pass! Title matched");		
	}
	
	@Test(priority=3)
	public void validateSignInLink()
	{
		String nextPageUrl = null;
		try {
			nextPageUrl = homePage.getStatusOfLink();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail: Login Page not open");
		System.out.println("Test Pass: Application navigating to Login Page");
	}
}
