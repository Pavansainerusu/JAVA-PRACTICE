class Array
{
	public static void main(String[]args)
	{
	int a[]=new int[]{10,20,30,40,50,60};
	int x,temp=a[0];
	for(x=0;x<=a.length-2;x++)
	{
		a[x]=a[x+1];
	}
		a[x]=temp;
	for(x=0;x<a.length;x++)
	{
		System.out.print(a[x]+" ");
	}
}
}
/*
int x,y,temp=a[0];
for(x=0,y=1;x<=a.length-2;x++,y++)
{
	a[x]=a[y];
}
	a[x]=temp;
*/