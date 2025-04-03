//second minimum
import java.util.Scanner;
class smaximum
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int a=s.nextInt(),max=0,smax=0,temp=a;
	while(a!=0)
	{
		int rem=a%10;
		if(max<rem)
		{
			smax=max;
			max=rem;
		}
		else if(smax<rem&&rem!=max)
		{
			smax=rem;
		}
		a/=10;
	}	
	System.out.println("minimum digit of"+temp+"is"+max);
	System.out.println("second minimum digit of minimum"+temp+"is"+smax);
}
}
	
		
