package com.zym.javaweb.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessStep1Servlet
 */
@WebServlet("/processStep1")
public class ProcessStep1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得需要购买的书籍
		String[] bookItems = request.getParameterValues("book");
		
//		// 创建session
//		HttpSession session = request.getSession(true);
////		session.setMaxInactiveInterval(300);
//		// 将书籍添加到session
//		for (String bookItem : bookItems) {
//			session.setAttribute(bookItem, bookItem);
//			System.out.println(bookItem);
//		}
		request.getSession().setAttribute("bookItems", bookItems);
		
		response.sendRedirect(request.getContextPath() +  "/session/Step2.jsp");

	}

}
