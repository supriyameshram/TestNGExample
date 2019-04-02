package testngExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefreshExample {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com");
		driver.manage().window().maximize();
		driver.navigate().to(driver.getCurrentUrl());
		driver.quit();
	}

}
