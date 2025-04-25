import java.util.Scanner;
class pattern18
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row value");
	int rows=s.nextInt();
	for(int r=1;r<=rows;r++)
	{
		int temp=1;
		for(int c=1;c<=r;c++)		
		{
		if(c==1||r==rows||r==c)
		{
			System.out.print(temp+" ");
			temp++;
		}
		else
			System.out.print("  ");
		}
		System.out.println();
	}
}
}			