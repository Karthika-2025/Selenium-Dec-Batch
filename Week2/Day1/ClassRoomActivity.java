package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivity 
{

	public static void main(String[] args)
	{
		//Driver instantiation
		ChromeDriver driver=new ChromeDriver();
		
		//Open FB in chrome browser
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter email ID and password and click Login button
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		
		//Get the title of the page.
		System.out.println(driver.getTitle());
	}
}
