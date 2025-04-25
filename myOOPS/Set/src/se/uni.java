package se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class uni {

	public static void main(String[] args) {
		ArrayList a=new ArrayList(Arrays.asList(10,20,30,40,50));
		ArrayList b=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
		Set s=new LinkedHashSet();
		s.addAll(a);
		s.addAll(b);
		
		System.out.println(s);
		//intersection//commom
		s.retainAll(a);
		s.retainAll(b);
		System.out.println(s);

		
	}

}
