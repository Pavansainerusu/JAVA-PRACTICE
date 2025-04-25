package com.codinghub;

public class Organization {
	int o_id;
	String o_name;
	Employee employee;
	Student student;
	public Organization(int o_id, String o_name, Employee employee, Student student) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
		this.employee = employee;
		this.student = student;
	}
	@Override
	public String toString() {
		return "Organization [o_id=" + o_id + ", o_name=" + o_name + ", employee=" + employee + ", student=" + student
				+ "]";
	}
	

}
