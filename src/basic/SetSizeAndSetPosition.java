package basic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndSetPosition {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium"
				+ "\\Chrome driver\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://vctcpune.com");
	  driver.manage().window().maximize();
	  
	  Dimension d = new Dimension(1000,600); 
	  driver.manage().window().setSize(d);//to set the size of browser
	  
	  Point P = new Point(300,50);
	  driver.manage().window().setPosition(P);//to set the position 
//	  of browser application's top left corner.
	  
	}

}
