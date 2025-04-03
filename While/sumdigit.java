class sumdigit
{
	public static void main(String[]args)
	{
	int a=143,sum=0,temp=a;
	while(a!=0)
	{
		int rem=a%10;
		sum+=rem;
		a=a/10;
	System.out.println(sum);
	}
	System.out.println("sum for " +temp +" is " +sum);
	
	}
}