package Mouse_Keyboard_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.Browser;

public class Drag_and_DropMultipleAtSameTime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame =driver.findElement(By.xpath("(//iframe[@height='500'])[1]"));
		driver.switchTo().frame(frame);
		
		List <WebElement> source = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		
		int size = source.size();
		
		WebElement trash = driver.findElement(By.xpath("//div[contains(@id,'trash')]"));

		
		Actions actions = new Actions(driver);
		
		
		
		
		for(int i=0; i<size; i++) {
			
			WebElement img = source.get(i);
			
			actions.dragAndDrop(img, trash);
			
			actions.perform();
			
			
			Thread.sleep(500);
			
			
		}
	
		
	}

}
