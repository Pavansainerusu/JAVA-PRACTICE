class myclass
{
	public static void main(String[]args)
	{
		prime d=new prime();
		d.method1(7,0);
	}
}
class prime{
	void method1(int num,int count)
	{
		for(int start=2;start<=num/2;start++)
		{
			if(num%start==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count==0&&num>=2?num+"prime":num+"not prime");
	}
}
			