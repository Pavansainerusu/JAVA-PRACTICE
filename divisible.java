class divisible
{
	public static void main(String[]args)
{
	int a=25;
	if(a%2==0)
	{
		if(a%5==0)
		System.out.println("it is divisible by both 2&5");
	}
	else if(a%2==0)
	System.out.println("Divisible by only 2");
	else if(a%5==0)
	System.out.println("Divisible by only 5");
	else
	System.out.println("not Divisible by 2&5");
}
}


