package Week3.Day2.HomeAssignment;

public class Button extends webElement
{
	public void submit() 
	{
		super.Click();
		super.setText("Hello");
		System.out.println("Click submit");
	}
}
