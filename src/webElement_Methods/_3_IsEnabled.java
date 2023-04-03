package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _3_IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://classic.freecrm.com/register/");
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean status1 = button.isEnabled();
		System.out.println(status1);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		boolean status2 = button.isEnabled();
		System.out.println(status2);
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
