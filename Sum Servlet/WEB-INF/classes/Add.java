import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class Add extends HttpServlet 
{ 
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
  { 
    res.setContentType("text/html"); 
    PrintWriter pw=res.getWriter(); 
    int n1=Integer.parseInt(req.getParameter("num1")); 
    int n2=Integer.parseInt(req.getParameter("num2")); 
    pw.print("<h1>The sum of two number is"+(n1+n2)); 
  } 
} 
