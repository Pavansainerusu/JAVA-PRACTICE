//sum of even numbers from 1 to 100
class sum
{
	public static void main(String[]args)
	{
	int start=1,end=100,sum=0;
	while(start<=end)
	{
	if(start%2==0)
	{
	sum=sum+start;
	}
	start++;
}
	System.out.println("sum is"+sum);
}
}