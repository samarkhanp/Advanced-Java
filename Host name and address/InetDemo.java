import java.net.*;
public class InetDemo
{
	public static void main(String args[])
	{
		try
		{
		
			InetAddress ip=InetAddress.getLocalHost();
			System.out.println("HOST NAME:: "+ip.getHostName());
			System.out.println("HOST Address:: "+ip.getHostAddress());
		
		}
		catch(Exception e)
		{
	
		}
	}
}