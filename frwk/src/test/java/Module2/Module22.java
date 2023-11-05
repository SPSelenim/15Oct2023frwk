package Module2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frwk.Input;


public class Module22 extends Input {
	
public void max1()
{
	driver.manage().window().maximize();
}
	
public WebElement myClick(String name)
{
	WebElement x=null;
	
	try {
		 x = driver.findElement(By.xpath(pTestData.getProperty(name)));
Thread.sleep(2000);
		return x;
	} catch (Exception e) {
System.out.println(e.getMessage());
	}
	return x;
}
}
