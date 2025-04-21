package Generic_Utilities;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {

	public void maximizewebdriver(WebDriver driver) {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	
	}
	
	public void moveToelements(WebDriver driver,WebElement ele) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.click();
		
	}
	
	public static String Takescreenshot(WebDriver driver,String screenshot) throws Throwable {
		
		TakesScreenshot Ts = (TakesScreenshot)driver;
		File src = Ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+screenshot+".png");
		FileUtils.copyFile(src, dest);
		
	
		return dest.getAbsolutePath();
		
		
		
	}

	

	
}
