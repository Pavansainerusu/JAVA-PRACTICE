class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c,temp=0;
		for(r=1;r<=rows;r++)
		{
			temp=rows;
			for(c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=r;z--)
			{
				System.out.print(temp+" ");
				temp--;
			}
		System.out.println();

		}
	}
}