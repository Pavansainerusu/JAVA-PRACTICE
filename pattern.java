import java.util.Scanner;
class pattern
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		int row=s.nextInt(),colum=s.nextInt();
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
			System.out.print("# ");
			}
		System.out.println( );
		}
	}
}