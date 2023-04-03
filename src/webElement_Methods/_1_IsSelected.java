package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _1_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		boolean check1 = checkBox1.isSelected();
		System.out.println(check1);
		
		checkBox1.click();
		
		boolean check2 = checkBox1.isSelected();
		System.out.println(check2);
		
		driver.close();
		
	}

}
