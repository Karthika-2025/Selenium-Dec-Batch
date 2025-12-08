package Week1.Day2;

public class EdgeBrowser 
{

	public static void main(String[] args) 
	{
		// CReate object for Browser class here
		
		Browser edgeobj=new Browser();
		
		//Calling Browser class methods : launchBrowser & loadurl
		
		String browseroutput=edgeobj.launchBrowser("Edge Browser");
		System.out.println(browseroutput);
		System.out.println(edgeobj.loadurl());
	}

}
