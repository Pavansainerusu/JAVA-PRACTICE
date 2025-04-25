//Two numbers are input through the keyboard into two locations C and D. Write a program to interchange the contents of C and D (Using E Location )
class swapwithE{
    public static void main(String[] args) {
        int C = 5;
        int D = 10;

        System.out.println("Before swapping: C = " + C + ", D = " + D);

        int E = C;
        C = D;
        D = E;

        System.out.println("After swapping: C = " + C + ", D = " + D);
    }
}
