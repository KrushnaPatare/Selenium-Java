package basic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
	
	public static void main(String[] args) {

		WebDriver driver = Browser.openBrowser("https://www.zlti.com/");
	
		List<WebElement>ankor = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<ankor.size();i++)
		{
			String url = ankor.get(i).getAttribute("href");
			
			if (url == null || url.isEmpty())
			{
				continue;
			}
			
			try {
			     
				URL u = new URL (url);
				HttpURLConnection huc = (HttpURLConnection) u.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responseCode = huc.getResponseCode();
				
				if (responseCode >= 400)
						{
							System.out.println(url+" is broken link");
						}
					else
						{
						System.out.println(url + "Is working link");
						}
				}
			
			catch (Exception e)
				{
					e.printStackTrace();
			    }

          }
}
}

	
