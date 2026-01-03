package Week2.Day2;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
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
		
		//click Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//click Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//enter account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Karthika SK new new");
		
		//Enter desc
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Select industry
		WebElement selectoption=driver.findElement(By.name("industryEnumId"));
		Select seloption=new Select(selectoption);
		seloption.selectByIndex(3);
		
		//select ownership
		WebElement selectowner=driver.findElement(By.name("ownershipEnumId"));
		Select seloption1=new Select(selectowner);
		seloption1.selectByVisibleText("S-Corporation");
		
		//select source
		WebElement selsource=driver.findElement(By.id("dataSourceId"));
		Select seloption2=new Select(selsource);
		seloption2.selectByValue("LEAD_EMPLOYEE");
		
		//select  marketing campaign
		WebElement selmarketing= driver.findElement(By.id("marketingCampaignId"));
		Select seloption3=new Select(selmarketing);
		seloption3.selectByIndex(6);
		
		//select  state/province
		WebElement selstate= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select seloption4=new Select(selstate);
		seloption4.selectByValue("TX");
		
		//click create acc button
		driver.findElement(By.className("smallSubmit")).click();
		
		//print account name
		WebElement accname=driver.findElement(By.xpath("//span[contains(text(),'Karthika SK ')]"));
		String s=accname.getText();
		System.out.println(s);
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
