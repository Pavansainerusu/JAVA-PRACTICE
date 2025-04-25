import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		MyClass m3=new MyClass();
		MyClass m4=new MyClass();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		for(int x=1;x<=5;x++)
		{
			System.out.println(Thread.currentThread().getName()+" "+x);
		}
	}
}

class MyClass extends Thread
{
	public void run()
	{
	for(int x=1;x<=5;x++)

	{		System.out.println("i am run "+Thread.currentThread().getName()+" "+x);
	//System.out.println(10/0);
	}
	}
}
