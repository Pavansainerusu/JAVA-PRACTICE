//printing odd numbers from 1 to 100 by while
class oddnumbers
{
	public static void main(String[]args)
	{
	int start=1,end=100;
	while(start<=end)
	{
	if(start%2!=0)
	{
	System.out.println("the odd values are"+start);
	}
	start++;
	}
}
}