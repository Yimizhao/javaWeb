package com.zym.javaweb.fileupload.listener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.zym.javaweb.fileupload.utils.FileUploadProperities;

/**
 * Application Lifecycle Listener implementation class FileUploadListener
 *
 */
@WebListener
public class FileUploadListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public FileUploadListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		InputStream in = this.getClass().getResourceAsStream("/properties/fileUpload.properities");
		Properties properties = new Properties();
		try {
			properties.load(in);
			for (Entry<Object, Object> properity : properties.entrySet()) {
				FileUploadProperities.getInstance().addProperities((String) properity.getKey(),
						(String) properity.getValue());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
