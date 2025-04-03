import java.util.Scanner;
class pattern6
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
			if(r==1||row==r||c==1||colum==c)
			System.out.print("# ");
			else
			System.out.print("  ");


			}
		System.out.println( );
		}
	}
}