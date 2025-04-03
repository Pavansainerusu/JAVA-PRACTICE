class pattern26
{
	public static void main(String[]args)
	{
	int r,c,rows=5,temp=0;
	for(r=1;r<=rows;r++)
	{
		temp=r-1;
		for(c=rows;c>=r;c--)
		{
			System.out.print("# ");
				
		}
	for(c=1;c<=r;c++)
	{
	System.out.print(c+" ");
	}
	for(c=1;c<r;c++)
	{
		System.out.print(temp+" ");
		temp--;
	}
		System.out.println();
	}

	}
}