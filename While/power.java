/*1 power 1 is 1.0
2 power 2 is 2.0
3 power 3 is 3.0
4 power 4 is 4.0
.
.
10 power 0 is 1.0
11 power 1 is 11.0*/
class power
{
	public static void main(String[]args)
	{
	int start=1,end=100,last=1;
	while(start<=end)
	{
	last=start%10;
	double power=Math.pow(start,last);
	System.out.println(start+"power"+last+ "is"+power);
	start++;
	}
}
}