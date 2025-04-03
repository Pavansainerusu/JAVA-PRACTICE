class lastdigit
{
	public static void main(String[]args)
	{
	int start=100,end=200,pro=0;
	while(end>=start)
	{
		pro=start%10;
		System.out.println(start+ "last digit is"+pro);

		start++;
	}
	}
}