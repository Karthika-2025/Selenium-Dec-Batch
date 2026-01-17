package Week3.Day2;

public class Browser 
{
	String browserName="Chrome";
	Long browserVersion = (long) 143.71;
	
	public void openURL() 
	{
		System.out.println(browserName+" is opened successfully");
	}
	
	public void closeBrowser()
	{
		System.out.println("Browser is closed ");
	}
	
	public void navigateBack() 
	{
		System.out.println("navigate back");

	}
}
