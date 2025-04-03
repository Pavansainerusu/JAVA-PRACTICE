class pattern20
{
	public static void main(String[]args)
	{
	int rows=5;
 		
        for(int r=1;r<=rows;r++)//
	{
		  int temp=1;
                  char letter='A';

		for(int c=1;c<=r;c++)		
		{
                   
           		if(c==1||r==rows||r==c)
		        {
			System.out.print(temp+" ");
			temp++;
		        }
		
		else
                {
			System.out.print(letter+" ");
                        letter++;
			

		}
		
              }
		System.out.println();
	}

}
}			