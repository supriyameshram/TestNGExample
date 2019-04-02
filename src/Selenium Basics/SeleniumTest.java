package testngExample;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	private static FirefoxDriver driver;
	WebElement element;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void valid_UserCredentials()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Supriya");
		driver.findElement(By.name("lastname")).sendKeys("Meshram");		
		driver.findElement(By.id("submit")).click();
	}
	
	@AfterClass
	public static void closeBrowser()
	{
		driver.quit();
	}
}
