package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage {
		
		@FindBy (xpath = "//input[@id='email']") private WebElement email;// @FindBy annotation is used to find element
		@FindBy (xpath = "//input[@id='pass']") private WebElement password;
		@FindBy (xpath = "//button[@value='1']") private WebElement login;
		@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgot;
		@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement signUp;
		@FindBy (xpath = "//input[@name='firstname']") private WebElement firstname;
		
		public FacebookLoginPage(WebDriver driver) { //when we make constructor, the code in it runs first.
			
			PageFactory.initElements(driver, this); // .initElements() triggers all @FindBy
			
		}
		
		public void enterEmail(String mail) {
			
			email.sendKeys(mail);
			
		}
		
        public void enterPassword(String pass) {
			
			password.sendKeys(pass);
			
		}
        
        public void clickLogin() {
			
			login.click();
			
		}
        
       public void clickForgot() {
			
			forgot.click();
			
		}
        
       public void clickSignUp() {
			
			signUp.click();
			
		}
        
//       public void enterFirstname( WebDriver driver, String name ) {
//			
//    	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.visibilityOf(firstname));
//    	   firstname.sendKeys(name);
//			
//		}
        
       public void enterFirstname( WebDriver driver, String name ) {
			
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofMillis(30000));
    	wait.pollingEvery(Duration.ofMillis(100));
    	
    	wait.ignoring(Exception.class);
    	wait.until(ExpectedConditions.visibilityOf(firstname));
    	
    	   firstname.sendKeys(name);
			
		}
   
}
