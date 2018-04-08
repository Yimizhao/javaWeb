package com.zym.javaweb.mvc.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;


public class myTag implements SimpleTag {
	
	private PageContext pageContext;
	
	private String value;
	private String count;
	public void setCount(String count) {
		this.count = count;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	

	@Override
	public void doTag() throws JspException, IOException {
		
		
//		HttpServletRequest request = (HttpServletRequest) this.pageContext.getRequest();
//		pageContext.getOut().print("hello" + request.getParameter("name"));
		JspWriter out = pageContext.getOut();
		for (int i = 0; i < Integer.parseInt(count); i++) {
			out.print(i + 1 + ":" + value);
			out.print("<br>");
		}

	}

	@Override
	public JspTag getParent() {
		System.out.println("getParent");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJspBody(JspFragment arg0) {
		System.out.println("setJspBody");
		// TODO Auto-generated method stub

	}

	@Override
	public void setJspContext(JspContext arg0) {
		
		
		this.pageContext = (PageContext)arg0;
		// TODO Auto-generated method stub

	}

	@Override
	public void setParent(JspTag arg0) {
		System.out.println("setParent");
		// TODO Auto-generated method stub

	}

}
