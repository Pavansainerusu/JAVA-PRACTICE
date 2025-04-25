class pattern23
{
	public static void main(String[]args)
	{
	int r,c,rows=5;

	for(r=1;r<=rows;r++)
	{
		for(c=r;c<=rows;c++)
		{
			if(r==1||r==c||c==rows)
			System.out.print("# ");
			else
			System.out.print("  ");
		}
		System.out.println();
	}
	for(r=2;r<=rows;r++)
	{
		for(c=1;c<=r;c++)
		{
			if(c==1||r==rows||c==r)
			System.out.print("# ");
			else
			System.out.print("  ");

		}
		System.out.println();
	}
}
}