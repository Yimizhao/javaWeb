package com.zym.javaweb.mvc.tag;

public class MyElFuction {
	public static int length(String var) {
		int length;
		if (var == null) {
			length = 0;
		} else {
			length = var.length();
		}
		return length;
	}
}
