//finding foctor by using for loop
class factor
{
	public static void main(String[]args)
	{
	int highest=0;
	for(int start=1,n=6,end=n;start<=n/2;start++)
	{
		highest=start;
		System.out.println(start);
	}
	System.out.println("highest factor is "+highest);
	}
}	