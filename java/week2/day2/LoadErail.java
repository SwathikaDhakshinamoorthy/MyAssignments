package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoadErail {
	
	public static void main(String[] args) {
	
	// To add driver to the code
			 WebDriverManager.chromedriver().setup(); 
			 
			 //Open a browser
			 ChromeDriver driver=new ChromeDriver(); 
			 
			 //To load an URL
			 driver.get("https://erail.in/");
			 
			 driver.findElement(By.xpath("//input[@id = 'txtStationFrom']")).clear();
			 
			 driver.findElement(By.xpath("//input[@id = 'txtStationFrom']")).sendKeys("MS");
			 
			 driver.findElement(By.xpath("//a[contains(text() ,'Chennai Egmore')]")).sendKeys("MS",Keys.TAB);
			 
			 driver.findElement(By.xpath("//input[@id ='chkSelectDateOnly']")).click();
			 
			
			List<WebElement> elementRows = driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
			
			List<WebElement> elementCols = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));
			 
			
			
			for( int i = 0; i <= elementRows.size(); i++) {
				
				for( int j = 0; j <= elementCols.size()-10; j++) {
					
					String text = driver.findElement(By.xpath("(//table)[3]/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.print(text + "   ");
				}
				
				System.out.println();
			}

}
}
