package Initialization;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import Pages.HomePage;
import Pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;
	public LoginPage loginPage;

	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}
}