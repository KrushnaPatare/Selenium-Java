package wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static WebDriver openBrowser(String url) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium"
				+ "\\Chrome driver\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get(url);
	  driver.manage().window().maximize();
	  return driver;
	}

}
