package popup;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class ChildB_Shortcut {

	public static void switchToChildBrowser(WebDriver driver, String pageTitle) {
		
		Set<String> handles = driver.getWindowHandles();//to store all page address(handle)
	    Iterator<String> a = handles.iterator();//to fetch data

	    
	    while (a.hasNext()){
	    	
	    	String handle = a.next();
	    	driver.switchTo().window(handle);
	    	String actualTitle = driver.getTitle();
	    
	    	if(pageTitle.equals(actualTitle))
	    	{
	    	  break;	
	    	}
		
		 
	       }

}
}
