package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Initialization.BaseClass;

public class LoginPageTestcase extends BaseClass{
	
	@BeforeClass
	public void pageSetup() {
		try {
			homePage.getStatusOfLink();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    @Test
	public void validateLogin() 
	{
		String url = loginPage.doLogin("test@gmail.com", "test123");
		Assert.assertTrue(url.contains("customers"),"Test Fail:Login Fail");
		System.out.println("Test pass: Login completed");
	}
}
