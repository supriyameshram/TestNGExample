package dataProviderExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import utility.ExcelUtils;

public class DataProviderWithExcel_001 {

WebDriver driver;

@BeforeMethod

public void beforeMethod() throws Exception {

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.manage().window().maximize();

    driver.get("http://demo.guru99.com/v4/");	 

}

@Test(dataProvider="Authentication")

public void Registration_data(String sUserName,String sPassword)throws  Exception{

driver.findElement(By.name("uid")).sendKeys(sUserName);

System.out.println(sUserName);

driver.findElement(By.name("password")).sendKeys(sPassword);

System.out.println(sPassword);

driver.findElement(By.name("btnLogin")).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

driver.findElement(By.linkText("Log out")).click();

Alert alert = driver.switchTo().alert();

alert.accept();

}

@DataProvider

public Object[][] Authentication() throws Exception{

 Object[][] testObjArray = ExcelUtils.getTableArray("D://ToolsOA//TestNGExample//TestData//TestData.xlsx","Sheet1");

 return (testObjArray);

}

@AfterMethod

public void afterMethod() {

  driver.close();

}

}