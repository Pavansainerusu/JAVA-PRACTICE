class Main
{
	public static void main(String[]args)
	{
	int a[]=new int[]{0,1,2,3,6,7,9};
	Main main=new Main();
	main.ZerosLast(a);
}
	void ZerosLast(int a[])
	{
		int c1=0,c2=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==0)
			{
			   c1++;
			}
			else
			{
			  a[c2]=a[x];
			  c2++;
			}
		}	
		for(int x=1;x<=c1;x++)
		{
			a[a.length-x]=0;
		}
		for(int t:a)
		{
			System.out.println(t);
		}
	}
}
