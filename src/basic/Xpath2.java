package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome exe\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().window().maximize();
		  
		  Thread.sleep(3000);
                           
		                         //absolute xpath
		  WebElement email = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/form/div/div/input"));
		  email.sendKeys("xyz@gmail.com");
		  
		  Thread.sleep(3000);
		                        //relative xpath
		  WebElement password = driver.findElement(By.xpath("(//html//input)[15]"));
		  password.sendKeys("asdfgh@123");
		  
		  Thread.sleep(3000);
		  
	
		  driver.quit();
	}

}
