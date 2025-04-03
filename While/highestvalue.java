//Find the highest value before the given value
class highestvalue
{
	public static void main(String[]args)
	{
		int start=1,num=6,end=num,highest=0;
		while(start<=num/2)
		{
			if(num%start==0)
			{
				highest=start;
			}
		start++;
		}
	System.out.println(highest);
	}
}