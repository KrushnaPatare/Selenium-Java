package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _2_IsDisplayed {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean check1 = textBox.isDisplayed();
		System.out.println(check1);
		
		WebElement hide = driver.findElement(By.xpath("//input[@value='Hide']"));
		hide.click();
		
		boolean check2 = textBox.isDisplayed();
		System.out.println(check2);
		
		
		driver.close();
		
	}

}
