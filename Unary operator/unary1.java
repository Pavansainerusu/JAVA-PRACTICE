class unary1
{
	public static void main(String[] args)
	{
		int a=5;
		int b=a - --a+ ++a;
		int c=(b++/a) - a-- + ++b;
		int d=a + --b + --c + a++ -c++;
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		System.out.println("c value is"+c);
		System.out.println("d value is"+d);
	}
}
		
