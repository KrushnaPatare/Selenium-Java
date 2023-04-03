package Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mouse);
		actions.perform();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", mouse);
		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,500)");
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
