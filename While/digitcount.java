class digitcount
{
	public static void main(String[]args)
	{
	int a=143,count=0,temp=a;
	while(a!=0)
	{
		int rem = a%10;
		count++;
		a=a/10;
	}
		System.out.println(count);
}
}