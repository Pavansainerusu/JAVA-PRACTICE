class main
{
	public static void main(String[]args)
	{
	String name="pavan";
	String s2="";
	for(int x=name.length()-1;x>=0;x--)
	{
		char c=name.charAt(x);
		s2+=c;
	}
	System.out.println(s2);
	}
}