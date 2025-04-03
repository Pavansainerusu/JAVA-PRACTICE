//Positive Negative Zero using ternary operator
class positivenegativezero
{
public static void main(String[]args)
{
	int num=-10;
	String b=(num>0)?("positive"):(num<0)?("negative"):("zero");
	System.out.println(b);
}
}