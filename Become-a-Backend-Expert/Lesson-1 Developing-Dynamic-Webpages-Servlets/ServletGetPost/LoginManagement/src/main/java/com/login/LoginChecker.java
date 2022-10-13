package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		if(email.equalsIgnoreCase("simplilearn") && pword.equals("123")){
			out.println("You are Welcomed");
		}
		else
			out.println("Invalid Username or Password");
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		RequestDispatcher rd;
		if(email.equalsIgnoreCase("simplilearn@123") && pword.equals("123")){
			//session object is created bby web conatiner and generate sessionid
			HttpSession session=request.getSession(true);//create a new object and store its reference in session object
			session.setAttribute("email", email);
			
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid UserId or Password");
			rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
			
		}
	}
}