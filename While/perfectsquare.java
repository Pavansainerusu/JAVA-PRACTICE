//perfect square 
class perfectsquare
{
	public static void main(String[]args)
{
	int start=1,end=100;
	while(start<=end)
	{
	int sqr=(int)Math.sqrt(start);
	if(sqr*sqr==start)
	{
		System.out.println(start+"is perfect square");
	}
	start++;
	}
}
}