class Array
{
	public static void main(String[]args)
	{
		int rows=4,cols=7;
		int b[][]=new int[rows][cols];
		for(int r=0;r<=rows-1;r++)
		{
			for(int c=0;c<=cols-1;c++)
			{
			System.out.print(b[r][c]+" ");
			}
			System.out.println( );
		}
	}
}