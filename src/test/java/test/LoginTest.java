package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {
	
	
	@Test (groups = {"smoke"})
	public void testlogin() throws InterruptedException {
		LoginPage loginpage = new LoginPage(dr);
		ProductsPage productspage = new ProductsPage(dr);
		
		Thread.sleep(3000);
//		loginpage.login("standard_user1", "secret_sauce");//wrong id
//		loginpage.login("standard_user", "secret_sauce1");//wrong password
		loginpage.login("standard_user", "secret_sauce");//Right id and password
		Thread.sleep(3000);
		productspage.logout();
	}
}
   