class Myclass
{
	public static void main(String[]args)
	{
		Demo demo=new Demo();
		demo.digit(25,0,25);
		demo.digitWithRecursion(25,0,25);
	}
}	
class Demo
{
	void digit(int num, int sum, int temp)
	{
	for(;num!=0;num/=10)
	{
		int rem=num%10;
		sum+=rem;
	}
	System.out.println("sum of "+temp +"is "+sum);
	}
	void digitWithRecursion(int num,int sum,int temp)
	{
	if(num==0)
	{
		System.out.println("sum of "+temp +"is "+sum);
	}
	else
	{
		int rem=num%10;
		sum+=rem;
		digitWithRecursion(num/10,sum,temp);
	}
	}
}