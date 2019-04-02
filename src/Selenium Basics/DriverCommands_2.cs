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
    class DriverCommands_2
    {
        [Test]
        public void test()
        {
            IWebDriver driver = new ChromeDriver();
            driver.Url = "http://www.executeautomation.com/demosite/index.html";
            driver.FindElement(By.XPath("//a[@href='popup.html'][contains(text(), 'HtmlPopup')]")).Click();
            driver.Quit();
        }
    }
}
