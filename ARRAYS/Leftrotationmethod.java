class Array
{
	public static void main(String[]args)
	{
	int a[]=new int[]{10,20,30,40,50};
	User user=new User(); 
	
	int rotate=3;
	for(int x=1;x<=rotate;x++)
	{int r[]=user.leftRotation(a);
		for(int z:r)
		{
		System.out.print(z+" ");
		}
		System.out.println();
	}

}
}
class User
{
	int[] leftRotation(int a[])
	{
		int x,temp=a[0];
		for(x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
			a[x]=temp;
			return a;
	}
}