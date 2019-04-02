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
    class DriverCommands
    {
        [Test]
        public void Test()
        {
            IWebDriver driver = new ChromeDriver();

            driver.Url = "http://www.google.com";

            String Title = driver.Title;

            int TitleLength = Title.Length;

            Console.WriteLine("Title of the page is: " +Title);

            Console.WriteLine("Length of Title is : " +TitleLength);

            String PageURL = driver.Url;

            int URLLength = PageURL.Length;

            Console.WriteLine("URL of the page is :" + PageURL);

            Console.WriteLine("Length of the URL is : " + URLLength);

            String PageSource = driver.PageSource;

            int PageSourceLength = driver.PageSource.Length;

            Console.WriteLine("Page Source of the page is : " + PageSource);

            Console.WriteLine("Length of the Page Source is : " + PageSourceLength);

            driver.Quit();
    
        }
    }
}
