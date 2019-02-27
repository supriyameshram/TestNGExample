set projectpath=D:\ToolsOA\TestNGExample
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\Lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause