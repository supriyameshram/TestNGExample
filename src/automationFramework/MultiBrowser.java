package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser 
{
public WebDriver driver;

@Parameters("browser")

@BeforeClass

public void beforeTest(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))	
	{
		driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("ie"))
	{	
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");	
		
		driver = new InternetExplorerDriver();
	}
	
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	driver.get("http://demo.guru99.com/v4/");
	
	driver.manage().window().maximize();
}
	
	@Test public void login() throws InterruptedException
	{
	driver.findElement(By.name("uid")).sendKeys("mgr123");	
	
	driver.findElement(By.name("password")).sendKeys("mgr!23");
	
	driver.findElement(By.name("btnLogin")).click();
	
	driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass public void afterTest()
	{
		driver.quit();
	}

}
