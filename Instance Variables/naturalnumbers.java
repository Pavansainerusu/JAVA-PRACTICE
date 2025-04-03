class Myclass
{
	public static void main(String[]args)
	{
	c2 d=new c2();
	System.out.println(d.m2());
	d.m1();
	}
}
class c2
{
	void m1()
	{
		int sum=0;
		for(int start=1;start<=10;start++)
		{
			sum+=start;
		}
		System.out.println(sum+" m1");
	}
	int m2()
	{
		int sum=0;
		for(int start=1;start<=10;start++)	
		{
			sum+=start;
		}
		return 6788;
	}
}

