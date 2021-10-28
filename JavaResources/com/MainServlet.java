package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mainservlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int classno = Integer.parseInt(request.getParameter("class"));
		System.out.println(classno);
		DbConnect con  = new DbConnect();

        List <Student>student = con.dbconStudent(classno);
        List <Subject>subject = con.dbconSubject(classno);
        
        request.setAttribute("student", student); 
        request.setAttribute("subject", subject); 
        request.setAttribute("classno", classno); 
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	}
}
