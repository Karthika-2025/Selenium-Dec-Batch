package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentCreateAccount 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Driver instantiation
		ChromeDriver driver=new ChromeDriver();
		
		//Open website in chrome browser
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter email ID and password and click Login button
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Create account steps
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Karthika SK");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("50");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("“LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the title of the page.
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		//Close the current browser window
		driver.close();

	}

}
