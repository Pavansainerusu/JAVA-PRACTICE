//Deccending Order
class Array
{
public static void main(String[]args)
{
	int a[]=new int[]{50,30,20,12,34,-7,45};
	int temp=0;
	for(int fix=0;fix<a.length;fix++)
	{
		for(int c=fix+1;c<a.length;c++)
		{
		if(a[fix]<a[c])
		{
			temp=a[fix];
			a[fix]=a[c];
			a[c]=temp;
		}
		}
	}
	System.out.println("after sorting");
	for(int x=0;x<=a.length-1;x++)
	{
		System.out.println(a[x]);
	}
int f=0,l=a.length-1,m,search=45;
for(;f<=l;)
{
	m=(f+l)/2;
	if(search==a[m])
	{
	System.out.println(" element found");
	break;
	}
	else if(search<a[m])
	f=m+1;
	else if(search>a[m])
	l=m-1;

}
if(f>l)
	System.out.println("/n element not found");

}
}