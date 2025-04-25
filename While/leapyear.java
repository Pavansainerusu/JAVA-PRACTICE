//Leap year 1900 to 2024
class leapyear
{
	public static void main(String[]args)
	{
	int start=1900,end=16000;
	while(start<=end)
	{
	if(start%4==0&&start%100!=0||start%400==0)
	{
		System.out.println(start+"is leap year");
	}
	start++;
	}
}
}  