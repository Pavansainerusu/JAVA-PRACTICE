
package com.codinghub;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Customer {
	int id;
	String[] items;
	List price;
	Set email;
	public Customer(int id, String[] items, List price, Set email) {
		super();
		this.id = id;
		this.items = items;
		this.price = price;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", items=" + Arrays.toString(items) + ", price=" + price + ", email=" + email
				+ "]";
	}
	

}
