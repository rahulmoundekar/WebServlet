package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rahul Moundekar
 * Servlet Filter implementation class CacheFilter
 */
@WebFilter("/CacheFilter")
public class CacheFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("in cache init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		res.addHeader("Pragma", "no-cache");
		res.addHeader("Cache-Control", "no-cache");
		res.addHeader("Cache-Control", "no-store");
		res.addHeader("Cache-Control", "must-revalidate");
		String userAgent = req.getHeader("User-Agent");
		System.out.println("user info : " + userAgent);
		chain.doFilter(request, response);
	}

	public void destroy() {
		System.out.println("in destroy cache filter");
	}

}
