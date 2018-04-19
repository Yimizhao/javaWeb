package com.zym.javaweb.fileupload.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zym.javaweb.fileupload.utils.FileUploadProperities;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/fileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String exts = FileUploadProperities.getInstance().getProperty("exts");
		String fileMaxSize = FileUploadProperities.getInstance().getProperty("file.max.size");
		String totalFileMaxSize = FileUploadProperities.getInstance().getProperty("total.file.max.size");
		System.out.println(exts);
		System.out.println(fileMaxSize);
		System.out.println(totalFileMaxSize);
	}
}
