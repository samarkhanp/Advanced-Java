import java.io.*;
import java.net.*;


public class TCPServerChat
{
	public static void main(String args[])throws IOException
	{
		try
		{
			ServerSocket s=new ServerSocket(123);
			System.out.println("SERVER WAITING FOR CLIENT::");
			Socket cs=s.accept();
			InetAddress ia=cs.getInetAddress();
			String cli=ia.getHostName();
			System.out.println("Connected to ::"+cli);
			BufferedReader in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
			
			BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
			    System.out.print("\n\nYou::");
				String tocl=din.readLine();
				//System.out.println("\n------------------");
				out.println(tocl);
			
			do
			{
				

				
				
				String st=in.readLine();
				System.out.println("Client::"+st);
				System.out.print("You::");
				 tocl=din.readLine();
				System.out.println("\n------------------");
				out.println(tocl);
				
				if(st.equalsIgnoreCase("BYE")|| st==null)break;
				
			}while(true);
			in.close();
			out.close();
			cs.close();
			
		}
		catch(Exception e)
		{
			
			
			
			
		}
		
		
	}
	
	
	
}
