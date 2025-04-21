package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import Object_Repo.HomePage;
import Object_Repo.LoginPage;
import Object_Repo.loginpage;

public class BaseClass {
	
	public static WebDriver sdriver;
	public WebDriver driver;
	public WebDriver_Utility wb;
	CommonDataFile cf;
	@BeforeSuite(groups = { "smokeTest", "regressionTest", "sanityTest" })
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}

	@BeforeTest(groups = { "smokeTest", "regressionTest", "sanityTest" })
	public void beforeTest() {
		System.out.println("Parallel Exceution ");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smoke","regression"})
	public void BC() throws Throwable {
		
		cf = new CommonDataFile();
		String browser = cf.getPropertiesData("browser");
		
		//String browser = System.getProperty("browser");
		switch(browser) {
		
		case "chrome" :
			
			driver = new ChromeDriver();
			break;
			
		case "edge" :
			
			driver = new EdgeDriver();
			break;
			
		case "Firefox" :
			
			driver = new FirefoxDriver();
			break;
		
		}
		
		sdriver = driver;
		
	}
	
		
	@BeforeMethod(groups= {"smoke","regression"})
		public void BM() throws Throwable {
			
		CommonDataFile flib = new CommonDataFile();
        String URL = flib.getPropertiesData("url");
		String USERNAME = flib.getPropertiesData("username");
		String PASSWORD = flib.getPropertiesData("password");

		// reading from cmd prompt
//		String URL = System.getProperty("url");
//		String USERNAME = System.getProperty("username");
//		String PASSWORD = System.getProperty("password");

		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizewebdriver(driver);

		driver.get(URL);

		// Business Logics
		loginpage login = new loginpage(driver);
		login.logintoApp(USERNAME, PASSWORD);
		System.out.println("log into application");
		}	
	
	@AfterMethod(groups= {"smoke","regression"})
	
	public void tearDown() {
		HomePage hp = new HomePage(driver);
		hp.signOut();
		System.out.println("closing this testcase");
	}
		
	@AfterClass(groups = { "smokeTest", "regressionTest", "sanityTest" })
	public void afterClass() {
		driver.quit();
		System.out.println("close the browser");
	}

	@AfterTest(groups = { "smokeTest", "regressionTest", "sanityTest" })
	public void afterTest() {
		
		System.out.println("close parallel execution");
	}

	@AfterSuite(groups = { "smokeTest", "regressionTest", "sanityTest" })
	public void afterSuite() {
		
		System.out.println("Close the DataBase");
	}
	}

	

