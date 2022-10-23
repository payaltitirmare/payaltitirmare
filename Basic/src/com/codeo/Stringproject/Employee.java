package com.codeo.Stringproject;

public class Employee  implements Comparable<Employee>{

	int id = 0;
	String empname =null;
	int sallary =0;
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", sallary=" + sallary + "]";
	}

	public Employee(int id, String empname, int sallary) {
		super();
		this.id = id;
		this.empname = empname;
		this.sallary = sallary;
	}



	@Override
	public int compareTo(Employee o) {
		
		//if(this.empname.equals(o.))
		return this.empname.compareTo(o.empname);
	}
	

}
