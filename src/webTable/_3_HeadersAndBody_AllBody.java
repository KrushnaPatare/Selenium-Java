package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _3_HeadersAndBody_AllBody {

	public static void main(String[] args) {
		

		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement>headers = driver.findElements(By.xpath("//table//thead//tr//th"));
		
		for(int i=0;i<headers.size();i++)
		{
			System.out.print(headers.get(i).getText());
			System.out.print("   ");
		}
		
		System.out.println();
    

	


		List<WebElement>rows = driver.findElements(By.xpath("(//table//tbody)[2]//tr"));
		
		for(int k=1;k<=rows.size();k++)
		{
			List<WebElement>column = driver.findElements(By.xpath("(//table//tbody)[2]//tr["+k+"]//td"))	;
			
			for(int l=0;l<column.size();l++)
			{
				System.out.print(column.get(l).getText());
				System.out.print("   ");
			}
			System.out.println();
		}


	}

}
