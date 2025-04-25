package unique;

import java.util.ArrayList;
import java.util.Arrays;

public class uni {

	public static void main(String[] args) {
		String s="madam arora teaches malayalam";
		String str[]=s.split(" ");
		ArrayList<String> b=new ArrayList<String>(Arrays.asList(str));

		for(int x=0;x<b.size();x++)
		{
			String word=b.get(x);
			if(b.indexOf(word)==b.lastIndexOf(word))
			{
				System.out.println(word);
			}
				
		}

	}

}
