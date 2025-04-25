//Two numbers are input through the keyboard into two locations C and D. Write a program to interchange the contents of C and D (Using without E Location )
class swapwithoutE
{
	public static void main(String[]args)
{
	int C=10;
	int D=20;
	System.out.println("Before swap C:"+C + ",D = "+D);
	 C = C + D;
         D = C - D;
         C = C - D;

        System.out.println("After swapping: C = " + C + ", D = " + D);
    }
}