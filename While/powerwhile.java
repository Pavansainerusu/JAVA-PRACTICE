class powerwhile
{
	public static void main(String[]args)
	{
	int start=1,m=10,n=2,power=1;
	while(start<=n)
	{
		power=power*m;
		start++;
	}
	System.out.println(power);
	}
}