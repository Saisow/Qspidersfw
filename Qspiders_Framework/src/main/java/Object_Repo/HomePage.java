package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.WebDriver_Utility;

public class HomePage {
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	
	@FindBy(css = "[src='themes/softed/images/user.PNG']")
	private WebElement admLink;

	public void signoutfromapp(WebDriver driver) {
			
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.moveToelements(driver, admLink);
		signOut.click();
		
	}

	public void signOut()
	{
		admLink.click();
		signOut.click();
	}
	

}
