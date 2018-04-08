package com.zym.javaweb.mvc.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

public class MaxTag implements SimpleTag {

	private PageContext pageContext;

	private String num1;
	private String num2;

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter outWriter = pageContext.getOut();
		if (Integer.parseInt(num1) > Integer.parseInt(num2)) {
			outWriter.print(num1);
		} else {
			outWriter.print(num2);
		}

	}

	@Override
	public void setParent(JspTag parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public JspTag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJspContext(JspContext pc) {

		this.pageContext = (PageContext) pc;
		// TODO Auto-generated method stub

	}

	@Override
	public void setJspBody(JspFragment jspBody) {
		// TODO Auto-generated method stub

	}

}
