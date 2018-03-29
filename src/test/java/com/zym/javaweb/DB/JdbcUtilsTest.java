package com.zym.javaweb.DB;


import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.zym.javaweb.mvc.DB.JdbcUtils;

public class JdbcUtilsTest {

	@Test
	public void testGetConnection() throws SQLException {
		Connection connection = JdbcUtils.getConnection();
		System.out.println(connection);
	}

}
