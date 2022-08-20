package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
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
		 
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		WebElement elementCRMLink = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMLink.click();
		
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TestLeaf");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Test");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Test1");
		
		
		WebElement elementSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(elementSourceDD);
		elementSourceDD.sendKeys("LEAD_COLDCALL");
		
		WebElement elementMarketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaign = new Select(elementMarketingCampaignDD);
		marketingCampaign.selectByIndex(3);
		
		WebElement elementIndustryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(elementIndustryDD);
		industry.selectByVisibleText("Aerospace");
		
		WebElement elementOwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(elementOwnershipDD);
		ownership.selectByValue("OWN_PARTNERSHIP");
		
		
		

		
		
		
		 
		 
		 

}


}
