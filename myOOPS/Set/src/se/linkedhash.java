package se;

import java.util.LinkedHashSet;

public class linkedhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
		hs.add(10);
		hs.add(10);
		hs.add(23.45);
		hs.add("hii");
		hs.add('a');
		hs.add(null);
		hs.add(false);
		System.out.println(hs);

	}

}
