package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.productinfopage;
import Object_Repo.productpage;
import Object_Repo.productvalidation;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.Reports.class)
public class productcreateTest extends BaseClass {

	@Test(groups = "regression")
	public void createproduct() throws Throwable {
		
			WebDriver_Utility wu = new WebDriver_Utility();
			wu.maximizewebdriver(driver);
			
			productpage pg = new productpage(driver);
			pg.clickonprdlink();
			pg.clickonicon();
			
			
			Excel_Utility eu = new Excel_Utility();
			String prdname =eu.getExcelData("Sheet1", 0, 0);
			System.out.println(prdname);
			
			productinfopage pi = new productinfopage(driver);
			pi.enterprdname(driver, prdname);
			
			productvalidation pv= new productvalidation(driver);
			pv.validateprd(driver, prdname);
			
			
	
		
	}
		
	
}
