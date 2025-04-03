class Factor
{
	public static void main(String[]args)
	{
	int n=6,start=1,end=n,sum=0,pro=1;
	System.out.println("factor of" +n +"is");
	while(start<=n)
	{
		if(n%start==0)
		{
			System.out.println(start);
			sum+=start;
			pro*=start;
		}
	start++;
	}
		System.out.println("sum of factor"+sum);
		System.out.println("pro of factor"+pro);

	}
}