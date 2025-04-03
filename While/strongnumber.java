yimport java.util.Scanner;
class strongnumber
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt(),temp=a,sum=0;
		while(a!=0)
		{
			int rem=a%10;
			int pro=1,start=1;
			int num=rem;
			for(;start<=rem;start++)
			{
			pro*=start;
			}
			System.out.println(num+"factorial is"+pro);
			sum=sum+pro;
			a/=10;
		}
			System.out.println(sum);

		if(sum==temp)
		System.out.println(temp+"Strong number");
		else
		System.out.println(temp+"not a strong number");
}

}		