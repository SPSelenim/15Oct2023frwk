package Module1;

import org.testng.annotations.Test;

import frwk.Input;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Test1 extends Module11 {
	@Test
	public void f() throws InterruptedException {
		max1();
		sendkeys1("firstname").sendKeys("Helllllllo");
		sendkeys1("lastname").sendKeys("Helllllllo");

	}

	@Test
	public void f1() throws InterruptedException {
		max1();
		sendkeys1("firstname").clear();
		sendkeys1("firstname").sendKeys("222222");
		sendkeys1("lastname").clear();
		sendkeys1("lastname").sendKeys("333333");

	}

	@BeforeClass
	public void beforeClass() {
		InputInit();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();

	}

}
