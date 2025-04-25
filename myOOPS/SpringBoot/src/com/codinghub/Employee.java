package com.codinghub;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Employee {
	int id;
	String name;
	int[] a=new int[5];
	Set<Integer> set;
	List<String> list;
	
	public Employee(int id, String name, int[] a, Set<Integer> set, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
		this.set = set;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", a=" + Arrays.toString(a) + ", set=" + set + ", list=" + list
				+ "]";
	}
}
