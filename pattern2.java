import java.util.Scanner;
class pattern
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		int row=s.nextInt(),colum=s.nextInt(),temp=0;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=colum;c++)
			{
			System.out.print(c+" ");
			temp++;
			}
		System.out.println( );
		}
	}
}