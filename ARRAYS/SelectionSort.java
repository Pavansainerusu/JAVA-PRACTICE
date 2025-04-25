class Main
{
	public static void main(String[]args)
	{
		int a[]=new int[]{90,84,34,23,-12,-9};
		Main main=new Main();
		int res[]=main.SelectionSort(a);
		for(int t:res)
		System.out.println(t+" ");
	}
	int[] selectionSort(int a[])
	{
	for(int x=0;x<a.length-1
||;x++)
	{
		int min=x;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[min]>a[y])
			{
				min=y;
			}
		}
		int t=a[x];
		a[x]=a[min];
		a[min]=t;
	}
	return a;
	}
}