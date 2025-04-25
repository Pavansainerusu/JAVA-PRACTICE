//eligible for vote if age is 18&above other wise not aligible for voting in ternary operator
class voting
{
	public static void main(String[]args)
{
	int a=20;
	String b=(a>=18)?("eligible for voting"):("not eligible for voting");
	System.out.println(b);
}
}