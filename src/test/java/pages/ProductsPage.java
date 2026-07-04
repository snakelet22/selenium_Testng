package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {


	WebDriver dr;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement MenuBar;
		
	@FindBy(id="logout_sidebar_link") 
	WebElement logoutbtn;
	
	public ProductsPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void  logout() throws InterruptedException {
		MenuBar.click();
		Thread.sleep(1000);
		logoutbtn.click();
		
	}
//	public void logout() throws InterruptedException {
//	    MenuBar.click();
//	    Thread.sleep(1000);
//	    logoutbtn.click();
//	    System.out.println("=== LOGOUT CLICKED ===");
//	    Thread.sleep(2000); // wait 2 seconds after logout
//	    System.out.println("=== CURRENT URL: " + dr.getCurrentUrl() + " ===");
//	    // if browser was closed, dr.getCurrentUrl() would throw an exception
//	    // if browser is open, it prints the URL
//	}

}
