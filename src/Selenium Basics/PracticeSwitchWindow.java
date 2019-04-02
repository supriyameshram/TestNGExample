package testngExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {
public static WebDriver driver;
public static void main(String[] args)
{	
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	driver.findElement(By.xpath("//BUTTON[@onclick='newMsgWin()']")).click();
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles);
	
	for(String handle1 : driver.getWindowHandles())
	{
		System.out.println(handles);
		driver.switchTo().window(handle1);
	}
	driver.close();
	driver.quit();
}
}
