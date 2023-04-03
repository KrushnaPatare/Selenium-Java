package basic;

import org.openqa.selenium.WebDriver;

import pom.FacebookLoginPage;

public class FacebookLoginTest {
	
	

	public static void loginWithValidCredentials() throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/login/");
		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		
		facebookLoginPage.enterEmail("xyz123@gmail.com");
		
		facebookLoginPage.enterPassword("12345678");
		
		facebookLoginPage.clickLogin();
		
		Thread.sleep(8000);
	    
		driver.close();
}
        
	public static void loginWithoutPassword() throws InterruptedException {
		
        WebDriver driver = Browser.openBrowser("https://www.facebook.com/login/");
		
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        
        facebookLoginPage.enterEmail("xyz123@gmail.com");
		
		facebookLoginPage.clickLogin();
		
	     Thread.sleep(8000);
    
	      driver.close();
	}
	
        public static void loginWithoutEmail() throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/login/");
		
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		
		facebookLoginPage.enterPassword("12345678");
		
		facebookLoginPage.clickLogin();
		
		Thread.sleep(8000);
	    
	      driver.close();
}
	
	
        public static void main(String [] args) throws InterruptedException {
        	
        	FacebookLoginTest.loginWithValidCredentials();
        	Thread.sleep(3000);
        	
        	FacebookLoginTest.loginWithoutPassword();
        	Thread.sleep(3000);
        	
        	FacebookLoginTest.loginWithoutEmail();
        	Thread.sleep(3000);
        
        	
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
