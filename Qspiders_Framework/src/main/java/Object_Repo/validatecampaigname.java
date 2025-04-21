package Object_Repo;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class validatecampaigname {
	
	public validatecampaigname(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id="mouseArea_Campaign Name")
	String vacname;
	
	public void validatecampaign(WebDriver driver , String campaigname ) {
		
		String campnaame = vacname;
	
		Assert.assertEquals(vacname,campnaame );
	}

}
