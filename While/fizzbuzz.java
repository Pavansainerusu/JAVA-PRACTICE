//fizz&buzz
class fizzbuzz
{
	public static void main(String[]args)
	{
	int start=100,end=1000;
	while(start<=end)
	{
	if(start%3==0&&start%5==0)
	System.out.println("fizz,buzz");
	else if(start%3==0)
	System.out.println("fizz");
	else if(start%5==0)
	System.out.println("buzz");
	else
	System.out.println(start);

	start++;
}
}
}

	
	