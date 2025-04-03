/*reverse the given number from 3245 to 5423 an print as
5
4
2
3*/
class reversenumber
{
	public static void main(String[]args)
	{
	int n=3245,rev=0;
	for(;n!=0;n/=10)
	{
		int rem=n%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
	n=rev;
	for(;rev!=0;rev/=10)
	{
		int rev1=rev%10;
		System.out.println(rev1);
	}		
}
}