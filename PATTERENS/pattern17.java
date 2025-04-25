import java.util.Scanner;
class pattern17
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row value");
	int rows=s.nextInt();
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)		
{
				System.out.print(temp+" ");	
				temp--;	
}
		System.out.println();
	}
}
}			