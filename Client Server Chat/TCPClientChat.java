


import java.io.*;
import java.net.*;


public class TCPClientChat
{
	public static void main(String args[])throws IOException
	{
		try
		{
			Socket con=new Socket("localhost",123);
			BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
			PrintWriter out=new PrintWriter(con.getOutputStream(),true);
			while(true)
			{
				String s1=in.readLine();
				System.out.println("SERVER::"+s1);
				System.out.print("You::");
				BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
				String st=din.readLine();
				System.out.println("\n------------------");
				out.println(st);
				
				if(st.equalsIgnoreCase("BYE")|| st==null)break;
			}
			in.close();
			out.close();
			con.close();
			
		}
		catch(Exception e)
		{
			
			
			
			
		}
		
		
	}
	
	
	
}
