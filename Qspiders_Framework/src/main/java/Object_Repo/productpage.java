package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage {
	
	private By prdlink = By.linkText("Products");
	private By icon = By.xpath("//img[@alt='Create Product...']");
	private WebDriver driver;
	
	
	public productpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Methods to interact with web elements
	
	public void clickonprdlink() {
		
		driver.findElement(prdlink).click();
		
	}
	
	public void clickonicon(){
		
		driver.findElement(icon).click();
	}
}
