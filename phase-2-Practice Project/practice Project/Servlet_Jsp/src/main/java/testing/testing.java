package testing;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class testing extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		
		//Type 1-      now send the value of "i" to setAttribute using sendRedirect(); or URL Rewriting
		
		//res.sendRedirect("setAttribute?i="+i);         // it is a kind of response goes to client side Or it will add data to the URL
		
		
		// Type 2-    now send the value of "i" to setAttribute using RequestDispacher()
		
		req.setAttribute("i",i);
		RequestDispatcher rd=req.getRequestDispatcher("setAttribute");
		rd.forward(req, res);
				
				
		
		
	}
	
}
