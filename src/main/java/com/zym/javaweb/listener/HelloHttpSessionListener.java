package com.zym.javaweb.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HelloHttpSessionListener
 *
 */
public class HelloHttpSessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public HelloHttpSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("HttpSessionListener 创建" + se.getSession());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("HttpSessionListener 销毁" + se.getSession());
    }
	
}
