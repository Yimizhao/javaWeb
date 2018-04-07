package com.zym.javaweb.check;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckCodeServlet
 */
@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取checkCode
		String CHECK_CODE_PRAM_KEY = request.getParameter("CHECK_CODE_PRAM_KEY");

		// 获取验证框Code
		String CHECK_CODE_KEY = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
		System.out.println(CHECK_CODE_PRAM_KEY);
		System.out.println(CHECK_CODE_KEY);

		request.getSession().removeAttribute("MEG");
		// 比较
		if (!(CHECK_CODE_PRAM_KEY != null && !CHECK_CODE_PRAM_KEY.isEmpty()
				&& CHECK_CODE_PRAM_KEY.equals(CHECK_CODE_KEY))) {
			request.getSession().setAttribute("MEG", "验证码输入错误");
		} else {

			request.getSession().setAttribute("MEG", "通过验证");
		}
		response.sendRedirect(request.getContextPath() + "/check/index.jsp");
	}

}
