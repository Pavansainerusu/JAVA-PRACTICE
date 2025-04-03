class main
{
	public static void main(String[] args)
	Parent c1=new child;
	c1.add();
}
class Parent
{
	static int x=0;
	static void add()
	{
		System.out.println("i am staic  add in parent");

	}
}
class child extends Parent
{
	static void add()
	{

		System.out.println("i am staic  add in child");
	}
	void sub()
	{
		system.out.println("i am static in sub ");
	}
}