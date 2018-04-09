package com.zym.javaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class UserNameFilter implements Filter {

	private FilterConfig filterConfig;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
//		System.out.println("UserNameFilter");
		HttpServletRequest res= (HttpServletRequest)request;
		// 获取页面name
		String username = res.getParameter("name");
		// 获取固定name
		String initName = this.filterConfig.getInitParameter("username");
		if (username != null && username.equals(initName)) {
			
			res.removeAttribute("MSG");
			chain.doFilter(request, response);
		} else {
			res.setAttribute("MSG", "用户名输入错误");
			res.getRequestDispatcher("/filter/login.jsp").forward(request, response);
		}

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}

}
