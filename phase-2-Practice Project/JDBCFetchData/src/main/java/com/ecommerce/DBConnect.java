package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fetchJDBC")
public class DBConnect extends HttpServlet
{
	static int sid;
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		sid=Integer.parseInt(req.getParameter("sid"));
		
		
		PrintWriter out= res.getWriter();
		
		Properties props=new Properties();
		res.setContentType("text/html");
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		
		props.load(in);
		
		Connection conn=DBConfig.getConnection(props);
		
		if(conn!=null)
		{
			// out.print("Connection is Done Successfully"+sid);
			
			try { 
				out.print(sid);			 
				 Statement stmt = conn.createStatement(); 
				 ResultSet  rs=stmt.executeQuery("select * from eproduct where id="+sid); 
				  
				 while(rs.next()) 
				 { 
					 	out.println("<tr>");
						out.print("<td>" + rs.getInt(1) + "</td>");
						out.print("<td>" + rs.getString(2) + "</td>");
						out.print("<td>" + rs.getBigDecimal(3) + "</td>");
						out.print("<td>" + rs.getTimestamp(4) + "</td>");
						out.println("</tr>");
					 
//					 out.println(rs.getInt(1)+" ,"+rs.getString(2)+", " 
//				 	 +rs.getBigDecimal(3)+", " 
//				 	 +rs.getTimestamp(4)+"<br>"); 
				 } 
				 				 
	 			}
			catch (SQLException e) 
			{ 
				 // TODO Auto-generated catch block 
				e.printStackTrace(); 
			} 

			
			
		}
		else
		{
			out.print("Connection not Established");
		}
	}

	
}
