package Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Drag_and_Drop_Single {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser( "https://www.globalsqa.com/demo-site/draganddrop/" );
		
		WebElement frame =driver.findElement(By.xpath("(//iframe[@height='500'])[1]"));
		driver.switchTo().frame(frame);
		
		WebElement img1 = driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content')])[1]"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(img1, trash );
		actions.perform();
		
		
		
        Thread.sleep(3000);
        driver.close();
	}

}
