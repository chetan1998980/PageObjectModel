package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
	
	WebDriver driver;
	
	
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.name("login");
	
	public FbLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void EnterEmail()
	{
		driver.findElement(email).sendKeys("chetan");
	}
	
	public void EnterPass()
	{
		driver.findElement(pass).sendKeys("chetan@123");
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}
	

}
