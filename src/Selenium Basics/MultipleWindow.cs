using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ToolsQA.Selenium_Basics
{
    class MultipleWindow
    {   
        [Test]
        public void Test()
        {
            IWebDriver driver = new ChromeDriver();

            driver.Url = "https://www.toolsqa.com/automation-practice-switch-windows/";

            String parentWindowHandle = driver.CurrentWindowHandle;

            Console.WriteLine("Parent window's handle -> " + parentWindowHandle);

            IWebElement clickElement = driver.FindElement(By.Id("button1"));

            for(int i=0;i<3;i++)
            {
                clickElement.Click();
                Thread.Sleep(3000);
            }

            List<string> lstWindow = driver.WindowHandles.ToList();
            foreach(var handle in lstWindow)
            {
                Console.WriteLine(handle);
            }

        }
    }
}
