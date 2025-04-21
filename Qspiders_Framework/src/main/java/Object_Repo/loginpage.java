package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="user_name")
	private WebElement uname;
	
	@FindBy(name="user_password")
	private WebElement pswd;
	
	@FindBy(id="submitButton")
	private WebElement subtn;

	//Without using getters and setters also we can implement
	/*public WebElement getUname() {
		return uname;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getSubtn() {
		return subtn;
	}*/
	
	//Writing bussiness logic inside method
	public void logintoApp(String username,String pswrd) {
		
		uname.sendKeys(username);
		pswd.sendKeys(pswrd);
		subtn.click();
	}

}
