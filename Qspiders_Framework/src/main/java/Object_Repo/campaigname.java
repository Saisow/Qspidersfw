package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaigname {
	
	public campaigname(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="campaignname")
	private WebElement cname;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	public void entercampaigname(String cellvalue) {
		cname.sendKeys(cellvalue);
		savebtn.click();
		
		
	}
}
