package Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Keyboard_Action {

	public static void main(String[] args) {
		
	    WebDriver driver = Browser.openBrowser("https://demoqa.com/text-box");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		
		username.sendKeys("Krushna Patare");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB);
//		actions.perform();
		actions.sendKeys("krushnapatare21@gmail.com");
//		actions.perform();
//		
		actions.sendKeys(Keys.TAB);
//		actions.perform();
		actions.sendKeys("At post shirdi, Tehsil Rahata, "
				+ "Dist. Ahmednagar, Maharashtra, 414005.");
//		actions.perform();
//		
		actions.keyDown(Keys.CONTROL);
//		actions.perform();
		actions.sendKeys("a");
//		actions.perform();
//		
		actions.sendKeys("c");
//		actions.perform();
		actions.keyUp(Keys.CONTROL);
//		actions.perform();
//		
		actions.sendKeys(Keys.TAB);
//		actions.perform();
		actions.keyDown(Keys.CONTROL);
//		actions.perform();
		actions.sendKeys("v");
//		actions.perform();
//		
		actions.keyUp(Keys.CONTROL);
//		actions.perform();
		actions.sendKeys(Keys.TAB);
//		actions.perform();
		actions.sendKeys(Keys.ENTER);
//		actions.perform();

		
		actions.build().perform();
		//collectively it takes actions.perform(); for all iterations/reoccurance
		
	

	}

}
