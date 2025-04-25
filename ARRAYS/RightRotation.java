class Array
{
	public static void main(String[]args)
	{
	int a[]=new int[]{10,20,30,40,50,60};
	int x,temp=a[a.length-1];
	for(x=a.length-1;x>0;x--)
	{
		a[x]=a[x-1];
	}
		a[0]=temp;
	for(x=0;x<a.length;x++)
	{
		System.out.println(a[x]+"");
	}
}
}
