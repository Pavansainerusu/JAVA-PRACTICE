import java.util.*;
public class hash 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map Hm= new HashMap();
		/*Hm.put(1,3);
		Hm.put(2,null);
		Hm.put(3,'a');
		Hm.replace(1, 5);//replacing with key 
		Hm.containsValue('a');
		Hm.remove(3, 'b');//removing with the key value 
		System.out.println(Hm);
		System.out.println(	Hm.containsKey(3));//true
		System.out.println(	Hm.containsValue(10));//true
		System.out.println(	Hm.get(3));//getting key value
		System.out.println( Hm.remove(1));//removing key and getting value
		System.out.println(Hm.getOrDefault(5 , "default"));
		System.out.println(Hm.getOrDefault(1 , "default"));
		Hm.get(5);
		Set ks=Hm.keySet();
		Collection c=Hm.values();
		System.out.println(c);
		Set es=Hm.entrySet();
		System.out.println(es);*/
		Map<Integer,String> m=new HashMap<Integer,String>();
		Hm.put(1, "hello");
		Hm.put(2, "hello");
		Hm.put(3, "hello");
		Hm.put(4, "hello");
		/*for(Map.Entry<Integer,String> e:Hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getvalue());
		}*/
		Hm.replaceAll((x,y)->"replaced");
		System.out.println(Hm);
		Hm.compute(24,(x,y)->"i am 24 key");
		System.out.println(Hm);
		Hm.computeIfAbsent(5,(x)->"compute if absent");
		System.out.println(Hm);
		Hm.computeIfPresent(1,(x,y)->"compute if present");
		System.out.println(Hm);
		

		
		//linkedHashMap
		//Map Lm= new LinkedHashMap();
		//Lm.put(1,null);
		//Lm.put(2,null);
		//Lm.put(null,null);
		//Lm.put(null,"hello");
		//Lm.put(2,"sai");
		//Lm.put(3,'a');
		//System.out.println(Lm);
	}

}
