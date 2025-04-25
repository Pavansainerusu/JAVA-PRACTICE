class digit
{
	public static void main(String[]args)
	{
	int a=143;
	while(a!=0)
	{
		int rem=a%10;
		System.out.println(rem);
		a=a/10;
	}
	}
}