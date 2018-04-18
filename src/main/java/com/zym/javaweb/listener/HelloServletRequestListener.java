package com.zym.javaweb.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class HelloServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequestListener 销毁" + sre.getServletRequest());

	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		
		System.out.println("ServletRequestListener 创建" + sre.getServletRequest());

	}

}
