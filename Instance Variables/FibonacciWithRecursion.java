class Myclass
{
	public static void main(String[]args)
	{
		Demo demo=new Demo();
		demo.FibonacciWithRecursion(0,1,2,0,10,1);
		
	}
}
class Demo
{
	void FibonacciWithRecursion(int a, int b, int c, int d, int n, int start)
	{
		if(start==n+1)
		{
		}
		else
		{
			System.out.println(a+" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
			FibonacciWithRecursion(a,b,c,d,n,start+1);
		}
	
	}	
}