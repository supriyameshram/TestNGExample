using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace ToolsQA
{
    class FirstTestCase
    {
        static void Main(string[] args)
        {
            IWebDriver driver = new ChromeDriver("D:\\ChromeDriver\\chromedriver.exe");
            driver.Url = "http://www.demoqa.com";
        }
    }
}
