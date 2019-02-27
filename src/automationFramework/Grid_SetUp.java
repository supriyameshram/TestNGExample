package automationFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_SetUp {
	public static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		String URL = "http://demo.guru99.com/v4/";
		String Node = "http://10.222.126.150:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		driver = new RemoteWebDriver(new URL(Node), cap);
		
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
	}
			
	}

