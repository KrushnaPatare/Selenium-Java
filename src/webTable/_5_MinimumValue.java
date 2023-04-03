package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _5_MinimumValue {

	public static void main(String[] args) {
		
        WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement>totalCurrentPrice = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		
		List<WebElement>totalCompany = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));
		
		 
		 
		String currentPrice = totalCurrentPrice.get(0).getText();
		double min = Double.parseDouble(currentPrice);
		
		String companyName="";
		 
		for(int i=0;i<totalCurrentPrice.size();i++)
		{
			 currentPrice = totalCurrentPrice.get(i).getText();
			
			double value = Double.parseDouble(currentPrice);
			
			
			if(min>value)
			{
				min=value;
			    companyName=totalCompany.get(i).getText();
			}
			
			}
		
        
		
		System.out.println("The " + companyName + " minimum Current Price (Rs) - "+min);
		

			
		}
		
		

	}


