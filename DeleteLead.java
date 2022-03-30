package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9094203239");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		
		String Leadid = driver.findElement(By.xpath("//table[contains(@class,'table')]//tr//div[contains(@class,'Id')]/a[contains(@href,'viewLead')]")).getText();
		System.out.println(Leadid);
		driver.findElement(By.xpath("//table[contains(@class,'table')]//tr//div[contains(@class,'Id')]/a[contains(@href,'viewLead')]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(Leadid);
		driver.findElement(By.linkText("Find Leads")).click();
		String verifytext = driver.findElement(By.linkText("No records to display")).getText();
		System.out.println(verifytext);
		driver.close();
		
		
		
		
		
		
	}

}
