import java.util.Scanner;
class Myclass
{
	public static void main(string[]args)
	{	
	Scanner s=new Scanner(system.in);
	int a=nextInt();
	while(a!=0)
	{
	int rem=a%10;
		a/=10;
	}
	if(rem==7&&rem%7==0)
	{
		System.out.println("the number is busy number");
	}
	else
		System.out.println("the number is not a busy number");
	}
}