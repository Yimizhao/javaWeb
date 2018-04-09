package com.zym.javaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class PassWordFilter implements Filter {
	private FilterConfig filterConfig;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest res= (HttpServletRequest)request;
		// 获取页面name
		String password = res.getParameter("password");
		// 获取固定name
		String initpassword = this.filterConfig.getInitParameter("password");
		if (password != null && password.equals(initpassword)) {
			
			res.removeAttribute("MSG");
			chain.doFilter(request, response);
		} else {
			res.setAttribute("MSG", "密码错误");
			res.getRequestDispatcher("/filter/login.jsp").forward(request, response);
		}

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}

}
