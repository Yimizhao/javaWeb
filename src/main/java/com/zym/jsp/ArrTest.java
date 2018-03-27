package com.zym.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.omg.CORBA.Request;

/**
 * Servlet implementation class ArrTest
 */
@WebServlet("/arrTest")
public class ArrTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArrTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		// 1、pageContext
		
		// 2、request
		Object requestAttr = request.getAttribute("requestAttr");
		out.println("requestAttr :" + requestAttr);
		
		// 3、session
		Object sessionAttr = request.getSession().getAttribute("sessionAttr");
		out.println("sessionAttr :" + sessionAttr);
		
//		 4、application
		Object applicationAttr = request.getServletContext().getAttribute("applicationAttr");
		out.println("applicationAttr:" + applicationAttr);
	}

}
