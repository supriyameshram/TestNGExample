package testngExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_List {
public static void main(String[] args) throws InterruptedException
{	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-form");
	Select oSelect = new Select(driver.findElement(By.id("continents")));
	oSelect.selectByIndex(1);
	Thread.sleep(2000);
	oSelect.selectByVisibleText("Africa");
	Thread.sleep(2000);
	List<WebElement> oSize = oSelect.getOptions();
	int iListSize = oSize.size();
	
	for(int i=0;i<iListSize; i++)
	{
		String sValue = oSelect.getOptions().get(i).getText();
		System.out.println(sValue);
		if(sValue.equals("Africa"))
		{
			oSelect.selectByIndex(i);
			break;
		}
	}
driver.quit();
}
}
