package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGTest {
	public WebDriver driver;
  @Test
  public void main() {
	 
	  driver.findElement(By.name("uid")).sendKeys("mgr123");
	  driver.findElement(By.name("password")).sendKeys("mgr!23");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println("Login Successfully, now it is the time to Log Off.");
	  driver.findElement(By.linkText("Log out"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://demo.guru99.com/v4/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
