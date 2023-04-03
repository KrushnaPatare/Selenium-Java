package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = Browser.openBrowser("https://www.facebook.com/login/");
		
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Velocity123@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("1234567");
		Thread.sleep(2000);
		
		email.clear();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
