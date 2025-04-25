//even number count sum
class evencount
{
	public static void main(String[]args)
	{
		int n=123456,count=0,sum=0;
		for(;n!=0;n=n/10)
		{
			int rem=n%10;
			count++;
			if(n%2==0)
			{
				sum=sum+rem;
			}
		}
		System.out.println(sum);

		
	}
}