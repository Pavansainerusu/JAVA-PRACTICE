class pattern25
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
	for(c=2;c<=r*2;c++)
	{
		if(c==2||r==rows||r*2==c)
		System.out.print("$ ");
		else
		System.out.print("  ");
	}
		System.out.println();
	}

	}
}