class main
{
	public static void main(String[]args)
	{
	int row=5,r,c;
 	for(r=1;r<=row;r++)
 	{
  		for(c=row;c>=r;c--)
  		{
   			System.out.print("  ");
 		 }
  		for(c=1;c<=r;c++)
  		{
   			System.out.print("# ");
  		}
  		for(c=2;c<=r;c++)
  		{
   			System.out.print("# ");
  		}
  		System.out.println();
 	}
      for(r=2;r<=row;r++)
 	{
  		for(c=1;c<=r;c++)
  		{
   			System.out.print("  ");
  		}
  		for(c=row;c>=r;c--)
  		{
  			 System.out.print("# ");
  		}
  		for(c=row-1;c>=r;c--)
  		{
   			System.out.print("# ");
 		 }
 	 System.out.println();
 	}
}
}