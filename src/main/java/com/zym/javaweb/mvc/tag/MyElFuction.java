package com.zym.javaweb.mvc.tag;

public class MyElFuction {
	public static int length(Object var) {
		int length;
		if (var == null) {
			length = 0;
		} else {
			length = ((String)var).length();
		}
		return length;
	}
}
