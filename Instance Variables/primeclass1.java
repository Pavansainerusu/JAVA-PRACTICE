class myclass
{
	public static void main(String[]args)
	{
		prime d=new prime();
		for(int x=1;x<=100;x++){
		int num=x;
		String res=d.method1(x,0);
		System.out.println(x+" "+res);
		}
		
	}
}
class prime{
	String method1(int num,int count)
	{
		for(int start=2;start<=num/2;start++)
		{
			if(num%start==0)
			{
				count++;
				break;
			}
		}
		if(count==0&&num>=2)
		return "prime";
		else
		return "Not prime";
		
	}
}
			