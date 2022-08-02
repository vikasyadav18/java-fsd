package Addition;

import java.io.IOException;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Multiply extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=(int)req.getAttribute("c");
		
		
		res.getWriter().println("multiply with 2 is : "+(2*i));
	}

}
