package basic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.FacebookLoginPage;

public class FacebookLoginTestWithAnnotationScreenshot {

WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver = Browser.openBrowser("https://www.facebook.com/login/");
	}
	
	@AfterMethod
	public void screenshot() throws IOException, InterruptedException {
        Thread.sleep(8000);
		Picture.photo(driver);
		driver.close();
	}
	
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
	
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		Thread.sleep(2000);
		facebookLoginPage.enterEmail("xyz123@gmail.com");
	    Thread.sleep(2000);
		facebookLoginPage.enterPassword("12345678");
		Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		
}
	
	@Test
	public void loginWithoutPassword() throws InterruptedException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        Thread.sleep(2000);
        facebookLoginPage.enterEmail("xyz123@gmail.com");
        Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		
}
	
	@Test
        public void loginWithoutEmail() throws InterruptedException {
	
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        Thread.sleep(2000);
		facebookLoginPage.enterPassword("12345678");
		Thread.sleep(2000);
		facebookLoginPage.clickLogin();
		
}
}
