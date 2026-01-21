package Week3.Day2.HomeAssignment;

public class elements extends Button
{
	
	public static void main(String[] args) 
	{
		elements mainobj=new elements();
		
		RadioButton radioobj=new RadioButton();
		radioobj.selectRadioButton();
		
		checkBoxButton checkobj=new checkBoxButton();
		checkobj.clickCheckButton();
		
		TextField textobj=new TextField();
		textobj.getText("Karthika");
		
		mainobj.submit();
		
	}

}
