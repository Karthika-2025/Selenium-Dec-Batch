package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath 
{

	public static void main(String[] args) 
	{
		//Driver instantiation
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//Open website in chrome browser
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter email ID and password and click Login button		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//click Leads tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//close the browser
		driver.close();
		
	}

}
