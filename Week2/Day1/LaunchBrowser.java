package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
	public static void main(String[] args) 
	{
		//driver instantiation
		ChromeDriver driver=new ChromeDriver();
		
		//open browser
		driver.get("https://www.facebook.com/");
		
		//window maximize
		driver.manage().window().maximize();
		
		//current window closed
		driver.close();
	}
}
