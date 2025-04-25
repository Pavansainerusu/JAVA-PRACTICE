class largedigit
{
	public static void main(String[]args)
	{
		int num=234567,max=0,temp=num;
		for(;num!=0;num/=10)
		{
			int rem=num%10;
			if(rem>max)
			max=rem;
		}
			System.out.println(max);
	}
}
	