class Array
{
	public static void main(String[]args)
	{
		int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<b.length;r++)
		{
			for(int c=0;c<=b[r].length-1;c++)
			{
				if(r==c||r+c==2)
					System.out.print(b[r][c]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
