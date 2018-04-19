package com.zym.javaweb.fileupload.utils;

import java.util.HashMap;
import java.util.Map;

public class FileUploadProperities {
	private Map<String, String> properties = new HashMap<>();

	private static FileUploadProperities fileUploadProperities = new FileUploadProperities();

	public static FileUploadProperities getInstance() {
		return fileUploadProperities;
	}

	public void addProperities(String properitiesKey, String properitiesValue) {
		properties.put(properitiesKey, properitiesValue);
	}

	public String getProperty(String properitiesKey) {
		return properties.get(properitiesKey);
	}

}
