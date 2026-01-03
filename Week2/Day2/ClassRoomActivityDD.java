package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomActivityDD 
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
				
				//Enter email ID and password and click Login button
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click CRM/SFA link
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
				//click Leads tab
				driver.findElement(By.linkText("Leads")).click();
				
				//click create leads shortcut
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");

				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SK");

				WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select sourceDD = new Select(source);
				sourceDD.selectByIndex(4);
				
				WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select marketingDD = new Select(marketing);
				marketingDD.selectByVisibleText("Automobile");
				
				
				WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select ownerDD=new Select(owner);
				ownerDD.selectByValue("OWN_SCORP");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				System.out.println("The Title of the page is "+driver.getTitle());

				Thread.sleep(5000);
				
				driver.close();
				
	}

}
