package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				WebDriverManager.chromedriver().setup();		
	
				ChromeDriver driver=new ChromeDriver();
				
			
				driver.get("http://leaftaps.com/opentaps/control/login");
				
			
				driver.manage().window().maximize();
	
				driver.findElement(By.id("username")).sendKeys("democsr");
				
			
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		
				driver.findElement(By.className("decorativeSubmit")).click();
				
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
			
				driver.findElement(By.linkText("Leads")).click();
				
			
				driver.findElement(By.linkText("Create Lead")).click();
				
			
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
				
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangavi");
				
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ezhilan");
				
				
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sangavie");
				
			
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
			
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Test Engineer");
				
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sangi.kings@gmail.com");
				

				
		        WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		        
				
		        Select obj=new Select(dropdown);           
				
		     	
		        obj.selectByVisibleText("Florida");
		        
	
		       driver.findElement(By.className("smallSubmit")).click();
		       
		      
		       String title = driver.getTitle();
		        System.out.println(title);
		}

		
	}


