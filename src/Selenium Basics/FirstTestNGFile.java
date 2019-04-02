package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D://ChromeDriver//chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void verifyHomePageTitle() {
	  
	  System.out.println("Launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();
  }
}
