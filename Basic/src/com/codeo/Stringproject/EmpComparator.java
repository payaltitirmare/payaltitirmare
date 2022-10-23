package com.codeo.Stringproject;

public class EmpComparator {

	public EmpComparator(int id, String empname, int sallary) {
		super();
		this.id = id;
		this.empname = empname;
		this.sallary = sallary;
	}
	int id = 0;
	String empname =null;
	int sallary =0;
	
	
	@Override
	public String toString() {
		return "EmpComparator [id=" + id + ", empname=" + empname + ", sallary=" + sallary + "]";
	}
	
	
}
