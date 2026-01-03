package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
{
	public static void main(String[] args) 
	{
		//Driver instantiation
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//Open website in chrome browser
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//including implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter email ID and password and click Login button
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//click Leads tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click  Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the CompanyName
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");
		
		//Enter the FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthika");

		//Enter the LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SK");
		
		//Enter the FirstName (Local) 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("KK");
		
		//Enter the Department Field 
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CS");
		
		//Enter the Description Field
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation tester");
		
		//Enter your email in the E-mail address Field 
		driver.findElement(By.xpath("(//input[@class='inputBox'])[20]")).sendKeys("karthika19.it@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selstate=new Select(state);
		selstate.selectByVisibleText("New York");
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Click on the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Hello");
		
		//Click on the update button.
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//Get the Title of the Resulting Page
		System.out.println(driver.getTitle());
		
		//Close the browser window
		driver.close();
		
		
		
		
	}

}
