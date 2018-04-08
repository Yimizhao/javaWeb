package com.zym.javaweb.session;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ProcessStep2Servlet
 */
@WebServlet("/processStep2")
public class ProcessStep2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Enumeration<String> paraItems = request.getParameterNames();
		while (paraItems.hasMoreElements()) {
			String paraname = (String) paraItems.nextElement();
			
			session.setAttribute(paraname, request.getParameter(paraname));
		}
		response.sendRedirect(request.getContextPath() + "/session/Step3.jsp");
	}

}
