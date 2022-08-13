package com.simplilearn;

public class Classs {
	private long ClassID;
	private String name;
    private String Ctype;

	public Classs() {

	}

	public Classs(String name, String Ctype) {
		this.ClassID = 0;
		this.name = name;
		this.Ctype = Ctype;
	}

	public long getClassID() {
		return this.ClassID;
	}

	public String getName() {
		return this.name;
	}

	public String getCtype() {
		return this.Ctype;
	}

	public void setClassID(long id) {
		this.ClassID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCtype(String Ctype) {
		this.Ctype = Ctype;
	}

}
