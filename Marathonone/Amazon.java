package Marathonone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week3.Day2.HomeAssignment.webElement;

public class Amazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get into website
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//search items
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys",Keys.ENTER);
		
		//get total no.of search results
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		String result=ele.getText();
		String[] split=result.split(" ");
		System.out.println("Total number of results : "+split[3]);
		
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//li[@id='p_123/648962']//i")).click();
		driver.findElement(By.xpath("//li[@id='p_123/418063']//i")).click();
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[contains(@class,'a-button-dropdown')]")).click();
		driver.findElement(By.xpath("(//ul[contains(@class,'a-list-link')]//a)[5]")).click();
		
		//Print the first resulting bag info
		WebElement nametext=driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[1]"));
		String name=nametext.getText();
		System.out.println("Name of the first product \n"+name);
		
		WebElement pricetext=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String price=pricetext.getText();
		System.out.println("Price is \n"+price);
		
		//Get the page title 
		String title=driver.getTitle();
		System.out.println("Title of the page is : "+title);
		
		//close the driver
		driver.close();
		
		

		
	}

}