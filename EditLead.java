package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		  // FirefoxDriver driver=new FirefoxDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 //driver.manage().window().minimize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEst leaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("uma");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("subramani");
		 WebElement text1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dd=new Select(text1);
		 dd.selectByVisibleText("Employee");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mageshwari");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Code is interesting");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("uma.s85@gmail.com");
		 WebElement statedropdwn = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select drp = new Select(statedropdwn);
		 drp.selectByVisibleText("New York");
		 
		 
		 
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("createLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test leaf is wonderful");
		 driver.findElement(By.name("submitButton")).click();
		 String title1 = driver.getTitle();
		 System.out.println(title1);

	}

}
