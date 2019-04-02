package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe2 {
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new FirefoxDriver();
		// Step 1: Navigate to the page with multiple iframes
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		//Step 2: Switch to the first frame and then First Name and Last name
		//element
		driver.switchTo().frame(0);
		
		WebElement firstName = driver.findElement(By.xpath("//INPUT[@name='firstname']"));
		
		WebElement lastName = driver.findElement(By.xpath("//INPUT[@name='lastname']"));
		
		firstName.sendKeys("Supriya");
		lastName.sendKeys("Meshram");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		WebElement imageElement = driver.findElement(By
		.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
				 
		imageElement.click();
		System.out.println("Switching successfull");
		
	}

}
