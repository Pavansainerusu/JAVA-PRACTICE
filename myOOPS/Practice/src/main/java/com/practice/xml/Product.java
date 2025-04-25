package com.practice.xml;

public class Product {
	int id;
	char grade;
	public Product(int id, char grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", grade=" + grade + "]";
	}
	

}
