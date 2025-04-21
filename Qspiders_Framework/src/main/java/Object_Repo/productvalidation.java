
package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class productvalidation {

	public productvalidation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void validateprd(WebDriver driver,String prdname) {
		
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();

		Assert.assertEquals(actData, prdname);
		System.out.println("ASSERT PASS");
		
	}
	
	
	
	
}
