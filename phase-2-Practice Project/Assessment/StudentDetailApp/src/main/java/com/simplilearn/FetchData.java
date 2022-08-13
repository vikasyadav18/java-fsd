package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<Admin> list= session.createQuery("from Admin").list();
		
		for(Admin product:list) 
		{
			out.print("<br>");
			out.print("<b>Id:</b>"+product.getID()+"<br>");
			//out.print("<b>Name:</b>"+product.getName()+"<br>");
	
			out.print("<b>Student Details:</b><br>");
			
			List<Student> Students=product.getStudent();
			
			for(Student c:Students) {
				out.print("<b>Student Name: </b>"+c.getName()+"<br>");
				
			}
			
			out.print("<b>Teacher Details:</b><br> ");
			
			Collection<Teacher> teacher=product.getTeachers();
			
			if(teacher!=null)
			{
			for(Teacher sc:teacher) {
				out.print("<b>name : </b>"+sc.getName()+"<br>");
			}
			
			
			
			out.print("<b><br>Subject Details: <br></b>");
			}
			Set<Subject>subject=product.getSubject();
			for(Subject sub:subject) {
				out.print("<b>Subject: </b><br>"+sub.getName());
			}
			
			out.print("<br>");
			out.print("<b>Class Details:</b><br>");
			
			Map clss= product.getClasss();
			
			
			if(clss.get("cls")!=null) {
				Classs f=(Classs) clss.get("cls");
				f.getName();
			}
//			if(clss.get("BANK")!=null) {
//				Class f=(Class) clss.get("BANK");
//				f.getName();
//			}
			
			 
			out.print("<br>-----------------------------------------------------------<br>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}