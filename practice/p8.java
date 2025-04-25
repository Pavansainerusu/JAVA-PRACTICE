class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c;
		char letter='A';
		for(r=1;r<=rows;r++)
		{
			for(c=rows;c>r;c--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=r;z++)
			{
				System.out.print(letter+" ");	
				letter++;
			}
		System.out.println( );

		}
	}
}

