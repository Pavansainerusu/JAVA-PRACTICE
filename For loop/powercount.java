/* let num=125689
	9^1+8^2+6^3+5^4+2^5+1^6 count should be power for digit*/
class powercount
{
	public static void main(String[]args)
	{
	int num=125689,temp=num,power=0,sum=0,count=0;
	for(;num!=0;num/=10)
	{
		int rem=num%10;
		count++;
		power=(int)Math.pow(rem,count);
		sum=sum+power;
	}
		System.out.println(sum);
}
}