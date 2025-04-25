//convert small letter to capital in ternary operator 
class ternaryoperator
{
	public static void main(String[]args)
	{
	char letter='a';
	char output=(letter>='a'&&letter<='z')?(char)(letter-32):(char)(letter+32);
	
	System.out.println(output);	
}
}