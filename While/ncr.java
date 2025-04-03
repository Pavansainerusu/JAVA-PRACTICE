
//
class ncr
{
	public static void main(String[]args)
{
	int n=5,start=n,pro=1,r=4,num=r,xyz=1;
        int var=n-r,diff=1;
	while(start>1)
	{
	pro = pro*start;
	start--;
	}
	while(num>1)
	{
	xyz = xyz*num;
	num--;
	}  
        while(var>1)
	{
	diff=diff*var;
	var--;
	}
	
	System.out.println(pro);
	System.out.println(xyz);
	System.out.println(var);
	int a=xyz*var;
	System.out.println("ncr of n&r is"+pro/a);
}
}	