class User
{
	public static void main(String[]args)
	{
	int a[]=new int[]{10,60,-20,30,-40,50};
	User user=new User(); 
	int[] r=user.SortingUsingSingleLoop(a);
	for(int temp:r)
	{
		System.out.println(temp+" ");
	}
	}
	int[] SortingUsingSingleLoop(int[] b)
	{
		for(int x=0;x<=b.length-2;x++)
		{
			if(b[x]>b[x+1])
			{
				int t=b[x];
				b[x]=b[x+1];
				b[x+1]=t;
				x=-1;
			}
		}
		return b;
	}
}
	