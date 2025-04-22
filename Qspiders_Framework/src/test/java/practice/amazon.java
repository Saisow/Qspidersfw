package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	//i'm engineer1
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement ip = driver.findElement(By.id("twotabsearchtextbox"));
		
		ip.sendKeys("iPhone");
		
		ip.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String iptext = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (512 GB) - Green']")).getText();
		
		System.out.println(iptext);
		
		
		List<WebElement> allclrs = driver.findElements(By.xpath("//span[text()='Apple iPhone 13 (512 GB) - Green']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
		
		Thread.sleep(3000);
		for(WebElement clrs : allclrs) {
			
			System.out.println(clrs.getAttribute("aria-label"));
		}
		
		
		
		
		
		
		
		

	}

}
