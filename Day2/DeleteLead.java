package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
				//Driver instantiation
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("Guest");
				ChromeDriver driver=new ChromeDriver(options);
				
				//Open website in chrome browser
				driver.get("http://leaftaps.com/opentaps/.");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Enter email ID and password and click Login button
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click CRM/SFA link
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
				//click Leads tab
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				//click FindLeads link
				driver.findElement(By.linkText("Find Leads")).click();
				
				//click phone tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//enter ph.no
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9879879899");
				
				//click findleads button
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Thread.sleep(5000);
				//Capture the lead ID of the first resulting lead
				WebElement l=driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a"));
				String s1=l.getText();
				System.out.println(s1);	
				
				//Click the first resulting lead
				driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a")).click();
				
				//Click Delete button
				driver.findElement(By.linkText("Delete")).click();
				
				//click findleads button again
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Enter captured LeadID
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(s1);
				
				//click findleads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(5000);
				
				driver.close();
				
	}
}
