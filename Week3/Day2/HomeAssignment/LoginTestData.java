package Week3.Day2.HomeAssignment;

public class LoginTestData extends TestData
{
	
	public void enterUsername(String user)
	{
		System.out.println("Enter username : "+user);
	}
	
	public void enterPassword(char pass) 
	{
		System.out.println("Enter password : "+pass);
	}
	
	public static void main(String[] args) 
	{
		LoginTestData logintest=new LoginTestData();
		logintest.enterCredentials();
		logintest.enterUsername("Karthika");
		logintest.enterPassword('*');
		logintest.navigateToHomePage();
	}

}
