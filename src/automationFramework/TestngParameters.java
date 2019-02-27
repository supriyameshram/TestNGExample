package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {
	
	private static WebDriver driver;
	
  @Test
  @Parameters({"sUsername" , "sPassword" })
  public void test(String sUsername, String sPassword) {
	  
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
