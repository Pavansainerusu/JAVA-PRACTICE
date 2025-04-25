class Myclass
{
	public static void main(String[]args)
	{
		Demo obj=new Demo();
		System.out.println(obj.x);
		int res=obj.x;
		System.out.println(res);
		obj.add();
	}
}
class Demo
{
	int x=10;
	void add()
	{
		int a=100,b=200;
		System.out.println("add method"+(a+b));
	}
	void sub()
	{
		int a=100,b=200;
		System.out.println("sub method"+(a+b));
	}
}