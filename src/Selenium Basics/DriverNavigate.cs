using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.IE;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ToolsQA.Selenium_Basics
{
    class DriverNavigate
    {
        [Test]
        public void test()
        {
            IWebDriver driver = new InternetExplorerDriver();
            driver.Navigate().GoToUrl("http://www.executeautomation.com/demosite/index.html");
            driver.FindElement(By.XPath("//SPAN[text()='Logout']"));
            driver.Navigate().Back();
            driver.Navigate().Forward();
            driver.Navigate().Refresh();
            driver.Close();

        }
    }
}
