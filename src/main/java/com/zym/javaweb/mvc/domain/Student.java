package com.zym.javaweb.mvc.domain;

public class Student {
	private int Id;
	private String name;
	private String location;
	private String gender;
	private int grade;

	public Student() {
	}

	public Student(int id, String name, String location, String gender, int grade) {
		Id = id;
		this.name = name;
		this.location = location;
		this.gender = gender;
		this.grade = grade;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
