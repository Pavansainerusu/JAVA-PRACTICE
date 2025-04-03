class Myclass
{
	public static void main(String[]args)
	{
		Demo demo=new Demo();
		demo.total(10,0,1);
		demo.totalWithRecursion(10,0,1);
	}
}
class Demo
{
	void total(int num, int sum, int start)
	{
		for(;start<=num;start++)
		{
			sum+=start;
		}
		System.out.println("Sum of"+num+"natural numbers is "+sum);
	}	
	void totalWithRecursion(int num, int sum, int start)
	{
		if(start==num+1)
		{
		System.out.println("Sum of"+num+"natural numbers is "+sum);

		}
		else
		{
		sum+=start;
		totalWithRecursion(num,sum,start+1);
		}
	}
}