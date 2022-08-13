package com.simplilearn;

public class Student {
	private long StudentID;
	private String name;

	public Student() {

	}

	public Student(String name) {
		this.StudentID = 0;
		this.name = name;
	}

	public long getStudentID() {
		return this.StudentID;
	}

	public String getName() {
		return this.name;
	}

	public void setStudentID(long id) {
		this.StudentID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}