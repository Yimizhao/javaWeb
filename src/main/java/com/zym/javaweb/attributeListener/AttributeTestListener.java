package com.zym.javaweb.attributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class AttributeTestListener
 *
 */
@WebListener
public class AttributeTestListener
		implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

	/**
	 * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
	 */
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute 删除  "+ srae.getName() + " " + srae.getValue());
	}

	/**
	 * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
	 */
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute 增加   " + srae.getName() + " " + srae.getValue());
	}

	/**
	 * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
	 */
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("requestAttribute 修改  " + srae.getName() + " " + srae.getValue());
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("HttpSessionAttribute 增加  "+ se.getName() + " " + se.getValue());
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("HttpSessionAttribute 删除  "+ se.getName() + " " + se.getValue());
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("HttpSessionAttribute 修改  "+ se.getName() + " " + se.getValue());
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
		System.out.println("ServletContexAttribute 增加  "+ scae.getName() + " " + scae.getValue());
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
		System.out.println("ServletContexAttribute 删除  "+ scae.getName() + " " + scae.getValue());
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
		System.out.println("ServletContexAttribute 修改  "+ scae.getName() + " " + scae.getValue());
	}

}
