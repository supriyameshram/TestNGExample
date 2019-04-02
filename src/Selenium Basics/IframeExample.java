package testngExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.toolsqa.com/iframe-practice-page/");
	    driver.manage().window().maximize();
	    JavascriptExecutor exe =(JavascriptExecutor) driver;
	    Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	    System.out.println("Number of iframes on the page are " +numberOfFrames);
	    
	    List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	    System.out.println("The total number of iframes are " + iframeElements.size());
	    
	    driver.switchTo().frame(0);
	    
	    WebElement first_name = driver.findElement(By.xpath("//INPUT[@name='firstname']"));
	    first_name.sendKeys("supriya");
	    
	    driver.switchTo().defaultContent();
	    driver.get("https://www.toolsqa.com");
	    
	    driver.close();
	}

}
