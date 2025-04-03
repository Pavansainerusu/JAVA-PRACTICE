//Abstract
class main
{
	public static void main(String[]args)
	{
		parent p=new child();
		p.add();
		p.mul();
		p.div();
		p.sum();
	}
}
abstract class Grandparent
{
	void add()
	{
		System.out.println("add of Grandparent");
	}
	abstract void mul();
	abstract void div();
	abstract void sum();
	abstract void pro();
}
abstract class parent extends Grandparent
{
	void sum()
	{
		System.out.println("sub of parent");	
	}
}
class child extends parent
{
	void mul()
	{
		System.out.println("mul of child");
	}
	void div()
	{
		System.out.println("div of child");
	}
	void add()
	{
		System.out.println("add of child");
	}
	void pro()
	{
		System.out.println("pro of child");
	}


}