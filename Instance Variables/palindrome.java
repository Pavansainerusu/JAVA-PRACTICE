class Myclass
{
	public static void main(String[]args)
	{
		class2 m=new class2()
		d.m1();
		System.out.println(d.m2);
	}
}
class class2
{
void m1()
{
	for(int x=1;x<=100;x++)
	{
	int num=11,rev=0,temp=num;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
	}
	if(rev==temp)
		System.out.println("palindrome");
	else
		System.out.println("Not a palindrome");
}
}
		
String m1()
{
	for(int x=1;x<=100;x++)
	{
	int num=11,rev=0,temp=num;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
	}
	if(rev==temp)
		return "palindrome";
	else
		return "Not a palindrome";
	}
}
}		