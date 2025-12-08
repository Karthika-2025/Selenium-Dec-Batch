package Week1.Day2;

public class Browser 
{

	public String launchBrowser(String browserName)
	{
		return browserName;
		
	}
	
	public String loadurl()
	{
		return "URL loaded successfully";
		
	}
	
	public static void main(String[] args)
	{
		Browser obj1=new Browser();
		System.out.println(obj1.launchBrowser("Google Chrome"));
		String url=obj1.loadurl();
		System.out.println(url);
	}

}
