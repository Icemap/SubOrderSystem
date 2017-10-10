package com.gig.sub.order.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gig.sub.order.bean.ResultBean;
import com.google.gson.Gson;

public class PermissionsFilter implements Filter
{

	/** Filter Config Info **/
	private FilterConfig config;

	public void init(FilterConfig config) throws ServletException
	{
		this.config = config;
	}

	public void destroy()
	{
		this.config = null;
	}

	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		Boolean isLogin = false;
		HttpServletRequest hrequest = (HttpServletRequest) request;
		HttpServletResponse hresponse = (HttpServletResponse) response;
		
		String uri = hrequest.getRequestURI();
		if(!uri.contains(".perm")) chain.doFilter(request, response);
		
		Cookie[] cookies = hrequest.getCookies();
		for(Cookie cookie : cookies)
		{
			if(! cookie.getName().equals("sub-order-token")) continue;
			String token = cookie.getValue();
			if(true)//token验证
				isLogin = true;
		}
		
		//这段是为了测试加的，以便能通过请求
		isLogin = true;
		
		if(isLogin)
			chain.doFilter(request, response);
		else
			hresponse.getWriter().println(new Gson().toJson(
					ResultBean.tokenKeyNotValid()));
	}
}