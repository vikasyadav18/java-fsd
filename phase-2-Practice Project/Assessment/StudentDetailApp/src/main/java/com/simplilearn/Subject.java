package com.simplilearn;

public class Subject {

	private long subjectID;
	private String name;

	public Subject() {

	}

	public Subject(String name) {
		this.subjectID = 0;
		this.name = name;
	}

	public long getsubjectID() {
		return this.subjectID;
	}

	public String getName() {
		return this.name;
	}

	public void setsubjectID(long id) {
		this.subjectID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
