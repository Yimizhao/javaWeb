package com.zym.javaweb.fileupload.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUploadServlet
 */
//@WebServlet("/fileUploadServlet")
public class FileUploadServlet_bak extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1、获取FileItem
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Set factory constraints
		//超过1k的字段数据采用临时文件缓存
		factory.setSizeThreshold(1024);

		// 设置硬盘缓存路径
		File tempDirectory = new File("D:\\BigData\\workspace\\javaWeb\\src\\main\\webapp\\tempDirectory");
		factory.setRepository(tempDirectory);

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		//最多上传5M数据 
		upload.setSizeMax(1024 * 1024 * 5);

		// Parse the request
		try {
			List<FileItem> items = upload.parseRequest(request);

			// Process the uploaded items
			Iterator<FileItem> iter = items.iterator();
			while (iter.hasNext()) {
				FileItem item = iter.next();

				if (item.isFormField()) {

					String name = item.getFieldName();
					String value = item.getString();
					System.out.println(name + ":" + value);
				} else {
					File uploadedFile = new File(
							"D:\\BigData\\workspace\\javaWeb\\src\\main\\webapp\\uploadedFile\\" + item.getName());
					item.write(uploadedFile);
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
