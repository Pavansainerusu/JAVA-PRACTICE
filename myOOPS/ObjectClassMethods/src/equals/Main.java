package equals;

public class Main {
	public static void main(String[] args) {
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);
        System.out.println(d1.equals(d2)); // false (by default compares reference)
    }

}
