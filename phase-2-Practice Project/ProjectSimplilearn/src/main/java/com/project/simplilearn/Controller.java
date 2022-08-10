package com.project.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * @author VIKAS YADAV
 *
 */
@WebServlet("/submit")
public class Controller extends HttpServlet{

	static int id=1;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		ArrayList<Product> list=new ArrayList<>();
		

			String name=req.getParameter("pname");
			String price=req.getParameter("pprice");
			
			LocalDate date = LocalDate.now();
			String da=date.toString();
			Product ob=new Product(1,name,price,da);
			list.add(ob);
		
		
		
		HttpSession session=req.getSession();
		
		
		
		
		session.setAttribute("list", list);
		
		resp.sendRedirect("target.jsp");
		
//		PrintWriter out=resp.getWriter();
//		out.print(ob);
	}
	

}
