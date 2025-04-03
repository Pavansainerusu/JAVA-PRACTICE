class Myclass
{
	public static void main(String[]args)
	{
		Demo demo=new Demo();
		demo.Factorial(5,1,1);
		demo.FactorialWithRecursion(5,1,1);
	}
}
class Demo
{
	void Factorial(int num,int pro,int start)
	{
	
	for(;start<=num;start++)
	{
		pro*=start;
	}
		System.out.println("Factorial of "+num+"is "+pro);
	}
	void FactorialWithRecursion(int num,int pro,int start)
	{
	if(start==num+1)
	{
		System.out.println("Factorial of "+num+"is "+pro);

	}	
	else
	{
	pro*=start;
	FactorialWithRecursion(num,pro,start+1);
	}
	}
}