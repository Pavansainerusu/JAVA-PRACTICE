class pattern22
{
	public static void main(String[]args)
	{
	int r,c,rows=5;

	for(r=1;r<=rows;r++)
	{
		for(c=r;c<=rows;c++)
		{
			System.out.print("# ");
		}
		System.out.println();
	}
	for(r=2;r<=rows;r++)
	{
		for(c=1;c<=r;c++)
		{
			System.out.print("# ");
		}
		System.out.println();
	}
}
}