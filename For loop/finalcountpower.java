//Final count should be power for all values
class finalcountpower
{
	public static void main(String[]args)
	{
	int num=567,count=0,temp=num,power=0,sum=0;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		count++;
	}
	System.out.println(count);
	num=temp;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		power=(int)Math.pow(rem,count);
		sum=sum+power;
	}
	System.out.println(sum);
	}
}