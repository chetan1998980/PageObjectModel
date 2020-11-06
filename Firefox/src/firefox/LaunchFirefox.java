package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\firefox\\geckodriver.exe");
	WebDriver driver1=new FirefoxDriver();
	driver1.get("https://www.amazon.in");
	
	//System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Downloads\\firefox\\msedgedriver.exe");
	//WebDriver driver2=new EdgeDriver();
	//driver2.get("https://www.bestbuy.com");

	}

}