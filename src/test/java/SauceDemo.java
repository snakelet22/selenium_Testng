import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
	WebDriver dr;
	
	@Test
	public void setup() throws InterruptedException {
	dr = new ChromeDriver();
	dr.get("https://www.saucedemo.com/");
	dr.findElement(By.id("user-name")).sendKeys("problem_user");
	dr.findElement(By.id("password")).sendKeys("secret_sauce");
	dr.findElement(By.id("login-button")).click();
	Thread.sleep(3000);
	dr.quit();
	}
	
}
