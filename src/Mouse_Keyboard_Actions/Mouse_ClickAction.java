package Mouse_Keyboard_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Mouse_ClickAction {

	public static void main(String[] args) throws InterruptedException {
		
          WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
          
//          WebElement rClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//          
            Actions actions = new Actions(driver);
//          
//          actions.contextClick(rClick);
//          actions.perform();
          
          
         
          
          WebElement dClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
          
          actions.doubleClick(dClick);
          actions.perform();
          
          Alert alert = driver.switchTo().alert();
          alert.accept();
          
          Thread.sleep(3000);
          
          
          driver.close();
          
	}

}
