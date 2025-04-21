package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//By using pagefactory
public class productinfopage {

	public productinfopage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="productname")
	private WebElement prdname;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	public void enterprdname(WebDriver driver,String cellvalue) {
		prdname.sendKeys(cellvalue);
		savebtn.click();
		
	}
	
	

}
