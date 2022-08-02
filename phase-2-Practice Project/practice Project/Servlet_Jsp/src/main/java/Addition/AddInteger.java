package Addition;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddInteger extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		//PrintWriter out =res.getWriter();
		res.getWriter().println(c);
		
		
		
		//Calling another servlet from this servlet
		
		req.setAttribute("c", c);
		
		RequestDispatcher rd=req.getRequestDispatcher("multiply");
		rd.forward(req, res);
		
		
		
		
		
	}
}
