package com.demo.beans;

public class Employee {
	
	//parameters
	private int eid;
	private String enm;
	private String desg;
	private double sal;

	
	//default constructor
	public Employee() {
		super();
	}
	
	//parameterised constructor
	
	public Employee(int eid, String enm, String desg, double sal) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.desg = desg;
		this.sal=sal;
	
	}
	
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnm() {
		return enm;
	}
	public void setEnm(String enm) {
		this.enm = enm;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enm=" + enm + ", desg=" + desg +"sal=" + sal+  "]";
	}
	
	

}
