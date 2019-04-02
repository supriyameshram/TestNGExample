using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ToolsQA.Selenium_Basics
{
    class DropDownAndSelectOperations
    {
        [Test]
        public void test()
        {
            IWebDriver driver = new ChromeDriver();

            driver.Url = "http://www.executeautomation.com/demosite/index.html#";

            SelectElement oSelection = new SelectElement(driver.FindElement(By.Id("TitleId")));

            oSelection.SelectByText("Ms.");

            Thread.Sleep(2000);

            oSelection.SelectByIndex(1);

            Thread.Sleep(2000);

            IList<IWebElement> oSize = oSelection.Options;

            int iListSize = oSize.Count;

            for(int i = 0; i < iListSize; i++)
            {
                String sValue = oSelection.Options.ElementAt(i).Text;

                Console.WriteLine("Value of the Select item is : " + sValue);

                if(sValue.Equals("Ms."))
                {
                    oSelection.SelectByIndex(i);
                    break;
                }
            }


            driver.Close();
          
        }

    }
}
