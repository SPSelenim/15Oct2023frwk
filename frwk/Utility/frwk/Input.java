package frwk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Input extends ReadProperties {

	public WebDriver driver = null;
	public 	String myApplication = "file:///D:/Satish/05DemoApps/demo.html";

	public void InputInit()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get(myApplication);
readConfigProperties1();
readTestDataProperties1();
		
		}
		catch(Exception e)
		
		{
			System.out.println(e.getMessage());
		}
	}
}
