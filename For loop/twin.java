//Twin primes of two numbers distance should only be 2
class twin
{
	public static void main(String[]args)
	{
	int num1=7,num2=13,count1=0,count2=0,start1=1,start2=1;
	for(;start1<=num1;start1++)
	{
		if(num1%start1==0)
		count1++;
	}
	if(count1==2)
	{
	for(;start2<=num2;start2++)
	{
		if(num2%start2==0)
		count2++;
	}
	if(count2==2)
	System.out.println(num1-num2==2||num2-num1==2?"twin primes":"not twin primes");
	else
	System.out.println(num1+"and"+num2+"are not twin primes");
	}
}
}