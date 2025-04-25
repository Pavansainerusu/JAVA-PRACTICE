import java.util.Scanner;
class adding
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt(),temp=a,count=0,first=0,second=0,sum=0,power=0;
		while(a!=0)
		{
			int rem=a%10;
			count++;
			a/=10;
		}
		if(count%2==0)
		{
			power=(int)Math.pow(10,count/2);
			first=temp/power;
			second=temp%power;
			sum=first+second;
			System.out.println("sum of"+first+"and"+second +"of" +temp +"is"+sum);

		}
		else
		{
		System.out.println("cannot work with"+count+"digits of"+temp);
		}
	}
}
