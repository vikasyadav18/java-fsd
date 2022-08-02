package typesOfDataSendingBetweenServlet.Dispatcher_Redirect;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class setAttribute1 extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		// For requestDispatcher() method
		int a=(int)req.getAttribute("i");
		
		// For sendRedirect() method 
		//int a=Integer.parseInt(req.getParameter("i"));
		
		
		
		res.getWriter().println("value is :"+(a*a));
		
	}
}
