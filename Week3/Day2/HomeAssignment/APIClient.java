package Week3.Day2.HomeAssignment;

public class APIClient 
{

	public void sendRequest(String endpoint)
	{
		System.out.println("End point is "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody, Boolean  requestStatus)
	{
		System.out.println("End point is "+endpoint+" Request body is "+requestBody+"Request status is "+requestStatus);
	}
	
	public static void main(String[] args) 
	{
		APIClient clientobj=new APIClient();
		clientobj.sendRequest("API endpoint one");
		clientobj.sendRequest("API endpoint two", "API request body", true);
	}

}
