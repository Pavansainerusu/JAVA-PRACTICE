//second minimum
import java.util.Scanner;
class sminimum
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int a=s.nextInt(),min=9,smin=9,temp=a;
	while(a!=0)
	{
		int rem=a%10;
		if(min>rem)
		{
			smin=min;
			min=rem;
		}
		else if(smin>rem&&rem!=min)
		{
			smin=rem;
		}
		a/=10;
	}	
	System.out.println("minimum digit of"+temp+"is"+min);
	System.out.println("second minimum digit of minimum"+temp+"is"+smin);
}
}
	
		
