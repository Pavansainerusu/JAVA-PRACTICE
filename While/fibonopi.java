class fibonopi
{
	public static void main(String[]args)
	{
		int start=1,a=0,b=1,n=6,c;
		System.out.println("fibonopi of"+n+"is");
		System.out.println(a);
		System.out.println(b);

		while(start<=n)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			start++;
		}
	}
}
		