import java.util.Scanner;
class Amstrong
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	{
	int num=s.nextInt();
	int count=0,temp=num,power=0,sum=0;
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
}