//Interface
class main
{
	public static void main(String[]args)
	{
	one o=new xyz();
	o.add();
	o.sub();
	}
}
interface one
{
	int x=10;
	void add();
	abstract public void sub();
	void mul();
}
abstract class AbcAbstractImpl implements one
{
	public void add()
	{
		System.out.println("add");
	}
	abstract public void sub();
}
class xyz extends AbcAbstractImpl
{
	public void sub()
	{
		System.out.println("sub");
	}
	public void mul()
	{
		System.out.println("mul");
	}

}