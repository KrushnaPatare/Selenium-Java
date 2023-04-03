package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _2_Headers {

	public static void main(String[] args) {
	
		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement>headers = driver.findElements(By.xpath("//table//thead//tr//th"));
		
		for(int i=0;i<headers.size();i++)
		{
			System.out.print(headers.get(i).getText());
			System.out.print("   ");
		}
		
		System.out.println();
    

	}

}
