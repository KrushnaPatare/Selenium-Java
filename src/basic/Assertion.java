package basic;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.FacebookLoginPage;

public class Assertion {

	
		WebDriver driver;
		
		@BeforeMethod
		public void launchBrowser() {
			driver = Browser.openBrowser("https://www.facebook.com/");
		}
		
		
		@Test ()
		public void loginWithValidCredentials()  {
		
			FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
	
			facebookLoginPage.enterEmail("xyz123@gmail.com");
	
			facebookLoginPage.enterPassword("12345678");

			facebookLoginPage.clickLogin();
			String expectedTitle ="Home Page";
			String actualTitle = driver.getTitle();
			
//               * Hard Assertion *
//      Hard Assertion is used for blocker defect or important functionality.			
//			
//            Assert.assertEquals( actualTitle, expectedTitle);
//            System.out.println("Post Assertion.");
            
//               * Soft Assertion *
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(actualTitle, expectedTitle);
            System.out.println("Post Assertion.");
            softAssert.assertAll();
        
			driver.close();
	}
		
	
	

}
