class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c,temp=1;
		for(r=1;r<=rows;r++)
		{
			temp=1;
			for(c=rows;c>r;c--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=r;z++)
			{
				System.out.print(temp+" ");	
				temp++;
			}
		System.out.println( );

		}
	}
}

