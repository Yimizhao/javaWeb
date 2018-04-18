package com.zym.javaweb.attributeListener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributeListenerServlet
 */
@WebServlet("/attributeListenerServlet")
public class AttributeListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributeListenerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("追加一个requestAttribute");
		request.setAttribute("requestname", "requestname");
		System.out.println("修正一个requestAttribute");
		request.setAttribute("requestname", "requestname1");
		System.out.println("删除一个requestAttribute");
		request.removeAttribute("requestname");
		
		System.out.println("追加一个Httpsession");
		request.getSession().setAttribute("Httpsessionname", "Httpsessionvalue");
		System.out.println("修正一个Httpsession");
		request.getSession().setAttribute("Httpsessionname", "Httpsessionvalue1");
		System.out.println("删除一个Httpsession");
		request.getSession().removeAttribute("Httpsessionname");
		
		
		System.out.println("追加一个ServletContext");
		request.getServletContext().setAttribute("ServletContextname", "ServletContextvalue");
		System.out.println("修正一个ServletContext");
		request.getServletContext().setAttribute("ServletContextname", "ServletContextvalue1");
		System.out.println("删除一个ServletContext");
		request.getServletContext().removeAttribute("ServletContextname");
	}

}
