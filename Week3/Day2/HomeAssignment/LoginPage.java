 	package Week3.Day2.HomeAssignment;

public class LoginPage extends BasePage
{

@Override
	public void performCommonTasks()
	{
		super.performCommonTasks();
		System.out.println("loginpage perform tasks");
	}
	public static void main(String[] args)
	{
		LoginPage loginobj=new LoginPage();
		loginobj.clickElement();
		loginobj.findElement();
		loginobj.enterText();
		loginobj.performCommonTasks();
	}

}
