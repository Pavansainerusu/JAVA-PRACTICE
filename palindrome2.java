import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int sum=123,rev=0,temp=sum,n=s.nextInt();
		for(;n!=0;n=n/10)
		{
			int rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		if(rev==temp)
		System.out.println("its a palindrome");
		else
		System.out.println("not a palindrome");
	}
}