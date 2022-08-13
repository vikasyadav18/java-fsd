package com.simplilearn;

public class Teacher {
	private long TeacherId;
	private String Name;

	public Teacher() {

	}

	
	public Teacher(String Name) {
		this.TeacherId = 0;
		this.Name = Name;
	}

	public void setTeacherId(long id) {
		this.TeacherId= id;
	}

	public long getTeacherId() {
		return this.TeacherId;
	}

	public String getName() {
		return this.Name;
	}

	
	public void setName(String name) {
		this.Name = name;
	}

}