import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");	{
		int start=1,num=s.nextInt(),temp=start,rev=0;
		for(;start!=0;start=start/10)
		{
			int rem=start%10;
			rev=rev*10+rem;
		}
		if(rev==temp)
		System.out.println(temp+"Is a palindrome number");
		else
		System.out.println(temp+"Is not a palindrome number");
	}
}
}