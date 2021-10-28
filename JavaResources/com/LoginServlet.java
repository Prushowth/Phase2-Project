package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		if(name.isEmpty()||pwd.isEmpty()) {
			pw.println("<font color='red'>Please provide username.password</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}else{
			if(name.equals("Prushowth")&&pwd.equals("Prush123")) {
				pw.println("<font color = 'green'> Login Sucessful </font> <br> <br>  ");
				pw.println("<font color ='green'> Hi "+name+" Welcome. </font>");
				RequestDispatcher rd = request.getRequestDispatcher("dash.jsp");
				rd.forward(request, response);
			}else {
				pw.println("<font color = 'red'> Login Unsucesful </font> <br><br>    ");
				pw.println("<font color = 'red'> Please check your username or password </font> <br><br>");
				pw.println("<a href = index.jsp>Click here to go to Login Page</a>" );	
			}
		}
	}
}
