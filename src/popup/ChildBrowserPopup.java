package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		
//		String handle = driver.getWindowHandle();
//		System.out.println(handle);
		
		WebElement practice = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		practice.click();
		
//		String handle2 = driver.getWindowHandle();
//		System.out.println(handle2);
		
		Set<String> handles = driver.getWindowHandles();//to store all page address(handle)
	    Iterator<String> a = handles.iterator();//to fetch data
	    
//	    System.out.println(a.next());//by using next method of interface iterator we can get next
//	    //value (randomly selects one handle) in it. 
//	    System.out.println(a.next());
	    
	    while (a.hasNext()){
	    	
	    	String handle = a.next();
	    	driver.switchTo().window(handle);
	    	
	    	String expectedTitle = "Practice Page";
	    	String actualTitle = driver.getTitle();
	    	
	    	System.out.println(expectedTitle);
	    	System.out.println(actualTitle);
	    	
	    	if(expectedTitle.equals(actualTitle))
	    	{
	    		WebElement radiob = driver.findElement(By.xpath("//input[@value='Radio2']"));
	    		
	    		radiob.click();
	    		
	    		
	    	}
	    	
	    	
	    	
	}
}
	    	
}    	


