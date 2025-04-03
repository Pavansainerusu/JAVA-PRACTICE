import java.util.Scanner;
class pattern11
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row value");
	System.out.println("Enter column value");
	int rows=s.nextInt(),column=s.nextInt();
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=column;c++)
		{
		System.out.print(r+" ");
		}
		System.out.println();
	}
}
}