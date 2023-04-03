package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome driver\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  
	  Options opt = driver.manage();
	  Window win = opt.window();
	  win.maximize();
	}

}
