class Myclass
{
	public static void main(String[]args)
	{
	c2 d=new c2();
	d.m1();
	System.out.println(d.m2());

	}
}
class c2
{
void m1()
	{
	int num=10;
	if(num%2==0)
	System.out.println("Even");
	else
	System.out.println("odd");
	}
String m2()
	{
	int num=10;
	if(num%2==0)
	return "Even";
	else
	return "odd";
	}
}
	
