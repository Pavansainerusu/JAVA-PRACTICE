import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int start=1,num=s.nextInt(),count=0;
	for(;start<=num;start++)
	{
		if(num%start==0)
		{
			count++;
			
		}
	}
	if(count==2)
	System.out.println("prime number");
	else
	System.out.println("not a prime number");
	}
}
