package Week3.Day2;

public class Chrome extends Browser
{
	
	public void openIncognito()
	{
		System.out.println("open incognito");
	}
	
	public void clearCache() 
	{
		System.out.println("clear cache");
	}

	public static void main(String[] args)
	{
		
		Chrome chromeobject=new Chrome();
		
		chromeobject.openURL();
		System.out.println(chromeobject.browserName);
	}

}
