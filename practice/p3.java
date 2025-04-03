class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c;
		for(r=1;r<=rows;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=r;z--)
			{
				System.out.print("# ");
			}
		System.out.println();

		}
	}
}