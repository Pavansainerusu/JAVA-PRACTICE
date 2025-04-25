class reversereverse
{
	public static void main(String[]args)
	{
	int num=12300,rev=0,rev2=0,count1=0,count2=0,temp=num;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		count1++;
		num/=10;
	}
	num=rev;
	{
		int rem=num%10;
		rev2=rev*10+rem;
		count2++;
		num/=10;
	}
	int zeros=count1-count2;
	rev2=rev2*(int)Math.pow(10,zeros);
	System.out.println("num is"+temp);
	System.out.println("rev is"+rev);
	System.out.println("rev2 is"+rev2);
	}
}
