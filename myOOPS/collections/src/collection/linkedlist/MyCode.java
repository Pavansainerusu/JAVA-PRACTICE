package collection.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class MyCode {
	public static void main(String args[])
	{
		LinkedList<Object> ll=new LinkedList<Object>(Arrays.asList("Alpha",1,"Alpha",!true,1,null,null,false,10,12.34,12.34));
		ll.addFirst(12);
		System.out.println(ll);
		Iterator<Object> il=ll.descendingIterator();
		while(il.hasNext())
			System.out.print(il.next()+" ");
		System.out.println();
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
		System.out.print(li.next()+" ");
		System.out.println();
		while(li.hasNext())
			System.out.print(li.next()+" ");
		System.out.println();
		while(li.hasPrevious())
			System.out.print(li.previous()+" ");
	}
}
