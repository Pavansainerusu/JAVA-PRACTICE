import java.util.Scanner;
class pattern4
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("rows");
		System.out.println("columns");

		int row=s.nextInt(),colum=s.nextInt();
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=colum;c++)
			{
			if(r==1)
			System.out.print("# ");
			else if(r==row)
			System.out.print("# ");
			else
			System.out.print("* ");


			}
		System.out.println( );
		}
	}
}