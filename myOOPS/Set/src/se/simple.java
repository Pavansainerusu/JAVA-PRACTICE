package se;
import java.util.Arrays;
import java.util.HashSet;

public class simple {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>(Arrays.asList());
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
