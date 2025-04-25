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
				if(r==1||r==z||z==rows)
				System.out.print("# ");
				else
				System.out.print("  ");

			}
		System.out.println();

		}
	}
}