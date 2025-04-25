//finding common factors between two numbers
class twonumbers
{
	public static void main(String[]args)
	{
		int n1=10,n2=20,start=1,high=0;
			while(start<=n1&&start<=n2)
			{
				if(n1%start==0&&n2%start==0)
				{
					high=start;
					System.out.println(start);
				}
			start++;
			}
		System.out.println("commom factor for "+n1+" and "+n2 +" is " +high );
}
}