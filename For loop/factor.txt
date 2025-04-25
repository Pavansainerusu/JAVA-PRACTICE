//Finding power for the given number
class power
{
	public static void main(String[]args)
	{
	int m=10,n=2,power=1;
	for(int start=1;start<=n;start++)
	{
		power=power*m;
	}
	System.out.println(power);
	}
}