class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c;
		for(r=1;r<=rows;r++)
		{
			for(c=rows;c>r;c--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=r;z++)
			{
				if(z==1||r==rows||z==r)
				System.out.print("# ");
				else
				System.out.print("  ");

			}
		System.out.println( );

		}
	}
}

