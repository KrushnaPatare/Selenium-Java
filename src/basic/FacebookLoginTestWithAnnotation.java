package basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.FacebookLoginPage;

public class FacebookLoginTestWithAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver = Browser.openBrowser("https://www.facebook.com/");
	}
	
	
	@Test ()
	public void loginWithValidCredentials() throws InterruptedException {
	
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		Thread.sleep(2000);
		facebookLoginPage.enterEmail("xyz123@gmail.com");
	    Thread.sleep(2000);
		facebookLoginPage.enterPassword("12345678");
		Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		Thread.sleep(8000);
		driver.close();
}
	
	@Test(enabled=false)
	public void loginWithoutPassword() throws InterruptedException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        Thread.sleep(2000);
        facebookLoginPage.enterEmail("xyz123@gmail.com");
        Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		Thread.sleep(8000);
		driver.close();

}
	
	@Test(enabled=false)
        public void loginWithoutEmail() throws InterruptedException {
	
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        Thread.sleep(2000);
		facebookLoginPage.enterPassword("12345678");
		Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		Thread.sleep(8000);
		driver.close();

}
	@Test
	public void signupWithValidCredentials() {
	
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
	
		facebookLoginPage.clickSignUp();
		
		facebookLoginPage.enterFirstname( driver, "Krushna");
		
		driver.close();
}
}