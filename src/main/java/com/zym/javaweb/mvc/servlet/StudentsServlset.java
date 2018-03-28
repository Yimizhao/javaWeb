package com.zym.javaweb.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zym.javaweb.mvc.dao.StudentDao;
import com.zym.javaweb.mvc.domain.Student;

/**
 * Servlet implementation class StudentsServlset
 */
@WebServlet("/studentsServlset")
public class StudentsServlset extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
//		 Object deleteId = request.getAttribute("deleteId");
		String deleteId = (String)request.getParameter("deleteId");
		 if ((deleteId != null)) {
			int Id = Integer.parseInt(deleteId);
			dao.deleteStudent(Id);
		}
		
		  List<Student> students = dao.getAllStudent();
		  request.setAttribute("students", students);
		  String path = "students.jsp";
		  request.getRequestDispatcher(path).forward(request, response);
	}

}
