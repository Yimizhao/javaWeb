package com.zym.javaweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class
 * HelloSeverletContextListener
 *
 */
public class HelloSeverletContextListener implements ServletContextListener {

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("销毁" + sce.getServletContext());
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("创建" + sce.getServletContext());

	}

}
