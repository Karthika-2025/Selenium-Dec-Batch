package Week4.Day1;

import io.cucumber.java.tr.Ama;

public class Amazon extends CanaraBank implements Payments
{

	public static void main(String[] args) 
	{
		Amazon amobj=new Amazon();
		amobj.recordPaymentDetails();
		amobj.CashOnDelivery();
		amobj.upiPayments();
		amobj.cardPayments();
		amobj.InternetBanking();
		amobj.sample();
	}

	@Override
	public void CashOnDelivery() 
	{
		System.out.println("Interface unimp method - Cash on delivery");
	}

	@Override
	public void upiPayments()
	{
		System.out.println("Interface unimp method - UPI Payments");		
	}

	@Override
	public void cardPayments()
	{
		System.out.println("Interface unimp method - Card Payments");
	}

	@Override
	public void InternetBanking() 
	{
		System.out.println("Interface unimp method - Internet Banking");		
	}

}
