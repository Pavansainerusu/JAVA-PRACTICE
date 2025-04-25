import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class priority {

	public static void main(String[] args) {
		PriorityQueue<Object> a=new PriorityQueue<Object>(Arrays.asList(30,10,90,100,1,8,105));
		System.out.println(a);
	//	a.poll();
    //		System.out.println(a);
		//min value first
		PriorityQueue<Integer> b =new PriorityQueue<Integer>();
		b.add(10);
		b.add(30);
		b.add(34);
		b.add(12);
		b.add(56);
		b.add(78);
		b.add(-3);
		b.add(9);
		System.out.println(b);
		
		//max value first
		PriorityQueue<Integer> c =new PriorityQueue<Integer>(Comparator.reverseOrder());
		c.add(10);
		c.add(30);
		c.add(34);
		c.add(12);
		c.add(56);
		c.add(78);
		c.add(-3);
		c.add(9);
		System.out.println(c);




	}

}
