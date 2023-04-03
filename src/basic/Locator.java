package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().window().maximize();
		  
		  
		  
		             // Different types of locators.
		  
		              //1.Tagname
//		  WebElement login_button = driver.findElement(By.tagName("button"));
//		  login_button.click();
		  
		             //2.id
		/* WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("xyz@gmail.com");
		 
		             //3.name
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("abc@123");
		 
		             //4.class
		WebElement signUp =  driver.findElement(By.className("_97w5"));
		signUp.click();
		
		             //5.cssSelector
		//WebElement gmail = driver.findElement(By.cssSelector("input[type='text']"));
		
		            //6.text
		WebElement passwordd = driver.findElement(By.linkText("Forgotten account?"));
		passwordd.sendKeys("sfhKsfgahbcka");
		
		            //7.partialText
		WebElement passworrd = driver.findElement(By.partialLinkText("account?"));
		passworrd.sendKeys("sfhKsfgahbcka");
		
		            //8.xpath
		            //i)xpath by attribute
		  WebElement emaill = driver.findElement(By.xpath("//input[@type='text']"));
		  emaill.sendKeys("xyz@gmail.com");
		  
		            //ii)xpath by text
		  WebElement reset = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		  reset.click();
		  
		            //iii)xpath by contains
		  WebElement signUpp = driver.findElement(By.xpath("//a[contains(@class,'_97w5' )]"));
		  signUpp.click();
		  
		            //iv)xpath by index
		  WebElement ppassword = driver.findElement(By.xpath("(//input[contains(@class,'_55r1' )])[2]"));
		  ppassword.sendKeys("khvbsdkbKDB");
		  
		            //v)absolute xpath
		  WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
		  button.click();*/

		            //vi)relative xpath
		  WebElement forgot = driver.findElement(By.xpath("(//html//div//a)[2]"));
		  forgot.click();
	}

}
