package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
	               //isSelected method
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  driver.manage().window().maximize();
		  
	      WebElement radiob = driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
	      boolean check1 = radiob.isSelected();
	      System.out.println(check1);
	      
	      Thread.sleep(3000);
	      
	      radiob.click();
	      boolean check2 = radiob.isSelected();
	      System.out.println(check2);
	      
	      Thread.sleep(3000);
	      
	WebElement img = driver.findElement(By.xpath("/html/body/div[1]/section/div/h1"));
	 String text = img.getText(); 
	 System.out.println(text);	   
	 
	 WebElement input = driver.findElement(By.id("autocomplete"));
     input.sendKeys("abcde"); 
     
     Thread.sleep(3000);
     
     input.clear();
	 
     Thread.sleep(3000);
     
     WebElement search = driver.findElement(By.id("displayed-text"));
     boolean check3 = search.isDisplayed();
	 System.out.println(check3);
	 
	 WebElement hide = driver.findElement(By.id("hide-textbox"));
	 hide.click();
	 boolean check4 = search.isDisplayed();     
	 System.out.println(check4);     
	      
	 Thread.sleep(3000);
	 
	
	driver.quit();
	}

}
