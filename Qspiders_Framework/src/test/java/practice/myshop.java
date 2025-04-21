package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myshop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account#account-creation");
		driver.findElement(By.id("email_create")).sendKeys("sai1196@gmail.com");
		   driver.findElement(By.id("SubmitCreate")).click();

           // Wait for the form to load
           Thread.sleep(3000);

           // Step 4: Fill out personal information
           driver.findElement(By.id("id_gender1")).click(); // Mr
		//driver.findElement(By.name("email_create")).click(); 
		//driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		
	}	
}


