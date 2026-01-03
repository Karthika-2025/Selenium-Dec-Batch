package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FBClassAssignment 
{

	public static void main(String[] args) 
	{
		//Driver instantiation
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//Open website in chrome browser
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//including implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click create new account button
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		
		//Enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Karthika");
		
		//Enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SK");
		
		//enter reg.email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthika@gmail.com");
		
		//enter reg.password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Karthika@91");
		
		//select DOB date
		WebElement dobday= driver.findElement(By.name("birthday_day"));
		Select seloption=new Select(dobday);
		seloption.selectByIndex(1);
		
		//select DOB month
		WebElement dobmonth= driver.findElement(By.name("birthday_month"));
		Select seloption1=new Select(dobmonth);
		seloption1.selectByValue("2");
		
		//select DOB year
		WebElement dobyear= driver.findElement(By.name("birthday_year"));
		Select seloption2=new Select(dobyear);
		seloption2.selectByVisibleText("2025");
		
		//select Female radio button
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/label)[1]")).click();
		
		//close the browser
		driver.close();
		
		
		
		
		
		
		
		

		
		
		
	}

}
