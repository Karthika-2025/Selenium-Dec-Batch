package Week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLowestPricePhone 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
		
		List<WebElement> findelements= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (WebElement element : findelements)
		{
			String price= element.getText();
			String comma= price.replaceAll(",", "");
			if (!comma.isEmpty()) 
			{
				Integer priceaftercomma=Integer.parseInt(comma);
				list.add(priceaftercomma);
			}	
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Lowest price : "+list.get(0));
		System.out.println("Highest price "+list.get(list.size()-1));
		
	}
}