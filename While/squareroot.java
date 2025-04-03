//square root
class squareroot
{
	public static void main(String[]args)
{
	int start=1,end=100;
	double num=0;
	while(end>=start)
	{
	num=Math.sqrt(start);
	System.out.println(start+"square root is"+num);
	start++;
	}
}
}