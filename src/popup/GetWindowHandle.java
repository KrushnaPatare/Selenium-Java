package popup;

import org.openqa.selenium.WebDriver;

import basic.Browser;

public class GetWindowHandle {

	public static void main(String[] args) {
		
		//It is used to get single page address, mostly homepage of any website.
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		
		String homepageaddress = driver.getWindowHandle();
		
		System.out.println(homepageaddress);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
