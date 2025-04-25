//20 19 18 17------11 1 2  3 4 ----------9 10
class series
{
	public static void main(String[]args)
	{
	int start=1,num1=1,num2=20,end=num2;
	while(start<=end)
	{
		if(start<=end/2)
		{
			System.out.println(num2+"");
			num2--;
		}
		else
		{
			System.out.print(num1+" ");
			num1++;
		}
	start++;
	}
}
}