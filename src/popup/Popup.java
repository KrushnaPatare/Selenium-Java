package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		
//                             *Hidden Popup*		
		
//		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		signup.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		firstName.sendKeys("asdfghjkl");
//		
//		                    
//		Thread.sleep(3000);
		
		
//                            *Alert Popup*		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement alertbtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alertbtn.click();
 
//                            *Switching focus to alertpopup*
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement hide = driver.findElement(By.xpath("//input[@value='Hide']"));
		hide.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
