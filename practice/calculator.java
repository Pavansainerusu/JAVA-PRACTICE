class myclass1
{

public static void main(String[] args)
{
 Demo d=new Demo();
 System.out.println(d.add(12,32));
 System.out.println(d.sub(12,32));
 System.out.println(d.mul(12,32));
 System.out.println(d.div(12,32));


}
}
class Demo
{
	String add(int n1,int n2)
	{
 		int add=n1+n2;
		return add+" add ";
	}
	String sub(int n1,int n2)
	{
 		int sub=n1-n2;
		return sub+" sub ";
	}
	String mul(int n1,int n2)
	{
 		int mul=n1*n2;
		return mul+" mul ";
	}
	String div(int n1,int n2)
	{
 		int div=n1/n2;
		return div+" div";
	}
}