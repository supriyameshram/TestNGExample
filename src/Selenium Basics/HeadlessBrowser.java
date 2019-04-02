package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		unitDriver.get("https://www.google.com/");
		System.out.println("Title of the page: " +unitDriver.getTitle());
		WebElement searchBox = unitDriver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		WebElement button = unitDriver.findElement(By.name("btnG"));
		button.click();
		System.out.println("Title of the page: " +unitDriver.getTitle());
		unitDriver.close();
	}

}
