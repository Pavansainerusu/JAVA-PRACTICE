//tribonoppi
class tribonoppi
{
	public static void main(String[]args)
	{
		int start=1,a=0,b=1,c=2,d=0,end=10;
	while(start<=end)
	{
		d=a+b+c;
		System.out.println(a);
		a=b;
		b=c;
		c=d;
	
	start++;
        }
	}
}