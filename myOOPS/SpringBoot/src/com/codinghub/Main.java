package com.codinghub;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Main {

	public static void main(String[] args) {
		    int a[]=new int[] {1,2,3,4,5};
			Set<Integer>set=new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
			List<String>list=new LinkedList<String>(Arrays.asList("hyd","vij","Bvrm","Gdv"));
			Employee employee1=new Employee(1,"pavan",a,set,list);
			//System.out.println(employee1);
			Student student1=new Student(23,"tarun","tarun@gmail","a",97.5);
			//System.out.println(student1);
			Organization organization=new Organization(121,"Foundation",employee1,student1);
			System.out.println(organization);
			//Customer c=new Customer();
	}

}
