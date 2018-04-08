package com.zym.javaweb.mvc.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintUpper extends SimpleTagSupport {
	private String count;

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		int c = 0;
		c = Integer.parseInt(this.count);
		System.out.println(c);
		StringWriter sw = new StringWriter();
		JspFragment jspBody = getJspBody();
		jspBody.invoke(sw);
		String linString = sw.toString().toUpperCase().toString();
		JspWriter outJspWriter = getJspContext().getOut();
		for (int i = 0; i < c; i++) {
			outJspWriter.println(i + 1 + ":" + linString + "<br>");
//			outJspWriter.println("<br>");
		}
	}

}
