class smalldigit
{
	public static void main(String[]args)
	{
		int num=234567,min=9,temp=num;
		for(;num!=0;num/=10)
		{
			int rem=num%10;
			if(rem<min)
			min=rem;
		}
			System.out.println(min);
	}
}
	