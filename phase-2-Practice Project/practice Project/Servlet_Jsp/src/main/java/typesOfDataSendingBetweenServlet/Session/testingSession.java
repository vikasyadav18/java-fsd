package typesOfDataSendingBetweenServlet.Session;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class testingSession extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int k=Integer.parseInt(req.getParameter("num3"));
		
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("getSession1");
		
		//RequestDispatcher rd=req.getRequestDispatcher("sess");
		//rd.forward(req, res);
		
	}

}
