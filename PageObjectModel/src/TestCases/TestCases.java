package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.FbLoginPage;
import pages.LoginPage;

public class TestCases {
	
	@Test
	public void varifyLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Chrome\\Latest Chrome Jar File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin/");
		driver.manage().window().maximize();
		
		LoginPage login1=new LoginPage(driver);
		login1.EnterUserName();
		login1.EnterPassword();
		login1.Submit();
	}
	
	@Test
	public void VarifyFBLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Chrome\\Latest Chrome Jar File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		FbLoginPage login2=new FbLoginPage(driver);
		login2.EnterEmail();
		login2.EnterPass();
		login2.login();
	}

}
