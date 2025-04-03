import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Demo
{
	public static void main(String[]args) throws Exception	
	{
		sub();
		Thread.sleep(1000);
	}
	static void sub() throws Exception
	{
		add();
		String path="C:/Users/pavan/Desktop/JAVA PRACTICE/sample.txt";
		Scanner s=new Scanner(new File(path));
		System.out.println(s.nextLine());
	}
	static void add() throws Exception
	{
		Class.forName("java.util.Scanner");
		System.out.println("hello");
	}

}