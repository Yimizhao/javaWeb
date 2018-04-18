package com.zym.javaweb.ecCode;

import com.zym.javaweb.filter.HttpFilter;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class EnCodeFilter
 */
@WebFilter("/*")
public class EnCodeFilter extends HttpFilter {
	private String encoding;
	
	@Override
	public void init() {
		this.encoding = getFilterConfig().getServletContext().getInitParameter("encoding");
	}

	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
	}


}
