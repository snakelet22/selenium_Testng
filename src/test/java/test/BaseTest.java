package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver dr;
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)// alwaysRun ensures setup runs even when filtering groups
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--incognito");
//		    // ✅ This combination completely disables password manager
//		    java.util.HashMap<String, Object> prefs = new java.util.HashMap<>();
//		    prefs.put("credentials_enable_service", false);
//		    prefs.put("profile.password_manager_enabled", false);
//		    prefs.put("profile.password_manager_leak_detection", false);
//		    options.setExperimentalOption("prefs", prefs);
//		    options.addArguments("--disable-notifications");

		    dr = new ChromeDriver(options);
		}

		else if(browser.equalsIgnoreCase("firefox")) dr=new FirefoxDriver();
//		else if (browser.equalsIgnoreCase("ie")) dr= new InternetExplorerDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/");
	}
	private WebDriver getDriver() {
		return null;
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
	    if (dr != null) {
	    	System.out.println("=== TEARDOWN CALLED ===");
	        try {
	            dr.quit();
	        } catch (Exception e) {
	            System.out.println("Browser already closed: " + e.getMessage());
	        }
	    }
	}
}
//	@AfterMethod
//	public void tearDown() {
//		if (dr!=null) {
//			dr.quit();
//		}
//	}
//	
//}
