package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import basic.Browser;

public class _1_SingleElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		                  //Single element of Header
		String companyName = driver.findElement(By.xpath("//table//thead//tr//th[1]")).getText();
		
		System.out.print(companyName);
		
		
		                  //Single element of Body
		String firstCompanyName = driver.findElement(By.xpath("(//table//tbody)[2]//tr[1]//td[1]")).getText();
		
		System.out.println(firstCompanyName);
	
}
}
