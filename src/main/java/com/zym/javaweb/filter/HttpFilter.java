package com.zym.javaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpFilter implements Filter {

	private FilterConfig filterConfig;

	public FilterConfig getFilterConfig() {
		return filterConfig;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		init();
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request;
		HttpServletResponse response;
		request = (HttpServletRequest) req;
		response = (HttpServletResponse) res;
		doFilter(request, response, chain);
	}

	@Override
	public void destroy() {
	}

	public void init() {
	}

	public abstract void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain);
}
