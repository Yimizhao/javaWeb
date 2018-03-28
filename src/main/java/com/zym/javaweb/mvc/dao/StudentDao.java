package com.zym.javaweb.mvc.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zym.javaweb.mvc.domain.Student;

public class StudentDao {
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<>();
		String JDBD_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/atguigu?serverTimezone=UTC";
		String USER = "root";
		String password = "123456";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sqlString = "SELECT Id , name , location, gender, grade FROM student";
			Class.forName(JDBD_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, password);
			preparedStatement = connection.prepareStatement(sqlString);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int Id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String location = resultSet.getString(3);
				String gender = resultSet.getString(4);
				int grade = resultSet.getInt(5);
				Student student = new Student(Id, name, location, gender, grade);
				students.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
}
