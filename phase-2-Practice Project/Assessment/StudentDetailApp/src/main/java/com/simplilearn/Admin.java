package com.simplilearn;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Admin {
	private long ID;
	private String name;
	private List<Student> student;
	private Collection<Teacher> Teacher;
	private Set<Subject> subject;
	private Map classs;

	public Admin() {

	}

	public long getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}


	public List<Student> getStudent() {
		return this.student;
	}

	public Collection<Teacher> getTeachers() {
		return this.Teacher;
	}

	public Set<Subject> getSubject() {
		return this.subject;
	}

	public Map getClasss() {
		return this.classs;
	}

	public void setID(long id) {
		this.ID = id;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public void setTeachers(Collection<Teacher> teacher) {
		this.Teacher = teacher;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	public void setClasss(Map classs) {
		this.classs =classs ;
	}
}