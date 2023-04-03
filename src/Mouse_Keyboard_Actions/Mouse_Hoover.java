package Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Mouse_Hoover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-"
				+ "21&ascsubtag=_k_EAIaIQobChMI862a0prd-gIVZZhmAh3zrA3xEAAYASAAEgI5X"
				+ "fD_BwE_k_&gclid=EAIaIQobChMI862a0prd-gIVZZhmAh3zrA3xEAAYASAAEgI5XfD_BwE");
	
	    WebElement signIn = driver.findElement(By.xpath("(//a[contains (@href, 'https://www.amazon.in/ap/signin?')])[1]"));
	    Actions actions = new Actions(driver);
	    
	    actions.moveToElement(signIn);
	    actions.perform();
	    
	
	
	Thread.sleep(3000);
	driver.close();
	}

}
