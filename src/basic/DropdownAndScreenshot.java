package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndScreenshot  {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		

     WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		  
		
		  
		  WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		  
		 Select select = new Select(dropdown);
		  
		  select.selectByValue("option1");
		  
		  Thread.sleep(3000);
		  
		  select.selectByIndex(2);
		  
		  Thread.sleep(3000);
		  
		  select.selectByVisibleText("Option1");
		 
		
		Thread.sleep(3);
		  
		  
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		 File destination = new File("F:\\Selenium Screenshot\\shot2.png");
		  
       FileHandler.copy(source, destination);
		  
		  
	 
	}

	
	
	}


