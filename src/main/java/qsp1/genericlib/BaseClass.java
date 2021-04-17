	package qsp1.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements AutoConstant {
	public WebDriver driver;
	public propertyfile p;
	public ExcelData d=new ExcelData();
	public Photo p1 ;
	public Utilies q = new Utilies();
	
	@BeforeMethod
	
	public void openapp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		p = new propertyfile();
		driver.get(p.getPropertyData("srurl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		 int status = r.getStatus();
		 String name = r.getName();
		 if(status==2) {
			 p1= new Photo();
			 p1.getPhoto(driver, name);
			 
		 }
		driver.close();
	}

}
