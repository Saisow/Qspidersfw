package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignlink {
	
	public campaignlink(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="More")
	WebElement morelink;
	
	@FindBy(linkText="Campaigns")
	WebElement clink;
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	WebElement clickicon;
	
	public void createcampaign() {
		
		morelink.click();
		clink.click();
		clickicon.click();
	}
	
	

}
