package com.zym.javaweb.mvc.tag;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ForEach extends SimpleTagSupport {
	// private Collection<?> items;
	private Object items;
	private String var;

	public void setItems(Object items) {
		this.items = items;
	}

	public void setVar(String var) {
		this.var = var;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		if (items == null) {
			return;
		}

		if (items instanceof Collection<?>) {
			Collection<?> itemsCollection = (Collection<?>) items;
			for (Object obj : itemsCollection) {
				
				getJspContext().setAttribute(var, obj);
				getJspBody().invoke(null);
			}
		} else if (items instanceof Map<?, ?>) {
			Map<?, ?> itemsMap = (Map<?, ?>) items;
			for (Entry<?, ?> entry : itemsMap.entrySet()) {
				getJspContext().setAttribute(var, entry);
				getJspBody().invoke(null);
			}

		}
	}

}
