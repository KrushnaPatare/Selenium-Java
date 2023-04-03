package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class Click {

	public static void main(String[] args) {
		
        WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		checkBox1.click();

	}

}
