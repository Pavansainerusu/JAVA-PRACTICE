class myclass
{
	public static void main(String[]args)
	{	
		int rows=5;
		char c1='a',c2='A';
		for(int r=1;r<=rows;r++)
		{
			char t1=(char)(c1-1);
			char t2=c2;
		for(int c=rows;c>=r;c--)
		{
		if(r%2==0)
			System.out.print(t1++);
		else	
			System.out.print(t2++);
		}
		c1++;
		c2++;
	System.out.println();
	}
	}
}
