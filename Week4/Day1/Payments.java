/**
 * 
 */
package Week4.Day1;

/**
 * 
 */
public interface Payments
{
	public void CashOnDelivery();
	public void upiPayments();
	public void cardPayments();
	public void InternetBanking();
	
	public default void sample() 
	{
		System.out.println("Sample implemented method in interface");
	}
}
