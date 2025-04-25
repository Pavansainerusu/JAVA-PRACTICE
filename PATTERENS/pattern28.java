class pattern28
{
	public static void main(String[]args)
	{
	int rows=5,c;
	for(int r=1;r<=rows;r++)
	{
		for(c=1;c<=r;c++)
		{
			System.out.print("  ");
				
		}
	for(c=rows;c>=r;c--)
	{
		System.out.print("$ ");
	}
	for(c=rows;c>=r;c--)
	{
		System.out.print("& ");
	}

	
		System.out.println();
	}

	}
}