package com.zxh.job.interceptor;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoginInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		String contextPath = session.getServletContext().getContextPath();
		String[] noNeedAuthPage = new String[] { 
				"loginui", 
				"personlogin", 
				"enterpriselogin", 
				"registerui", 
				"personregister", 
				"enterpriseregister",
				"indexui",
				"search",
				"sort",
				"choosearea",
				"indexdetail",
				"admin",
				"adminlogin"
				};

		String uri = request.getRequestURI();
		uri = StringUtils.remove(uri, contextPath);
		//System.out.println(uri);
		if(uri.startsWith("/")){
            String method = StringUtils.substringAfterLast(uri,"/" );
            //System.out.println(method);
			if (!Arrays.asList(noNeedAuthPage).contains(method)) {
				int personid = 0;
				int enterpriseid = 0;
				int adminid = 0;
				try {
					personid = (int) session.getAttribute("personid");
				} catch (Exception e) {
				}
				try {
					enterpriseid = (int) session.getAttribute("enterpriseid");
				} catch (Exception e) {
				}
				try {
					adminid = (int) session.getAttribute("adminid");
				} catch (Exception e) {
				}
				
				if (personid == 0 && enterpriseid==0 && adminid==0) {
					response.sendRedirect("loginui");
					return false;
				}
			}
		}

		return true;

	}

	/**
	 * 在业务处理器处理请求执行完成后,生成视图之前执行的动作 可在modelAndView中加入数据，比如当前时间
	 */

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
	 * 
	 * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
	 */

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}
}
