class amstrongprime
{
	public static void main(String[]args)
	{
	int num1=2,count1=0,start1=1,count2=0,sum=0,temp=num1,power=0;
	for(;start1<=num1;start1++)
	{
		if(num1%start1==0)
		count1++;
	}
	if(count1==2)
	{
		for(;num1!=0;num1/=10)
		{
		int rem=num1%10;
		count2++;
		}
	num1=temp;
		for(;num1!=0;num1=num1/10)
		{
		int rem=num1%10;
		power=(int)Math.pow(rem,count2);
		sum=sum+power;
		}
	}
	if(count1==2&&temp==sum)
		System.out.println("is a amstrong number");

	else
		System.out.println("is not a amstrong number");
	}

}