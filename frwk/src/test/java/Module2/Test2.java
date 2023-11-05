package Module2;

import org.testng.annotations.Test;

import frwk.Input;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Test2 extends Module22 {
	@Test
	public void f() throws InterruptedException {
		max1();
		myClick("mygit").click();
	Thread.sleep(2000);
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
