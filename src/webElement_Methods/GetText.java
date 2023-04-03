package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class GetText {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement img = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		
		String text = img.getText();
		
		System.out.println(text);
		
		
		
		
		
		WebElement aboutUsTab = driver.findElement(By.xpath("//a[text()='About Us']"));
		
	    String tab = aboutUsTab.getText();
	    
	    System.out.println(tab);
	    
	    
		
		driver.close();
	}

}
