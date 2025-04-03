//Final count should be power for all values and find its amstrong or not
class amstrongnumber
{
	public static void main(String[]args)
	{
	int num=371,count=0,temp=num,power=0,sum=0;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		count++;
	}
	num=temp;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		power=(int)Math.pow(rem,count);
		sum=sum+power;
	}
	System.out.println(sum);
	if(sum==temp)
		System.out.println(temp+"is a amstrong number");
	else
		System.out.println(temp+"is not a amstrong number");

	}
}