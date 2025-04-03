class Main
{
	public static void main(String[]args)
	{
	int a[]=new int[]{0,1,2,3,6,7,9};
	Main main=new Main();
	main.MissingElements(a);
}
	void MissingElements(int a[])
	{
		for(int x=0;x<=9;x++)
		{
			int count=0;
			for(int y=0;y<a.length;y++)
			{
				if(x==a[y])
				{
				  count++;
				  break;
				}
			}
		if(count==0)
		{
			System.out.println(x);
		}
		}
	}
}