class ncrforward
{
	public static void main(String[]args)
{
	int n=6,start=1,pro1=1,r=4,start1=1,pro2=1,diff=n-r,start2=1,pro3=1;
	while(start<=n)
	{
	pro1*=start;
	start++;
	}
	while(start1<=r)
	{
	pro2*=start1;
	start1++;
	}
	while(start2<=diff)
	{
	pro3*=start2;
	start2++;
	}
	System.out.println(pro1/(pro2*pro3));
}
}