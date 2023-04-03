package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class CB_Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
	
		WebElement practice = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		practice.click();
		
//		WebElement courses = driver.findElement(By.xpath("(//a[@href='https://vctcpune.com/courses/'])[1]"));
//		courses.click();
		
		ChildB_Shortcut.switchToChildBrowser(driver,"Practice Page");
		
		WebElement radiob = driver.findElement(By.xpath("//input[@value='Radio3']"));
		radiob.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
