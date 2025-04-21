package testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repo.campaigname;
import Object_Repo.campaignlink;
import Object_Repo.productinfopage;
import Object_Repo.validatecampaigname;

public class campaigncreateTest extends BaseClass {
	
		@Test (groups = "smoke")
		public void campaigncreate() throws Throwable  {
			
			WebDriver_Utility wu = new WebDriver_Utility();
			wu.maximizewebdriver(driver);
			
			campaignlink cl = new campaignlink(driver);
			cl.createcampaign();
			
			Excel_Utility eu = new Excel_Utility();
			String campaigname = eu.getExcelData("sheet1", 0, 1);
			System.out.println(campaigname);
			
			campaigname cn = new campaigname(driver);
			cn.entercampaigname(campaigname);
			
			validatecampaigname vc = new validatecampaigname(driver);
			vc.validatecampaign(driver, campaigname);
			
			//Assert.fail();
			
			
		}

}
