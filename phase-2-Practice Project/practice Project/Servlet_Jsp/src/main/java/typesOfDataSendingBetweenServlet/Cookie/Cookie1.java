package typesOfDataSendingBetweenServlet.Cookie;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Cookie1 extends HttpServlet 
{
	public void service( HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c:cookies)
		{
			if(c.getValue().equals("i"))
			{
				i=Integer.parseInt(c.getValue());
				
			}
		}
		res.getWriter().println("value is : "+ i);
	}
	

}
