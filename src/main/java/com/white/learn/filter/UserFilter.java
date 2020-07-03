package com.white.learn.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UserFilter implements Filter {
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		System.out.println("this is UserFilter,url :"+request.getRequestURI());
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
