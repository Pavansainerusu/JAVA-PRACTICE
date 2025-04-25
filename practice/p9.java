class myclass
{
	public static void main(String[]args)
	{	
		int rows=5,colums=5,r,c,temp=1;
		for(r=1;r<=rows;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=r;z--)
			{
				if(r%2==0)
				{
				temp--;	
				System.out.print(temp+" ");
				}
				else
				{
				System.out.print(temp+" ");
				temp++;	
				}

			}
		System.out.println();

		}
	}
}