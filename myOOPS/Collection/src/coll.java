import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class coll {
	public static void main(String[]args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
////////////////////////////////////////////////////////////////
		ArrayList<Character> b=new ArrayList<Character>();
		String s="hello all"; //op: aehllo
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			b.add(c);
		}
		System.out.println(b);
		Collections.sort(b);
		System.out.println(b);
/////////////////////////////////////////
		ArrayList<Character> d=new ArrayList<Character>();
		String s1="malayalam",s2=""; 
		for(int x=0;x<s1.length();x++)
		{
			char c1=s1.charAt(x);
			d.add(c1);
		}
		System.out.println(Collections.max(d));
		Object[] obj1=d.toArray();
		//System.out.println(obj1);
		Collections.reverse(d);
		Object[] obj2=d.toArray();
		//System.out.println(obj2);
		if(Arrays.equals(obj1, obj2))
			System.out.println("palindrome");
		else
		    System.out.println("not palindrome");


	}

}
