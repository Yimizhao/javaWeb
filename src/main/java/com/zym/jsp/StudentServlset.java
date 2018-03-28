package com.zym.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlset
 */
public class StudentServlset extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] stundentsArray = {"张三", "李四", "王五", "赵六"};
		List<String> studentsList = new ArrayList<>();
		studentsList = Arrays.asList(stundentsArray);
		request.setAttribute("students", studentsList);
		request.getRequestDispatcher("students.jsp").forward(request, response);
	}

}
