import java.util.Scanner;
class pattern8
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the row value");
	System.out.println("enter the column value");
	int row=s.nextInt(),column=s.nextInt();
	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=column;c++)
		{
		if(r+c==row+1)
		System.out.print("# ");
		else
		System.out.print("$ ");
		}
	System.out.println();
	}
	}
}
		