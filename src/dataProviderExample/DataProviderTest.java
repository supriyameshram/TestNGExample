package dataProviderExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	private static WebDriver driver;
	
	@DataProvider(name = "Authentication")
	
	public static Object[][] credentials()
	{
		return new Object[][] { { "mgr123", "mgr!23" }, { "Test@123", "Test@123" }};
	}
	
	@Test(dataProvider = "Authentication")
		
		public void test(String sUsername, String sPassword)
		{
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://demo.guru99.com/v4/");
			
			driver.findElement(By.name("uid")).sendKeys(sUsername);
			
			driver.findElement(By.name("password")).sendKeys(sPassword);
			
			driver.findElement(By.name("btnLogin")).click();
			
			driver.findElement(By.linkText("Log out")).click();
			
			driver.quit();
		}
}
