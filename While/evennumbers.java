//printing even numbers from 1 to 100 by while
class evennumbers
{
	public static void main(String[]args)
	{
	int start=1,end=100;
	while(start<=end)
	{
	if(start%2==0)
	{
	System.out.println("the even values are"+start);
	}
	start++;
	}
}
}