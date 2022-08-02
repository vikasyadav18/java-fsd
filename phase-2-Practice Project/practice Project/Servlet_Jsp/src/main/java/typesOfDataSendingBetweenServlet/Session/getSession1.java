package typesOfDataSendingBetweenServlet.Session;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class getSession1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session=req.getSession();
		session.removeAttribute("k");
		int x=(int)session.getAttribute("k");
		
		
	
		res.getWriter().println("answer is : " + x*x);
	}

}
