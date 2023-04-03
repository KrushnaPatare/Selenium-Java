package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://demo.automationtesting.in/Frames.html");
		
		WebElement button = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		button.click();
		
		WebElement f1 =driver.findElement(By.xpath("//iframe [@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(f1);
		
		WebElement f2 =driver.findElement(By.xpath("//iframe [@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(f2);
		
		
		WebElement box =driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		
		box.sendKeys("Hello");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
