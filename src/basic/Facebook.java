package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException{
		
	WebDriver driver = Browser.openBrowser("https://www.facebook.com/login/");
	
	Thread.sleep(3000);
	
	
	String mail = Parameter.getExelData("credentials", 0, 0);
	
	System.out.println(mail );
    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(mail );
	
	Thread.sleep(3000);
	
	
	String pass = Parameter.getExelData("credentials", 1, 0);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys(pass);
	
	
	Picture.photo(driver);
	
	
	
	
	driver.quit();
	}

}
