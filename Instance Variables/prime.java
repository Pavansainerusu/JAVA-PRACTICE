class Myclass
{
	public static void main(String[]args)
	{
	c2 d=new c2();
	d.m1();
      
	System.out.println(d.m2(num));
	}
}
class c2
{
	void m1()
	{
		for(int x=1;x<=100;x++)
		{
			int num=x,count=0;
			for(int start=2;start<=num/2;start++)
			{
			        if(num%start==0)
				         count++;
			}
		      if(count==0&&num>=2)
		           System.out.println(num+"prime");
		}
	}
	void m2()
	{
		
			for(int start=2;start<=num/2;start++)
			{
			      if(num%start==0)
				count++;
			}
		        if(count==0&&num>=2)
		             System.out.println(num+"prime");    	
		 }
              
	}
}