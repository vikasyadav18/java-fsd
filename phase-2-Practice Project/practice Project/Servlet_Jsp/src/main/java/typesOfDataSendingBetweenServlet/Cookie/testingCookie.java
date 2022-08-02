package typesOfDataSendingBetweenServlet.Cookie;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class testingCookie extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		
		Cookie cookie=new Cookie("i",i+ "");
		res.addCookie(cookie);
		
		res.sendRedirect("Cookie1");
	}

}

