package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
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
		 
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		 
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		//WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		//String text = elementWelcomeMessage.getText();
		//System.out.println(text);
		
		WebElement elementCRMLink = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMLink.click();
		
		
		WebElement elementLeadsButton = driver.findElement(By.linkText("Leads"));
		elementLeadsButton.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TestLeaf");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Test");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Test1");
		
		WebElement elementFirstNameLocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Test2");
		
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("Sales");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Learning Selenium in Test Leaf");
		
		WebElement elementEmailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailId.sendKeys("Test@gmail.com");
		
		WebElement elementStateOrProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select State = new Select(elementStateOrProvince);
		State.selectByVisibleText("New York");
		
		WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton.click();
		
		System.out.println("The Titile is" + driver.getTitle());
		
		WebElement elementDuplicateLeadButton = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateLeadButton.click();
		
		WebElement elementCompanyName1 = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName1.clear();
		
		WebElement elementCompanyName2 = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName2.sendKeys("Test Leaf Selenium");
		
		WebElement elementFirstName1 = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName1.clear();
		
		WebElement elementFirstName2 = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName2.sendKeys("Testing Selenium");
		
		WebElement elementCreateLeadButton1 = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton1.click();
		
		System.out.println("The Titile is" + driver.getTitle());

}
}
