package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import popup.ChildB_Shortcut;

public class Iframe_1 {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		
		WebElement practice = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		practice.click();
		
		ChildB_Shortcut.switchToChildBrowser(driver,"");

//we can use three different argument to switch focus of selenium to iframe
		
//		driver.switchTo().frame("courses-iframe");
//		driver.switchTo().frame(0);
		WebElement f = driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(f);
		
		WebElement course = driver.findElement(By.xpath("(//a [@href='https://vctcpune.com/courses/'])[1]"));
		course.click();
		
		
		driver.switchTo().defaultContent();//to switch to main page directly.
		
//		driver.switchTo().parentFrame();//to switch to immediate parent frame.
		
		WebElement radiob = driver.findElement(By.xpath("//input[@value='Radio2']"));
		
		radiob.click();
		
	
		
	}

}
