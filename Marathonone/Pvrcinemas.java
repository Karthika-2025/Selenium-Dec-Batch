package Marathonone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Week3.Day2.HomeAssignment.webElement;

public class Pvrcinemas {

	
	public static void main(String[] args) throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click(); //Select cinema in quick book
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click(); //Click cinema drop down list
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[2]")).click(); // Select 2nd opton in DD list
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//driver.findElement(By.xpath("//div[@id='movie']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')][1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')][1]/span")).click();
		driver.findElement(By.xpath("//button[contains(@class,'filter-btn')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		driver.findElement(By.xpath("(//tr[@class='seats-row'][4]//span)[14]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WebElement seatinfo=driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		String seatinformation=seatinfo.getText();
		System.out.println("seat number : "+seatinformation);
		WebElement totalamount=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span"));
		String totalamt=totalamount.getText();
		System.out.println("Grand total : "+totalamt);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'pi-times')])[2]")).click();
		System.out.println("The title o the page  : "+driver.getTitle());
		

	}
}
