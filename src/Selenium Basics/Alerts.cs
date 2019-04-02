using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ToolsQA.Selenium_Basics
{
    class Alerts
    {   
        [Test]
        public void Test()
        {
            IWebDriver driver = new ChromeDriver();
            driver.Url = "http://www.executeautomation.com/demosite/index.html#";
            driver.Manage().Window.Maximize();
            driver.FindElement(By.XPath("//input[@name='generate']")).Click();
            IAlert alert = driver.SwitchTo().Alert();
            string alerttext = alert.Text;
            Console.WriteLine("Alert Text is:" + alerttext);
            alert.Dismiss();
            driver.Quit();
            
        }
    }
}
