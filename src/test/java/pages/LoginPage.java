package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver dr;
//	dr.findElement(By.id("user-name")).sendKeys("standard _user"); 
	
	//Locators
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public LoginPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
			
	//Actions
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbtn.click();
	}
}

