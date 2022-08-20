package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

public static void main(String[] args) {
		
		// To add driver to the code
		 WebDriverManager.chromedriver().setup(); 
		 
		 //Open a browser
		 ChromeDriver driver=new ChromeDriver(); 
		 
		 //To load an URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //To Maximize the window
		 driver.manage().window().maximize();
		 
		 //To find the element
		 
		WebElement elementUserName = driver.findElement(By.xpath("//input[@name = 'USERNAME']"));
	    elementUserName.sendKeys("Demosalesmanager");
		 
		 WebElement elementPassword = driver.findElement(By.xpath("//input[@name = 'PASSWORD']"));
		 elementPassword.sendKeys("crmsfa");
		 
		
		WebElement elementLoginButton = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		elementLoginButton.click();
		

		WebElement elementCRMLink = driver.findElement(By.xpath("//a[contains(text() ,'CRM/SFA')]"));
		elementCRMLink.click();
		
      WebElement elementLeadsButton = driver.findElement(By.xpath("//a[contains(text() ,'Leads')]"));
		elementLeadsButton.click();
		
		WebElement elementCreateLead = driver.findElement(By.xpath("//a[contains(text() , 'Create Lead')]"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName'][1]"));
		elementCompanyName.sendKeys("TestLeaf");
		
		WebElement elementFirstName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']"));
		elementFirstName.sendKeys("Test");
		
		WebElement elementLastName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']"));
		elementLastName.sendKeys("Test1");
		
		WebElement elementCreateLeadButton = driver.findElement(By.xpath("//input[@class = 'smallSubmit']"));
		elementCreateLeadButton.click();
}	
	
}