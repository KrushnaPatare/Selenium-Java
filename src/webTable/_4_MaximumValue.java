package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.Browser;

public class _4_MaximumValue {

	public static void main(String[] args) {
		
        WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement>totalCurrentPrice = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		
		List<WebElement>totalCompany = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));
		
		double max = 0;
		
		String companyNameBig="";
		
		
		for(int i=0;i<totalCurrentPrice.size();i++)
		{
			String currentPrice = totalCurrentPrice.get(i).getText();
			
			double value = Double.parseDouble(currentPrice);
			
			
			if(max<value)
			{
				max=value;
			    companyNameBig=totalCompany.get(i).getText();
			}
			
			
		}
		
		 System.out.println("The " + companyNameBig + " maximum Current Price (Rs) - "+max);

	}

}
