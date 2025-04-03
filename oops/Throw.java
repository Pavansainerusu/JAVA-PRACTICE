class Main
{
	public static void main(String[]args)
	{
		for(int x=0;x<=5;x++)
		{
			System.out.println(x);
			try
			{
				Thread.sleep(1000);
			}
			catch()
		}	
	}
}