/*
 * package com.gyl.web;
 * 
 * import javax.servlet.ServletContext;
 * 
 * import javax.servlet.ServletContextEvent; import
 * javax.servlet.ServletContextListener;
 * 
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.FileSystemXmlApplicationContext;
 *//**
	 * 
	 * @Decription spring的监听器
	 *             -----------其实不需要自己写。spring自己提供了，在web.xml中配置即可,详见web.xml，
	 * @author gyl Email:1076030424@qq.com
	 * @version 1.0
	 * @date 2020年2月8日下午4:09:56
	 *
	 */
/*
 * public class SpringContextListener implements ServletContextListener {
 * 
 * public SpringContextListener() { }
 * 
 * public void contextDestroyed(ServletContextEvent sce) { }
 * 
 *//**
	 * @see web应用服务器启动执行的方法
	 *//*
		 * public void contextInitialized(ServletContextEvent sce) { ServletContext
		 * servlectContext = sce.getServletContext(); String cfgLocation =
		 * servlectContext.getInitParameter("configLocation"); // 获取spring容器
		 * ApplicationContext context = new
		 * FileSystemXmlApplicationContext(cfgLocation);
		 * 
		 * servlectContext.setAttribute("application", context); }
		 * 
		 * }
		 */
