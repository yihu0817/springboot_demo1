package com.ittx.java1608.springbootdemo1.interceptor;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(value="/*")
public class LoginFilter implements Filter {

    public LoginFilter() {
    	 System.out.println("过滤器初始化");
    }

	public void destroy() {
		 System.out.println("过滤器销毁");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		  System.out.println("执行过滤操作>>>>>");
		// pass the request along the filter chain
		
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
