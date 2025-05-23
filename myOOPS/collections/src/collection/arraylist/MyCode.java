package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCode {
	public static void main(String args[])
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Kiran");
		al.add(12);
		al.add(12);
		al.add(true);
		al.add(null);
		al.add('q');
		al.add(12.22);
		al.add("Kiran");
		al.add(null);
		System.out.println("Using for-Each enhanced Loop:");
		for(Object o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println("\nUsing for-Each Method:");
		al.forEach(x->System.out.print(x+" "));
		System.out.println("\nUsing for Loop:");
		for(int x=0;x<al.size();x++)
		System.out.print(al.get(x)+" ");
		boolean b=al.contains(123);
		System.out.println(b);
		ArrayList<Object> c=new ArrayList<>();
		c.addAll(al);
		System.out.println(c);
		al.addFirst(3345);
		System.out.println(al);
		al.addAll(3, c);
		System.out.println(al);
		al.add(155555);
		System.out.println(c.containsAll(al));
		al.set(2, 13);
		System.out.println(al);
		System.out.println(al.reversed());
		List<Object> rc=c.reversed();
		System.out.println(rc);
		ArrayList<Number> la=new ArrayList<Number>(Arrays.asList(12,3,4,12,12.34,13.4f,12));
		System.out.println(la);
		
	}
}
