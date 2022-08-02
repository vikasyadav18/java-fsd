package LoginProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Authenticator extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		
		String FixedVariable="vikas@gmail.com";
		String pa="12345";
		
		if(user.equals(FixedVariable) && pass.equals(pa))
		{
			res.getWriter().println("Login Successfull");
			//res.sendRedirect("loginSuccessfull");
		}
		else
		{
			res.getWriter().println("wrong user id or password");
		}
		
		
	}
}
