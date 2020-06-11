/**
 * 
 */
package com.gyl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.gyl.model.User;
import com.gyl.service.UserService;

/**
 * @Decription
 * @author gyl  Email:1076030424@qq.com
 * @version 1.0
 * @date 2020年2月7日下午8:37:22
 *
 */
@WebServlet(urlPatterns= {"*.do"})
public class UserController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.servlet不支持注解
		ServletContext servletContext = req.getServletContext();
		//2.自己写的spring监听器
		/*
		 * ApplicationContext applicationContext = (ApplicationContext)servletContext.getAttribute("application");
		 */
		//3.spring提供的监听器
		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		
		UserService  userService =	(UserService)applicationContext.getBean("userService");
		List<User> list = userService.getList();
		list.forEach(System.out::println);
	    req.setAttribute("users", list);
	    req.getRequestDispatcher("/WEB-INF/JSP/index.jsp").forward(req, resp);
	}
}
