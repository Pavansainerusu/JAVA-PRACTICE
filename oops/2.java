class main
{
	public static void main(String[]args)
	{
		child c1=new child(10);
	}
}
class Grandparent
{
	Grandparent(int x)
	{
		this(10,12);
		System.out.println("i am grandparent 1 parameter");
	}
	Grandparent(int x,double y)
	{
		System.out.println("i am grandparent 2 parameter");
	}
}
class parent extends Grandparent
{
	parent()
	{
		super(10);
		System.out.println("i am parent default");
	}
	parent(int x)
	{       this();
		System.out.println("i am parent 1 parameter");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("i am child default");
	}
	child(int x)
	{
		super();
		System.out.println("i am child 1 parameter");
	}
	child(int x,char c)
	{
		System.out.println("i am child 2 parameter");
	}

}