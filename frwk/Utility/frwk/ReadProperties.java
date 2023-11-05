package frwk;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	public File f =null;
	public FileInputStream fis=null;
	public Properties pConfig=null;
	public Properties pTestData=null;
	public File fD =null;
	public FileInputStream fisD=null;
	
	public void readConfigProperties1() {
		try {
			File f = new File("D:\\Satish\\03Eclipse_Workspace\\15Oct2023v1_FRwk\\frwk\\src\\main\\java\\Test Data\\Config1.properties");
			fis = new FileInputStream(f);
			pConfig = new Properties();
			pConfig.load(fis);
			System.out.println("ReadConfig");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void readTestDataProperties1() {
		try {
			File fD = new File("D:\\Satish\\03Eclipse_Workspace\\15Oct2023v1_FRwk\\frwk\\src\\main\\java\\Test Data\\TestData1.properties");
			fisD = new FileInputStream(fD);
			pTestData = new Properties();
			pTestData.load(fisD);
			System.out.println("ReadTestData");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
