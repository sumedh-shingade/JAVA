package com.demo.beans;

public class Person {
	private int id;
	private String pname;
	
	public Person(int id, String pname) {
		this.id = id;
		this.pname = pname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + "]";
	}
	
	
}
