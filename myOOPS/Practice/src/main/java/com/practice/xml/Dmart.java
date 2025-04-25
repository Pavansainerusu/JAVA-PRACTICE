package com.practice.xml;

public class Dmart {
	String name;
	Product product;
	public Dmart(String name, Product product) {
		super();
		this.name = name;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Dmart [name=" + name + ", product=" + product + "]";
	}

}
