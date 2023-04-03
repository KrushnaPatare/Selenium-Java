package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser(String url) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome exe\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get(url);
	  driver.manage().window().maximize();
	  return driver;
	}

}
