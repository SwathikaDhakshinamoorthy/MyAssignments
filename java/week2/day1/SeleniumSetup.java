package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	
	public static void main(String[] args) {
		
		// To add driver to the code
		 WebDriverManager.chromedriver().setup(); 
		 
		 //Open a browser
		 ChromeDriver driver=new ChromeDriver(); 
		 
		 //To load an URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //To Maximize the window
		 driver.manage().window().maximize();
		 
		 //Close the browser
		 driver.close();
		 
		 
		 }

}
