import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Google3 {
WebDriver dr;
	 
	@Test(groups= {"smoke","Regression"})
	public void googlesearch() throws InterruptedException {
	dr = new ChromeDriver();
	dr.get("https://www.google.com/");
	dr.findElement(By.name("q")).sendKeys("Meaning of Mahabharath");
	Actions actions = new Actions(dr);
	actions.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);
	dr.quit();
	}
}
