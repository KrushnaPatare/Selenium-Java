package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		
		 LocalDateTime time =LocalDateTime.now();
		 DateTimeFormatter customformat =DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss");
		  String realtime =time.format(customformat);
		 
		 
	      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      
	      File destination = new File("F:\\Selenium Screenshot\\page"+realtime+".png");
	      
	      FileHandler.copy(source, destination);
	      
	      
	      
	     driver.quit(); 

	}

}
